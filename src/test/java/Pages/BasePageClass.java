package Pages;

import actionHelper.WebActionHelperMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePageClass {

    protected WebDriver driver;
    static WebActionHelperMethods webActionHelperMethods;
    //protected WebDriverWait wait;

    public BasePageClass(WebDriver driver){
        this.driver = driver;
        webActionHelperMethods = new WebActionHelperMethods(driver);
        //wait = new WebDriverWait(driver, 10);
    }
}
