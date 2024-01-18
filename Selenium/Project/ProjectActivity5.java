package Selenium_Java_Project;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class ProjectActivity5 {

    public static void main(String args[]) {

        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.get("https://alchemy.hguy.co/jobs/");

        driver.findElement(By.xpath("//a[text()='Jobs']")).click();

        System.out.println(driver.getTitle());

       String JobsMenuPageTitle = driver.getTitle();

        Assert.assertEquals(JobsMenuPageTitle, "Jobs – Alchemy Jobs");

        driver.quit();


    }
}
