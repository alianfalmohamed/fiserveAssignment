package Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class GooglePage extends BasePageClass {
    public GooglePage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath= "//textarea[@id='APjFqb']")
    WebElement searchBox;

    @FindBy(css = "h3")
    WebElement firstResultText;


    public void searchBox(String txtSearch) {
        webActionHelperMethods.clickbutton(searchBox);
        searchBox.sendKeys(txtSearch);
        searchBox.sendKeys(Keys.ENTER);
        Assert.assertTrue(firstResultText.getText().contains(txtSearch), "Expected text not found.");
    }
}
