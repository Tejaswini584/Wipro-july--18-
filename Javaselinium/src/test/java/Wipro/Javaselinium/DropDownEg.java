package Wipro.Javaselinium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;




public class DropDownEg {
	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions co=new ChromeOptions();
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver(co);
		
		//driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//maximize the window
		
		driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
		
		
		WebElement drdwn = driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
		
		Select sel = new Select(drdwn);
		
		sel.selectByVisibleText("Option1");
		
		Thread.sleep(2000);
		
		sel.selectByValue("option2");
		
		Thread.sleep(2000);
		
		sel.selectByIndex(3);
		
		
	}

}
