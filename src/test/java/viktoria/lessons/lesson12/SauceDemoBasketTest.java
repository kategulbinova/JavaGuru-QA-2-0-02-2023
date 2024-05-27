package viktoria.lessons.lesson12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;

import static java.lang.Thread.sleep;

public class SauceDemoBasketTest extends BaseTest {
    @Test
    @Parameters({"name", "password"})
    @Ignore
    public void testAddItemToBasket(String name, String password) throws InterruptedException {
        // Login
        WebElement usernameInput = driver.findElement(By.id("user-name"));
        usernameInput.sendKeys(name);

        sleep(2000);

        WebElement passwordInput = driver.findElement(By.id("password"));
        passwordInput.sendKeys(password);

        WebElement loginButton = driver.findElement(By.id("login-button"));
        loginButton.click();

        // Wait for the inventory page to load
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("inventory_item")));


        // Add any item to the basket and remember its price
        WebElement anyItem = driver.findElement(By.id("item_0_title_link"));
        String itemPrice = anyItem.findElement(By.className("inventory_item_price")).getText();

        WebElement addToCartButton = anyItem.findElement(By.id("add-to-cart-sauce-labs-bike-light"));
        addToCartButton.click();

        // Go to basket
        WebElement cartButton = driver.findElement(By.id("shopping_cart_container"));
        cartButton.click();

        // Assert the price is the same
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("cart_item")));
        WebElement cartItem = driver.findElement(By.className("cart_item"));
        String cartItemPrice = cartItem.findElement(By.className("inventory_item_price")).getText();

        Assert.assertEquals(cartItemPrice, itemPrice, "Item prices do not match.");

        // Remove the added item from the basket
        WebElement itemRemoveButton = driver.findElement(By.id("remove-sauce-labs-backpack"));
        itemRemoveButton.click();


        // Logout
        WebElement menuButton = driver.findElement(By.id("react-burger-menu-btn"));
        menuButton.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("logout_sidebar_link")));

        WebElement logoutLink = driver.findElement(By.id("logout_sidebar_link"));
        logoutLink.click();

        // Wait until the login page is loaded
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("login-button")));
    }
}
