package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Activity18 {

    public static void main(String args[]){
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.get("https://v1.training-support.net/selenium/selects");

       String title = driver.getTitle();
       System.out.println("title");

       WebElement multiselect = driver.findElement(By.id("multi-select"));

       Select option = new Select(multiselect);

       option.selectByVisibleText("Javascript");

       option.selectByIndex(3);
       option.selectByIndex(4);
       option.selectByIndex(5);

       option.selectByValue("node");

       option.deselectByIndex(4);

       driver.close();




    }
}
