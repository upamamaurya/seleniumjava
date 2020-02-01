package com.browsers;

public class TC_001 extends BaseTest
{
	
	public static void main(String[] args) throws Exception
	{
		init(); //to initialize data.properties file
		
		launch("chromebrowser");
		
		navigateUrl("amazonurl");
		
	}
	

}
