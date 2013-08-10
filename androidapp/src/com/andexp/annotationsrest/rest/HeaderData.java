package com.andexp.annotationsrest.rest;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class HeaderData {
	@JsonProperty("Referer")
	private String referer;
	
	@JsonProperty("User-Agent")
	private String userAgent;
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Referer : ").append(this.referer).append("\n");
		builder.append("User-Agent : ").append(this.userAgent).append("\n");
		return builder.toString();
	}
}
