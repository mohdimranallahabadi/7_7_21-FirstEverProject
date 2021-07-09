package com.scripts.MavenActitime;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.pages.MavenActitime.POMCreateACustomer;

@Listeners(com.genrics.MavenActitime.Utility.class)
public class TestCreateCustomerActiTime extends TestActitimeLogin
{
	@BeforeTest
	public void urlChoseMethod()
	{
		website="actitime";
	}
	
	@Test
	public void createCustomerLogin() throws IOException
	{
		POMCreateACustomer creatCust=new POMCreateACustomer(driver);
		creatCust.taskTabClickMethod();
		creatCust.addNewMethod();
		creatCust.customerDetailFillMethod();
		creatCust.createButtonMethod();
	}
}