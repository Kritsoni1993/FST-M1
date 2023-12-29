package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class activity3 {
        WebDriver driver;

        @BeforeClass
        @BeforeTest
        public void beforeClass()
        {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
            driver.get("https://v1.training-support.net/selenium/login-form");
        }

        @Test
        public void loginTest()
        {

            WebElement username = driver.findElement(By.xpath(".//input[@id='username']"));
            WebElement password = driver.findElement(By.xpath(".//input[@id='password']"));

            username.sendKeys("admin");
            password.sendKeys("password");

            driver.findElement(By.xpath("//button[text()='Log in']")).click();

            String loginMessage = driver.findElement(By.id("action-confirmation")).getText();

            Assert.assertEquals("Welcome Back, admin", loginMessage);
        }

        @AfterClass
        public void afterClass()
        {
            driver.close();
        }

}

