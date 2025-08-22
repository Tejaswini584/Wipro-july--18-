package Wipro.TestNG;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import io.github.bonigarcia.wdm.WebDriverManager;


public class TESTNG_Listners implements ITestListener
{
	@Override		
    public void onFinish(ITestContext arg0) {					
 
	 System.out.println("The testcase execution is completed using selenium testng  ");
    }		
 
 
    @Override		
    public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {					
 
    	 System.out.println("The testcase execution is completed with few issues using selenium testng ");
    }		
 
    @Override		
    public void onTestFailure(ITestResult arg0) {	
    	 System.out.println("The testcase execution is failed  using selenium testng");
    }		
 
    @Override		
    public void onTestSkipped(ITestResult arg0) {					
    	 System.out.println("The testcase execution is skipped  using selenium testng");	
    }		
 
    @Override		
    public void onTestStart(ITestResult arg0) {					
    	 System.out.println("The testcase execution is started using selenium testng");
    }		
 
    @Override		
    public void onTestSuccess(ITestResult arg0) {	
    	 System.out.println("The testcase execution is completed successfully using selenium testng");
    }
 
}