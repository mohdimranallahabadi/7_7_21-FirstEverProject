package com.pages.MavenActitime;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMDeleteAProject 
{
	WebDriver driver;
	
	@FindBy(xpath = "//div[.='All projects of all customers (active and archived)']/../../../..//div[.='Project name']/../..//div[@class='editButton']")
	private WebElement gearButton;
	
	@FindBy(xpath = "(//div[.='Project name']/../../../../../../..//div[.='ACTIONS'])[2]")
	private WebElement actionsButton;
	
	@FindBy(xpath = "//div[.='Project name']/../../..//div[.='ACTIONS']/../../../../../..//div[.='Delete']")
	private WebElement deleteButton;
	
	@FindBy(xpath = "//div[.='Project name']/../../..//div[.='ACTIONS']/../../../../../..//span[.='Delete permanently']")
	private WebElement deletePermanentButton;
	
	public POMDeleteAProject(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void deleteprojectMethod() throws InterruptedException
	{
		Thread.sleep(3000);
		gearButton.click();
		Thread.sleep(3000);
		actionsButton.click();
		deleteButton.click();
		deletePermanentButton.click();
	}
	
}
