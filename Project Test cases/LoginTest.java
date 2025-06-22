
package com.ecommerce.tests;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class LoginTest {
    WebDriver driver;

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://your-ecommerce-site.com/login");
    }

    @Test
    public void testValidLogin() {
        driver.findElement(By.id("email")).sendKeys("user@example.com");
        driver.findElement(By.id("password")).sendKeys("Password123");
        driver.findElement(By.id("loginButton")).click();
        Assert.assertTrue(driver.getTitle().contains("Dashboard"));
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
