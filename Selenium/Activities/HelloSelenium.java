package examples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HelloSelenium {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
        // Setup the Firefox driver(GeckoDriver)
        WebDriverManager.firefoxdriver().setup();

        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Open the browser
        driver.get("https://v1.training-support.net");

        Thread.sleep(2000);

        // Perform testing and assertions


        // Close the browser
        // Feel free to comment out the line below
        // so it doesn't close too quickly
        driver.quit();

    }
}
