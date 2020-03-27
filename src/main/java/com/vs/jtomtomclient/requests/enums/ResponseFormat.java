package com.vs.jtomtomclient.requests.enums;

public enum ResponseFormat {
	JSON(".json"),
	JSON_P(".jsonp"),
	JS(".js"),
	XML(".xml");
	
	private final String extension;
	
	private ResponseFormat(String extension) {
		this.extension = extension;
	}

	public String getExtension() {
		return extension;
	}
	
	
}
