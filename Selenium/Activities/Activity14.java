package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Activity14 {

    public static void main(String args[]){

        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://v1.training-support.net/selenium/tables");
        System.out.println(driver.getTitle());

        //List<WebElement> cols = driver.findElement(By.xpath("//table[@id='sortableTable']/tbody/tr[1]/td"));
        List<WebElement> cols = driver.findElements(By.xpath("//table[@id='sortableTable']/tbody/tr[1]/td"));
        System.out.println("Number of columns:  " +cols.size());

        List<WebElement> rows = driver.findElements((By.xpath("//table[@id='sortableTable']/tbody/tr")));
        System.out.println("Number of rows:  " +rows.size());

        WebElement cellvalue = driver.findElement(By.xpath("//table[@id='sortableTable']/tbody/tr[2]/td[2]"));
        System.out.println("Cell value of second row & second column:  "+cellvalue.getText());

        driver.findElement(By.xpath("//table[@id='sortableTable']/thead/tr/th")).click();

        WebElement cellvalue1 = driver.findElement(By.xpath("//table[@id='sortableTable']/tbody/tr[2]/td[2]"));
        System.out.println("Cell value of second row & second column after sorting:  "+cellvalue1.getText());

        List<WebElement> footervalues = driver.findElements(By.xpath("//table[@id='sortableTable']/tfoot/tr/th"));
        System.out.println("Table footer size:  "+footervalues.size());

        for(WebElement footvalue : footervalues ){

            System.out.println("Table footer values:  "+footvalue.getText());


        }

        driver.close();

    }











}
