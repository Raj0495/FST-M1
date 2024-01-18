package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity1 {

    WebDriver driver;
    //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    @BeforeMethod
    public void beforeMethod() {
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();

        driver.get("https://v1.training-support.net");

    }

    @Test
    public void testMethod() {
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        String title = driver.getTitle();
        System.out.println("Title of the page: " + driver.getTitle());
        Assert.assertEquals(title, "Training Support");

        driver.findElement(By.id("about-link")).click();

        String title1 = driver.getTitle();
        System.out.println("Title of the new page: " + title1);
        //Assert.assertEquals();

    }

    @AfterMethod
    public void afterMethod() {
        driver.quit();

    }


}
