package uk.co.amazon.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;
import uk.co.amazon.utility.Utility;

public class CreateAccountPage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());


    @FindBy(xpath = "//h1[contains(text(),'Create account')]")
    WebElement _createAccountPage;

    @FindBy(xpath = "//input[@id='ap_customer_name']")
    WebElement _yourName;

    @FindBy(xpath = "//input[@id='ap_email']")
    WebElement _email;

    @FindBy(xpath = "//input[@id='ap_password']")
    WebElement _password;

    @FindBy(xpath = "//input[@id='ap_password_check']")
    WebElement _reEnterPassword;

    @FindBy(xpath = "//input[@id='continue']")
    WebElement _createYourAmazonAccount;

    public String getTextFromCreateAccountPage() {
        Reporter.log("Get text create account page : "+ _createAccountPage.toString()+"<br>");
        log.info("Get text create account page : "+ _createAccountPage.toString());
        return getTextFromElement(_createAccountPage);
    }

    public void enterYourName(String name) {
        Reporter.log("Enter your name : " + _yourName.toString() + "<br>");
        log.info("Enter your name : " + _yourName.toString());
        sendTextToElement(_yourName, name);
    }

    public void enterEmail(String randomEmailAddress) {
        Reporter.log("Enter email : " + _email.toString() + "<br>");
        log.info("Enter email : " + _email.toString());
        sendTextToElement(_email, randomEmailAddress);
        String usedEmailAddress = randomEmailAddress;
    }

    public void enterPassword(String randomPassword) {
        Reporter.log("Enter Password : " + _password.toString() + "<br>");
        log.info("Enter Password : " + _password.toString());
        Reporter.log("Re-Enter Password : " + _reEnterPassword.toString() + "<br>");
        log.info("Re-Enter Password : " + _reEnterPassword.toString());
        sendTextToElement(_password, randomPassword);
        String enteredPassword = randomPassword;
        sendTextToElement(_reEnterPassword, enteredPassword);

    }

    public void clickOnCreateYourAmazonAccount() {
        Reporter.log("Click on create your amazon account : " + _createAccountPage.toString()+"<br>");
        log.info("Click on create your amazon account : " + _createAccountPage.toString());
        clickOnElement(_createYourAmazonAccount);
    }



}
