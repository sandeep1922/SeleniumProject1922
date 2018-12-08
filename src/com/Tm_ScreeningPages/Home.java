package com.Tm_ScreeningPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.Tm_GenericFunctions.Weblibrary;

public class Home extends Weblibrary {	
		
	//Logout link Webelement
	@FindBy(how = How.XPATH, using = "//a[text()='Logout']")
	public static WebElement link_Logout;

	// Welcome button link Webelement
	@FindBy(how = How.ID, using = "welcome")
	public static WebElement link_Welcome;

	// Leave tab Webelement
	@FindBy(how = How.XPATH, using = "//b[text()='Leave']")
	public static WebElement link_Leave;

	// Apply link Webelement
	@FindBy(how = How.XPATH, using = "//a[text()='Apply']")
	public static WebElement link_Apply;
	
	// MyInfo link Webelement
	@FindBy(how = How.XPATH, using = "//b[text()='My Info']")
	public static WebElement link_MyInfo;
	
	

	
//=======================================================================
	public void Exist() {
		boolean status;
		status = isExist(link_Welcome);
		logEvent(status, "user able to Login Sucessfully", "Unable to login ");
	}
	
 //-----------------------------------------------
	public void NavMyInfo() {
		boolean status;
		
		status = clickElement(link_MyInfo);
		logEvent(status, "User able to click on Myinfo link", "Unable to click on Myinfo link");
	}
 //-----------------------------------------------
	public void NavApplyLeave() {
		boolean status;
		status = moveToElement(link_Leave);
		logEvent(status, "User able to moveto the leave tab", "User unable to moveto the leave tab");
	
		wait(1);
		status = clickElement(link_Apply);
		logEvent(status, "User able to click on Apply link", "Unable to click on Apply link");
	}
	
 //-----------------------------------------------	
	public void logOut()
	{
		boolean status;
		
		status=clickElement(link_Welcome);
		logEvent(status, "user able to click the Welcome user link", "user unable to click the Welcome user link");
			
		status=clickElement(link_Logout);
		logEvent(status, "User able to sucessfully logout", "Unable to logout ");			
	}

	//==========================================================================
}
