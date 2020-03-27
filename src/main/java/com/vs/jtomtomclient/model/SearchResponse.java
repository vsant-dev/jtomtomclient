package com.vs.jtomtomclient.model;

import java.util.List;

public class SearchResponse {
	
	private Summary summary;
	
	private List<? extends Place> results;
	
	public Summary getSummary() {
		return summary;
	}

	public void setSummary(Summary summary) {
		this.summary = summary;
	}

	public List<? extends Place> getResults() {
		return results;
	}

	public void setResults(List<? extends Place> results) {
		this.results = results;
	}
	
}
