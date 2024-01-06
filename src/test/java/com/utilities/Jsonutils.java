package com.utilities;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import io.cucumber.cienvironment.internal.com.eclipsesource.json.JsonParser;
import io.restassured.path.json.JsonPath;

public class Jsonutils {
public String jspayload;

 public JsonPath jp;

    
  
    //return the json file as String
   public String InputJson() throws IOException{
			
		    jspayload=new String(Files.readAllBytes(Paths.get("payload.json")));
		    System.out.println(jspayload);
		    
	        return jspayload;
	       }
            
   //creating the object for Jsonpath to parse the Json
  public String Validate(String str) {
      		jp= new JsonPath(jspayload);
      		String str1= jp.get(str).toString();
      	    
      	  return str1;
      		
		}
      	
  //getting the size of the json objects
  public int size() {
      		jp= new JsonPath(jspayload);
      	int size= jp.getInt("$.size()");
			return size;
      		
      		
      	}
      	
      	
      	
      	
      	
}
	
	
	
	
	
	
	
	
	
	
	
	


