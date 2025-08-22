package Wipro.TestNG;


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
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TESTNG_SoftAssertions {

    @SuppressWarnings("unused")
	@Test
    public void testlogin() throws InterruptedException {

        // Setup Chrome
        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(chromeOptions);

        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        // small wait for page load
        Thread.sleep(2000);

        // validate title
        String actualTitle = driver.getTitle();
        System.out.println("Page title is: " + actualTitle);

        String expectedTitle = "Orange";
        SoftAssert soft = new SoftAssert(); 

        // check if title contains OrangeHRM
        soft.assertTrue(actualTitle.contains("OrangeHRM"), "Title does not match expected!");

        // username
        WebElement username = driver.findElement(By.name("username"));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(d -> username.isDisplayed());
        username.sendKeys("Admin");

        // password
        WebElement password = driver.findElement(By.xpath("//input[@name='password']"));

        Wait<WebDriver> wait1 = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofMillis(300))
                .ignoring(ElementNotInteractableException.class);

        wait1.until(d -> password.isDisplayed());
        password.sendKeys("admin123");

        // login button
        WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
        wait.until(d -> loginButton.isDisplayed());
        loginButton.click();

        Thread.sleep(3000);

        // assert all
        soft.assertAll();

        // close browser
        driver.quit();
    }
}