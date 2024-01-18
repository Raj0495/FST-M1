package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class Activity6 {

    public static void main(String args[]) {

        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
        WebDriverManager.firefoxdriver().setup();
        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        driver.get("https://v1.training-support.net/selenium/input-events");
        System.out.println("Title of the page: " + driver.getTitle());

        Actions act = new Actions(driver);

        act.sendKeys("R").build().perform();
        act.keyDown(Keys.CONTROL).sendKeys("a").sendKeys("c").keyUp(Keys.CONTROL).build().perform();

        //driver.quit();

    }
}