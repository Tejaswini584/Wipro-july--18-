package Wipro.TestNG;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class lab19augut_Booking {
	@Test(groups = {"Sanity"})
	 
	public void Hotel() throws InterruptedException {

		ChromeOptions chromeOptions = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(chromeOptions);
        
        // 1. Open PHPTRAVELS website
		driver.get("https://phptravels.net");
		driver.manage().window().maximize();

		// 2. Click on "Hotels"
		driver.findElement(By.xpath("//a[normalize-space()='Hotels']")).click();
		Thread.sleep(2000);

		// 3. Select city (custom dropdown - not normal select!)
		WebElement city = driver.findElement(By.id("select2-hotels_city-container"));
		city.click();
		Thread.sleep(1000);

		WebElement searchBox = driver.findElement(By.xpath("//input[@role='searchbox']"));
		searchBox.click();
		Thread.sleep(2000);

		// driver.findElement(By.xpath("//li[contains(text(),'Delhi')]")).click();
		driver.findElement(By.xpath("//body[1]/span[1]/span[1]/span[2]/ul[1]/div[1]/div[1]/div[1]/strong[1]/small[1]"))
				.click();
		Thread.sleep(2000);

		driver.findElement(By.id("checkin")).click();
		Thread.sleep(2000);

		// Select check-in date
		WebElement checkin = driver.findElement(By.xpath("//*[@id=\"fadein\"]/div[5]/div[1]/table/tbody/tr[4]/td[6]"));
		checkin.click();

//		driver.findElement(By.id("checkout")).click();
//		Thread.sleep(2000);
//
//		// Select Check-out date (e.g., 25)
//		WebElement checkout = driver.findElement(By.xpath("//body[1]/div[6]/div[1]/table[1]/tbody[1]/tr[5]/td[2]"));
//		checkout.click();
//		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"fadein\"]/div[6]/div[1]/table/tbody/tr[5]/td[3]")).click();

		//travellers
		
		driver.findElement(By
				.xpath("//a[@class='dropdown-toggle dropdown-btn travellers d-flex align-items-center waves-effect']"))
				.click();
		// Set guests
//		driver.findElement(By.xpath("//div[@class='roomInc']//*[name()='svg']")).click();
//		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[@class='qty-box d-flex align-items-center justify-content-between']//div[@class='qtyBtn d-flex align-items-center']//div[@class='qtyInc']//*[name()='svg']"));
		Thread.sleep(3000);
		// Click "Search"
		driver.findElement(By.cssSelector("button[type='submit'] svg")).click();
		Thread.sleep(3000);

		//hotels
		//WebElement hotel = driver.findElement(By.xpath("//*[@id=\"fadein\"]/main/section/div[2]/div/div[2]/div/ul/li[2]/div/div/div/div[2]/div/div[2]/div[2]/a"));
		WebElement hotel =driver.findElement(By.xpath("//li[2]//div[1]//div[1]//div[1]//div[2]//div[1]//div[2]//div[2]//a[1]"));
		hotel.click();
		Thread.sleep(2000);
		
		//book 
		
		WebElement book = driver.findElement(By.xpath("//strong[@class='fw-light']"));
		book.click();
		Thread.sleep(2000);
		//details
		
		WebElement fname = driver.findElement(By.xpath("//input[@id='p-first-name']"));
		fname.sendKeys("Mameeth");
		Thread.sleep(2000);
		
		WebElement lname = driver.findElement(By.xpath("//input[@id='p-last-name']"));
		lname.sendKeys("S");
		Thread.sleep(2000);
		
		WebElement mail = driver.findElement(By.xpath("//input[@id='p-email']"));
		mail.sendKeys("abc@gmail.com");
		Thread.sleep(2000);
		
		WebElement phone = driver.findElement(By.xpath("//input[@id='p-phone']"));
		phone.sendKeys("1234567890");
		Thread.sleep(2000);
		
		WebElement add = driver.findElement(By.xpath("//input[@id='p-address']"));
		add.sendKeys("AP");
		Thread.sleep(2000);
		
		//traveller info
		WebElement firstname = driver.findElement(By.xpath("//input[@name='firstname_1']"));
		firstname.sendKeys("Mameeth");
		Thread.sleep(2000);
		
		WebElement lastname = driver.findElement(By.xpath("//input[@name='lastname_1']"));
		lastname.sendKeys("S");
		Thread.sleep(2000);
		
		WebElement firstname2 = driver.findElement(By.xpath("//input[@name='firstname_2']"));
		firstname2.sendKeys("Sireesha");
		Thread.sleep(2000);
		
		WebElement lastname2 = driver.findElement(By.xpath("//input[@name='lastname_2']"));
		lastname2.sendKeys("S");
		Thread.sleep(2000);
		
		//payment
		
		@SuppressWarnings("unused")
		WebElement pay = driver.findElement(By.xpath("//strong[normalize-space()='paypal']"));
		Thread.sleep(2000);
		
		
		WebElement ok = driver.findElement(By.xpath("//input[@id='agreechb']"));
		ok.click();
		Thread.sleep(2000);
		
		WebElement confirm = driver.findElement(By.xpath("//button[@id='booking']"));
		confirm.click();
		Thread.sleep(2000);
		
		//proceed
		
		WebElement proceed = driver.findElement(By.xpath("//input[@id='form']"));
		proceed.click();
		Thread.sleep(2000);
		WebElement paypal = driver.findElement(By.xpath("//body"));
		paypal.click();
		Thread.sleep(6000);
		driver.quit();
	}
}