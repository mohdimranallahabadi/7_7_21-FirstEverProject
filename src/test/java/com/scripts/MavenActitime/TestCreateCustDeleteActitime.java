package com.scripts.MavenActitime;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.pages.MavenActitime.POMDeleteACustomer;

public class TestCreateCustDeleteActitime extends TestCreateCustomerActiTime
{ 	
	@BeforeTest
	public void urlChoseMethod()
	{
		website="actitime";
	}
	@Test
	public void createDeleteCustActMethod() throws InterruptedException
	{
		POMDeleteACustomer delete=new POMDeleteACustomer(driver);
		delete.deleteCustomerMethod();
	}
}
