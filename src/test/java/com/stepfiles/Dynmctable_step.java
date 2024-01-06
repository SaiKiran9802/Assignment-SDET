package com.stepfiles;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.List;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.utilities.Jsonutils;
import com.utilities.TestBase;
import com.utilities.Util;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Dynmctable_step {
	
	public Util util;
    Jsonutils js;
	
	//dependency injection with picoontainer
	public Dynmctable_step(Util Util) throws IOException {
		this.util = Util;
		}
	
	//Validates the page Header
	@Given("User lands on {string}")
	public void user_lands_on(String URL) {
	util.base.LaunchURL(URL);	
	util.po.Dynmictable().Validatelandingpage(); //Step 1
	}
	
	//Enters the data into the fields
	@When("User Inserts the data in input text box")
	public void user_inserts_the_data_input_text_box() throws IOException, ParseException {
	util.po.Dynmictable().UserinputsData(util.js.InputJson()); //step2 and step3
     }
	
	// to clicks on refreshbutton
	@And("User clicks on Refresh Table")
	public void clicks_on_refresh_table() {
		
	   util.po.Dynmictable().clickrefreshbutton();   
	
	}
	
	
	//to validate the data the entered data into the field
	@Then("User validates the entered data with Json") //step 4 and step 5 validating data
	public void User_validates_the_entered_data_with_Json() {  
	 
		for(int i=0; i<util.js.size();i++) {
	    	String jsonname= util.js.Validate("["+i+"].name");
	    	String jsonage= util.js.Validate("["+i+"].age");
	        String jsongenger= util.js.Validate("["+i+"].gender");
	    	
	    	
	    	String tablename=util.po.Dynmictable().tdValidatename(i);
	    	String tableage=util.po.Dynmictable().tdValidateage(i);
	    	String tablegender=util.po.Dynmictable().tdValidategender(i);
	    	
	        assertEquals(jsonname, tablename);
	        assertEquals(jsonage, tableage);
	        assertEquals(tablegender, jsongenger);
	        
		
	}
		
	}	
		
	}

	
	
	
	
	

