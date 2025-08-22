package Wipro.Javaselinium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import io.github.bonigarcia.wdm.WebDriverManager;




public class InvokeFireFoxBrowser {

	public static void main(String[] args) {
		// Set path to EdgeDriver executable
        System.setProperty("webdriver.edge.driver", "C://Users//gonug//Downloads//geckodriver-v0.35.0-win-aarch64//geckodriver.exe");
        // Create EdgeDriver instance
        WebDriver driver = new FirefoxDriver();
        // Open a webpage
        //driver.get("https://www.google.com");
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		

	}

}
