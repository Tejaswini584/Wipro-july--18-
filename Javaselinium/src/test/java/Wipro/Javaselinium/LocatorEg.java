package Wipro.Javaselinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

/*
 * locators in selenium
id - unique attribute
name - name attribute - name of the element
classname - common class name applied for multiple elements  grouped together
linktext - text present on the link
partial link text - partial link text text on the web element
tagname - the first word in the web element after the opening tag - this is applied for mutlipel web elements in the page
css selector - #name
div.oxd-form-row:nth-child(2) > div:nth-child(1) > div:nth-child(2) > input:nth-child(1)
 */
public class LocatorEg 
{
	public static void main(String[] args) throws Exception
	{
		ChromeOptions chromeOptions = new ChromeOptions();

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver(chromeOptions);

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(2000);
		
		WebElement username= driver.findElement(By.name("username"));
		username.sendKeys("Admin");
		
		Thread.sleep(2000);
		
		WebElement password= driver.findElement(By.xpath("//input[@name= 'password']"));
		password.sendKeys("admin123");
		
		Thread.sleep(2000);
		
		WebElement loginbutton=driver.findElement(By.xpath("//button[@type='submit']"));
		loginbutton.click();
		
		
		
		Thread.sleep(2000);
	}
}
