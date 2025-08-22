package Wipro.Javaselinium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class Mulitradioeg {
	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions co=new ChromeOptions();
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver(co);
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.manage().window().maximize();
		
		List<WebElement> chboxes = driver.findElements(By.xpath("//input[@type='radio']"));
		
		int size = chboxes.size();
		
		System.out.println(size);
		
		for(int i =0;i<size;i++) {
			
			Thread.sleep(1000);
			
			chboxes.get(i).click();
			
			Thread.sleep(1000);
		}
	}

}

