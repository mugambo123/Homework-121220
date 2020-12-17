package uk.co.amazon.testsuite;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import uk.co.amazon.pages.*;
import uk.co.amazon.testbase.TestBase;

public class NewCustomerCreateAccount extends TestBase {

    ComputerAndSoftwarePage computerAndSoftwarePage;
    CreateAccountPage createAccountPage;
    HomePage homePage;
    LastMinuteDealPage lastMinuteDealPage;
    ShopAllDeals shopAllDeals;
    VerifyRealPerson verifyRealPerson;

    @BeforeMethod(groups = {"smoke","sanity","regression"})
    public void setUp() {
        computerAndSoftwarePage = new ComputerAndSoftwarePage();
        createAccountPage = new CreateAccountPage();
        homePage = new HomePage();
        lastMinuteDealPage = new LastMinuteDealPage();
        shopAllDeals = new ShopAllDeals();
        verifyRealPerson = new VerifyRealPerson();
    }

    @Test(groups = {"regression"})
    public void createAccountForNewCustomer() {

        homePage.mouseHoverOnHelloSignIn();

        homePage.clickOnStartHereForNewCustomer();

        String expextedText = "Create account";
        String actualText = createAccountPage.getTextFromCreateAccountPage();
        Assert.assertEquals(expextedText, actualText);

        createAccountPage.enterYourName("Krishna");

        createAccountPage.enterEmail(randomStringUpperCaseLowerCase(6)
                + randomIntZeroToNineThousand(9000) + "@gmail.com");

        createAccountPage.enterPassword(randomStringUpperCaseLowerCase(6)
                + randomIntZeroToNineThousand(9000));

        createAccountPage.clickOnCreateYourAmazonAccount();

        verifyRealPerson.getTextVerifyYouAreRealPerson();
    }
}
