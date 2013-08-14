package com.andexp.annotationsrest.rest;

import java.util.HashMap;

import org.springframework.http.converter.json.MappingJacksonHttpMessageConverter;

import com.googlecode.androidannotations.annotations.rest.Accept;
import com.googlecode.androidannotations.annotations.rest.Get;
import com.googlecode.androidannotations.annotations.rest.Post;
import com.googlecode.androidannotations.annotations.rest.Rest;
import com.googlecode.androidannotations.api.rest.MediaType;

@Rest(converters= {MappingJacksonHttpMessageConverter.class})
public interface MyRestClient {
	
	@Get("http://time.jsontest.com/")
	@Accept(MediaType.APPLICATION_JSON)
	TimeData getTime();
	
	@Get("http://httpbin.org/headers")
	@Accept(MediaType.APPLICATION_JSON)
	Header getHeader();
	
	@Get("http://httpbin.org/get?id={id}&data={data}")
	@Accept(MediaType.APPLICATION_JSON)
	Header getGetData(String id, String data);
	
	
	@Post("http://httpbin.org/post")
	@Accept(MediaType.APPLICATION_JSON)
	Header getPostedData(ArgsData argsData);
}
