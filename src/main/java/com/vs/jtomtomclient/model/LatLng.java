package com.vs.jtomtomclient.model;

public class LatLng {
	private Double lat;
	private Double lon;
	
	public LatLng() {
		lat = 0.0;
		lon = 0.0;
	}
	
	public LatLng(Double double1, Double double2) {
		this.lat = double1;
		this.lon = double2;
	}

	public Double getLat() {
		return lat;
	}

	public void setLat(Double lat) {
		this.lat = lat;
	}

	public Double getLon() {
		return lon;
	}

	public void setLon(Double lng) {
		this.lon = lng;
	}
	
	
}
