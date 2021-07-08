package com.pages.MavenActitime;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMGoogleAutoSuggestionHandling 
{
	@FindBy(xpath = "//input[@title='Search']")
	private WebElement searchBox;
	
	@FindBy(xpath = "//span[contains(text(),'tesla')]")
	private List<WebElement> suggestionsList;
	
	public POMGoogleAutoSuggestionHandling(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void searchMethod()
	{
		searchBox.sendKeys("tesla");
		System.out.println(suggestionsList.size());
		for (int i = 0; i < suggestionsList.size(); i++) 
		{
			System.out.println(suggestionsList.get(i).getText());
			if (suggestionsList.get(i).getText().contains("model 3")) 
			{
				suggestionsList.get(i).click();
				break;
			}
		}
	}	
}
