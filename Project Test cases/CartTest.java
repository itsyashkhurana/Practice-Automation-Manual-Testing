
package com.ecommerce.tests;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class CartTest {
    WebDriver driver;

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://your-ecommerce-site.com/products");
    }

    @Test
    public void testAddToCart() {
        driver.findElement(By.cssSelector(".product-item")).click();
        driver.findElement(By.id("addToCart")).click();
        WebElement cartCount = driver.findElement(By.id("cart-count"));
        Assert.assertTrue(Integer.parseInt(cartCount.getText()) > 0);
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
