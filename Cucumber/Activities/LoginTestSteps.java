package StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginTestSteps {

    WebDriver driver;
    WebDriverWait wait;

    @Given("^User is on Login page$")
    public void userIsOnLoginPage() {
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
        //WebDriverManager.firefoxdriver().setup();
        driver =  new FirefoxDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));



        driver.get("https://v1.training-support.net/selenium/login-form");

    }

  /*  @When("^User enters username and password$")
    public void userEntersUsernameAndPassword(){
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");

        WebElement un = driver.findElement(By.id("username"));
        WebElement pwd = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.xpath("//button[contains(@class, 'ui button')]"));

        un.sendKeys("admin");
        pwd.sendKeys("password");
        loginButton.click();


    }*/

    @When("^User enters \"(.*)\" and \"(.*)\"$")
    public void userEntersUserNameAndPassword(String username, String password) throws Throwable {

        driver.findElement(By.id("username")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);

        //wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//button[@type='submit']")));

        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }


    @Then("^Read the page title and confirmation message$")
    public void readThePageTitleAndConfirmationMessage(){

        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("action-confirmation")));
        System.out.println("Title of the page: "+driver.getTitle());
        String loginMessage =  driver.findElement(By.id("action-confirmation")).getText();
        System.out.println("Login Confirmation Message: "+loginMessage);

        Assert.assertEquals(loginMessage, "Welcome Back, admin");
    }

    @And("^Close the Browser$")
    public void closeTheBrowser(){

        driver.quit();

    }

}
