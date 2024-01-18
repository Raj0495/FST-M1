package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Activity17 {

    public static void main(String[] args) {
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
        WebDriverManager.firefoxdriver().setup();
        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();
        // Create the Wait object
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

         driver.get("https://v1.training-support.net/selenium/selects");
        System.out.println("Home page title: " + driver.getTitle());
         WebElement dropdown = driver.findElement(By.id("single-select"));
        Select items = new Select(dropdown);

        items.selectByVisibleText("Option 2");
        items.selectByIndex(3);
        items.selectByValue("4");

         List<WebElement> options = items.getOptions();

         for(WebElement option : options ){
             System.out.println(option.getText());
         }



         driver.close();
    }
}
