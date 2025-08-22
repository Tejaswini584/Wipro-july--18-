package Wipro.Javaselinium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Webtable {

	public static void main(String[] args) throws InterruptedException {
		// Set path to EdgeDriver executable
        System.setProperty("webdriver.edge.driver", "C://Users//Supraja//Downloads//edgedriver_win64//msedgedriver.exe");
        // Create EdgeDriver instance
        WebDriver driver = new EdgeDriver();
        // Open a webpage
        //driver.get("https://www.google.com");
		
		driver.get("https://the-internet.herokuapp.com/tables");
		
		//Maximize the window
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//find the rows present 
		
		List<WebElement> rows= driver.findElements(By.xpath("//table[@id='table1']/tbody/tr"));
		
		int rowcount = rows.size();
		System.out.println(rowcount);
		
List<WebElement> cols= driver.findElements(By.xpath("//table[@id='table1']/thead/tr[1]/th"));
		
		int colscount = cols.size();
		System.out.println(colscount);
		
		WebElement celltext = driver.findElement(By.xpath("//table[@id='table2']/tbody/tr[4]/td[3]"));
		
		String actualcelltext = celltext.getText();
		
		String expectedcelltext = "tconway@earthlink.net";
		
		if (actualcelltext.equalsIgnoreCase(expectedcelltext)) {
			System.out.println("The text matches");
		} else {
			System.out.println("The text not matches");
		}
		driver.quit();
		

	}

}

