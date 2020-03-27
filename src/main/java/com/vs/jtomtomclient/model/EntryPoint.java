package com.vs.jtomtomclient.model;

public class EntryPoint {
	/**
	 * Main entry point: One of: main minor
	 */
	private String type;
	
	/**
	 * Position of the entry point
	 */
	private LatLng position;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public LatLng getPosition() {
		return position;
	}

	public void setPosition(LatLng position) {
		this.position = position;
	}
	
	
}
