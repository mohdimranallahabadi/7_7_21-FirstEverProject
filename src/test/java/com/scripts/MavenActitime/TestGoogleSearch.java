package com.scripts.MavenActitime;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.genrics.MavenActitime.BaseTest;
import com.pages.MavenActitime.POMGoogleAutoSuggestionHandling;

public class TestGoogleSearch extends BaseTest 
{
	@BeforeTest
	public void urlChoseMethod() 
	{
		website="google";
	}
	
	@Test
	public void gooSuggest()
	{
		POMGoogleAutoSuggestionHandling goo=new POMGoogleAutoSuggestionHandling(driver);
		goo.searchMethod();
	}	
}
