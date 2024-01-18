package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity15 {
    public static void main(String args[]){

        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.get("https://v1.training-support.net/selenium/dynamic-attributes");

        System.out.println(driver.getTitle());

        WebElement un = driver.findElement(By.xpath("//input[contains(@class,'username-')]"));
        WebElement pwd = driver.findElement(By.xpath("//input[contains(@class, 'password-')]"));

        un.sendKeys("admin");
        pwd.sendKeys("password");


        driver.findElement(By.xpath("//button[contains(@class, 'ui button')]")).click();

        String actionconfirmation = driver.findElement(By.id("action-confirmation")).getText();
        System.out.println(actionconfirmation);
    }
}
