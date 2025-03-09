package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput;
import org.testng.annotations.Test;
import java.lang.Thread;

public class Scroll {

    @Test
    public void ScrollTest()throws InterruptedException {


        WebDriver driver = new ChromeDriver();

        // Open the website
        driver.get("https://econmart24.com/");
        driver.manage().window().maximize();
//        WebElement Bestselling = driver.findElement(By.xpath("//*[@class='fw-700' and text()='Best Selling']\n"));
//        new Actions(driver)
//                .scrollToElement(Bestselling)
//                .perform();

        Thread.sleep(2000);
        WheelInput.ScrollOrigin scrollOrigin = WheelInput.ScrollOrigin.fromViewport(0, 200);
        Thread.sleep(2000);
        new Actions(driver)
                .scrollFromOrigin(scrollOrigin, 0, 1800)
                .perform();
        Thread.sleep(2000);
    }
}
