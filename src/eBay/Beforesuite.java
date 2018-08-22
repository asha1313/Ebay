package eBay;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class Beforesuite 
{
	public AppiumDriver driver;
	@BeforeClass
	public void setup() throws MalformedURLException
	{
		DesiredCapabilities capabilites=new DesiredCapabilities();
		
		capabilites.setCapability("BROWSER_NAME", "Android");
		capabilites.setCapability("VERSION", "5.1.1");
		capabilites.setCapability("deviceName", "ZX1G42C4ZB");
		capabilites.setCapability("platformName", "Android");
		capabilites.setCapability("appPackage", "com.ebay.mobile.activities");
	    capabilites.setCapability("appActivity", "com.ebay.mobile.activities.MainActivity");
	    driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilites);
	    driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
	}                                                                                                                                                                                                                                      
                          

}
