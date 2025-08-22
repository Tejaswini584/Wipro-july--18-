package Pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PracticeFormPage {

    private WebDriver driver;

    public PracticeFormPage(WebDriver driver) {
        this.driver = driver;
    }

    // Locators
    private By nameField = By.id("name");
    private By emailField = By.id("email");
    private By genderMale = By.id("gender"); // Adjust if multiple gender inputs
    private By mobileField = By.id("mobile");
    private By dobField = By.id("dob");
    private By subjectField = By.id("subjects");
    private By hobbySports = By.xpath("//input[@id='hobbies']");
    private By hobbyReading = By.xpath("//div[7]//div[1]//div[1]//div[2]//input[1]");
    private By uploadPicture = By.id("picture");
    private By currentAddress = By.xpath("//textarea[@id='picture']");
    private By stateDropdown = By.id("state");
    private By cityDropdown = By.id("city");
    private By loginButton = By.xpath("//input[@value='Login']");

    // Actions
    public void enterName(String name) {
        driver.findElement(nameField).sendKeys(name);
    }

    public void enterEmail(String email) {
        driver.findElement(emailField).sendKeys(email);
    }

    public void selectGender() {
        driver.findElement(genderMale).click();
    }

    public void enterMobile(String mobile) {
        driver.findElement(mobileField).sendKeys(mobile);
    }

    public void enterDOB(String dob) {
        driver.findElement(dobField).sendKeys(dob);
    }

    public void enterSubject(String subject) {
        driver.findElement(subjectField).sendKeys(subject);
    }

    public void selectHobbies() {
        driver.findElement(hobbySports).click();
        driver.findElement(hobbyReading).click();
    }

    public void uploadPicture(String filePath) {
        driver.findElement(uploadPicture).sendKeys(filePath);
    }

    public void enterCurrentAddress(String address) {
        driver.findElement(currentAddress).sendKeys(address);
    }

    public void selectState(String state) {
        driver.findElement(stateDropdown).sendKeys(state);
    }

    public void selectCity(String city) {
        driver.findElement(cityDropdown).sendKeys(city);
    }

    public void clickLogin() {
        driver.findElement(loginButton).click();
    }
}