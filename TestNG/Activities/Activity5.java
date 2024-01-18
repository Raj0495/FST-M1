package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class Activity5 {

    WebDriver driver;
    //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    @BeforeClass(alwaysRun = true)
    public void beforeClass() {
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();

        driver.get("https://v1.training-support.net/selenium/target-practice");

    }

    @Test( groups = {"HeaderTests", "ButtonTests"} )
    public void pageTitleTest() {
        String pageTitle = driver.getTitle();
        Assert.assertEquals(pageTitle, "Target Practice");
    }

    @Test( dependsOnMethods = {"pageTitleTest"}, groups = {"HeaderTests"})
    public void headerTest(){

        WebElement h3HeaderText = driver.findElement(By.id("third-header"));
        Assert.assertEquals(h3HeaderText.getText(), "Third header");

        String h5HeaderColor = driver.findElement(By.cssSelector("h3#third-header")).getCssValue("color");
        System.out.println("Color of the fifth header: "+h5HeaderColor);
        Assert.assertEquals(h5HeaderColor, "rgb(251, 189, 8)");
    }

    @Test(dependsOnMethods = {"pageTitleTest"}, groups = {"ButtonTests"})
    public void buttonTest(){
         String oliveButtonText = driver.findElement(By.xpath("//button[contains(@class,'ui olive button')]")).getText();
         System.out.println("Text of the olive button: "+oliveButtonText);
         Assert.assertEquals(oliveButtonText, "Olive");

         String ThirdRowFirstButtonColor = driver.findElement(By.xpath("//button[contains(@class, 'ui brown button')]")).getCssValue("color");
         System.out.println("Color of the third row first button: "+ThirdRowFirstButtonColor);
         Assert.assertEquals(ThirdRowFirstButtonColor, "rgb(255, 255, 255)");

    }

    @AfterClass(alwaysRun = true)
    public void afterClass(){
        driver.quit();
    }
}
