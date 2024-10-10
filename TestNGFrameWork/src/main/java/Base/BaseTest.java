package Base;

import Utilis.UtilitiesClass;
import com.beust.jcommander.Parameter;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.time.Duration;

public class BaseTest {
    public static WebDriver driver;
    @BeforeTest
    public void beforeTestMethod(){

    }
@BeforeMethod
@Parameters("browser")
public void beforeMethod(@Optional String browser){
        setUpDriver(browser);
        driver.get(UtilitiesClass.url);
    driver.manage().deleteAllCookies();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.manage().window().maximize();
}
    @AfterMethod
    public void afterMethod(){
        driver.quit();
    }
    @AfterTest
    public void afterTestMethod(){
System.out.println("Runned Successfully");
    }
    public void setUpDriver(String browser){
        if (browser.equalsIgnoreCase("chrome")){
//            WebDriverManager.chromedriver().setup();
            driver=new ChromeDriver();
        }
//        if (Browser.equals("chrome")){
//            driver=new ChromeDriver();
//        }
    }
}
