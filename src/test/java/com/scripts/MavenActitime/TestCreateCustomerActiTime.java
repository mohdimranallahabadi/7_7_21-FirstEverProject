package com.scripts.MavenActitime;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.pages.MavenActitime.POMCreateACustomer;

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