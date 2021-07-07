package com.pages.MavenActitime;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import com.genrics.MavenActitime.BasePage;
import com.genrics.MavenActitime.ExcelLiberary;

public class PomFacebookSignUp 
{
	public WebDriver driver;
	
	@FindBy(xpath = "//a[.='Create New Account']")
	private WebElement createNewAccountButton;
	
	@FindBy(xpath = "//input[@aria-label='First name']")
	private WebElement firstNameTextField;
	
	@FindBy(xpath = "//input[@aria-label='Surname']")
	private WebElement surNameTextField;
	
	@FindBy(xpath = "//input[@aria-label='Mobile number or email address']")
	private WebElement emailMobileTextField;
	
	@FindBy(xpath = "//input[@aria-label='New password']")
	private WebElement newPasswordPasswordField;
	
	@FindBy(id = "birthday-help")
	private WebElement birthdayHelpIcon;
	
	@FindBy(xpath = "//select[@aria-label='Day']")
	private WebElement selectDayDropDownList;
	
	@FindBy(xpath = "//select[@aria-label='Month']")
	private WebElement selectMonthDropDownList;
	
	@FindBy(xpath = "//select[@aria-label='Year']")
	private WebElement selectYearDropDownList;
	
	@FindBy(id = "gender-help")
	private WebElement genderHelpIcon;
	
	@FindBy(xpath = "//input[@name='sex'][@value='1']")
	private WebElement femaleRadioButton;
	
	@FindBy(xpath = "//input[@name='sex'][@value='2']")
	private WebElement maleRadioButton;
	
	@FindBy(xpath = "//input[@name='sex'][@value='-1']")
	private WebElement customRadioButton;
	
	@FindBy(xpath = "//div[contains(text(),'quick and easy')]/../..//a[.='Terms']")
	private WebElement termsLink;
	
	@FindBy(xpath = "//div[contains(text(),'quick and easy')]/../..//a[.='Data Policy']")
	private WebElement dataPolicyLink;
	
	@FindBy(xpath = "//div[contains(text(),'quick and easy')]/../..//a[.='Cookie Policy']")
	private WebElement cookiePolicyLink;
	
	@FindBy(xpath = "(//div[contains(text(),'quick and easy')]/../..//button[.='Sign Up'])[1]")
	private WebElement signUpButton;
	
	@FindBy(xpath = "//img[@src='https://static.xx.fbcdn.net/rsrc.php/v3/y2/r/__geKiQnSG-.png']")
	private WebElement closeButton;
	
	public PomFacebookSignUp(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void signUpMethod() throws IOException
	{
		BasePage.actionsClickHoverContextDouble(driver, createNewAccountButton, "Click");
		
		//createNewAccountButton.click();
		
		firstNameTextField.sendKeys(ExcelLiberary.fetchExcelData(2, 7));
		surNameTextField.sendKeys(ExcelLiberary.fetchExcelData(5, 8));
		emailMobileTextField.sendKeys(ExcelLiberary.fetchExcelData(4, 4));
		newPasswordPasswordField.sendKeys(ExcelLiberary.fetchExcelData(34, 4));
		BasePage.selectByText(selectDayDropDownList, ExcelLiberary.fetchExcelData(64, 2));//Used ' to convert it string
		BasePage.selectByIndex(selectMonthDropDownList, 11);//This takes indexing from 1..not from 0
		BasePage.selectByText(selectYearDropDownList, ExcelLiberary.fetchExcelData(294, 0));		
		BasePage.actionsClickHoverContextDouble(driver, maleRadioButton, "Click");
		BasePage.actionsClickHoverContextDouble(driver, signUpButton, "Click");
	}
	
	public void signUpButtonMethod()
	{
		BasePage.actionsClickHoverContextDouble(driver, signUpButton, "Click");
	}
	
	public void closeSignUpPageMethod()
	{
		BasePage.actionsClickHoverContextDouble(driver, closeButton, "Click");
	}
	
	public void termsLinkMethod()
	{
		BasePage.actionsClickHoverContextDouble(driver, termsLink, "Context");
	}
	
	public void dataPolicyLinkMethod()
	{
		BasePage.actionsClickHoverContextDouble(driver, dataPolicyLink, "Hover");
	}
	
	public void cookiePolicyLinkMethod()
	{
		BasePage.actionsClickHoverContextDouble(driver, cookiePolicyLink, "Double");
	}
	
	public void birthdayHelpIconTitleCheckMethod ()
	{
		if (birthdayHelpIcon.getAttribute("title").equalsIgnoreCase("click here to help")) {
			Reporter.log("Title matched",true);
		}else {
			Reporter.log("Title didn't match",true);
		}
	}
	
	public void genderHelpIconTitleCheckMethod()
	{
		if (genderHelpIcon.getAttribute("title").equalsIgnoreCase("gender help")) {
			Reporter.log("Title match",true);
		}else {
			Reporter.log("Title mismatch",true);
		}
	}
}
