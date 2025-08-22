package Wipro.TestNG;


import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TESTNG_lab18augustDependency {
	WebDriver driver;

    @BeforeClass
    public void setUp() {
        ChromeOptions chromeOption = new ChromeOptions();
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(chromeOption);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @Test
    public void formFillAndSubmission() throws InterruptedException {
        driver.get("https://www.techlistic.com/p/selenium-practice-form.html");

        WebElement firstname = driver.findElement(By.name("firstname"));
        firstname.sendKeys("supraja");
        WebElement lastname = driver.findElement(By.name("lastname"));
        lastname.sendKeys("anumandla");
        driver.findElement(By.id("sex-1")).click();
        driver.findElement(By.id("exp-0")).click();
        driver.findElement(By.id("datepicker")).sendKeys("18-08-2025");
        driver.findElement(By.id("profession-1")).click();
        driver.findElement(By.id("tool-2")).click();

        driver.findElement(By.id("continents")).click();
        driver.findElement(By.xpath("//option[normalize-space()='Browser Commands']")).click();

        Thread.sleep(2000);
        driver.findElement(By.id("photo"))
              .sendKeys("C://Users//Supraja//OneDrive//Pictures//Screenshots//2025-04-30 (1).png");
        Thread.sleep(2000);
        driver.findElement(By.id("submit")).click();
        Thread.sleep(2000);
    }

    @Test(dependsOnMethods = {"formFillAndSubmission"})
    public void shoppingCartAutomation() throws InterruptedException {
        driver.get("https://www.demoblaze.com/index.html");

        WebElement samPhone = driver.findElement(By.xpath("//a[normalize-space()='Samsung galaxy s7']"));
        samPhone.click();
        driver.findElement(By.xpath("//a[normalize-space()='Add to cart']")).click();
        Thread.sleep(2000);
        Alert alt = driver.switchTo().alert();
        alt.accept();

        driver.findElement(By.xpath("//li[@class='nav-item active']//a[@class='nav-link']")).click();
        driver.findElement(By.xpath("//a[3]")).click();
        driver.findElement(By.xpath("//a[normalize-space()='MacBook Pro']")).click();
        driver.findElement(By.xpath("//a[normalize-space()='Add to cart']")).click();

        Thread.sleep(2000);
        Alert alt1 = driver.switchTo().alert();
        alt1.accept();

        driver.findElement(By.id("cartur")).click();
        driver.findElement(By.xpath("//button[normalize-space()='Place Order']")).click();
        driver.findElement(By.id("name")).sendKeys("Supraja");
        driver.findElement(By.id("country")).sendKeys("India");
        driver.findElement(By.id("city")).sendKeys("korutla");
        driver.findElement(By.id("card")).sendKeys("0000 0000 0000");
        driver.findElement(By.id("month")).sendKeys("August");
        driver.findElement(By.id("year")).sendKeys("2025");

        driver.findElement(By.xpath("//button[normalize-space()='Purchase']")).click();
        driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
        Thread.sleep(2000);
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }

}