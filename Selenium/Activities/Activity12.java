package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity12 {
    public static void main(String args[]) {

        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.get("https://v1.training-support.net/selenium/dynamic-controls");
        System.out.println(("Title of the page: " + driver.getTitle()));

        WebElement Inputfield = driver.findElement(By.xpath("//input[@id='input-text']"));
        System.out.println("Checking the input field status: " + Inputfield.isEnabled());

        driver.findElement(By.xpath("//button[@id='toggleInput']")).click();

        WebElement Inputfield1 = driver.findElement(By.xpath("//input[@id='input-text']"));
        System.out.println("Checking the input fields status: " + Inputfield1.isEnabled());

        driver.quit();

        }
}