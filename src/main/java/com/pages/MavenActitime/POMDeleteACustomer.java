package com.pages.MavenActitime;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMDeleteACustomer
{
	public WebDriver driver;
	
	@FindBy(xpath = "(//div[.='Customers & Projects']/../..//div[@class='editButton'])[8]")
	private WebElement gearIcon;
	
	@FindBy(xpath = "(//div[.='Galaxy Corporation']/../../../../../../../../../../..//div[.='ACTIONS'])[2]")
	private WebElement actionsButton;
	
	@FindBy(xpath = "(//div[.='Galaxy Corporation']/../../../../../../../../../../..//div[.='ACTIONS']/../../../../../..//div[.='Delete'])[2]")
	private WebElement deleteCustomer;
	
	@FindBy(xpath = "//div[.='Galaxy Corporation']/../../../../../../../../../../..//div[.='ACTIONS']/../../../../../..//span[.='Delete permanently']")
	private WebElement deleteConfirmationButton;
	
	public POMDeleteACustomer(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void deleteCustomerMethod() throws InterruptedException
	{
		Thread.sleep(3000);
		gearIcon.click();
		Thread.sleep(3000);
		actionsButton.click();
		deleteCustomer.click();
		deleteConfirmationButton.click();
	}	
}