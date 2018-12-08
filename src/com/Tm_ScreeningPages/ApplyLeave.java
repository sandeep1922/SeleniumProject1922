package com.Tm_ScreeningPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.Tm_GenericFunctions.Weblibrary;

public class ApplyLeave extends Weblibrary{
	
	// Leave type Webelement
		@FindBy(how = How.ID, using = "applyleave_txtLeaveType")
		public static WebElement drp_LeaveType;

		// Leave Fromdate Webelement
		@FindBy(how = How.ID, using = "applyleave_txtFromDate")
		public static WebElement date_FromDate;

		// Leave toDate Webelement
		@FindBy(how = How.ID, using = "applyleave_txtToDate")
		public static WebElement date_toDate;
		// Comment text field Webelement
		@FindBy(how = How.ID, using = "applyleave_txtComment")
		public static WebElement txt_comment;

		//Save button Webelement
		@FindBy(how = How.ID, using = "applyleave_txtComment")
		public static WebElement btn_Save;
		
		public void applyLeave() {
			boolean status;

			wait(1);
			status = selectByvalue(drp_LeaveType, "Annual Leave");
			logEvent(status, "User able to Select the dropdown", "User unable to Select the dropdown");

			wait(1);
			status = setTextandEscape(date_FromDate, "2018-08-22");
			logEvent(status, "User able to select the Fromdate", "User unable to select the Fromdate");

			wait(1);
			status = setTextandEscape(date_toDate, "2018-08-24");
			logEvent(status, "User able to Select the to date", "User unable to Select the to date");

			wait(1);
			status = setText(txt_comment, "Hello i need Leave");
			logEvent(status, "User able to ente the comment meassege", "User unable to ente the comment meassege");

			wait(1);
			status = clickElement(btn_Save);
			logEvent(status, "User able to click on Save button", "Unable to click on save button");
		}

}
