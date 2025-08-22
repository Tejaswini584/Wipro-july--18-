package Wipro.Javaselinium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;



public class InvokeChromeBrowser {
	public static void main(String[] args) {
		
		ChromeOptions co=new ChromeOptions();
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver(co);
		
		driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
	}

}