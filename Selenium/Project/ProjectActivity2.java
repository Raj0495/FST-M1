package Selenium_Java_Project;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class ProjectActivity2 {

    public static void main(String args[]) {

        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.get("https://alchemy.hguy.co/jobs/");

        String pageHeading = driver.findElement(By.xpath("//h1[contains(@class, 'entry-title')]")).getText();
        System.out.println("Page heading: "+pageHeading);
        Assert.assertEquals(pageHeading, "Welcome to Alchemy Jobs");

        if(pageHeading.equals("Welcome to Alchemy Jobs")){
            driver.quit();
        }
        else{
            System.out.println("Page heading mismatch");
        }
    }
}
