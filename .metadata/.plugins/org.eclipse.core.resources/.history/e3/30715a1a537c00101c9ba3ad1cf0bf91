package Wipro.Javaselinium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;


import org.openqa.selenium.WebDriver;




public class Navigationalcommands {
	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions co=new ChromeOptions();
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver(co);
		
		//driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//maximize the window
		
		driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
		
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.navigate().back();
		Thread.sleep(2000);
		
		driver.navigate().forward();
		Thread.sleep(2000);
		
		driver.navigate().refresh();
	}

}

