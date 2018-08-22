package tests;

import helpers.eBayhelper;
import io.appium.java_client.AppiumDriver;

//This class contains sanity usecase
public class eBaySanity extends eBayhelper

{
	public void logintoeBayandadditemtocart(AppiumDriver driver)
   {
		eBayhelper helper=new eBayhelper();
		helper.logintoeBay(driver);
		helper.Search("Watches");
		
		
	}

}
