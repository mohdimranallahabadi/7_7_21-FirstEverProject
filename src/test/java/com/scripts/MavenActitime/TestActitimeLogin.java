package com.scripts.MavenActitime;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.genrics.MavenActitime.BaseTest;
import com.pages.MavenActitime.POMActiTIMELoginPage;

@Listeners(com.genrics.MavenActitime.Utility.class)
public class TestActitimeLogin extends BaseTest 
{
	@BeforeTest
	public void urlChoseMethod()
	{
		website="actitime";
	}
	
	@Test
	public void aloginToActitimeMethod()
	{
		POMActiTIMELoginPage actLog=new POMActiTIMELoginPage(driver);
		actLog.loginMethod();
	}
}
