package com.vs.jtomtomclient.requests;

import com.vs.jtomtomclient.model.LatLng;
import com.vs.jtomtomclient.requests.annotations.RequestParameter;

public class NearbySearchRequest extends Request {

	@RequestParameter(name = "latLng", required = "true")
	private LatLng latLng;

	@RequestParameter(name = "limit")
	private Integer limit;

	@RequestParameter(name = "ofs")
	private Integer startingOffset;

	@RequestParameter(name = "minFuzzyLevel")
	private Integer minFuzzyLevel;

	@RequestParameter(name = "maxFuzzyLevel")
	private Integer maxFuzzyLevel;

	@RequestParameter(name = "idxSet")
	private String[] idxSet;

	@RequestParameter(name = "countrySet")
	private String[] countrySet;

	@RequestParameter(name = "radius")
	private Integer radius;

	@RequestParameter(name = "language")
	private String language;

	@RequestParameter(name = "extendedPostalCodesFor")
	private String[] extendedPostalCodeFor;

	@RequestParameter(name = "categorySet")
	private Long[] categorySet;

	@RequestParameter(name = "brandSet")
	private String[] brandSet;

	@RequestParameter(name = "connectorSet")
	private String[] connectorSet;

	@RequestParameter(name = "view")
	private String view;

	@RequestParameter(name = "openingHours")
	private String openingHours;

	@RequestParameter(name = "mapcodes")
	private String mapcodes;

	@RequestParameter(name = "timeZone")
	private String timeZone;

	public NearbySearchRequest() {
		super("nearbySearch");
	}

	/**
	 * Get Latitude and Longitude, e.g., lat=37.337 lat,lon where results should be
	 * biased. Note: supplying a lat/lon without a radius will only bias the search
	 * results to that area. Value: min/max: -90 to +90 Reference: Latitude,
	 * Longitude and Coordinate System Grids
	 * 
	 * @return LatLng
	 */
	public LatLng getLatLng() {
		return latLng;
	}

	/**
	 * Set Latitude and Longitude, e.g., lat=37.337 lat,lon where results should be
	 * biased. Note: supplying a lat/lon without a radius will only bias the search
	 * results to that area. Value: min/max: -90 to +90 Reference: Latitude,
	 * Longitude and Coordinate System Grids
	 * 
	 * @param latLng
	 * @return
	 */
	public NearbySearchRequest setLatLng(LatLng latLng) {
		this.latLng = latLng;
		return this;
	}

	/**
	 * Get the maximum number of responses that will be returned. Default value: 10
	 * Maximum value: 100
	 * 
	 * @return
	 */

	public Integer getLimit() {
		return limit;
	}

	/**
	 * Set the maximum number of responses that will be returned. Default value: 10
	 * Maximum value: 100
	 * 
	 * @return
	 */
	public NearbySearchRequest setLimit(Integer limit) {
		this.limit = limit;
		return this;
	}

	/**
	 * Get the starting offset of the returned results within the full result set.
	 * Default value: 0 Maximum value: 1900
	 * 
	 * @return
	 */
	public Integer getStartingOffset() {
		return startingOffset;
	}

	/**
	 * Set the starting offset of the returned results within the full result set.
	 * Default value: 0 Maximum value: 1900
	 * 
	 * @param startingOffset
	 * @return
	 */
	public NearbySearchRequest setStartingOffset(Integer startingOffset) {
		this.startingOffset = startingOffset;
		return this;
	}

	/**
	 * Get minimum fuzziness level to be used.
	 * 
	 * @return
	 */
	public Integer getMinFuzzyLevel() {
		return minFuzzyLevel;
	}

	/**
	 * Set minimum fuzziness level to be used.
	 * 
	 * @return
	 */
	public NearbySearchRequest setMinFuzzyLevel(Integer minFuzzyLevel) {
		this.minFuzzyLevel = minFuzzyLevel;
		return this;
	}

	/**
	 * Get maximum fuzziness level to be used.
	 * 
	 * @return
	 */
	public Integer getMaxFuzzyLevel() {
		return maxFuzzyLevel;
	}

	/**
	 * Set maximum fuzziness level to be used.
	 * 
	 * @return
	 */
	public NearbySearchRequest setMaxFuzzyLevel(Integer maxFuzzyLevel) {
		this.maxFuzzyLevel = maxFuzzyLevel;
		return this;
	}

	/**
	 * Get a comma separated list of indexes which should be utilized for the
	 * search. Item order does not matter. Available indexes are:
	 * 
	 * Addr = Address range interpolation (when there is no PAD) Geo = Geographies
	 * PAD = Point Addresses POI = Points of interest Str = Streets Xstr = Cross
	 * Streets (intersections) Example: POI
	 */
	public String[] getIdxSet() {
		return idxSet;
	}

	/**
	 * Set a comma separated list of indexes which should be utilized for the
	 * search. Item order does not matter. Available indexes are:
	 * 
	 * Addr = Address range interpolation (when there is no PAD) Geo = Geographies
	 * PAD = Point Addresses POI = Points of interest Str = Streets Xstr = Cross
	 * Streets (intersections) Example: POI
	 */
	public NearbySearchRequest setIdxSet(String ...idxSet) {
		this.idxSet = idxSet;
		return this;
	}

	/**
	 * Get country codes (e.g., FR,ES). This will limit the search to the specified
	 * countries. The choice of view may restrict which countries are available.
	 * Values: FR,ES,etc.
	 * 
	 * @return
	 */
	public String[] getCountrySet() {
		return countrySet;
	}

	/**
	 * Set the country codes (e.g., FR,ES). This will limit the search to the
	 * specified countries. The choice of view may restrict which countries are
	 * available. Values: FR,ES,etc.
	 * 
	 * @param countrySet
	 * @return
	 */
	public NearbySearchRequest setCountrySet(String... countrySet) {
		this.countrySet = countrySet;
		return this;
	}

	/**
	 * Get radius in meters of the area where the results are searched .
	 * 
	 * @return
	 */
	public Integer getRadius() {
		return radius;
	}

	/**
	 * Set radius in meters of the area where the results are searched .
	 * 
	 * @param radius
	 * @return
	 */
	public NearbySearchRequest setRadius(Integer radius) {
		this.radius = radius;
		return this;
	}

	/**
	 * Get language in which search results should be returned. Should be one of the
	 * TomTom supported IETF language tags, case insensitive. When data in specified
	 * language is not available for a specific field, the default langauge is used.
	 * 
	 * @return
	 */
	public String getLanguage() {
		return language;
	}

	/**
	 * Set language in which search results should be returned. Should be one of the
	 * TomTom supported IETF language tags, case insensitive. When data in specified
	 * language is not available for a specific field, the default langauge is used.
	 * 
	 * @param language
	 * @return
	 */
	public NearbySearchRequest setLanguage(String language) {
		this.language = language;
		return this;
	}

	/**
	 * Get the indexes for which extended postal codes should be included in the
	 * results. Available values are described in additional information indexes
	 * abbreviation values section. Value should be a comma-separated list of index
	 * types (in any order) or "None" for no indexes. By default extended postal
	 * codes are included for all indexes except Geo. Extended postal code lists for
	 * geographies can be quite long, so they have to be explicitly requested when
	 * needed. Usage examples:
	 * 
	 * extendedPostalCodesFor=POI extendedPostalCodesFor=PAD,Addr,POI
	 * extendedPostalCodesFor=None Extended postal code is returned as an
	 * extendedPostalCode property of an address. Availability is region-dependent.
	 * 
	 * @return
	 */
	public String[] getExtendedPostalCodeFor() {
		return extendedPostalCodeFor;
	}

	/**
	 * Set the indexes for which extended postal codes should be included in the
	 * results. Available values are described in additional information indexes
	 * abbreviation values section. Value should be a comma-separated list of index
	 * types (in any order) or "None" for no indexes. By default extended postal
	 * codes are included for all indexes except Geo. Extended postal code lists for
	 * geographies can be quite long, so they have to be explicitly requested when
	 * needed. Usage examples:
	 * 
	 * extendedPostalCodesFor=POI extendedPostalCodesFor=PAD,Addr,POI
	 * extendedPostalCodesFor=None Extended postal code is returned as an
	 * extendedPostalCode property of an address. Availability is region-dependent.
	 * 
	 * @param extendedPostalCodeFor
	 * @return
	 */
	public NearbySearchRequest setExtendedPostalCodeFor(String... extendedPostalCodeFor) {
		this.extendedPostalCodeFor = extendedPostalCodeFor;
		return this;
	}

	/**
	 * Get list of opening hours for a POI.
	 * @return
	 */
	public String getOpeningHours() {
		return openingHours;
	}

	/**
	 * Set list of opening hours for a POI.
	 * @param openingHours
	 */
	public void setOpeningHours(String openingHours) {
		this.openingHours = openingHours;
	}

	/**
	 * Get the geopolitical view. The context used to resolve handling disputed
	 * territories. Views include Unified, along with IN, PK, IL, MA and AR, which
	 * are respectively tailored for India, Pakistan, Israel, Morocco, and
	 * Argentina. When this parameter is not used, the defaulting behavior will
	 * assign the following views. India: IN, Pakistan: PK, Morocco: MA, Argentina:
	 * AR, others: Unified. Default values:
	 * 
	 * Argentina, default view: AR, available views: Unified, IL, IN, MA, PK India,
	 * default view: IN, available views: - Morocco, default view: MA, available
	 * views: Unified, AR, IL, IN, PK Pakistan, default view: PK, available views:
	 * Unified, AR, IL, IN, MA Others, default view: Unified, available views: AR,
	 * IL, IN, MA, PK
	 * 
	 * @return
	 */
	public String getView() {
		return view;
	}

	/**
	 * Set the geopolitical view. The context used to resolve handling disputed
	 * territories. Views include Unified, along with IN, PK, IL, MA and AR, which
	 * are respectively tailored for India, Pakistan, Israel, Morocco, and
	 * Argentina. When this parameter is not used, the defaulting behavior will
	 * assign the following views. India: IN, Pakistan: PK, Morocco: MA, Argentina:
	 * AR, others: Unified. Default values:
	 * 
	 * Argentina, default view: AR, available views: Unified, IL, IN, MA, PK India,
	 * default view: IN, available views: - Morocco, default view: MA, available
	 * views: Unified, AR, IL, IN, PK Pakistan, default view: PK, available views:
	 * Unified, AR, IL, IN, MA Others, default view: Unified, available views: AR,
	 * IL, IN, MA, PK
	 * 
	 * @param view
	 * @return
	 */
	public NearbySearchRequest setView(String view) {
		this.view = view;
		return this;
	}

	/**
	 * Get a comma-separated list of categories which could be used to restrict the
	 * result to Points Of Interest of specific categories. The list of categories
	 * can be discovered using the POI Categories endpoint. Value: A comma-separated
	 * list of category identifiers (in any order). Item order does not matter. When
	 * multiple category identifiers are provided, only POIs that belong to (at
	 * least) one of the categories from the provided list will be returned. Usage
	 * examples:
	 * 
	 * categorySet=7315 (search Points Of Interest of category Restaurant)
	 * categorySet=7315025,7315017 (search Points Of Interest of category either
	 * Italian or French Restaurant)
	 * 
	 * @return
	 */
	public Long[] getCategorySet() {
		return categorySet;
	}

	/**
	 * Set a comma-separated list of categories which could be used to restrict the
	 * result to Points Of Interest of specific categories. The list of categories
	 * can be discovered using the POI Categories endpoint. Value: A comma-separated
	 * list of category identifiers (in any order). Item order does not matter. When
	 * multiple category identifiers are provided, only POIs that belong to (at
	 * least) one of the categories from the provided list will be returned. Usage
	 * examples:
	 * 
	 * categorySet=7315 (search Points Of Interest of category Restaurant)
	 * categorySet=7315025,7315017 (search Points Of Interest of category either
	 * Italian or French Restaurant)
	 * 
	 * @return
	 */
	public NearbySearchRequest setCategorySet(Long[] categorySet) {
		this.categorySet = categorySet;
		return this;
	}

	/**
	 * Get a comma-separated list of brand names which could be used to restrict the
	 * result to Points Of Interest of specific brands. Value: A comma-separated
	 * list of brand names (in any order). Item order does not matter. When multiple
	 * brands are provided, only POIs that belong to (at least) one of the brands
	 * from the provided list will be returned. Brands that contain a "," in their
	 * name should be put into quotes, for example: "A,B,C Comma". Usage examples:
	 * 
	 * brandSet=Tomtom (search Points Of Interest of ¨Tomtom¨ brand)
	 * brandSet=Tomtom,Foobar (search Points Of Interest of ¨Tomtom¨ brand OR
	 * ¨Foobar¨ brand) brandSet=¨A,B,C Comma¨ (search Points Of Interest of ¨A,B,C
	 * Comma¨ brand)
	 * 
	 * @return
	 */
	public String[] getBrandSet() {
		return brandSet;
	}

	/**
	 * Set a comma-separated list of brand names which could be used to restrict the
	 * result to Points Of Interest of specific brands. Value: A comma-separated
	 * list of brand names (in any order). Item order does not matter. When multiple
	 * brands are provided, only POIs that belong to (at least) one of the brands
	 * from the provided list will be returned. Brands that contain a "," in their
	 * name should be put into quotes, for example: "A,B,C Comma". Usage examples:
	 * 
	 * brandSet=Tomtom (search Points Of Interest of ¨Tomtom¨ brand)
	 * brandSet=Tomtom,Foobar (search Points Of Interest of ¨Tomtom¨ brand OR
	 * ¨Foobar¨ brand) brandSet=¨A,B,C Comma¨ (search Points Of Interest of ¨A,B,C
	 * Comma¨ brand)
	 * 
	 * @param brandSet
	 */
	public NearbySearchRequest setBrandSet(String[] brandSet) {
		this.brandSet = brandSet;
		return this;
	}

	/**
	 * Get a comma-separated list of connector types which could be used to restrict
	 * the result to Points Of Interest of type Electric Vehicle Station supporting
	 * specific connector types. List of supported connector types Value: A
	 * comma-separated list of connector types (in any order). Item order does not
	 * matter. When multiple connector types are provided, only POIs that support
	 * (at least) one of the connector types from the provided list will be
	 * returned. Usage examples:
	 * 
	 * connectorSet=IEC62196Type2CableAttached (search Points Of Interest of type
	 * Electric Vehicle Station supporting IEC62196Type2CableAttached)
	 * connectorSet=IEC62196Type2Outlet,IEC62196Type2CableAttached (search Points Of
	 * Interest of type Electric Vehicle Station supporting
	 * IEC62196Type2CableAttached or IEC62196Type2Outlet)
	 * 
	 * @return
	 */
	public String[] getConnectorSet() {
		return connectorSet;
	}

	/**
	 * Set a comma-separated list of connector types which could be used to restrict
	 * the result to Points Of Interest of type Electric Vehicle Station supporting
	 * specific connector types. List of supported connector types Value: A
	 * comma-separated list of connector types (in any order). Item order does not
	 * matter. When multiple connector types are provided, only POIs that support
	 * (at least) one of the connector types from the provided list will be
	 * returned. Usage examples:
	 * 
	 * connectorSet=IEC62196Type2CableAttached (search Points Of Interest of type
	 * Electric Vehicle Station supporting IEC62196Type2CableAttached)
	 * connectorSet=IEC62196Type2Outlet,IEC62196Type2CableAttached (search Points Of
	 * Interest of type Electric Vehicle Station supporting
	 * IEC62196Type2CableAttached or IEC62196Type2Outlet)
	 * 
	 * @param connectorSet
	 */
	public NearbySearchRequest setConnectorSet(String[] connectorSet) {
		this.connectorSet = connectorSet;
		return this;
	}

	/**
	 * Get enables the return of a comma-separated mapcodes list. Can also filter
	 * the Response to only show selected mapcode types. See Mapcodes in the
	 * response. Values: One or more of: Local International Alternative A mapcode
	 * represents a specific location to within a few meters. Every location on
	 * Earth can be represented by a mapcode. Mapcodes are designed to be short,
	 * easy to recognize, remember, and communicate. Visit the Mapcode project
	 * website for more information. Usage examples:
	 * 
	 * mapcodes=Local (only returns local mapcode for a location)
	 * mapcodes=Local,Alternative (returns both local and alternative mapcodes for a
	 * location) mapcodes=Local,Alternative,International (returns all possible
	 * mapcodes for a location)
	 * 
	 * @return
	 */
	public String getMapcodes() {
		return mapcodes;
	}

	/**
	 * Set enables the return of a comma-separated mapcodes list. Can also filter
	 * the Response to only show selected mapcode types. See Mapcodes in the
	 * response. Values: One or more of: Local International Alternative A mapcode
	 * represents a specific location to within a few meters. Every location on
	 * Earth can be represented by a mapcode. Mapcodes are designed to be short,
	 * easy to recognize, remember, and communicate. Visit the Mapcode project
	 * website for more information. Usage examples:
	 * 
	 * mapcodes=Local (only returns local mapcode for a location)
	 * mapcodes=Local,Alternative (returns both local and alternative mapcodes for a
	 * location) mapcodes=Local,Alternative,International (returns all possible
	 * mapcodes for a location)
	 * 
	 * @param mapcodes
	 */
	public NearbySearchRequest setMapcodes(String mapcodes) {
		this.mapcodes = mapcodes;
		return this;
	}

	/**
	 * Get used to indicate the mode in which the timeZone object should be
	 * returned. Values: iana Mode shows the IANA ID which allows the user to
	 * determine the current time zone for the POI. Usage examples:
	 * 
	 * timeZone=iana
	 * 
	 * @return
	 */
	public String getTimeZone() {
		return timeZone;
	}

	/**
	 * Set used to indicate the mode in which the timeZone object should be
	 * returned. Values: iana Mode shows the IANA ID which allows the user to
	 * determine the current time zone for the POI. Usage examples:
	 * 
	 * timeZone=iana
	 * 
	 * @param timeZone
	 */
	public NearbySearchRequest setTimeZone(String timeZone) {
		this.timeZone = timeZone;
		return this;
	}
}
