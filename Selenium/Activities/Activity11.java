package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity11 {

    public static void main(String args[]){

        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.get("https://v1.training-support.net/selenium/dynamic-controls");
        System.out.println("Title of the page: "+driver.getTitle());

        WebElement Checkbox = driver.findElement(By.name("toggled"));
        //Checkbox.click();

        System.out.println("State of the checkbox: "+Checkbox.isSelected());

        Checkbox.click();

        System.out.println("State of the checkbox: "+Checkbox.isSelected());


        driver.quit();



    }
}
