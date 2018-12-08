package com.Tm_TestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.Tm_BaseClass.DriverClass;
import com.Tm_ScreeningPages.*;

public class TestCases_Myinfo extends DriverClass{
	
	
//================================================================================
/*	@Test
	public void TC201_AddWorkExperience() {
		
		//--------------- Initialize pages ----------------------
		// Create the page pattern to Login Page
		Login lp = PageFactory.initElements(driver, Login.class);	
		// Create the page pattern to Home Page
		Home hpg = PageFactory.initElements(driver, Home.class);
		
		MyInfo myinfo = PageFactory.initElements(driver, MyInfo.class);
		
		Qualifications Qualifications = PageFactory.initElements(driver, Qualifications.class);
		
		Dependents Dependents=PageFactory.initElements(driver, Dependents.class);

		
		//-------------- Test Steps ---------------------------
		
		// Step 1: Login as a team member
		lp.LoginHRM("user02", "pass1234");
		hpg.Exist();
		
		//Step 2: Navigate My Info page	
		hpg.NavMyInfo();
		
		//Step 3: Click Qualifications	
		myinfo.NavQualifications();
		
		//Step 4: ClickAdd and enter all required details then click on Save button
		Qualifications.AddExperice();		
		
		//Step 5: Verify Work Experience added
		Qualifications.VerifyWEAdded();
		
		//Step 6: Logout
		hpg.logOut();
	}*/
	
//================================================================================
	@Test
	public void TC_202_AddDependent()
	{
		// Create the page pattern to Login Page
				Login lp = PageFactory.initElements(driver, Login.class);	
				// Create the page pattern to Home Page
				Home hpg = PageFactory.initElements(driver, Home.class);
				
				MyInfo myinfo = PageFactory.initElements(driver, MyInfo.class);
				
				Dependents Dependents=PageFactory.initElements(driver, Dependents.class);
			//=====================================================================
				// Step 1: Login as a team member
				lp.LoginHRM("user02", "pass1234");
				
				hpg.NavMyInfo();
				
				myinfo.NavDependents();
				Dependents.AddDependent();
				hpg.logOut();
				
	}
	
				
//====================================================================================
		
	
	
//=====================================================================
	
	
	
}
