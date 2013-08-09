package com.andexp.annotationsrest.rest;

import org.springframework.http.converter.json.MappingJacksonHttpMessageConverter;

import com.googlecode.androidannotations.annotations.rest.Accept;
import com.googlecode.androidannotations.annotations.rest.Get;
import com.googlecode.androidannotations.annotations.rest.Rest;
import com.googlecode.androidannotations.api.rest.MediaType;

@Rest(converters= {MappingJacksonHttpMessageConverter.class})
public interface MyRestClient {
	
	@Get("http://time.jsontest.com/")
	@Accept(MediaType.APPLICATION_JSON)
	TimeData getTime();
}
