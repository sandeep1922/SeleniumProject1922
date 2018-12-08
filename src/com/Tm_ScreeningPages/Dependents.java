package com.Tm_ScreeningPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.Tm_GenericFunctions.Weblibrary;

public class Dependents extends Weblibrary
{

	//Qualifications link Dependent
	@FindBy(how = How.XPATH, using = "//input[@id='btnAddDependent']")
	public static WebElement btn_Adddep;
	
	//Name edit field
	@FindBy(how = How.ID, using = "dependent_name")
	public static WebElement edit_DepName ;
	
	//Realtionship edit field
		@FindBy(how = How.XPATH, using = "//select[@id='dependent_relationshipType']")
		public static WebElement List_Realationtype ;
	
		//Name edit field
		@FindBy(how = How.ID, using = "btnSaveDependent")
		public static WebElement Btn_save ;
		
		
	//=======================================================================================
		
		
public void AddDependent()
{ 
	boolean status;
	status=clickElement(btn_Adddep);
	logEvent(status, "Add Button Clicked", "Unable to Click on Add Button");
	
	
	
	status=setText(edit_DepName,"Sandeep");
	logEvent(status, "Entered Name", "Unable to Enter Name");
	
	
	
	selectByText(List_Realationtype,"Child");
	logEvent(status, "Able to Select The Child", "Unable to Able to Select The Child");
	
	
	status=clickElement(Btn_save);
	logEvent(status, "Save Button Clicked", "Unable to Click on Save Button");
	
	
	
//========================================================================================================
	
}




}
