package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;

public class Fileupload {

    @Test
    public void fileTest() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/upload");

        File filelocation = new File("C:\\Users\\flyte\\IdeaProjects\\untitled2\\src\\FileUpload");

        WebElement fileUpload= driver.findElement(By.cssSelector("input[type=file]"));
        fileUpload.sendKeys(filelocation.getAbsolutePath());
        Thread.sleep(3000);
        driver.findElement(By.id("file-submit")).click();
        Thread.sleep(3000);




    }



}
