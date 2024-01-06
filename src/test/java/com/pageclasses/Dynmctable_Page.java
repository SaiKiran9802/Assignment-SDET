package com.pageclasses;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Dynmctable_Page {

	public WebDriver driver;
	
	public Dynmctable_Page(WebDriver driver) {
		this.driver=driver;	
	}
	
	
	private By curentpageheader= By.xpath("//h1");
	private By Tablebutton= By.xpath("//summary[text()='Table Data']");
	private By JsonTxtbox= By.id("jsondata");
	private By refreshtable=By.id("refreshtable");
	
	
	
	
	
	
	//validates the current page header
public void Validatelandingpage() {
		String Header= driver.findElement(curentpageheader).getText();
		assertEquals(Header, "Dynamic HTML TABLE Tag");
		
	}
	
	
	//enter the data into the field
public void UserinputsData(String json) {
		  driver.findElement(Tablebutton).click();//clicks on Table Data button
		  driver.findElement(JsonTxtbox).isDisplayed();//validates the json text box
		  driver.findElement(JsonTxtbox).clear();//clears the existing text from text box
		  driver.findElement(JsonTxtbox).sendKeys(json);//
		 }
	
 //clicks on refreshbutton
 public void clickrefreshbutton() {
	
		driver.findElement(refreshtable).isEnabled();
		driver.findElement(refreshtable).click();
		
	}

 //to validate name
 public String tdValidatename(int tabledata) {
		
      String tDname= driver.findElement(By.xpath("(//table//tr/td[1])[1+"+tabledata+"]")).getText();
	return tDname;
		
	}
 //to validate age	
 public String tdValidateage(int tabledata) {
	      String tDage= driver.findElement(By.xpath("(//table//tr/td[2])[1+"+tabledata+"]")).getText();
	return tDage;
		
	}
 //to validate gender
 public String tdValidategender(int tabledata) {
	      String tDgender= driver.findElement(By.xpath("(//table//tr/td[3])[1+"+tabledata+"]")).getText();
	return tDgender;
		
	}
}

	
	
	
	
	

