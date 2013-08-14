package com.andexp.annotationsrest.rest;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class HeaderData {
	@JsonProperty("User-Agent")
	private String userAgent;

	public String getUserAgent() {
		return userAgent;
	}

	public void setUserAgent(String userAgent) {
		this.userAgent = userAgent;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("User-Agent : ").append(this.userAgent).append("\n");
		return builder.toString();
	}
}
