package org.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class Interaction {
    @Test
    public void Navigation(){
     WebDriver driver = new ChromeDriver();
     driver.get("https://ecommart.flytesolutions.com/");
     String tittle = driver.getTitle();


        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.selenium.dev/documentation/webdriver/interactions/windows/");
         driver.navigate().back();
        //Assert.assertEquals(tittle,"econmart");

        System.out.println("Tittle: "+tittle);
}
@Test
public void AlertTest() throws InterruptedException {
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));

    //Navigate to Url
    driver.get("https://www.selenium.dev/documentation/webdriver/interactions/alerts/");

    //Simple Alert
    //Click the link to activate the alert
    JavascriptExecutor js = (JavascriptExecutor) driver;
    //execute js for alert
    //js.executeScript("alert('Sample Alert');");
   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
//    //Wait for the alert to be displayed and store it in a variable
//    wait.until(ExpectedConditions.alertIsPresent());
//

//    //Store the alert text in a variable and verify it
//    //Press the OK button
//    alert.accept();

    js.executeScript("confirm('Are you sure?');");
    //Wait for the alert to be displayed
   // wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    wait.until(ExpectedConditions.alertIsPresent());

    Alert alert = driver.switchTo().alert();

    //Store the alert text in a variable and verify it
   Thread.sleep(3000);
    //Press the Cancel button
    alert.dismiss();


}
@Test
public void AlertTestInputBox() throws InterruptedException {
    WebDriver driver = new FirefoxDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.get("https://www.selenium.dev/documentation/webdriver/interactions/alerts/");
    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("prompt('What is your name?');");
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    wait.until(ExpectedConditions.alertIsPresent());
    Alert alert = driver.switchTo().alert();
    alert.sendKeys("hello");
    Thread.sleep(3000);
    alert.accept();
    driver.quit();

}

}