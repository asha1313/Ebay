package helpers;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;

import Pages.eBay_Login;
import Pages.eBay_SearchPage;
import eBay.Beforesuite;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;


//This class contains commonly used methods. If any changes, it easy to modify also easy to maintain
public class eBayhelper extends Beforesuite
{
	public void logintoeBay(AppiumDriver driver)
	{
		eBay_Login loginpage=new eBay_Login();
	    driver.findElement(loginpage.SignIn).click();
	    //findElements returns list of webelements so it return type is list
	    List<WebElement> credential_Fields=driver.findElements(loginpage.textbox);
	    credential_Fields.get(0).sendKeys("asha.cs13@gmail.com");
	    credential_Fields.get(1).sendKeys("Password");
	    driver.findElement(loginpage.login).click();
	    
		
	}
	public void Search(String searchKey)
	{ 
		eBay_SearchPage search=new eBay_SearchPage();
		//Scanner scan=new Scanner("System.in");
		//String str=scan.next();
		String cart="Add to Cart";
		driver.findElement(search.search_Box).click();
		driver.findElement(search.searchkey_KeyEnter).sendKeys(searchKey);
		WebElement auto_suggues=driver.findElement(search.select_autosugguestions);
		TouchActions action=new TouchActions(driver);
		action.moveToElement(auto_suggues).click();
		
		driver.findElement(search.select_autosugguestions).click();
		
		driver.findElement(search.select_size_dropdown).click();
		driver.findElement(search.select_size).click();
		//driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollIntoView("
				//+ "new UiSelector().text('Add to Cart')""))"));
		//or we can use scrollTo method which accepts string as arg
		driver.scrollTo(cart);
		
		
		
		
	}

	}


