package com.Tm_ScreeningPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.Tm_GenericFunctions.Weblibrary;

public class MyInfo extends Weblibrary{
	
	//Qualifications link Webelement
	@FindBy(how = How.XPATH, using = "//a[text()='Qualifications']")
	public static WebElement link_Qualifications;
	
	//Memberships link Webelement
	@FindBy(how = How.XPATH, using = "//a[text()='Memberships']")
	public static WebElement link_Memberships;
	
	@FindBy(how = How.XPATH, using = "//a[text()='Dependents']")
	public static WebElement link_Dependent;
	
	//
	
	//-------------------------------
	public void NavQualifications() {
		boolean status;
		
		status = clickElement(link_Qualifications);
		logEvent(status, "User able to click on Qualifications link", "Unable to click on Qualifications link");
	}
	
	//======================================================
	
	
	public void NavDependents() {
		boolean status;
		
		status = clickElement(link_Dependent);
		logEvent(status, "User able to click on Dependent link", "Unable to click on Dependent link");
	}
	
	
 //-----------------------------------------------
	

}
