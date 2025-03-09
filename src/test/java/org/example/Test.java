package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Test {
    @org.testng.annotations.Test
    public void Testing() {

        WebDriver driver = new ChromeDriver();

        // Open the website
        driver.get("https://econmart24.com/todays-deal");
        driver.manage().window().maximize();

        Actions actions = new Actions(driver);
        // Find all "Today's Deal" product elements
        WebElement d1 = driver.findElement(By.xpath("//div[contains(@class, 'aiz-card-box')]\n"));
        actions.moveToElement(d1).perform();
        WebElement addToCartButton = d1.findElement(By.xpath("//a[contains(@onclick, 'showAddToCartModal')]\n"));
              addToCartButton.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='fs-24 fw-700']\n")));

        // Interact with the element
        element.click();

        // Close the browser
      //          driver.quit();
        //List<WebElement> deals = driver.findElements(By.cssSelector("div.col.text-center.border-right.border-bottom"));

        // Loop through each product, hover, and click "Add to Cart"
        // for (WebElement deal : deals) {
        // try {
        // Hover over the product to reveal the "Add to Cart" button
        //   actions.moveToElement(deal).perform();
        //  Thread.sleep(1000); // Wait for the button to appear

        // Locate "Add to Cart" button inside the hovered product
//               WebElement addToCartButton = deal.findElement(By.xpath(".//button[contains(text(),'Add to cart')]"));
//               addToCartButton.click();


//               WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2)); // 5-second timeout
//               WebElement addToCartButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(\"//a[contains(text(),'Add to cart')]\")\n")));
//               addToCartButton.click();
//
//               System.out.println("Product added to cart.");
//           } catch (Exception e) {
//               System.out.println("Add to Cart button not found for a product.");
//           }
//       }
//
//       // Close browser (optional)

//   }
    }
}
