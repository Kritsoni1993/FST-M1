package OrangeHRM;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class activity4 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.get("http://alchemy.hguy.co/orangehrm");
        Thread.sleep(2000);
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.findElement(By.id("txtUsername")).sendKeys("orange");
        driver.findElement(By.id("txtPassword")).sendKeys("orangepassword123");
        driver.findElement(By.id("btnLogin")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(".//a[@id='menu_pim_viewPimModule']")).click();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        Thread.sleep(2000);
        driver.findElement(By.xpath(".//a[@id='menu_pim_addEmployee']")).click();
        //driver.findElement(By.id("btnAdd")).click();
        driver.findElement(By.xpath(".//input[@name='firstName']")).sendKeys("SBTest136");
        driver.findElement(By.xpath(".//input[@name='lastName']")).sendKeys("Test");
        Thread.sleep(2000);
        driver.findElement(By.id("btnSave")).click();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        Thread.sleep(2000);
        driver.findElement(By.id("menu_pim_viewPimModule")).click();
        Thread.sleep(2000);
        //driver.findElement(By.id("menu_pim_addEmployee")).click();
        driver.findElement(By.id("menu_pim_viewEmployeeList")).click();
        Thread.sleep(2000);
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.findElement(By.id("searchBtn")).click();
        Thread.sleep(2000);
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.findElement(By.xpath(".//input[@id='empsearch_employee_name_empName']")).clear();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        Thread.sleep(2000);
        driver.findElement(By.xpath(".//input[@id='empsearch_employee_name_empName']")).sendKeys("SBTest136 Test");
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        Thread.sleep(2000);
        driver.findElement(By.xpath(".//li[@class='ac_even ac_over']")).click();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        Thread.sleep(2000);
        driver.findElement(By.id("searchBtn")).click();
        Thread.sleep(2000);
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        System.out.println("Employee Added");
        driver.close();
    }
}
