package com.pages.MavenActitime;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMActiTIMELoginPage
{	
	public WebDriver driver;
	
	@FindBy(id="username")
	private WebElement userNameTextfield;
	
	@FindBy(xpath = "//input[@name='pwd']")
	private WebElement passwordTextfield;
	
	@FindBy(id="keepLoggedInCheckBox")
	private WebElement keepMeLoggedInCheckbox;
	
	@FindBy(xpath = "//div[.='Login ']")
	private WebElement loginButton;
	
	@FindBy(id="toPasswordRecoveryPageLink")
	private WebElement forgotYourPaswordLink;
	
	@FindBy(xpath = "//a[.='actiTIME Inc.']")
	private WebElement actiTimeIncLink;

	public POMActiTIMELoginPage(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this); 
	}
	
	public void loginMethod()
	{
		userNameTextfield.sendKeys("admin");
		passwordTextfield.sendKeys("manager");
		keepMeLoggedInCheckbox.click();
		loginButton.click();
	}
	
	public void forgotPasswordLinkMethod() 
	{
		forgotYourPaswordLink.click();
	}
	
	public void actiTimeIncLinkMethod() 
	{
		actiTimeIncLink.click();
	}
}
