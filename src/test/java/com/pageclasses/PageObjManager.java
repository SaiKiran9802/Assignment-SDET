package com.pageclasses;

import org.openqa.selenium.WebDriver;

public class PageObjManager {
       Dynmctable_Page dt;
       public WebDriver driver;
	
   
       //calling the contructor for initilization of driver to the page class
 public PageObjManager(WebDriver driver) {
		this.driver=driver;
		}
	
	
	
 public Dynmctable_Page Dynmictable() {
		dt=new Dynmctable_Page(driver);
		return dt;
	}
	
}
