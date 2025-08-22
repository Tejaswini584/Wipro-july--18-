package Wipro.Javaselinium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;


public class ImplicitExForDragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		// Set path to EdgeDriver executable
        System.setProperty("webdriver.edge.driver", "C://Users//Supraja//Downloads//edgedriver_win64//msedgedriver.exe");
        // Create EdgeDriver instance
        WebDriver driver = new EdgeDriver();
        // Open a webpage
        //driver.get("https://www.google.com");
		
		driver.get("https://the-internet.herokuapp.com/drag_and_drop");
		
		//Maximize the window
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
		
		//Action class is used to simulate the mouse related activities
		Actions act = new Actions(driver);
		
		WebElement from= driver.findElement(By.id("column-a"));
		WebElement to= driver.findElement(By.id("column-b"));
		act.dragAndDrop(from,to).perform();
		Thread.sleep(2000);
		
		
		
	
		driver.quit();
		

	}

}