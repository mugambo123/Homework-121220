package uk.co.amazon.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;
import uk.co.amazon.utility.Utility;

public class VerifyRealPerson extends Utility {

    private static final Logger log = LogManager.getLogger(ComputerAndSoftwarePage.class.getName());

    @FindBy(xpath = "//span[contains(text(),\"Please solve this puzzle so we know that you're a \")]")
    WebElement _verifyRealPerson;

    public String getTextVerifyYouAreRealPerson() {
        Reporter.log("Get text to verify you are a real person : " + _verifyRealPerson.toString() + "<br>");
        log.info("Get text to verify you are a real person : " + _verifyRealPerson.toString());
        return getTextFromElement(_verifyRealPerson);
    }
}
