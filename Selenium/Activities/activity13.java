package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class activity13 {

    public static void main(String args[]){

        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.get("https://v1.training-support.net/selenium/tables");
        System.out.println("Title of the page:  "+driver.getTitle());

        List<WebElement> rows = driver.findElements(By.xpath("//table[contains(@class, 'striped')]/tbody/tr"));
        System.out.println("Number of rows in static table:  "+rows.size());

        List<WebElement> cols = driver.findElements(By.xpath("//table[contains(@class, 'striped')]/tbody/tr[1]/td"));
        System.out.println("Number of columns in static table:  "+cols.size());

        List<WebElement> thirdRowValues = driver.findElements(By.xpath("//table[contains(@class, 'striped')]/tbody/tr[3]/td"));

        for(WebElement thirdRowValue: thirdRowValues){

            System.out.println("All the third row values: "+thirdRowValue.getText());

        }

        WebElement cellvalue = driver.findElement(By.xpath("//table[contains(@class, 'striped')]/tbody/tr[2]/td[2]"));
        System.out.println("Cell value of the second row second column: "+cellvalue.getText());

        driver.quit();
    }


}


