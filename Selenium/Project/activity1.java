package OrangeHRM;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static dev.failsafe.internal.util.Assert.*;

public class activity1
{
    public static void main(String[] args)
    {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("http://alchemy.hguy.co/orangehrm");
        String Title = driver.getTitle();
        System.out.println("The Title is:" + Title);
        Assert.assertEquals("src/test/OrangeHRM", Title);
        driver.close();
    }

}
