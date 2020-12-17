package uk.co.amazon.testbase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import uk.co.amazon.propertyreader.PropertyReader;
import uk.co.amazon.utility.Utility;

public class TestBase extends Utility {

    String browser = PropertyReader.getInstance().getProperty("browser");

    @BeforeMethod(groups = {"smoke","sanity","regression"})
    public void openBrowser(){selectBrowser(browser);}

    @AfterMethod(groups = {"smoke","sanity","regression"})
    public void tearDown(){closeBrowser();}


}
