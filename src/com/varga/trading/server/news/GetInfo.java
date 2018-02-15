package com.varga.trading.server.news;

import java.io.StringReader;
import java.math.BigDecimal;

import javax.json.Json;
import javax.json.stream.JsonParser;
import javax.json.stream.JsonParser.Event;

public class GetInfo {

	public GetInfo() {
		System.out.println("Inside GetInfo constructor"); 
	}
	
	
	 public void test_sub() {
		
		 
		String result = "{\"name\":\"Falco\",\"age\":3,\"bitable\":false}";
	    JsonParser parser = Json.createParser(new StringReader(result));
	    
	    String key = null;
	    //String value = null;
	    while (parser.hasNext()) {
	         final Event event = parser.next();
	         switch (event) {
	            case KEY_NAME:
	                 key = parser.getString();
	                 System.out.println(key);
	                 break;
	            case VALUE_STRING:
	                 String string = parser.getString();
	                 System.out.println(string);
	                 break;
	            case VALUE_NUMBER:
	                BigDecimal number = parser.getBigDecimal();
	                System.out.println(number);
	                break;
	            case VALUE_TRUE:
	                System.out.println(true);
	                break;
	            case VALUE_FALSE:
	                System.out.println(false);
	                break;
	            }
	        }
	        parser.close();
	}
}
