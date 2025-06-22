
package com.ecommerce.tests;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class SearchTest {
    WebDriver driver;

    @BeforeClass
    public void setUp() {
        System.set.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://your-ecommerce-site.com");
    }

    @Test
    public void testSearchProduct() {
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("iPhone");
        searchBox.submit();
        Assert.assertTrue(driver.getPageSource().contains("iPhone"));
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
