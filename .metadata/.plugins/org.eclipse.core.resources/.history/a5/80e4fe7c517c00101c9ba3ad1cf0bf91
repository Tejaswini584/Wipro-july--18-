package Wipro.Javaselinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeselectEg
{
	public static void main(String[] args) throws Exception
	{
		ChromeOptions chromeOptions=new ChromeOptions();
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver(chromeOptions);
		
		driver.get("https://grotechminds.com/multiple-select/?");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		WebElement dropdown=driver.findElement(By.xpath("//select[@id = 'automobiles']"));
		
		Select se1= new Select(dropdown);
		
		se1.selectByIndex(1);
		
		Thread.sleep(2000);
		
		se1.selectByIndex(2);
		
		Thread.sleep(2000);
		
		se1.selectByIndex(3);
		
		Thread.sleep(3000);
		
		se1.deselectByIndex(3);
		
		Thread.sleep(2000);
		
		se1.deselectByIndex(2);
		
		Thread.sleep(2000);
		
		se1.deselectByIndex(1);
		
	}
}

