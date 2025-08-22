package Wipro.Javaselinium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class AlertExample {
	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions co=new ChromeOptions();
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver(co);
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts\r\n");
		
		WebElement simplealert = driver.findElement(By.cssSelector("button[onclick='jsAlert()']"));
		
		simplealert.click();
		
		Thread.sleep(2000);
		
		Alert alt = driver.switchTo().alert();
		
		//click on ok button 
		alt.accept();
		Thread.sleep(2000);
		
		//click on confirmational alert 
		
        WebElement confirmalert = driver.findElement(By.cssSelector("button[onclick='jsConfirm()']"));
		
        confirmalert.click();
		
		Thread.sleep(2000);
		
		Alert alt1 = driver.switchTo().alert();
		
		//click on cancel button 
		alt.dismiss();
		Thread.sleep(2000);
		
		//click on prompt alert 
		
		WebElement promptalert = driver.findElement(By.cssSelector("button[onclick='jsPrompt()']"));
		
		promptalert.click();
		Thread.sleep(2000);
		Alert alt2 = driver.switchTo().alert();
		
		//click on ok button 
		
		String alertText = alt2.getText();
		System.out.println(alertText);
		
		alt2.sendKeys("abhiram");
		
		Thread.sleep(2000);
		alt.accept();
		Thread.sleep(2000);
		
		
	}

}

