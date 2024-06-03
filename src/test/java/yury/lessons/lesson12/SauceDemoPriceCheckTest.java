package yury.lessons.lesson12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SauceDemoPriceCheckTest extends BaseTest {

    @Test(enabled = false)
    @Parameters({"login", "password"})
    void priceCheck(String login, String password) {

        WebElement usernameInput = driver.findElement(By.id("user-name"));
        usernameInput.sendKeys(login);

        WebElement passwordInput = driver.findElement(By.id("password"));
        passwordInput.sendKeys(password);

        WebElement loginButton = driver.findElement(By.id("login-button"));
        loginButton.click();

        WebElement backPackLink = driver.findElement(By.id("item_4_title_link"));
        backPackLink.click();

        WebElement backPackPriceField = driver.findElement(By.className("inventory_details_price"));
        String priceInTheShop = backPackPriceField.getText();

        WebElement backPackAddButton = driver.findElement(By.id("add-to-cart"));
        backPackAddButton.click();

        WebElement shoppingCartIcon = driver.findElement(By.id("shopping_cart_container"));
        shoppingCartIcon.click();

        WebElement backPackPriceInShoppingCart = driver.findElement(By.className("inventory_item_price"));
        Assert.assertEquals(priceInTheShop, backPackPriceInShoppingCart.getText());

        WebElement backPackRemoveButton = driver.findElement(By.id("remove-sauce-labs-backpack"));
        backPackRemoveButton.click();

    }
}
