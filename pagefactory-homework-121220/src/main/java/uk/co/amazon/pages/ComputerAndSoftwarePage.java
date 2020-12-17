package uk.co.amazon.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;
import uk.co.amazon.utility.Utility;

import java.util.ArrayList;
import java.util.List;

public class ComputerAndSoftwarePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    @FindBy(xpath = "//span[contains(text(),'Featured')]")
    WebElement _sortbyFeatured;

    @FindBy(xpath = "//ul[@class = 'a-nostyle a-list-link']/child::li/a")
    WebElement _selectFromDropDown;

    @FindBy(xpath = "//ul[@class = 'a-nostyle a-list-link']/child::li/a[contains(text(),'Price - Low to High')]")
    WebElement _optionFromDropDown;

    @FindBy(xpath = "//h1[contains(text(),'Deals on Computers and Software')]")
    WebElement _getTextFromComputerAndSoftware;

    @FindBy(xpath = "//span[@class = 'gb-font-size-medium inlineBlock unitLineHeight dealPriceText']")
    List<WebElement> _productPriceList;

    public void clickOnSortByFeatured() {
        Reporter.log("Click on Sortby : " + _sortbyFeatured.toString() + "<br>");
        log.info("Click on Sortby : " + _sortbyFeatured.toString());

        clickOnElement(_sortbyFeatured);
    }

    public void selectFromDropDown(String select) {
        Reporter.log("Select from dropdown : " + _selectFromDropDown.toString() + "<br>");
        log.info("select from dropdown : " + _selectFromDropDown.toString());
        clickOnElement(_optionFromDropDown);
    }


    public String getTextFromDealsOnComputerAndSoftwarePage() {
        Reporter.log("Get text from Deals On Computer And Software : " + _getTextFromComputerAndSoftware.toString() + "<br>");
        log.info("Get text from Deals On Computer And Software : " + _getTextFromComputerAndSoftware.toString());
        return getTextFromElement(_getTextFromComputerAndSoftware);
    }

    public void verifyProductArrangedInorder() {
        Reporter.log("Verify Product Arranged in Order : " + _productPriceList.toString() + "<br>");
        log.info("Verify Product Arranged in Order : " + _productPriceList.toString());
        List<WebElement> productPriceList = getListOfElements(_productPriceList);

        List<String> productPrices = new ArrayList<>();

        for (WebElement pricesOfProducts : productPriceList) {
            productPrices.add(pricesOfProducts.getText());
        }
        List<String> templist = new ArrayList<>();
        templist.addAll(productPrices);

        System.out.println(productPrices);
        System.out.println(templist);
        Assert.assertEquals(templist, productPrices);

    }
}
