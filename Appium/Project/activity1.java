package AppiumProject.GoogleKeepAndTasks;


import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class activity1 {
    static AndroidDriver driver;
    WebDriverWait wait;

    @BeforeClass
    public void beforeClass() throws MalformedURLException {
        // Desired Capabilities
        UiAutomator2Options options = new UiAutomator2Options();
        options.setPlatformName("Android");
        options.setAutomationName("UiAutomator2");
        options.setAppPackage("com.google.android.apps.tasks");
        options.setAppActivity(".ui.TaskListsActivity");
        options.noReset();

        URL serverURL = new URL("http://localhost:4723/wd/hub");

        // Driver initialization
        driver = new AndroidDriver(serverURL, options);

        wait = new WebDriverWait(driver, Duration.ofSeconds(10));


    }

    @Test
    public void additionOfFirstTask()
    {
        driver.findElement(AppiumBy.id("tasks_fab")).click();

        driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text='New task']")).sendKeys("Complete Activity with Google Tasks");

        driver.findElement(AppiumBy.id("add_task_done")).click();

        String result = wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath("//android.widget.TextView[@text='Complete Activity with Google Tasks']"))).getText();

        //String result = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Complete Activity with Google Tasks']")).getText();

        Assert.assertEquals(result, "Complete Activity with Google Tasks");

    }

    @Test
    public void additionOfSecondTask()
    {

        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.findElement(AppiumBy.id("tasks_fab")).click();

        wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath("//android.widget.EditText[@text='New task']"))).sendKeys("Complete Activity with Google Keep");

        //driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text='New task']")).sendKeys("Complete Activity with Google Keep");

        driver.findElement(AppiumBy.id("add_task_done")).click();

        String result1 = wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath("//android.widget.TextView[@text='Complete Activity with Google Keep']"))).getText();

        //String result1 = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Complete Activity with Google Keep']")).getText();

        Assert.assertEquals(result1, "Complete Activity with Google Keep");

    }

    @Test
    public void additionOfThirdTask()
    {
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.findElement(AppiumBy.id("tasks_fab")).click();

        wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath("//android.widget.EditText[@text='New task']"))).sendKeys("Complete the second Activity Google Keep");

        //driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text='New task']")).sendKeys("Complete the second Activity Google Keep");

        driver.findElement(AppiumBy.id("add_task_done")).click();

        String result2 = wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath("//android.widget.TextView[@text='Complete the second Activity Google Keep']"))).getText();

        //String result2 = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Complete the second Activity Google Keep']")).getText();

        Assert.assertEquals(result2, "Complete the second Activity Google Keep");
    }

    @AfterClass
    public void tearDown()
    {
        // Close the app
        driver.quit();
    }
}