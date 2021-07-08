package com.scripts.MavenActitime;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.genrics.MavenActitime.BaseTest;
import com.pages.MavenActitime.POMActiTIMELoginPage;

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
