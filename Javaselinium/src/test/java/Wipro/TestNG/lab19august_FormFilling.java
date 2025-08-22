package Wipro.TestNG;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;



import io.github.bonigarcia.wdm.WebDriverManager;
  @Listeners(TESTNG_Listners.class)
public class lab19august_FormFilling {

	@Test(groups = {"Sanity","Regression"})
	public  void formFilling() throws InterruptedException {
		ChromeOptions chromeOption = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(chromeOption);
		driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
		//Maximize the window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement firstname = driver.findElement(By.xpath("//input[@name='firstname']"));
		firstname.sendKeys("supraja");
		WebElement lastname = driver.findElement(By.xpath("//input[@name='lastname']"));
		lastname.sendKeys("Anumandla");
		WebElement gender = driver.findElement(By.xpath("//input[@id='sex-1']"));
		gender.click();
		WebElement experience = driver.findElement(By.xpath("//input[@id='exp-0']"));
		experience.click();
		WebElement date = driver.findElement(By.xpath("//input[@id='datepicker']"));
		date.sendKeys("18-08-2025");
		WebElement profession = driver.findElement(By.xpath("//input[@id='profession-1']"));
		profession.click();
		WebElement tools = driver.findElement(By.xpath("//input[@id='tool-2']"));
		tools.click();
		WebElement continents = driver.findElement(By.xpath("//select[@id='continents']"));
		continents.click();
		WebElement commands = driver.findElement(By.xpath("//option[normalize-space()='Browser Commands']"));
		commands.click();
		Thread.sleep(2000);
		WebElement upload = driver.findElement(By.xpath("//input[@id='photo']"));
		upload.sendKeys("C://Users//Supraja//OneDrive//Pictures//Screenshots//Screenshot (144).png");
		Thread.sleep(2000);
		WebElement submit = driver.findElement(By.xpath("//button[@id='submit']"));
		submit.click();
		Thread.sleep(2000);
		
	}

}