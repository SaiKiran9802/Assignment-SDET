package com.utilities;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	public WebDriver driver;
	public String currentpageURL;
	 
	//to initilitize the browser
	 public TestBase() throws IOException {
		 System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		 driver= new ChromeDriver();
	     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	     driver.manage().window().maximize();
		
	}
	 
	 //to launch the URL
	 public String LaunchURL(String URL) {
		 
		driver.get(URL);
		currentpageURL= driver.getCurrentUrl();
		return currentpageURL;
	 }
	 
}
