package Wipro.Javaselinium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitFluenLoginPage
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
		
		// explicit wait - applicable for single web element - selenium 4
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		 wait.until(d -> username.isDisplayed());
		
		Thread.sleep(2000);
		
		WebElement password= driver.findElement(By.xpath("//input[@name= 'password']"));
		//password.sendKeys("admin123");
		
		// fluent wait 
				 Wait<WebDriver> wait1 =
					        new FluentWait<>(driver)
					            .withTimeout(Duration.ofSeconds(2))
					            .pollingEvery(Duration.ofMillis(300))
					            .ignoring(ElementNotInteractableException.class);
		 
					    wait1.until(
					        d -> {
					        	password.sendKeys("admin123");
					          return true;
					        });
		
		Thread.sleep(2000);
		
		WebElement loginbutton=driver.findElement(By.xpath("//button[@type='submit']"));
		loginbutton.click();
		
		
		
		Thread.sleep(2000);
	}
}

