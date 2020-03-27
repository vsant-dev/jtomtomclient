package com.vs.jtomtomclient.model;

public class Viewport {
	/**
	 * Top left corner of the rectangle:
	 */
	private LatLng topLeftPoint;
	
	/**
	 * Bottom right corner of the rectangle:
	 */
	private LatLng btmRightPoint;

	public LatLng getTopLeftPoint() {
		return topLeftPoint;
	}

	public void setTopLeftPoint(LatLng topLeftPoint) {
		this.topLeftPoint = topLeftPoint;
	}

	public LatLng getBtmRightPoint() {
		return btmRightPoint;
	}

	public void setBtmRightPoint(LatLng btmRightPoint) {
		this.btmRightPoint = btmRightPoint;
	}
	
	
}
