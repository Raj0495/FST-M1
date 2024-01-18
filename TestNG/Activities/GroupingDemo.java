package examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class GroupingDemo {

    WebDriver driver;
    @BeforeClass(alwaysRun = true)
    public void setUp()
    {
        driver = new FirefoxDriver();
        driver.get("https://v1.training-support.net/selenium/target-practice");
    }

    @Test(groups={"HeaderTests"})
    public void headerTest1(){
        String header1=driver.findElement(By.tagName("h1")).getText();
        System.out.println("Header 1 text:"+header1);
        Assert.assertTrue(true);
    }
    @Test(groups={"HeaderTests"})
    public void headerTest2(){
        String header1=driver.findElement(By.tagName("h2")).getText();
        System.out.println("Header 2 text:"+header1);
        Reporter.log("This is a log statement");
        Assert.assertTrue(false);
    }

    @Test(groups = {"ButtonTests"})
    public void buttonTest1(){
        String oliveButton = driver.findElement(By.cssSelector("button.olive")).getText();
        System.out.println("header 1 text:" + oliveButton);
        Assert.assertTrue(true);
    }
    @Test(groups = {"ButtonTests"})
    public void buttonTest2(){
        String greyButton = driver.findElement(By.className("grey")).getText();
        System.out.println("Header 2 text:" + greyButton);
        Assert.assertTrue(true);
    }
    @AfterClass(alwaysRun=true)
    public void afterClass(){
        driver.quit();
    }
}
