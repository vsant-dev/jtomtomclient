package com.vs.jtomtomclient.model;

public class Address {
	/**
	 * The building number on the street.
	 */
	private String streetNumber;

	/**
	 * The street name
	 */
	private String streetName;

	/**
	 * Sub / Super City
	 */
	private String municipalitySubdivision;

	/**
	 * City / Town
	 */
	private String municipality;

	/**
	 * Country
	 */
	private String countrySecondarySubdivision;

	/**
	 * Named Area
	 */
	private String countryTertiarySubdivision;

	/**
	 * State or Province
	 */
	private String countrySubdivision;

	/**
	 * Postal Code / Zip Code
	 */
	private String postalCode;

	/**
	 * Extended postal code (availability dependent on region)
	 */
	private String extendedPostalCode;

	/**
	 * Country (Note: This is a two-letter code, not a country name.)
	 */
	private String countryCode;

	/**
	 * Country name
	 */
	private String country;

	/**
	 * ISO alpha-3 country-code
	 */
	private String countryCodeISO3;

	/**
	 * An address line formatted according to formatting rules of a Result's country
	 * of origin,or in case of countries its full country name.
	 */
	private String freeformAddress;

	/**
	 * A full name of a first level of country administrative hierarchy. This field
	 * appears only in case countrySubdivision is presented in an abbreviated form.
	 * Supported only for USA, Canada and Great Britain.
	 */
	private String countrySubdivisionName;

	/**
	 * An address component which represents the name of a geographic area or
	 * locality that groups a number of addressable objects for addressing purposes,
	 * without being an administrative unit.
	 */
	private String localName;

	public String getStreetNumber() {
		return streetNumber;
	}

	public void setStreetNumber(String streetNumber) {
		this.streetNumber = streetNumber;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getMunicipalitySubdivision() {
		return municipalitySubdivision;
	}

	public void setMunicipalitySubdivision(String municipalitySubdivision) {
		this.municipalitySubdivision = municipalitySubdivision;
	}

	public String getMunicipality() {
		return municipality;
	}

	public void setMunicipality(String municipality) {
		this.municipality = municipality;
	}

	public String getCountrySecondarySubdivision() {
		return countrySecondarySubdivision;
	}

	public void setCountrySecondarySubdivision(String countrySecondarySubdivision) {
		this.countrySecondarySubdivision = countrySecondarySubdivision;
	}

	public String getCountryTertiarySubdivision() {
		return countryTertiarySubdivision;
	}

	public void setCountryTertiarySubdivision(String countryTertiarySubdivision) {
		this.countryTertiarySubdivision = countryTertiarySubdivision;
	}

	public String getCountrySubdivision() {
		return countrySubdivision;
	}

	public void setCountrySubdivision(String countrySubdivision) {
		this.countrySubdivision = countrySubdivision;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getExtendedPostalCode() {
		return extendedPostalCode;
	}

	public void setExtendedPostalCode(String extendedPostalCode) {
		this.extendedPostalCode = extendedPostalCode;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCountryCodeISO3() {
		return countryCodeISO3;
	}

	public void setCountryCodeISO3(String countryCodeISO3) {
		this.countryCodeISO3 = countryCodeISO3;
	}

	public String getFreeformAddress() {
		return freeformAddress;
	}

	public void setFreeformAddress(String freeformAddress) {
		this.freeformAddress = freeformAddress;
	}

	public String getCountrySubdivisionName() {
		return countrySubdivisionName;
	}

	public void setCountrySubdivisionName(String countrySubdivisionName) {
		this.countrySubdivisionName = countrySubdivisionName;
	}

	public String getLocalName() {
		return localName;
	}

	public void setLocalName(String localName) {
		this.localName = localName;
	}
	
	

}
