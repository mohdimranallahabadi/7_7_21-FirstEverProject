package com.pages.MavenActitime;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.genrics.MavenActitime.BasePage;
import com.genrics.MavenActitime.ExcelLiberary;

public class POMCreateACustomer 
{
	//Make instance Driver variable so as to use it inside all the methods of this class
	public WebDriver driver;
	
	@FindBy(xpath = "//div[.='Tasks']")
	private WebElement taskTabClick;
	
	@FindBy(xpath = "//div[.='Add New']")
	private WebElement addNewButton;
	
	@FindBy(xpath = "//div[.='+ New Customer']")
	private WebElement addNewCustomerButton;
	
	@FindBy(xpath = "//span[@id='ext-gen1_titlePlaceholder']/../../../../../..//input[@placeholder='Enter Customer Name']")
	private WebElement enterCustomerNameTextField;
	
	@FindBy(xpath = "//span[@id='ext-gen1_titlePlaceholder']/../../../../../..//textarea[@placeholder='Enter Customer Description']")
	private WebElement enterCustomerDiscriptionTextField;
	
	@FindBy(xpath = "//span[@id='ext-gen1_titlePlaceholder']/../../../../../..//div[@class='dropdownButton']")
	private WebElement SelectCustomerdropDownList;
	
	@FindBy(xpath = "//span[@id='ext-gen1_titlePlaceholder']/../../../../../..//div[.='Galaxy Corporation']")
	private WebElement selectGalaxy;
	
	@FindBy(xpath = "//span[@id='ext-gen1_titlePlaceholder']/../../../../../..//div[.='Create Customer']")
	private WebElement createCustomerButton;
	
	@FindBy(xpath = "//span[@id='ext-gen1_titlePlaceholder']/../../../../../..//div[.='Cancel']")
	private WebElement cancelButton;
	
	public POMCreateACustomer(WebDriver driver)
	{
		this.driver=driver;//Make this driver to refer driver at instance of the class
		PageFactory.initElements(driver, this);
	}
	
	public void taskTabClickMethod()
	{
		taskTabClick.click();
	}
	
	public void addNewMethod()
	{
		addNewButton.click();
		addNewCustomerButton.click();
	}
	
	public void customerDetailFillMethod() throws IOException
	{
		enterCustomerNameTextField.sendKeys(ExcelLiberary.fetchExcelData(523, 4));
		enterCustomerDiscriptionTextField.sendKeys(ExcelLiberary.fetchExcelData(768, 9));
		BasePage.actionsClickHoverContextDouble(driver, SelectCustomerdropDownList, "Click");
		BasePage.actionsClickHoverContextDouble(driver, selectGalaxy, "Click");
	}
	
	public void createButtonMethod()
	{
		createCustomerButton.click();
	}
	
	public void cancelAndHandleMethod()
	{
		cancelButton.click();
		BasePage.acceptAlert(driver);
	}
}
