package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity2 {
    WebDriver driver;
    //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    @BeforeMethod
    public void beforeMethod() {
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();

        driver.get("https://v1.training-support.net/selenium/target-practice");

    }

    @Test
    public void testMethod1() {
        String title = driver.getTitle();
        //System.out.println(title);

        Assert.assertEquals(title, "Target Practice");
    }

    @Test
    public void testMethod2() {
        String Blackbutton = driver.findElement(By.xpath("//button[contains(@class, 'ui black button')]")).getText();
        //System.out.println(Blackbutton.isDisplayed());
        Assert.assertEquals(Blackbutton, "black");

    }

    @Test(enabled = false)
    public void testMethod3() {
        String subHeading = driver.findElement(By.className("sub")).getText();
        Assert.assertTrue(subHeading.contains("Practice"));

    }

    @Test
    public void testMethod4() {
        throw new SkipException("Skipping test case");
    }

    @AfterMethod
    public void afterMethod() {
        driver.close();
    }

}









