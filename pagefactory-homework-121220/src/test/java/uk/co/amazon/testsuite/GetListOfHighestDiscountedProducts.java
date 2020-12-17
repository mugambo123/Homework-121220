package uk.co.amazon.testsuite;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import uk.co.amazon.pages.*;
import uk.co.amazon.testbase.TestBase;

public class GetListOfHighestDiscountedProducts extends TestBase {

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

    @Test(groups = {"sanity","regression"})
    public void GetListOfHighestDiscounteOffersInLastMinuteDeals() {

        homePage.clickOnLastMinuteDeals();

        lastMinuteDealPage.isLastMinuteDealPageDisplayed();

        shopAllDeals.clickOnShopAllDeals();

        String expectedMsg = "Shop deals";
        String actualMsg = shopAllDeals.getTextFromShopDeals();
        Assert.assertEquals(expectedMsg, actualMsg);

        computerAndSoftwarePage.clickOnSortByFeatured();

        shopAllDeals.selectDiscountHighToLow();

        shopAllDeals.getListOfHighestDiscountedProducts();
    }
}
