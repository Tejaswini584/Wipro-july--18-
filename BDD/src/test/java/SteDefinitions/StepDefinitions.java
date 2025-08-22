package SteDefinitions;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import io.cucumber.java.en.*;

import utils.DriverFactory;
 
public class StepDefinitions {

    WebDriver driver = DriverFactory.getDriver();
 
    @Given("User is on the login page")

    public void user_is_on_the_login_page() throws InterruptedException {

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        Thread.sleep(2000);

    }
 
    @When("user enters the username")

    public void user_enters_the_username() throws InterruptedException {

        Thread.sleep(2000);

        WebElement username = driver.findElement(By.name("username"));

        username.sendKeys("Admin");

        Thread.sleep(2000);

    }
 
    @When("user enters the password")

    public void user_enters_the_password() throws InterruptedException {

        WebElement password = driver.findElement(By.name("password"));

        password.sendKeys("admin123");

        Thread.sleep(2000);

    }
 
    @When("user clicks on the login button")

    public void user_clicks_on_the_login_button() throws InterruptedException {

        WebElement button = driver.findElement(By.xpath("//button[normalize-space()='Login']"));

        button.click();

        Thread.sleep(8000);

    }
 
    @Then("user is navigated to home page")

    public void user_is_navigated_to_home_page() throws InterruptedException {

        WebElement admin = driver.findElement(By.xpath("//li[1]//a[1]//span[1]"));

        Thread.sleep(8000);
 
        if (admin.isDisplayed()) {

            System.out.println("User is on the home page");

        } else {

            System.out.println("User is not on the home page");

        }

    }
 
    @When("user enters the invalid username")

    public void user_enters_the_invalid_username() throws InterruptedException {

        Thread.sleep(2000);

        WebElement username = driver.findElement(By.name("username"));

        username.sendKeys("InvalidUser");

        Thread.sleep(2000);

    }
 
    @Then("an error message should be displayed")

    public void an_error_message_should_be_displayed() throws InterruptedException {

        Thread.sleep(3000);

        WebElement errorMsg = driver.findElement(By.xpath("//p[contains(@class,'oxd-alert-content-text')]"));

        if (errorMsg.isDisplayed()) {

            System.out.println("Error displayed: " + errorMsg.getText());

        } else {

            System.out.println("Expected error not displayed");

        }

    }
 
    @When("user enters the {string} and {string}")

    public void user_enters_the_and(String username, String password) throws InterruptedException {

        WebElement username1 = driver.findElement(By.name("username"));

        Thread.sleep(2000);

        username1.sendKeys(username);

        Thread.sleep(1000);
 
        WebElement password1 = driver.findElement(By.name("password"));

        password1.sendKeys(password);

        Thread.sleep(2000);

    }

}

 