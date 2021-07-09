package com.scripts.MavenActitime;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.pages.MavenActitime.POMCreateAProjectActiTime;

@Listeners(com.genrics.MavenActitime.Utility.class)
public class TestCreateProject extends TestActitimeLogin 
{
	@BeforeTest
	public void urlChoseMethod()
	{
		website="actitime";
	}
	@Test
	public void createProject()
	{
		POMCreateAProjectActiTime createp=new POMCreateAProjectActiTime(driver);
		createp.taskTabButton();
		createp.addNewProjectMethod();
		createp.createNewProject();
		createp.addFirstTaskMethod();
		createp.createProjectButtonMethod();
	}	
}
