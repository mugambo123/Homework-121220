package uk.co.amazon.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;
import uk.co.amazon.utility.Utility;

public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    @FindBy(xpath = "//a[contains(text(),'Last Minute Deals')]")
    WebElement _lastMinuteDeals;

    @FindBy(xpath = "//a[@id='nav-link-accountList']")
    WebElement _helloSignIn;

    @FindBy(xpath = "//a[contains(text(),'Start here.')]")
    WebElement _newCustomerStartHere;

    public void clickOnLastMinuteDeals() {
        Reporter.log("Click on Last Minute Deals : " + _lastMinuteDeals.toString() + "<br>");
        log.info("Click on Last Minute Deals : " + _lastMinuteDeals.toString());
        clickOnElement(_lastMinuteDeals);

    }

    public void mouseHoverOnHelloSignIn() {
        Reporter.log("Mouse hover on Hello Sign In : " + _helloSignIn.toString() + "<br>");
        log.info("Mouse hover on Hello Sign In : " + _helloSignIn.toString());
        mouseHoverToElement(_helloSignIn);
    }

    public void clickOnStartHereForNewCustomer() {
        Reporter.log("Click on new customer start here : " + _newCustomerStartHere.toString() + "<br>");
        log.info("Click on new customer start here : " + _newCustomerStartHere.toString());
        clickOnElement(_newCustomerStartHere);
    }
}
