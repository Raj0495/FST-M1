package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3 {

    public static void main(String args[]) {
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

/*        driver.get("https://v1.training-support.net");
        System.out.println("Title of the page: "+driver.getTitle());

        driver.findElement(By.xpath("//a[contains(@class, 'ui inverted huge green button')]")).click();

        System.out.println("Title of the New page: "+driver.getTitle());*/

        driver.get("https://v1.training-support.net/selenium/login-form");
        System.out.println("Title of the page: " + driver.getTitle());

        driver.findElement(By.xpath("//input[contains(@class, '')]")).sendKeys("admin");
        driver.findElement(By.xpath("//input[contains(@name, 'Password')]")).sendKeys("password");

        driver.findElement(By.xpath("//button[contains(@class, 'ui button')]")).click();

        driver.quit();


    }
}