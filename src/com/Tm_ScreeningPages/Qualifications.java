package com.Tm_ScreeningPages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.Tm_GenericFunctions.Weblibrary;

public class Qualifications extends Weblibrary{
	
	//WE_Add button Webelement
	@FindBy(how = How.XPATH, using = "//input[@id='addWorkExperience']")
	public static WebElement Btn_AddWE;
	
	//WE_Company Edit Webelement
	@FindBy(how = How.XPATH, using = "//input[@id='experience_employer']")
	public static WebElement Edi_Company;
		
	//WE_Job Title button Webelement
	@FindBy(how = How.XPATH, using = "//input[@id='experience_jobtitle']")
	public static WebElement Edi_JobTitle;
		
	//WE_Save button Webelement
	@FindBy(how = How.XPATH, using = "//input[@id='btnWorkExpSave']")
	public static WebElement Btn_SaveWE;
	
	//-----------------------------------------
	
	public static void AddExperice()
	{
		boolean status;
		
		status = clickElement(Btn_AddWE);		
		logEvent(status, "User able to click on Add button", "Unable to click on Add button");
				
		status = setText(Edi_Company, "Tech Mahindra");
		logEvent(status, "Comapany name entered Sucessfully", " unable to enter Comapany name ");
		
		status = setText(Edi_JobTitle, "QA Specialist");
		logEvent(status, "Job Title entered Sucessfully", " unable to enter Job Title ");
		
		status = clickElement(Btn_SaveWE);		
		logEvent(status, "User able to click on Save button", "Unable to click on Save button");	
			
	}
	
	//-----------------------------------------
	
		public static void VerifyWEAdded()
		{
			boolean status;
			
			List<WebElement> rows = driver.findElements(By.xpath("//form[@id='frmDelWorkExperience']/table/tbody/tr"));
			int rowCount = rows.size();
			boolean bTag = false;
			for(int iRow=1; iRow<=rowCount; iRow++)
			{
				String company = driver.findElement(By.xpath("//form[@id='frmDelWorkExperience']/table/tbody/tr["+iRow+"]/td[1]")).getText();
				if(company.contains("techM"))
				{
					System.out.println("Comapny added");
					bTag = true;
					break;
				}				
			}
			
			if(bTag==false)
				System.out.println("Company name not added.");		
				
		}
		
		
	
	

}
