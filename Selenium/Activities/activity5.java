package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class activity5
{
    public static void main(String[] args)
    {

        WebDriverManager.firefoxdriver().setup();

        WebDriver driver = new FirefoxDriver();

        Actions builder = new Actions(driver);

        driver.get("https://v1.training-support.net/selenium/input-events");

        System.out.println("Home page title: " + driver.getTitle());

        builder.click().pause(1000).build().perform();

        String frontText = driver.findElement(By.className("active")).getText();
        System.out.println(frontText);

        builder.doubleClick().pause(1000).build().perform();

        frontText = driver.findElement(By.className("active")).getText();
        System.out.println(frontText);

        builder.contextClick().pause(1000).build().perform();

        frontText = driver.findElement(By.className("active")).getText();
        System.out.println(frontText);

        driver.close();
    }
}