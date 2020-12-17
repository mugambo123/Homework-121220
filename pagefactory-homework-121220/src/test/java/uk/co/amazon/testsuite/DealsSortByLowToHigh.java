package uk.co.amazon.testsuite;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import uk.co.amazon.pages.*;
import uk.co.amazon.testbase.TestBase;

public class DealsSortByLowToHigh extends TestBase {

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

    @Test(groups = {"smoke","regression"})
    public void checkLastMinuteDealsForComputerAndSoftwareAndSortbyPriceLowToHigh() {

        homePage.clickOnLastMinuteDeals();

        lastMinuteDealPage.isLastMinuteDealPageDisplayed();

        lastMinuteDealPage.clickOnComputersAndSoftware();

        String expectedMessage = "Deals on Computers and Software";
        String actualMessage = computerAndSoftwarePage.getTextFromDealsOnComputerAndSoftwarePage();
        Assert.assertEquals(expectedMessage, actualMessage);

        computerAndSoftwarePage.clickOnSortByFeatured();

        computerAndSoftwarePage.selectFromDropDown("Price - Low to High");

        computerAndSoftwarePage.verifyProductArrangedInorder();

    }
}
