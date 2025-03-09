package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import javax.swing.*;
import java.util.List;

public class WriteTest {

    @Test
    public void LearnTest(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://econmart24.com/todays-deal");
        driver.manage().window().maximize();
        List<WebElement> cards = driver.findElements(By.xpath("//div[contains(@class,'aiz-card-box')]"));
        if(!cards.isEmpty()){
           for(WebElement card : cards){

              Actions action = new Actions(driver);
              action.moveToElement(card).perform();


          }
           

       }
    }
}



