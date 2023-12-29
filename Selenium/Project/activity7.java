package OrangeHRM;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class activity7
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

        driver.findElement(By.xpath(".//a[@id='menu_pim_viewMyDetails']")).click();

        driver.findElement(By.xpath(".//a[@href='/orangehrm/symfony/web/index.php/pim/viewQualifications/empNumber/1']")).click();

        driver.findElement(By.xpath(".//input[@id='addWorkExperience']")).click();

        driver.findElement(By.xpath(".//input[@id='experience_employer']")).sendKeys("IBM");

        driver.findElement(By.xpath(".//input[@id='experience_jobtitle']")).sendKeys("Automation Tester");

        driver.findElement(By.xpath(".//input[@id='btnWorkExpSave']")).click();

        driver.close();

    }
}
