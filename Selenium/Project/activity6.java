package OrangeHRM;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.Assert;
import org.testng.annotations.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class activity6
{
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.get("http://alchemy.hguy.co/orangehrm");
        Thread.sleep(2000);
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.findElement(By.id("txtUsername")).sendKeys("orange");
        driver.findElement(By.id("txtPassword")).sendKeys("orangepassword123");
        driver.findElement(By.id("btnLogin")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        //ExpectedCondition<WebElement> Visibility = ExpectedConditions.elementToBeClickable(By.xpath(".//a[@id='menu_directory_viewDirectory']"));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//a[@id='menu_directory_viewDirectory']")));

        WebElement element1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//a[@id='menu_directory_viewDirectory']")));
        Thread.sleep(2000);
        element.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        String Title = driver.findElement(By.xpath(".//div[@class='head']/h1")).getText();
        System.out.println("The heading is" + Title);
        Assert.assertEquals("Search Directory", Title);

        driver.close();
    }
}
