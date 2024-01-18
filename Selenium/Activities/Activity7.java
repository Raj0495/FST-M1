package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity7 {

    public static void main(String args[]) {

        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
        WebDriverManager.firefoxdriver().setup();
        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        driver.get("https://v1.training-support.net/selenium/drag-drop");
        System.out.println("Title of the page: "+driver.getTitle());

        WebElement football = driver.findElement(By.id("draggable"));

        WebElement dropzone1 = driver.findElement(By.id("droppable"));

        WebElement dropzone2 = driver.findElement(By.id("dropzone2"));

        Actions act = new Actions(driver);

        act.clickAndHold(football).moveToElement(dropzone1).pause(2000).release().build().perform();

        //act.clickAndHold(football).moveToElement(dropzone2).pause(2000).release().build().perform();

        act.dragAndDrop(football, dropzone2).build().perform();

        driver.quit();


    }
}
