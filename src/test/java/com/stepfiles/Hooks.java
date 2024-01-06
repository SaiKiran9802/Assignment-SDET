
package com.stepfiles;
import com.utilities.Util;
import io.cucumber.java.After;

//dependency injection with picoontainer
public class Hooks {
	public Util util;
	    
	  public Hooks(Util Util) {
	   			this.util = Util;
	   			
	   		}
	
	  //to close the browser
	 @After
	 public void  closethebrowser(){
		 
		 util.base.driver.quit();
		 
		 
	 }
	

}
