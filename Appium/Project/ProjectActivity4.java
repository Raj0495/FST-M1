package AppiumProject1;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class ProjectActivity4 {

    public class Activity2 {

        AndroidDriver driver;

        WebDriverWait wait;

        @BeforeClass
        public void setUp() throws MalformedURLException {

            UiAutomator2Options options = new UiAutomator2Options();
            options.setPlatformName("android");
            options.setAutomationName("UIAutomator2");
            options.setAppPackage("com.android.chrome");
            options.setAppActivity("com.google.android.apps.chrome.Main");
            options.noReset();

            URL serverURL = new URL("http://localhost:4723/wd/hub");

            driver = new AndroidDriver(serverURL, options);

            wait = new WebDriverWait(driver, Duration.ofSeconds(10));

            driver.get("https://v1.training-support.net");

        }

        @Test
        public void loginForm(){
            String UiScrollable = "UiScrollable(UiSelector().Scrollable(true))";

            wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath("//android.view.View")));

            driver.findElement(AppiumBy.androidUIAutomator(UiScrollable + ".scrollForward()"));












        }

    }
}
