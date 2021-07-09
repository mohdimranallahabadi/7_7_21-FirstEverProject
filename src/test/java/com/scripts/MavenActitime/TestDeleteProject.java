package com.scripts.MavenActitime;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.pages.MavenActitime.POMDeleteAProject;

@Listeners(com.genrics.MavenActitime.Utility.class)
public class TestDeleteProject extends TestCreateProject
{
	@BeforeTest
	public void urlChoseMethod()
	{
		website="actitime";
	}
	@Test
	public void deleteProject() throws InterruptedException
	{
		POMDeleteAProject del=new POMDeleteAProject(driver);
		del.deleteprojectMethod();
	}	
}
