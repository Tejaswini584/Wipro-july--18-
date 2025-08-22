package Wipro.Javaselinium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;


import org.openqa.selenium.WebDriver;




public class BrowserCommands {
	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions co=new ChromeOptions();
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver(co);
		
		
		driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
		
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		//get the page title
		
		String title = driver.getTitle();
		System.out.println(title);
		//get the source code of the html page
		
		
		String pagesource = driver.getPageSource();
		
		System.out.println(pagesource);
		
		//fetch the current url
		String url = driver.getCurrentUrl();
		
		System.out.println(url);
		//close the current window
		
		driver.close();
		//close all the windows
		//driver.quit();
	}

}

