package com.vs.jtomtomclient.model;

public class Summary {
	private String queryType;
	
	private Long queryTime;
	
	private Long numResults;
	
	private Integer offset;
	
	private Long totalResults;
	
	private Integer fuzzyLevel;
	
	private LatLng geoBias;
	
	public String getQueryType() {
		return queryType;
	}

	public void setQueryType(String queryType) {
		this.queryType = queryType;
	}

	public Long getQueryTime() {
		return queryTime;
	}

	public void setQueryTime(Long queryTime) {
		this.queryTime = queryTime;
	}

	public Long getNumResults() {
		return numResults;
	}

	public void setNumResults(Long numResults) {
		this.numResults = numResults;
	}

	public Integer getOffset() {
		return offset;
	}

	public void setOffset(Integer offset) {
		this.offset = offset;
	}

	public Long getTotalResults() {
		return totalResults;
	}

	public void setTotalResults(Long totalResults) {
		this.totalResults = totalResults;
	}

	public Integer getFuzzyLevel() {
		return fuzzyLevel;
	}

	public void setFuzzyLevel(Integer fuzzyLevel) {
		this.fuzzyLevel = fuzzyLevel;
	}

	public LatLng getGeoBias() {
		return geoBias;
	}

	public void setGeoBias(LatLng geoBias) {
		this.geoBias = geoBias;
	}
	
	
}
