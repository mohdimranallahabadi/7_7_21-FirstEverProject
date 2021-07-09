package com.genrics.MavenActitime;

import java.io.File;
import java.io.IOException;

import org.codehaus.plexus.util.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

//NOT WORKING CHECK IT
public class Utility implements ITestListener
{
	public void onTestFailure(ITestResult arg)
	{
		//To call the method of screenshot with driver reference...because end of the day i have to take screenshot of browser only
		TakesScreenshot ts=(TakesScreenshot)BaseTest.driver;//Type cast it(downcast) made driver static so taht we can access it with class name
		//Now using TakeScreenshot reference we use its method of taking screenshot
		File file=ts.getScreenshotAs(OutputType.FILE);//File is class of java io package..
		//Now move above file to some location on the hard drive..By using static method copyFile of FileUtils class of java io package
		try {
			FileUtils.copyFile(file, new File("./screenshots/image.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Now Go to each and every Test class and declare this above code by using @Listeners annotation with the address of this class file
		//By doing this only the Test class will be able to know about this code...will listen to this by @Listeners annotation of testNG
	}
}
