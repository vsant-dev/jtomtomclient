package com.vs.jtomtomclient.model;

public class OpeningHours {
	/**
	 * Mode used in the Request
	 */
	private String mode;

	/**
	 * List of time ranges for the next 7 days.
	 */
	private TimeRange[] timeRanges;

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

	public TimeRange[] getTimeRanges() {
		return timeRanges;
	}

	public void setTimeRanges(TimeRange[] timeRanges) {
		this.timeRanges = timeRanges;
	}
	
	
}
