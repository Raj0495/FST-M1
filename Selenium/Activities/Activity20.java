package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity20 {

    public static void main(String args[]) throws InterruptedException {

        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");

        WebDriverManager.firefoxdriver().setup();

        WebDriver driver = new FirefoxDriver();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://v1.training-support.net/selenium/javascript-alerts");

        System.out.println(driver.getTitle());

        driver.findElement(By.id("prompt")).click();

        Alert promptAlert = driver.switchTo().alert();

        System.out.println(promptAlert.getText());

        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.id()))

        promptAlert.sendKeys("Awesome");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        promptAlert.accept();

        driver.close();







    }


}
