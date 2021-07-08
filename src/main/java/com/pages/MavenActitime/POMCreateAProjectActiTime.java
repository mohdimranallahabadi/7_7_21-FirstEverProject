package com.pages.MavenActitime;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMCreateAProjectActiTime 
{
	public WebDriver driver;
	
	@FindBy(id="container_tasks")
	private WebElement taskTab;
	
	@FindBy(xpath = "//div[.='Add New']")
	private WebElement addNewButton;
	
	@FindBy(xpath = "//div[.='+ New Project']")
	private WebElement newProjectButton;
	
	@FindBy(xpath = "//span[.='Create New Project']/../../../../../..//input[@placeholder='Enter Project Name']")
	private WebElement enterProjectNameTextField;
	
	@FindBy(xpath = "//span[.='Create New Project']/../../../../../..//div[@class='dropdownButton']")
	private WebElement dropDownButton;
	
	@FindBy(xpath = "(//span[.='Create New Project']/../../../../../..//div[.='Galaxy Corporation'])[1]")
	private WebElement chooseCustomerOptionButton;
	
	@FindBy(xpath = "//span[.='Create New Project']/../../../../../..//textarea[@placeholder='Add Project Description']")
	private WebElement addProjectDescriptionTextArea;
	
	@FindBy(xpath = "(//span[.='Create New Project']/../../../../../..//input[@placeholder='Enter task name'])[1]")
	private WebElement enterTaskNameFirstTextarea;
	
	@FindBy(xpath = "(//a[@id='descriptionElement'])[1]")
	private WebElement enterTaskDescriptionButton;
	
	@FindBy(id = "editDescriptionPopupText")
	private WebElement startTypingDescriptionTextArea;
	
	@FindBy(id="scbutton")
	private WebElement saveButton;
	
	@FindBy(xpath = "//input[@class='infobutton cancelBtn']")
	private WebElement cancelDiscriptionPopupButton;
	
	@FindBy(xpath = "(//span[.='Create New Project']/../../../../../..//input[@placeholder='not needed'])[1]")
	private WebElement estimateTimeFirstTextField;
	
	@FindBy(xpath = "(//span[.='Create New Project']/../../../../../..//button[.='set deadline'])[1]")
	private WebElement setDeadlineButton;
	
	@FindBy(xpath = "//a[@title='Next Month (Control+Right)']")
	private WebElement nextMonthButton;
	
	@FindBy(xpath = "//button[.='October 2021']/../../../../../../../..//span[.='20']")
	private WebElement dateChoosePopup;
	
	@FindBy(xpath = "(//span[.='Create New Project']/../../../../../..//div[@class='value ellipsis'])[1]")
	private WebElement typeOfWorkButton;
	
	@FindBy(xpath = "(//span[.='Create New Project']/../../../../../..//div[.='testing'])[1]")
	private WebElement chooseTypeOfWorkOptionButton;
	
	@FindBy(xpath = "//div[.='Create Project']")
	private WebElement createProjectButton;
	
	@FindBy(xpath = ";//span[.='Create New Project']/../../../../../..//div[.='Cancel']")
	private WebElement createProjectCancelButton;
	
	//Deleting the project part
	
	@FindBy(xpath = "//div[.='All projects of all customers (active and archived)']/../../../..//div[.='Project name']/../..//div[@class='editButton']")
	private WebElement gearButton;
	
	@FindBy(xpath = "(//div[.='Project name']/../../../../../../..//div[.='ACTIONS'])[2]")
	private WebElement actionsButton;
	
	@FindBy(xpath = "//div[.='Project name']/../../..//div[.='ACTIONS']/../../../../../..//div[.='Delete']")
	private WebElement deleteButton;
	
	@FindBy(xpath = "//div[.='Project name']/../../..//div[.='ACTIONS']/../../../../../..//span[.='Delete permanently']")
	private WebElement deletePermanentButton;
	
	public POMCreateAProjectActiTime(WebDriver driver)
	{
		this.driver=driver;//This will make local driver refer to instance driver
		PageFactory.initElements(driver, this);
	}
	
	//This not the proper way to do..ie make diff methods for diff things...try to make as less as possible methods
	public void taskTabButton()
	{
		taskTab.click();
	}
	
	public void addNewProjectMethod()
	{
		addNewButton.click();
		newProjectButton.click();
	}
	
	public void createNewProject()
	{
		enterProjectNameTextField.sendKeys("Project name");
		dropDownButton.click();
		chooseCustomerOptionButton.click();
		addProjectDescriptionTextArea.sendKeys("this is search area");
	}
	
	public void addFirstTaskMethod()
	{
		enterTaskNameFirstTextarea.sendKeys("TaskName");
		enterTaskDescriptionButton.click();
		startTypingDescriptionTextArea.sendKeys("startTypingArea");
		saveButton.click();
		estimateTimeFirstTextField.sendKeys("12:12");
		setDeadlineButton.click();
		for (int i = 0; i < 4; i++) 
		{
			nextMonthButton.click();
		}
		dateChoosePopup.click();
		typeOfWorkButton.click();
		chooseTypeOfWorkOptionButton.click();
	}
	public void createProjectButtonMethod()
	{
		createProjectButton.click();
	}
	public void cancelProjectButton()
	{
		createProjectCancelButton.click();
		Alert alt=driver.switchTo().alert();
		System.out.println(alt.getText());
		alt.accept();
	}
	public void deleteprojectMethod() throws InterruptedException
	{
		gearButton.click();
		Thread.sleep(3000);
		actionsButton.click();
		deleteButton.click();
		deletePermanentButton.click();
	}
}
