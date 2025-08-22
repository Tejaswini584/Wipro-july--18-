package Wipro.Javaselinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsEg 
{
	public static void main(String[] args) throws Exception 
	{
		ChromeOptions chromeOptions = new ChromeOptions();

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver(chromeOptions);

		driver.get("https://www.amazon.in/");

		driver.manage().window().maximize();

		Thread.sleep(2000);
		
		Actions act=new Actions(driver);
		
		// double click
		WebElement sell=driver.findElement(By.xpath("//a[normalize-space()='Sell']"));
		act.doubleClick(sell).perform();
		
		Thread.sleep(4000);
		
		driver.navigate().back();
		
		Thread.sleep(4000);
		
		//Context click or a Right click
		WebElement mobiles=driver.findElement(By.xpath("//a[normalize-space()='Mobiles']"));
		act.contextClick(mobiles).perform();
		
		Thread.sleep(4000);
		
	}
}


