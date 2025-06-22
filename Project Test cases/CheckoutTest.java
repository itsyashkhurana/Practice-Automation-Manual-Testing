
package com.ecommerce.tests;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class CheckoutTest {
    WebDriver driver;

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://your-ecommerce-site.com/cart");
    }

    @Test
    public void testCheckout() {
        driver.findElement(By.id("checkoutButton")).click();
        driver.findElement(By.id("address")).sendKeys("123 Test St");
        driver.findElement(By.id("payment")).sendKeys("4111111111111111");
        driver.findElement(By.id("placeOrder")).click();
        Assert.assertTrue(driver.getPageSource().contains("Order Confirmed"));
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
