package OrangeHRM;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class activity3
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
        WebElement Menu = driver.findElement(By.xpath(".//div[@id='content']"));
        System.out.println("Menu Displayed? " + Menu.isDisplayed());
        //Assert.assertEquals("Dashboard",Title);
        driver.close();
    }
}
