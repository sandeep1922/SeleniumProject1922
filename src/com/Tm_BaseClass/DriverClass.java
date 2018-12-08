package com.Tm_BaseClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class DriverClass extends CommonVariables {
	
	public String userId;
	public String password;
	
	//========================================================================
	
	@BeforeMethod
	public void startingMethod(Method method1)  throws IOException{
		
		CurrentTestCaseName = method1.getName();

		System.out.println("<<TestStart>> TestCase Name   " + CurrentTestCaseName + "  <<TestStart>>");
		Browser = Browser.toUpperCase();
		
		switch(Browser)
		{
		case "FF":
			  driver = new FirefoxDriver();				  
			   break;
		
		case "IE":
			//For IE settings
			DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
			capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
			capabilities.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, true);
			
			System.setProperty("webdriver.ie.driver","D:\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();				 
			break;
			  
		case "CHROME":
			System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
			 driver = new ChromeDriver();
              break;
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);		
		/*
		 	boolean bTag = false;							
			
			File f1 = new File(TestDataPath + "HRM.xlsx");
			FileInputStream inputstream = new FileInputStream(f1);
			XSSFWorkbook wb1 = new XSSFWorkbook(inputstream);
			
			XSSFSheet ws1 = wb1.getSheet("Sheet1");									
			int rowcount = ws1.getLastRowNum()+1;
			
			for(int iRowIndex=1; iRowIndex<rowcount; iRowIndex++)
			{
				Row r1 = ws1.getRow(iRowIndex);
				String TCName = r1.getCell(1).getStringCellValue();
				if(TCName.trim().equals(CurrentTestCaseName))
				{
					userId = r1.getCell(2).getStringCellValue();
					password = r1.getCell(3).getStringCellValue();
					bTag = true;
					break;
				}				
			}	
			
			if(bTag==false)
			{
				System.out.println("Testcase nout found in Test Data file");
			}
		*/		
		}		
		

//========================================================================	

	@AfterMethod
	public void EndMethod() {
		driver.close();
		System.out.println("<<TestSuccess>> TestCase Name   " + CurrentTestCaseName + "  <<TestSuccess>>");
		System.out.println();
	}
	

	@AfterSuite
	public void toEnd() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(System.getProperty("user.dir") + "\\test-output\\index.html");
		driver.navigate().refresh();

	}
	
	//========================================================================

}
