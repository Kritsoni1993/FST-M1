package OrangeHRM;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class activity8
{
    public static void main(String[] args) throws InterruptedException
    {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.get("http://alchemy.hguy.co/orangehrm");
        Thread.sleep(2000);
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.findElement(By.id("txtUsername")).sendKeys("orange");
        driver.findElement(By.id("txtPassword")).sendKeys("orangepassword123");
        driver.findElement(By.id("btnLogin")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.findElement(By.xpath(".//a[@id='menu_dashboard_index']")).click();
        driver.findElement(By.xpath(".//span[text()='Apply Leave']")).click();

        Select LeaveType = new Select (driver.findElement(By.xpath(".//select[@id='applyleave_txtLeaveType']")));
        LeaveType.selectByVisibleText("DayOff");

        driver.findElement(By.xpath(".//input[@id='applyleave_txtFromDate']")).clear();
        driver.findElement(By.xpath(".//input[@id='applyleave_txtFromDate']")).sendKeys("2023-10-24");

        driver.findElement(By.xpath(".//input[@id='applyleave_txtToDate']")).clear();
        driver.findElement(By.xpath(".//input[@id='applyleave_txtToDate']")).sendKeys("2023-10-24");

        Thread.sleep(5000);

        driver.findElement(By.xpath(".//input[@id='applyBtn']")).click();
        driver.findElement(By.xpath(".//input[@id='applyBtn']")).click();
        System.out.println("Leave Submitted");
        Thread.sleep(5000);
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        //wait.until(ExpectedConditions.visibilityOf(By.xpath("")))
        driver.findElement(By.xpath(".//a[@id='menu_leave_viewMyLeaveList']")).click();

        driver.findElement(By.xpath(".//input[@id='calFromDate']")).clear();
        driver.findElement(By.xpath(".//input[@id='calFromDate']")).sendKeys("2023-10-24");

        driver.findElement(By.xpath(".//input[@id='calToDate']")).clear();
        driver.findElement(By.xpath(".//input[@id='calToDate']")).sendKeys("2023-10-24");

        driver.findElement(By.xpath(".//input[@id='btnSearch']")).click();
        String LeaveStatus = driver.findElement(By.xpath(".//a[contains(text(),'Pending Approval')]")).getText();
        System.out.println("The status of leave is " + LeaveStatus);

        driver.close();
    }
}
