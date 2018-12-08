package com.Tm_TestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.Tm_BaseClass.DriverClass;
import com.Tm_ScreeningPages.ApplyLeave;
import com.Tm_ScreeningPages.Home;
import com.Tm_ScreeningPages.Login;

public class TestCases_Leave extends DriverClass {

	@Test
	public void TC101_verifyLoginFunctionality() {
		// Create the page pattern to Login Page
		Login lp = PageFactory.initElements(driver, Login.class);		
		// Create the page pattern to Home Page
		Home hpg = PageFactory.initElements(driver, Home.class);
		

		lp.LoginHRM("user02", "pass1234");
		hpg.Exist();
		hpg.logOut();
	}
	
	//==============================================================================

	@Test
	public void TC102_ApplyLeave() {		
		// Create the pagepattern to Login Page
		Login lp = PageFactory.initElements(driver, Login.class);
		// Create the pagepattern to Home Page
		Home hpg = PageFactory.initElements(driver, Home.class);
		// Create the pagepattern to Apply Leave Page
		ApplyLeave alp = PageFactory.initElements(driver, ApplyLeave.class);
		
		lp.LoginHRM("user02", "pass1234");
		hpg.Exist();
		hpg.NavApplyLeave();
		alp.applyLeave();
		hpg.logOut();			
	}
	
	//==============================================================================

}
