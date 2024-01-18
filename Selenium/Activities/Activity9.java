package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity9 {

    public  static void main(String args[]){

        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://v1.training-support.net/selenium/ajax");
        System.out.println("Title of the page: "+driver.getTitle());

        driver.findElement(By.xpath("//button[contains(@class, 'ui violet button')]")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("h1")));

        System.out.println("Message on the page: "+driver.findElement(By.tagName("h1")).getText());

        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.tagName("h3"), "I'm late!"));

        System.out.println("Changed message: "+driver.findElement(By.tagName("h3")).getText());

        driver.quit();






    }
}
