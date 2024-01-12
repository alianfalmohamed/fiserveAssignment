package TestCases;

import Pages.GooglePage;
import driverManager.DriverManagerType;
import driverManager.WebDrivers;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import util.utility;
import java.util.Properties;

public class BaseTest {
    
    protected GooglePage googlePage;
    protected WebDriver driver;
    Properties properties;
    static String URL;

    // @BeforeMethod
    // public void setUp() {
    //     System.setProperty("webdriver.chrome.driver", "C:\\Anfal\\dependencies\\chrome-win64\\chrome.exe");
    //     driver = new ChromeDriver();
    // }
    
    @BeforeSuite
    public void setUp() {
        String propertyPath = System.getProperty("user.dir") + "//src//test//resources//Env.properties";
        try {
            driver = WebDrivers.getDriver(DriverManagerType.CHROME);
            properties = utility.loadProperties(propertyPath);
            URL = properties.getProperty("URL");

            googlePage = new GooglePage(driver);
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @AfterSuite
    public void tearDown() {
        if(driver !=null) {
            driver.quit();
        }
    }

}
