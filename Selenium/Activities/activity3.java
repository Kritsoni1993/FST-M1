package activities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class activity3
{
        public static void main(String[] args){
            WebDriverManager.firefoxdriver().setup();
            WebDriver driver = new FirefoxDriver();
            driver.get("https://v1.training-support.net/selenium/login-form");
            System.out.println("The Title is:" + driver.getTitle());
            driver.findElement(By.xpath(".//input[@id='username']")).sendKeys("admin");
            driver.findElement(By.xpath(".//input[@id='password']")).sendKeys("password");
            driver.findElement(By.xpath(".//button[@class='ui button']")).click();
            driver.close();

        }
}
