package harrowbrowsertest;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.TreeMap;
import java.util.concurrent.TimeUnit;

public class MultiBrowserTest {

    static String baseUrl ="https://www.harrow.gov.uk/";
    static String browser="ie";
   static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        if (browser.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
            driver =new ChromeDriver();
            driver.manage().window().setPosition(new Point(+2000,0));
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.get(baseUrl);
            Thread.sleep(5000);
            driver.quit();
        }else if (browser.equalsIgnoreCase("firefox")){
            System.setProperty("webdriver.gecko.driver","drivers/geckodriver.exe");
            driver=new FirefoxDriver();
            driver.manage().window().setPosition(new Point(+2000,0));
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
            driver.get(baseUrl);
            Thread.sleep(5000);
            driver.quit();
        }else if (browser.equalsIgnoreCase("ie")){
            System.setProperty("webdriver.ie.driver","drivers/IEDriverServer.exe");
            driver=new InternetExplorerDriver();
            driver.manage().window().setPosition(new Point(+2000,0));
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
            driver.get(baseUrl);
            Thread.sleep(5000);
            driver.quit();
        }else {
            System.out.println("Wrong browser : ");
        }
    }
}
