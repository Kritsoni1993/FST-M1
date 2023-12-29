package OrangeHRM;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class activity5
{
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.get("http://alchemy.hguy.co/orangehrm");
        Thread.sleep(2000);

        driver.findElement(By.id("txtUsername")).sendKeys("orange");
        driver.findElement(By.id("txtPassword")).sendKeys("orangepassword123");
        driver.findElement(By.id("btnLogin")).click();

        //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        Thread.sleep(2000);
        driver.findElement(By.xpath(".//a[@id='menu_pim_viewMyDetails']")).click();

        driver.findElement(By.xpath(".//input[@value='Edit']")).click();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.findElement(By.xpath(".//input[@id='personal_txtEmpFirstName']")).clear();
        driver.findElement(By.xpath(".//input[@id='personal_txtEmpFirstName']")).sendKeys("Deeksitha");

        driver.findElement(By.xpath(".//input[@id='personal_txtEmpLastName']")).clear();
        driver.findElement(By.xpath(".//input[@id='personal_txtEmpLastName']")).sendKeys("Roy");

        driver.findElement(By.xpath(".//input[@id='personal_optGender_2']")).click();

        Select Nationality = new Select(driver.findElement(By.xpath(".//select[@id='personal_cmbNation']")));
        Nationality.selectByVisibleText("Indian");

        driver.findElement(By.xpath(".//input[@id='personal_DOB']")).clear();
        driver.findElement(By.xpath(".//input[@id='personal_DOB']")).sendKeys("2023-08-31");

        driver.findElement(By.xpath(".//input[@value='Save']")).click();

        driver.close();
    }
}