package uk.co.amazon.pages;

import com.cucumber.listener.Reporter;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import uk.co.amazon.utility.Utility;

import java.util.ArrayList;
import java.util.List;

public class ShopAllDeals extends Utility {

    private static final Logger log = LogManager.getLogger(ComputerAndSoftwarePage.class.getName());

    @FindBy(xpath = "//div[@data-value ='Q4ALLD']")
    WebElement _shopAllDeals;

    @FindBy(xpath = "//h1[contains(text(),'Shop deals')]")
    WebElement _getTextShopDeals;

    @FindBy(xpath = "//a[@ data-value ='{\"stringVal\":\"BY_DISCOUNT_DESCENDING\"}']")
    WebElement _selectDiscountHighToLow;

    @FindBy(xpath = "//div[@class = 'a-row dealDetailContainer']")
    List<WebElement> _listOfHighestDiscountedProducts;


    public void clickOnShopAllDeals() {
        Reporter.addStepLog("Click on Shop All Deals : " + _shopAllDeals.toString() + "<br>");
        log.info("Click on Shop All Deals : " + _shopAllDeals.toString());
        clickOnElement(_shopAllDeals);
    }

    public String getTextFromShopDeals() {
        Reporter.addStepLog("Get Text from Shop Deals : " + _getTextShopDeals.toString() + "<br>");
        log.info("Get Text from Shop Deals : " + _getTextShopDeals.toString());
        return getTextFromElement(_getTextShopDeals);
    }

    public void selectDiscountHighToLow() {
        Reporter.addStepLog("Select Discount High to Low from Drop Down : " + _selectDiscountHighToLow.toString() + "<>br");
        log.info("Select Discount High to Low from Drop Down : " + _selectDiscountHighToLow.toString());
        clickOnElement(_selectDiscountHighToLow);
    }

    public void getListOfHighestDiscountedProducts() {
        Reporter.addStepLog("Get list of highest discounted products : " + _listOfHighestDiscountedProducts.toString() + "<br>");
        log.info("Get list of highest discounted products : " + _listOfHighestDiscountedProducts.toString());

        List<WebElement> discountedProducts = getListOfElements(_listOfHighestDiscountedProducts);

        List<String> highestDiscountedProductList = new ArrayList<>();

        for (WebElement topDiscountedProductList : discountedProducts) {
            highestDiscountedProductList.add(topDiscountedProductList.getText());
            System.out.println(highestDiscountedProductList + "<br>");
        }

    }
}
