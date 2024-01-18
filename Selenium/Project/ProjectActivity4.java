package Selenium_Java_Project;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class ProjectActivity4 {

    public static void main(String args[]) {

        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.get("https://alchemy.hguy.co/jobs/");

        String secondHeading = driver.findElement(By.tagName("h2")).getText();
        Assert.assertEquals(secondHeading, "Quia quis non");

        if(secondHeading.equals("Quia quis non")){
            driver.quit();
        }
        else{
            System.out.println("Second heading mismatch");
        }
    }
}
