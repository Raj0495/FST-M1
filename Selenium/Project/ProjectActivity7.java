package Selenium_Java_Project;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class ProjectActivity7 {

    public static void main(String args[]) {

        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://alchemy.hguy.co/jobs/");

        driver.findElement(By.xpath("//a[text()='Post a Job']")).click();

        driver.findElement(By.id("create_account_email")).sendKeys("rajshekarboyini@y.com");

        driver.findElement(By.id("job_title")).sendKeys("Test specialist");

        driver.findElement(By.id("job_location")).sendKeys("UK");

        WebElement jobTypeDropDown = driver.findElement(By.id("job_type"));
        jobTypeDropDown.click();

        Select selectJobType = new Select(jobTypeDropDown);
        selectJobType.selectByVisibleText("Full Time");

        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body[contains(@data-id, 'job_description')]")));

        driver.findElement(By.xpath("//iframe[@id= 'job_description_ifr']")).sendKeys("Automation Testor");

        driver.findElement(By.xpath("//input[@id='application']")).sendKeys("https://alchemy.hguy.co/jobs/");

        driver.findElement(By.id("company_name")).sendKeys("IBM");

        driver.findElement(By.name("submit_job")).click();

        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='job_preview_submit_button']")));

        driver.findElement(By.xpath("//input[@id='job_preview_submit_button']")).click();

        driver.findElement(By.xpath("//a[text()='click here']")).click();

        String JobTitleText =  driver.findElement(By.xpath("//h1[contains(@class, 'entry-title')]")).getText();

        Assert.assertEquals(JobTitleText, "Test specialist");

        driver.quit();





    }
}
