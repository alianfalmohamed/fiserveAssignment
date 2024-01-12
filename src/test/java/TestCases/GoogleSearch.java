package TestCases;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class GoogleSearch extends BaseTest {

    @Test
    @Parameters({"browser", "environment"})
    public void testGoogleSearch() {
        driver.get(URL);
        // You may want to encapsulate this logic in a separate GoogleSearchPage class
        googlePage.searchBox("fiserve");
    }
}