package barclaysbrowsertest;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ChromeBrowserTest {
    public static void main(String[] args) throws InterruptedException {

        String baseUrl = "https://www.barclays.co.uk/ ";
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //  driver.manage().window().setPosition(new Point(+2000,0));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baseUrl);
        Thread.sleep(5000);
        driver.quit();

    }
}