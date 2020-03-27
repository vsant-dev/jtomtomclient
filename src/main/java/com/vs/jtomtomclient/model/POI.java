package com.vs.jtomtomclient.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class POI{
	/**
	 * Name of the POI
	 */
	private String name;
	
	/**
	 * Telephone number
	 */
	private String phone;
	
	/**
	 * The list of POI brands.
	 */
	private Brand[] brand;
	
	/**
	 * Website URL
	 */
	private String url;

	/**
	 * The list of the most specific POI categories.
	 */
	@JsonProperty(value="categorySet")
	private Category[] categories;
	
	private OpeningHours openingHours;
	
	private Classification[] classifications;

	private TimeZone timeZone;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Brand[] getBrand() {
		return brand;
	}

	public void setBrand(Brand[] brand) {
		this.brand = brand;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Category[] getCategories() {
		return categories;
	}

	public void setCategories(Category[] categories) {
		this.categories = categories;
	}

	public OpeningHours getOpeningHours() {
		return openingHours;
	}

	public void setOpeningHours(OpeningHours openingHours) {
		this.openingHours = openingHours;
	}

	public Classification[] getClassifications() {
		return classifications;
	}

	public void setClassifications(Classification[] classifications) {
		this.classifications = classifications;
	}

	public TimeZone getTimeZone() {
		return timeZone;
	}

	public void setTimeZone(TimeZone timeZone) {
		this.timeZone = timeZone;
	}
	
	
}
