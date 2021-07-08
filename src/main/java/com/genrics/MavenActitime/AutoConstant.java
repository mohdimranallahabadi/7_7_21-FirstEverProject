package com.genrics.MavenActitime;

public interface AutoConstant 
{
	//It contains keys and values, urls, excel path, excel sheet name..All things without methods
	
	String chrome_key="webdriver.chrome.driver";
	String chrome_value="./drivers/chromedriver.exe";
	String gecko_key="webdriver.gecko.driver";
	String gecko_value="./drivers/geckodriver.exe";
	String ie_key="webdriver.ie.driver";
	String ie_value="./drivers/IEDriverServer.exe";
	String excelsheet_path="./testdata/TestingDataInternet.xlsx";
	String excellsheet_name="Orders";
	String url_facebook="https://en-gb.facebook.com/";
	String url_instagram="https://www.instagram.com/accounts/emailsignup/";
	String url_actitime="https://demo.actitime.com";
	String url_google="https://www.google.com";
}
