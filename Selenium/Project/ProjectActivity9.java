package Selenium_Java_Project;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class ProjectActivity9 {

    public static void main(String args[]) {

        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://alchemy.hguy.co/jobs/wp-admin");

        driver.findElement(By.id("user_login")).sendKeys("root");
        driver.findElement(By.id("user_pass")).sendKeys("pa$$w0rd");
        driver.findElement(By.id("wp-submit")).click();

        driver.findElement(By.xpath("//div[text()='Job Listings ']")).click();

        driver.findElement(By.xpath("//a[contains(@class, 'page-title-action')]")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Next']")));

        driver.findElement(By.xpath("//button[text()='Next']")).click();
        driver.findElement(By.xpath("//button[text()='Next']")).click();
        driver.findElement(By.xpath("//button[text()='Next']")).click();

        driver.findElement(By.xpath("//button[contains(@class, 'components-button components-guide__finish-button is-primary')]")).click();

        driver.findElement(By.xpath("//textarea[@id='post-title-0']")).sendKeys("Test specialist");

        driver.findElement(By.xpath("//div[contains(@class, 'block-library-classic__toolbar has-advanced-toolbar')]")).click();

        driver.findElement(By.xpath("//div[starts-with(@id, 'editor-')]")).sendKeys("Automating the app");

        driver.findElement(By.xpath("//button[text()='Publish…']")).click();
        driver.findElement(By.xpath("//button[text()='Publish']")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(@class, 'components-button is-secondary')]")));
        driver.findElement(By.xpath("//a[contains(@class, 'components-button is-secondary')]")).click();
        String jobTitleText = driver.findElement(By.xpath("//h1[text()='Test specialist']")).getText();

        Assert.assertEquals(jobTitleText, "Test specialist");

        driver.quit();







    }
}
