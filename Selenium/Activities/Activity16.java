package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity16 {

    public static void main(String args[]){

        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.get("https://v1.training-support.net/selenium/dynamic-attributes");
        System.out.println(driver.getTitle());

         WebElement un = driver.findElement(By.xpath("//input[contains(@class, '-username')]"));
        WebElement pw = driver.findElement(By.xpath("//input[contains(@class,'-password')]"));
        WebElement cpw = driver.findElement(By.xpath("//label[text() = 'Confirm Password']/following-sibling::input"));
        WebElement email = driver.findElement(By.xpath("//label[text()='Email']/following-sibling::input"));

        un.sendKeys("raj");
        pw.sendKeys("shekar");
        cpw.sendKeys("shekar");
        email.sendKeys("raj@gmail.com");

        driver.findElement(By.xpath("//button[contains(text(), 'Sign Up')]")).click();
        String loginMessage = driver.findElement(By.id("action-confirmation")).getText();
        System.out.println("Login message: " + loginMessage);
        driver.close();


    }
}
