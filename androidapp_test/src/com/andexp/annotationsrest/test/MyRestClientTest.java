package com.andexp.annotationsrest.test;

import java.util.HashMap;

import android.test.AndroidTestCase;
import android.util.Log;

import com.andexp.annotationsrest.rest.ArgsData;
import com.andexp.annotationsrest.rest.Header;
import com.andexp.annotationsrest.rest.MyRestClient_;
import com.andexp.annotationsrest.rest.TimeData;

public class MyRestClientTest extends AndroidTestCase {
	public void testGetTime() {
		TimeData time = new MyRestClient_().getTime();
		assertNotNull(time.getDate());
		assertTrue(time.getMillis() + 2000 > System.currentTimeMillis()); // add 2 seconds to count latency
	}
	
	public void testGetHeaders(){
		Header header = new MyRestClient_().getHeader();
		assertTrue(header.getHeaderData().getUserAgent().length() > 10);
	}
	
	public void testGetVersionRest() {
		String idTest = "toto";
		String dataTest = "myData";
		Header data = new MyRestClient_().getGetData("toto", "myData");
		assertEquals(idTest, data.getArgs().getId());
		assertEquals(dataTest, data.getArgs().getData());
	}
	
	public void testPostVersionRest() {
		ArgsData args = new ArgsData();
		args.setData("super data");
		args.setId("42");
		
		Header postedData = new MyRestClient_().getPostedData(args);
		assertNotNull(postedData);
		assertNotNull(postedData.getJsonData());
		
		assertEquals(args.getData(), 
				postedData.getJsonData().getData());
		assertEquals(args.getId(), 
				postedData.getJsonData().getId());
	}

}
