package com.vs.jtomtomclient.requests;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.vs.jtomtomclient.model.LatLng;
import com.vs.jtomtomclient.model.SearchResponse;
import com.vs.jtomtomclient.requests.annotations.RequestParameter;
import com.vs.jtomtomclient.requests.enums.ResponseFormat;
import com.vs.jtomtomclient.requests.exceptions.ParameterNotInformedException;

/************************************************************
 * Superclass used to perform requests in the TomTom's APIs
 * 
 * @author Victor Santos
 *
 */
public abstract class Request {

	/**
	 * 	The base URL for calling the API.
	 */
	private final String BASE_URL = "https://api.tomtom.com";

	@RequestParameter(name="key", required="true")
	protected String apiKey;

	protected Integer versionNumber;

	protected ResponseFormat expectedFormat;

	protected String searchAPI;

	public Request(String searchAPI) {
		this.searchAPI = searchAPI;
		this.versionNumber = 2;
		this.expectedFormat = ResponseFormat.JSON;
	}

	/**
	 * Get an API Key valid for the requested service.
	 * @return
	 */
	public String getApiKey() {
		return this.apiKey;
	}

	/**
	 * Set an API Key valid for the requested service.
	 * @param apiKey
	 * @return
	 */
	public Request setApiKey(String apiKey) {
		this.apiKey = apiKey;
		return this;
	}

	/**
	 * @return Get the service version.
	 */
	public Integer getVersion() {
		return versionNumber;
	}

	/**
	 * Set service version number. Default is 2.
	 * 
	 * @param version
	 * @return
	 */
	public Request setVersion(Integer version) {
		this.versionNumber = version;
		return this;
	}

	/**
	 * 
	 * @return Expected response format (JSON, JSONP, JS, XML).
	 */
	public ResponseFormat getExpectedFormat() {
		return expectedFormat;
	}

	/**
	 * Set expected response format (JSON, JSONP, JS, XML).
	 * 
	 * @param expectedFormat
	 * @return
	 */
	public Request setExpectedFormat(ResponseFormat expectedFormat) {
		this.expectedFormat = expectedFormat;
		return this;
	}

	/**
	 * get search API used in the request. Supported Tomtom's APIs : FuzzySearch,
	 * Points of Interest Search, Category Search, Geometry Search, Nearby Search,
	 * Along Route Search, EV Charging Stations Availability, Geocode, Structured
	 * Geocode, Reverse Geocode, Cross Street Lookup and Geometry Filter
	 * 
	 * @return Search API
	 */
	public String getSearchAPI() {
		return searchAPI;
	}

	/**************************************************************
	 * Build the url used in the request
	 * 
	 * @return
	 */
	protected String buildRequestUrl() {
		StringBuilder urlBuilder = new StringBuilder();

		// PATH -------------------------------------------
		urlBuilder.append(BASE_URL);
		urlBuilder.append("/search/");
		urlBuilder.append(versionNumber);
		urlBuilder.append("/");
		urlBuilder.append(searchAPI);
		urlBuilder.append("/");
		urlBuilder.append(expectedFormat.getExtension());

		// PARAMETERS
		Class<?> thisClass = this.getClass();
		
		// get fields from subclass and superclass
		List<Field> allFields = new ArrayList<Field>();
		allFields.addAll(Arrays.asList(thisClass.getDeclaredFields()));
		allFields.addAll(Arrays.asList(thisClass.getSuperclass().getDeclaredFields()));
		
		urlBuilder.append("?");
		
		try {

			for (Field field : allFields) {

				if (field.isAnnotationPresent(RequestParameter.class)) {
					// become private fields accessible
					field.setAccessible(true);

					RequestParameter annotation = field.getAnnotation(RequestParameter.class);

					if (annotation.required().equals("true") && field.get(this) == null) {
						throw new ParameterNotInformedException(
								"Required parameter " + annotation.name() + " did not inform for request");
					}

					if (field.getType() == LatLng.class) {

						LatLng latLng;
						latLng = (LatLng) field.get(this);
						urlBuilder.append("lat=");
						urlBuilder.append(latLng.getLat());
						urlBuilder.append("&");
						urlBuilder.append("lon=");
						urlBuilder.append(latLng.getLon());
						urlBuilder.append("&");

					}

					else if (field.getType().isArray()) {
						String parameterName = annotation.name();
						Object[] values = field.get(this) != null ? (Object[])field.get(this) : null;
						
						if (values != null) {
							urlBuilder.append(parameterName);
							urlBuilder.append("=");
							
							// separate values by comma
							for(Object value: values) {
								urlBuilder.append(value);
								urlBuilder.append(",");
							}
							// remove last comma
							urlBuilder.deleteCharAt(urlBuilder.length()-1);
							
							urlBuilder.append("&");
						}
					}
					else {
						
						String parameterName = annotation.name();
						String parameterValue = field.get(this) != null ? ""+field.get(this) : null ;

						// only put parameter in the url if it is not null
						if (parameterValue != null) {
							urlBuilder.append(parameterName);
							urlBuilder.append("=");
							urlBuilder.append(parameterValue);
							urlBuilder.append("&");
						}
					}

				}
			}
		} catch (final IllegalArgumentException | IllegalAccessException e) {
			e.printStackTrace();
		}

		// remove last '?'
		return urlBuilder.toString().substring(0, urlBuilder.length() - 1);
	}
	
	/**
	 * The function performs a request to tomtom's api and return a response.
	 * @return ResponseEntity
	 */
	public ResponseEntity<?> await() {
		String url = buildRequestUrl();
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<?> response =  restTemplate.getForEntity(url, SearchResponse.class);
	
		return response;
		
	}

}
