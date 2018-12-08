package com.Tm_GenericFunctions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.Tm_BaseClass.DriverClass;

public class Weblibrary extends DriverClass {

	public static boolean launchApplication(String URL) {

		boolean status;
		try {
			driver.get(URL);
			status = true;
		} 
		catch (Exception e) 
		{
			status = false;
		}
		return status;
	}

	/*
	 * Method Name : setText
	 * 
	 * Description : This method is used to send the data to input text field
	 * 
	 * Input:: WebElement and text Data
	 * 
	 * Output: boolean status
	 * 
	 * Author : Testing Masters Technologies
	 * 
	 * 
	 * 
	 */

	public static boolean setText(WebElement element, String value) {
		boolean status;

		try {
			element.click();
			element.clear();
			element.sendKeys(value);
			status = true;
		} 
		catch (Exception e) 
		{
			status = false;
		}

		return status;

	}

	/*
	 * Method Name : setTextandEscape
	 * 
	 * Description : This method is used to send the data to input text field
	 * and Click on Escape button
	 * 
	 * Input:: WebElement and text Data
	 * 
	 * Output: boolean status
	 * 
	 * Author : Testing Masters Technologies
	 * 
	 * 
	 * 
	 */

	public static boolean setTextandEscape(WebElement element, String value) {
		boolean status;

		try {
			element.click();
			element.clear();
			element.sendKeys(value);
			element.sendKeys(Keys.ESCAPE);
			status = true;
		} 
		catch (Exception e) 
		{
			status = false;
		}

		return status;

	}

	/*
	 * Method Name : logEvent
	 * 
	 * Description : This method is used to print the log status and take the
	 * screenshots
	 * 
	 * Input::boolean status, PassDescription , FailDescription
	 * 
	 * Output: Log status
	 * 
	 * Author : Testing Masters Technologies
	 * 
	 * 
	 * 
	 */

	public static void logEvent(boolean status, String PassDescription, String FailDescription) {

		if (status) {
			System.out.println("		<<>> " + PassDescription + " <<>>");

		} else {
			System.out.println("		<<>> " + FailDescription + " <<>>");

		}

	}

	/*
	 * Method Name : clickElement
	 * 
	 * Description : This method is used to Click the Element
	 * 
	 * Input:: WebElement
	 * 
	 * Output: boolean status
	 * 
	 * Author : Testing Masters Technologies
	 * 
	 * 
	 * 
	 */
	public static boolean clickElement(WebElement element) {

		boolean status;

		try {
			element.click();

			status = true;
		} 
		catch (Exception e) 
		{
			status = false;
		}

		return status;

	}

	public static boolean moveToElement(WebElement element) {

		boolean status;
		try {
			Actions ac = new Actions(driver);
			ac.moveToElement(element).build().perform();
			status = true;
		} 
		catch (Exception e) 
		{
			status = false;
		}

		return status;

	}
	
	
	
	public static boolean isExist(WebElement element) {

		boolean status;
		try {
			element.isDisplayed();
			status=true;
		} 
		catch (Exception e) 
		{
			status = false;
		}

		return status;

	}
	
	
	public static boolean movetoElement(WebElement element) {

		boolean status;
		try {
			Actions ac=new Actions(driver);
			ac.moveToElement(element).build().perform();
			status=true;
		} 
		catch (Exception e) 
		{
			status = false;
		}

		return status;

	}
	
	public static boolean selectByText(WebElement element, String Selected_value) {

		boolean status;
		try {
			org.openqa.selenium.support.ui.Select sc=new org.openqa.selenium.support.ui.Select(element);
			sc.selectByVisibleText(Selected_value);
			
			status=true;
		} 
		catch (Exception e) 
		{
			status = false;
		}
		return status;

	}
	
	
	
	public static boolean selectByValue(WebElement element, String Selected_value) {

		boolean status;
		try {
			org.openqa.selenium.support.ui.Select sc=new org.openqa.selenium.support.ui.Select(element);
			sc.selectByValue(Selected_value);
			
			status=true;
		} 
		catch (Exception e) 
		{
			status = false;
		}
		return status;

	}
	
	public void wait(int seconds)
	{
		try
		{
			Thread.sleep(seconds*1000);
		}
		catch(Exception e)
		{
			
		}
	}

}
