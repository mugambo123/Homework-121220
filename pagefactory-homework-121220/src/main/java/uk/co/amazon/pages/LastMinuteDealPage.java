package uk.co.amazon.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;
import uk.co.amazon.utility.Utility;

public class LastMinuteDealPage extends Utility {

    private static final Logger log = LogManager.getLogger(LastMinuteDealPage.class.getName());

    @FindBy(xpath = "//div[@data-value ='Q4COMP']")
    WebElement _computersAndSoftware;

    @FindBy(xpath = "//img[@alt = 'Last Minute Christmas Deals']")
    WebElement _getTextLastMinute;

    public void clickOnComputersAndSoftware() {
        Reporter.log("Click on Computer And Software : " +  _computersAndSoftware.toString()+ "<br>");
        log.info("Click on Computer And Software : " +  _computersAndSoftware.toString());
        clickOnElement(_computersAndSoftware);
    }
    public boolean isLastMinuteDealPageDisplayed(){
        Reporter.log("Get Text from Last Minute Deals Page : " +_getTextLastMinute.toString() + "<br>");
        log.info("Get Text from Last Minute Deals Page : " +_getTextLastMinute.toString());
        return _getTextLastMinute.isDisplayed();
    }
}
