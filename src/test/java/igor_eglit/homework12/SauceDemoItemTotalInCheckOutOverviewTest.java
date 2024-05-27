package igor_eglit.homework12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.List;

public class SauceDemoItemTotalInCheckOutOverviewTest extends BaseTest {


    @Test(priority = 1)
    @Parameters({"user-name", "passwordSauce"})
    void loginToSauceDemo(String userName, String password) {
        driver.findElement(id_credentialField_user).sendKeys(userName);
        driver.findElement(id_credentialField_password).sendKeys(password);
        driver.findElement(id_loginButton).click();
    }

    @Test(priority = 2,
            dataProvider = "itemsLocatorsFromProductListing",
            dataProviderClass = SauceDemoDataProvider.class)
    void putItemInCartCheckingItemListPriceWithItemInCartPrice(By itemLocator) {
        driver.findElement(itemLocator).click();
        String price = driver.findElement(className_itemPriceFromItemPage).getText();
        driver.findElement(id_addToCartOnItemPage).click();
        itemPricesCheckList.add(price);
        driver.findElement(id_shoppingCartButton).click();

        List<WebElement> pricesInCart = driver.findElements(id_itemInventoryPrice);
        String lastAddedPrice = pricesInCart.get(pricesInCart.size() - 1).getText();
        Assert.assertEquals(lastAddedPrice,price);
        driver.findElement(id_continueShoppingButton).click();
    }

    @Test(priority = 3)
    @Parameters({"testFirstName", "testLastName", "testPostalCode"})
    void proceedToCheckOutOverview(String firstName,
                                   String lastName,
                                   String postalCode) {

        driver.findElement(id_shoppingCartButton).click();

        js.executeScript("arguments[0].scrollIntoView();",
                driver.findElement(id_checkOutButtonInCart));
        driver.findElement(id_checkOutButtonInCart).click();

        driver.findElement(id_firstNameFieldInCheckOut).sendKeys(firstName);
        driver.findElement(id_lastNameFieldInCheckOut).sendKeys(lastName);
        driver.findElement(id_postalCodeFieldInCheckOut).sendKeys(postalCode);
        driver.findElement(id_continueButtonInCheckOut).click();
    }

    @Test(priority = 4)
    void checkItemsTotalFromCart() {
        js.executeScript("arguments[0].scrollIntoView();",
                driver.findElement(className_itemTotalCheckOutOverview));
        double itemsTotalFromCart = getParseDoubleItemsTotalFromCart(className_itemTotalCheckOutOverview, 13);
        double itemsTotalFromCheckList = getTotalItemsPricesAndParseDoubleInCheckList(itemPricesCheckList);
        Assert.assertEquals(itemsTotalFromCart, itemsTotalFromCheckList);
    }

    private double getParseDoubleItemsTotalFromCart(By element, int beginIndex) {
        return Double.parseDouble(driver
                .findElement(element)
                .getText().substring(beginIndex));
    }

    private double getTotalItemsPricesAndParseDoubleInCheckList(List<String> pricesList) {
        return pricesList
                .stream()
                .map(price -> Double.parseDouble(price.substring(1)))
                .reduce(0.0, Double::sum);
    }

}
