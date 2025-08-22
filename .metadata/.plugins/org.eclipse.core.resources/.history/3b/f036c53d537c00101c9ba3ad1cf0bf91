package Wipro.Javaselinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;



	public class saucedemoLogin
	{
		public static void main(String[] args) throws Exception
		{
			ChromeOptions chromeOptions = new ChromeOptions();

			WebDriverManager.chromedriver().setup();

			WebDriver driver = new ChromeDriver(chromeOptions);

			driver.get("https://www.saucedemo.com/");
			
			Thread.sleep(2000);
			
			WebElement username= driver.findElement(By.xpath("//input[@id='user-name']"));
			username.sendKeys("standard_user");
			
			Thread.sleep(2000);
			
			WebElement password= driver.findElement(By.xpath("//input[@id='password']"));
			password.sendKeys("secret_sauce");
			
			Thread.sleep(2000);
			
			WebElement loginbutton=driver.findElement(By.xpath("//input[@type='submit']"));
			loginbutton.click();
			
			
			
			Thread.sleep(2000);
		}
	}

