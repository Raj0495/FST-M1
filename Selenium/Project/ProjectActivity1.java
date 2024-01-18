package Selenium_Java_Project;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class ProjectActivity1 {

    public static void main(String args[]) {

        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.get("https://alchemy.hguy.co/jobs/");
        String pageTitle = driver.getTitle();
        System.out.println("Title of the page: "+pageTitle);

        Assert.assertEquals(pageTitle, "Alchemy Jobs – Job Board Application");

        if(pageTitle.equals("Alchemy Jobs – Job Board Application")){
            driver.quit();
        }
        else{
            System.out.println("Title mismatch");
        }





    }
}
