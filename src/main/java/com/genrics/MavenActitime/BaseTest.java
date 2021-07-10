package com.genrics.MavenActitime;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseTest implements AutoConstant
{
	public static WebDriver driver;//We made this static so that we can acces it with class nam where we need
	public String website;
	
	@BeforeTest//We keep it here in this @ because it will change h website variable prior to the loading of urlEnteering method
	public void urlChoseMethod()
	{//Used to over send facebook or instagram etc to open different websites...By over riding in test method..in implimentation part
	}
	
	@BeforeClass
	public void openBrowser()
	{
		System.setProperty(chrome_key, chrome_value);
		//Do like this ..not a good idea to use this
		/*WebDriver driver=new ChromeDriver();
		this.driver=driver;//This will*/ 
		//Or do like this...This is good
		driver=new ChromeDriver();//This will be same as the instance webdriver
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	@BeforeMethod
	public void urlEntering()
	{
		if (website.contains("google")) {
			driver.get(url_google);
		}if (website.contains("facebook")) {
			driver.get(url_facebook);
		}if (website.contains("instagram")) {
			driver.get(url_instagram);
		}if (website.contains("actitime")) {
			driver.get(url_actitime);
		}
	}
	
	@AfterSuite//Put it here in afterSute annotation so that it doesen't close the browser
	public void quitBrowser()
	{
		driver.quit();
	}
}