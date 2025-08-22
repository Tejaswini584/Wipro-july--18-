package Wipro.TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGParameterizationEg {
	@Parameters({ "browser", "platform" })
	@Test
	public void testparameters(String browser, String platform) {
		if (browser.equals("chrome") && platform.equals("windows")) {
			ChromeOptions chromeOptions = new ChromeOptions();
 
			WebDriverManager.chromedriver().setup();
 
			WebDriver driver = new ChromeDriver(chromeOptions);
 
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		}else {
			// Set path to EdgeDriver executable
	        System.setProperty("webdriver.edge.driver", "C://Users//Supraja//Downloads//edgedriver_win64//msedgedriver.exe");
	        // Create EdgeDriver instance
	        WebDriver driver = new EdgeDriver();
		    // Open a webpage
		    driver.get("https://www.google.com"); 
		}

	}

}