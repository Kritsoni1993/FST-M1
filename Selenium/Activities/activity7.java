package activities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class activity7
{
    public static void main(String[] args)
    {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://v1.training-support.net/selenium/drag-drop");
        System.out.println("The Title is:" + driver.getTitle());
        Actions act = new Actions(driver);
        act.clickAndHold(driver.findElement(By.xpath(".//img[@id='draggable']"))).moveToElement(driver.findElement(By.xpath(".//div[@id='droppable']"))).release().build().perform();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
        act.dragAndDrop(driver.findElement(By.xpath(".//img[@id='draggable']")), driver.findElement(By.xpath(".//div[@id='dropzone2']"))).build().perform();
        driver.close();
    }
}