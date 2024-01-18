package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity3 {

    WebDriver driver;
    //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    @BeforeClass
    public void beforeClassMethod() {
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();

        driver.get("https://v1.training-support.net/selenium/login-form");

    }

    @Test
    public void test() {
        WebElement un = driver.findElement(By.id("username"));
        WebElement pwd = driver.findElement(By.id("password"));

        un.sendKeys("admin");
        pwd.sendKeys("password");

        WebElement loginButton = driver.findElement(By.xpath("//button[contains(@class, 'ui button')]"));
        loginButton.click();

        String loginConfirmationMessage = driver.findElement(By.id("action-confirmation")).getText();
        Assert.assertEquals(loginConfirmationMessage, "Welcome Back, admin");


    }

    @AfterClass
    public void afterClassMethod() {
        //driver.quit();
    }


}
