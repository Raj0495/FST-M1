package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4 {

    public static void main(String args[]) {
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.get("https://v1.training-support.net/selenium/target-practice");
        System.out.println("Title of the page: "+driver.getTitle());

        driver.findElement(By.xpath("//h3[contains(@class, 'ui yellow header')]")).getText();

       String FifthHeaderColor = driver.findElement(By.xpath("//h5[contains(@class, 'ui green header')]")).getCssValue("color");
       System.out.println("Fifth header color: "+FifthHeaderColor);

        String VioletButtonClasses = driver.findElement(By.xpath("//button[contains(@class, 'ui violet button')]")).getAttribute("class");
        System.out.println("Violet button classes: "+VioletButtonClasses);

        String GreyButtonText = driver.findElement(By.xpath("//button[contains(@class, 'ui grey button')]")).getText();
        System.out.println("Grey button text: "+GreyButtonText);

        driver.quit();


    }
}