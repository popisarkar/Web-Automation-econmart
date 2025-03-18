package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.pagefactory.ByAll;
import org.openqa.selenium.support.pagefactory.ByChained;
import org.testng.annotations.Test;

import java.util.List;

public class Fileupload {


   // public String fileTest() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
//        driver.get("https://the-internet.herokuapp.com/upload");
//
//        File filelocation = new File("C:\\Users\\flyte\\IdeaProjects\\untitled2\\src\\FileUpload");
//
//        WebElement fileUpload= driver.findElement(By.cssSelector("input[type=file]"));
//        fileUpload.sendKeys(filelocation.getAbsolutePath());
//        Thread.sleep(3000);
//        driver.findElement(By.id("file-submit")).click();
//        Thread.sleep(3000);

        @Test
        public void ByAllTest() {
            // Create instance of ChromeDriver
            WebDriver driver = new ChromeDriver();
            // Navigate to Url
            driver.get("https://www.selenium.dev/selenium/web/login.html");

            // get both logins
            By example = new ByAll(By.id("password-field"), By.id("username-field"));
            List<WebElement> login_inputs = driver.findElements(example);

            //send them both input
            login_inputs.get(0).sendKeys("username");
            login_inputs.get(1).sendKeys("password");
        }



}




