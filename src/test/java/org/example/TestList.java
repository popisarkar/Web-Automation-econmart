package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class TestList {

    @Test
    public void Test() {
        WebDriver driver = new ChromeDriver();

        // Open the website
        driver.get("https://econmart24.com/todays-deal");
        driver.manage().window().maximize();

        // Implicit wait to let elements load


        // Locate all the card elements
        List<WebElement> cards = driver.findElements(By.xpath("//div[contains(@class, 'aiz-card-box')]\n"));

        // Check if there are at least 7 cards
        if (!cards.isEmpty()) {  // Replaced cards.size() > 0 with cards.isEmpty()
            // Use enhanced for loop to iterate through all cards
            for (WebElement card : cards){

                // Hover over the card to make the Add to Cart button visible
                Actions actions = new Actions(driver);
                actions.moveToElement(card).perform();

                // Locate the "Add to Cart" button that becomes visible after hover
                WebElement addToCartButton = driver.findElement(By.xpath("//a[contains(@onclick, 'showAddToCartModal')]"));

                // Click the "Add to Cart" button
                addToCartButton.click();

                // Wait for the new cart modal to appear (use an explicit wait)

                WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
                WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='fs-24 fw-700']\n")));

                // Click the close button on the cart modal
                element.click();


            }
            System.out.println("7 cards found.");
        }

        else {
            System.out.println(" 7 cards not  found.");
        }


    }
}