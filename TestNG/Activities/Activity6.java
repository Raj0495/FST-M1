package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Activity6 {

    WebDriver driver;
    //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    @BeforeClass(alwaysRun = true)
    public void beforeClass() {
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();

        driver.get("https://v1.training-support.net/selenium/login-form");

    }

    @Test
    @Parameters({"username", "password"})
    public void loginTest(String username, String password){

        WebElement un = driver.findElement(By.id("username"));
        WebElement pwd =  driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.xpath("//button[contains(@class, 'ui button')]"));

        un.sendKeys(username);
        pwd.sendKeys(password);
        loginButton.click();

        String loginMessage = driver.findElement(By.id("action-confirmation")).getText();
        Assert.assertEquals(loginMessage, "Welcome Back, admin");



    }

    @AfterClass(alwaysRun = true)
    public void afterClass(){
        driver.quit();
    }
}




