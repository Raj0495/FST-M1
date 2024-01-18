package Selenium_Java_Project;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProjectActivity6 {

    public static void main(String args[]) {

        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait  = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://alchemy.hguy.co/jobs/");

        driver.findElement(By.xpath("//a[text()='Jobs']")).click();

        driver.findElement(By.id("search_keywords")).sendKeys("Banking");

        driver.findElement(By.xpath("//input[@type='submit']")).click();

        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//h3[text()='Banking'][1]")));

        driver.findElement(By.xpath("//h3[text()='Banking'][1]")).click();

        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//input[@type='button']")));

        driver.findElement(By.xpath("//input[@type='button']")).click();

        String emailText = driver.findElement(By.xpath("//a[contains(@class, 'job_application_email')]")).getText();

        System.out.println("Email: "+emailText);

        driver.quit();

    }
}
