package com.utilities;

import com.pageclasses.Dynmctable_Page;
import com.pageclasses.PageObjManager;

public class Util {

	
	//this class will create the objects for all the common uilities
	
	public PageObjManager po;
	public TestBase base;
	public Jsonutils js;
	public Util() throws Exception {
		base= new TestBase();
		po= new PageObjManager(base.driver);
		js= new Jsonutils();
		
	}
	
	
	
}
