package StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertTestSteps {

    WebDriver driver;
    Alert alert;

    @Given("^User is on the page$")
    public void userIsOnLoginPage() throws InterruptedException {
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
        //WebDriverManager.firefoxdriver().setup();
        driver =  new FirefoxDriver();

        Thread.sleep(2000);

        driver.get("https://v1.training-support.net/selenium/javascript-alerts");

    }

    @When("^User clicks the Simple Alert button$")
    public void userClicksTheSimpleAlertButton(){

        driver.findElement(By.id("simple")).click();
    }

    @Then("^Alert opens$")
    public void switchFocus() {

        alert = driver.switchTo().alert();
    }

    @And("^Read the text from it and print it$")
    public void readTextAndPrint(){
        System.out.println("Text on Alert: "+alert.getText());
    }

    @And("^Close the alert$")
    public void closeAlert(){
        alert.accept();
    }

    @And("^Read the result text$")
    public void readTheResultText(){
        System.out.println("Title of the page: "+driver.getTitle());
    }

    @And("^Close Browser$")
    public void closeBrowser(){
        driver.quit();
    }

    @When("^User clicks the Confirm Alert Button$")
    public void userClicksTheConfirmAlertButton(){
        driver.findElement(By.id("confirm")).click();

    }

/*    @And("^Read the text from it and print it$")
    public void readTextFromConfirmAlertAndPrint(){
        System.out.println("Text on Alert: "+alert.getText());
    }*/

    @And("^Close the alert with Cancel$")
    public void closeTheAlertWithCancel(){
        alert.dismiss();
    }

    @When("^User clicks the Prompt Alert button$")
    public void userClicksThePromptAlertButton(){
        driver.findElement(By.id("prompt")).click();
    }

    @And("^Write a custom message in it$")
    public void writeACustomMessageInIt(){
        alert.sendKeys("Awesome");
    }

}
