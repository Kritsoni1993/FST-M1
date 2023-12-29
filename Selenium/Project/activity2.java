package OrangeHRM;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.hc.core5.http.Header;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class activity2
{
    public static void main(String[] args) throws InterruptedException
    {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.get("http://alchemy.hguy.co/orangehrm");
        Thread.sleep(2000);
        WebElement HeaderURL = driver.findElement(By.xpath(".//img[@src='/orangehrm/symfony/web/webres_5d69118beeec64.10301452/themes/default/images/login/logo.png']"));
        System.out.println("The URL is: " + HeaderURL.getAttribute("src"));
        driver.close();
    }
}
