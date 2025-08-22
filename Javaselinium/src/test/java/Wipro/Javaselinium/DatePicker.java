package Wipro.Javaselinium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DatePicker {
    public static void main(String[] args) throws InterruptedException {

        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new org.openqa.selenium.chrome.ChromeDriver(chromeOptions);

        driver.get("https://ui.shadcn.com/docs/components/date-picker");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        // Open date picker
        WebElement datePickerBtn = driver.findElement(By.xpath("//*[@id='date']"));
        datePickerBtn.click();
        Thread.sleep(2000);

        // Select first date (13/08/2025)
        WebElement dayPicker1 = driver.findElement(By.xpath("//button[@data-day='13/08/2025']"));
        dayPicker1.click();
        Thread.sleep(2000);

        // Open date picker again
        datePickerBtn.click();
        Thread.sleep(2000);

        // Select second date (22/08/2025)
        WebElement dayPicker2 = driver.findElement(By.xpath("//button[@data-day='22/08/2025']"));
        dayPicker2.click();
        Thread.sleep(2000);

        driver.quit();
    }
}
