package com.scripts.MavenActitime;

import java.io.IOException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.genrics.MavenActitime.BaseTest;
import com.pages.MavenActitime.PomFacebookSignUp;

@Listeners(com.genrics.MavenActitime.Utility.class)
public class TestSignUpToFacebook extends BaseTest
{
	@BeforeTest
	public void urlChoseMethod()//Override in every test case (test class) so as to enter desired url..And runs before test class
	{
		website="facebook";
	}
	
	@Test
	public void facebookSignUp() throws IOException
	{
		PomFacebookSignUp signUp=new  PomFacebookSignUp(driver);
		signUp.signUpMethod();
		signUp.birthdayHelpIconTitleCheckMethod();
		signUp.genderHelpIconTitleCheckMethod();
		signUp.dataPolicyLinkMethod();
		signUp.signUpButtonMethod();
	}
}
