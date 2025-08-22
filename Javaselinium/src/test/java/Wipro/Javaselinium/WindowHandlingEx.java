package Wipro.Javaselinium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;


public class WindowHandlingEx {

	public static void main(String[] args) throws InterruptedException {
		// Set path to EdgeDriver executable
        System.setProperty("webdriver.edge.driver", "C://Users//Supraja//Downloads//edgedriver_win64//msedgedriver.exe");
        // Create EdgeDriver instance
        WebDriver driver = new EdgeDriver();
        // Open a webpage
        //driver.get("https://www.google.com");
		
		driver.get("https://the-internet.herokuapp.com/windows");
		
		//Maximize the window
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement clickhere = driver.findElement(By.xpath("//a[normalize-space()='Click Here']"));
		clickhere.click();
		
		Thread.sleep(2000);
		
		//fetch all the window handles - there will be two [0] - default 
		//click on link to open a new window
		
		Object [] windowHandles = driver.getWindowHandles().toArray();
		
		System.out.println(windowHandles);
		
		driver.switchTo().window((String) windowHandles[1]);
		
		//assert on tiltle of new window 
		String title = driver.getTitle(); 
		System.out.println(title);
		
		Thread.sleep(2000);
		
		driver.close();
		
		driver.switchTo().window((String) windowHandles[0]);
		
		driver.quit();
		

	}

}
