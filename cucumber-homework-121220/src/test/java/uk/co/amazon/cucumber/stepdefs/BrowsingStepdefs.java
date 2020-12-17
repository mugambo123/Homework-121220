package uk.co.amazon.cucumber.stepdefs;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import jdk.nashorn.internal.AssertsEnabled;
import org.junit.Assert;
import uk.co.amazon.pages.*;
import uk.co.amazon.utility.Utility;

public class BrowsingStepdefs {
    @Given("^I am on home page$")
    public void iAmOnHomePage() {
    }


    @When("^I click on Last Minute Deals$")
    public void iClickOnLastMinuteDeals() {
        new HomePage().clickOnLastMinuteDeals();
    }

    @And("^I should be on Last Minute Deals Page expectedMessage \"([^\"]*)\"$")
    public void iShouldBeOnLastMinuteDealsPageExpectedMessage(String expectedMessage) {
        new LastMinuteDealPage().isLastMinuteDealPageDisplayed();

    }

    @And("^I click on Computers & Software$")
    public void iClickOnComputersSoftware() {
        new LastMinuteDealPage().clickOnComputersAndSoftware();
    }

    @And("^I should be on Deals on Computer and Software expectedMsg \"([^\"]*)\"$")
    public void iShouldBeOnDealsOnComputerAndSoftwareExpectedMsg(String expectedMsg) {
        Assert.assertEquals(expectedMsg, new ComputerAndSoftwarePage().getTextFromDealsOnComputerAndSoftwarePage());
    }


    @And("^I click on Sort by Featured$")
    public void iClickOnSortByFeatured() {
        new ComputerAndSoftwarePage().clickOnSortByFeatured();

    }

    @And("^I  from dropdown select \"([^\"]*)\"$")
    public void iFromDropdownSelect(String select) {
        new ComputerAndSoftwarePage().selectFromDropDown(select);

    }


    @Then("^products should be displayed accordingly$")
    public void productsShouldBeDisplayedAccordingly() {
        new ComputerAndSoftwarePage().verifyProductArrangedInorder();
    }

    @And("^click on Shop All Deals$")
    public void clickOnShopAllDeals() {
        new ShopAllDeals().clickOnShopAllDeals();


    }

    @And("^I should be on Shop deals page expectedText \"([^\"]*)\"$")
    public void iShouldBeOnShopDealsPageExpectedText(String expectedText) {
        Assert.assertEquals(expectedText, new ShopAllDeals().getTextFromShopDeals());
    }

    @And("^from dropdown I select option Discount - High to Low$")
    public void fromDropdownISelectOptionDiscountHighToLow() {
        new ShopAllDeals().selectDiscountHighToLow();
    }

    @Then("^I should get list of highest discounted products$")
    public void iShouldGetListOfHighestDiscountedProducts() {

        new ShopAllDeals().getListOfHighestDiscountedProducts();

    }


    @When("^I mouse hover on Hello, Sign in$")
    public void iMouseHoverOnHelloSignIn() {
        new HomePage().mouseHoverOnHelloSignIn();
    }

    @And("^I click on New customer\\? Start here\\.$")
    public void iClickOnNewCustomerStartHere() {
        new HomePage().clickOnStartHereForNewCustomer();
    }

    @And("^I should be on Create account page with expectedText \"([^\"]*)\"$")
    public void iShouldBeOnCreateAccountPageWithExpectedText(String expectedText) {
        Assert.assertEquals(expectedText, new CreateAccountPage().getTextFromCreateAccountPage());
    }

    @And("^I enter name \"([^\"]*)\"$")
    public void iEnterName(String name) {
        new CreateAccountPage().enterYourName(name);
    }

    @And("^I enter email \"([^\"]*)\"$")
    public void iEnterEmail(String randomEmailAddress) {
        new CreateAccountPage().enterEmail(Utility.getRandomString(6) + "123@gmail.com");

    }

    @And("^I enter password \"([^\"]*)\"$")
    public void iEnterPassword(String randomPassword) {
        new CreateAccountPage().enterPassword(Utility.getRandomString(6) + "123");

    }

    @And("^I click on Create your Amazon account$")
    public void iClickOnCreateYourAmazonAccount() {
        new CreateAccountPage().clickOnCreateYourAmazonAccount();
    }

    @Then("^Verify that you are a real person text \"([^\"]*)\"$")
    public void verifyThatYouAreARealPersonText(String realPersonText){
        Assert.assertEquals(realPersonText, new VerifyRealPerson().getTextVerifyYouAreRealPerson());
    }
}
