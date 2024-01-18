package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class Activity9 {

    WebDriver driver;


    @BeforeClass(alwaysRun = true)
    public void beforeClass() {
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://v1.training-support.net/selenium/javascript-alerts");
        String title = ("Title of the page: "+driver.getTitle());
        Reporter.log("Opened the web page |");

    }

    @Test
    public void simpleAlert(){
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
        driver.findElement(By.id("simple")).click();
        Reporter.log("Clicked the Simple alert button |");
        Alert smplAlert = driver.switchTo().alert();
        Reporter.log("Switched to the Simple alert |");
        System.out.println("Text on the Simple Alert: "+smplAlert.getText());
        Assert.assertEquals("This is a JavaScript Alert!", smplAlert.getText());
        smplAlert.accept();
        String title = ("Title of the page: "+driver.getTitle());


    }

    @BeforeMethod
    public void switchFocus(){
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
        Reporter.log("Switching the focus back to the main page |");
        driver.switchTo().defaultContent();
    }

    @Test
    public void confirmationAlert(){
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
        driver.findElement(By.id("confirm")).click();
        Reporter.log("Clicked the Confirmation alert button |");
        Alert confrmtnAlert = driver.switchTo().alert();
        Reporter.log("Switched to the Confirmation Alert |");
        System.out.println("Text on the Confirmation Alert: "+confrmtnAlert.getText());
        Assert.assertEquals("This is a JavaScript Confirmation!", confrmtnAlert.getText());
        confrmtnAlert.dismiss();
        String title = ("Title of the page: "+driver.getTitle());


    }

    @Test
    public void promptAlert(){
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
        driver.findElement(By.id("prompt")).click();
        Reporter.log("Clicked the prompt alert button |");
        Alert promtAlert = driver.switchTo().alert();
        Reporter.log("Switched to the Prompt Alert |");
        System.out.println("Text on the Prompt Alert: "+promtAlert.getText());
        Assert.assertEquals("This is a JavaScript Prompt!", promtAlert.getText());
        promtAlert.sendKeys("Awesome");
        promtAlert.accept();
        String title = ("Title of the page: "+driver.getTitle());

    }

    @AfterClass(alwaysRun = true)
    public void afterClass(){
        String title = driver.getTitle();
        System.out.println("Title of the main page: "+title);
        driver.quit();
    }

}
