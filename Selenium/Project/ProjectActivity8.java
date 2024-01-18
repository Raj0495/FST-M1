package Selenium_Java_Project;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class ProjectActivity8 {

    public static void main(String args[]) {

        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://alchemy.hguy.co/jobs/wp-admin");

        driver.findElement(By.id("user_login")).sendKeys("root");
        driver.findElement(By.id("user_pass")).sendKeys("pa$$w0rd");
        driver.findElement(By.id("wp-submit")).click();

        System.out.println(driver.getTitle());

        String pageTitle = driver.getTitle();
        System.out.println("Title of the page: "+pageTitle);
        Assert.assertEquals(pageTitle, "Dashboard ‹ Alchemy Jobs — WordPress");

        if(pageTitle.equals("Dashboard ‹ Alchemy Jobs — WordPress")){
            driver.quit();
        }
        else {
            System.out.println("Logged into some other website instead of Alchemy portal");
        }
    }
}
