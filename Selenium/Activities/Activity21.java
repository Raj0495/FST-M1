package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity21 {
    public static void main(String arg[]) {

        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");

        WebDriverManager.firefoxdriver().setup();

        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.v1.training-support.net/selenium/tab-opener");

        System.out.println(driver.getTitle());





        }


    }

