package com.genrics.MavenActitime;

import java.util.ArrayList;
import java.util.Set;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage 
{	
	//Select class methods
	public static void selectByText(WebElement element,String text)
	{
		Select sel=new Select(element);
		sel.selectByVisibleText(text);
	}
	public static void selectByValue(WebElement element, String value)
	{
		Select sel=new Select(element);
		sel.selectByValue(value);
	}
	public static void selectByIndex(WebElement element, int index)
	{
		Select sel=new Select(element);
		sel.selectByIndex(index);
	}
	
	//Actions class methods
	public static void actionsClickHoverContextDouble(WebDriver driver, WebElement element, String Action)
	{
		Actions act=new Actions(driver);//NOTE It's Actions NOT Action   !!!!!!!!
		if (Action.contains("Click")) {
			act.click(element).perform();
		}if (Action.contains("Hover")) {
			act.moveToElement(element).perform();
		}if (Action.contains("Context")) {
			act.contextClick(element).perform();
		}if (Action.contains("Double")) {
			act.doubleClick(element).perform();
		}
	}
	
	public static void actionsClickHold(WebDriver driver, WebElement element)
	{
		Actions act=new Actions(driver);
		act.clickAndHold(element).perform();
	}
	public static void actionsRelease(WebDriver driver)
	{
		Actions act=new Actions(driver);
		act.release().perform();
	}
	public static void actionsDragAndDrop(WebDriver driver, WebElement source, WebElement target)
	{
		Actions act=new Actions(driver);
		act.dragAndDrop(source, target).perform();
	}
	
	//ExplicitWait Methods
	public static void tillVisibilityOfElementWait(WebDriver driver, WebElement element)
	{
		WebDriverWait wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public static void tillTitleContainsWait(WebDriver driver, String title)
	{
		WebDriverWait wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.titleContains(title));
	}
	
	public static void tillTextToBePresentWait(WebDriver driver, WebElement element, String text)
	{
		WebDriverWait wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.textToBePresentInElement(element, text));
	}
	
	//Popup methods
	public static void acceptAlert(WebDriver driver)
	{
		Alert alt=driver.switchTo().alert();
		alt.accept();
	}
	public static void dismissAlert(WebDriver driver)
	{
		Alert alt=driver.switchTo().alert();
		alt.dismiss();
	}
	public static void switchToWindowByIndex(WebDriver driver,int index)
	{
		Set<String> set=driver.getWindowHandles();
		ArrayList<String> handleList=new ArrayList<String>(set);
		driver.switchTo().window(handleList.get(index));
	}
	public static void switchToWindowByPartialTitleText(WebDriver driver, String partialTitle)
	{
		Set<String> set=driver.getWindowHandles();
		ArrayList<String> al=new ArrayList<String>(set);
		for (int i = 0; i < al.size(); i++) {
			if (al.get(i).contains(partialTitle)) {
				driver.switchTo().window(al.get(i));
			}			
		}
	}
	
	//Robot class methods...Not able to
	/*public void robotKeyPress() throws AWTException
	{
		Robot rbt=new Robot();
		rbt.keyPress(KeyEvent);
	}*/
}
