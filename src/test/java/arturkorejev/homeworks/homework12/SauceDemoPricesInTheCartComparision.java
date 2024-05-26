package arturkorejev.homeworks.homework12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class SauceDemoPricesInTheCartComparision extends BaseTest {
    @Test
    @Parameters({"login", "password"})
    void priceCheck(String login, String password) {

        WebElement usernameInput = driver.findElement(By.id("user-name"));
        usernameInput.sendKeys(login);

        WebElement passwordInput = driver.findElement(By.id("password"));
        passwordInput.sendKeys(password);

        WebElement loginButton = driver.findElement(By.id("login-button"));
        loginButton.click();

        WebElement tShirtLink = driver.findElement(By.id("item_1_title_link"));
        tShirtLink.click();

        WebElement tShirtPriceField = driver.findElement(By.className("inventory_details_price"));
        String firstItemPrice = tShirtPriceField.getText();

        addItemToCart();

        WebElement backToProductsButton = driver.findElement(By.id("back-to-products"));
        backToProductsButton.click();

        WebElement fleeceJacketLink = driver.findElement(By.id("item_5_title_link"));
        fleeceJacketLink.click();

        WebElement fleeceJacketPriceField = driver.findElement(By.className("inventory_details_price"));
        String secondItemPrice = fleeceJacketPriceField.getText();

        addItemToCart();

        WebElement shoppingCartIcon = driver.findElement(By.id("shopping_cart_container"));
        shoppingCartIcon.click();

        WebElement tShirtPriceInCart = driver.findElement(By.xpath("//*[@id=\"cart_contents_container\"]/div/div[1]/div[3]/div[2]/div[2]/div"));
        String firstItemPriceInCart = tShirtPriceInCart.getText();

        WebElement fleeceJacketPriceInCart = driver.findElement(By.xpath("//*[@id=\"cart_contents_container\"]/div/div[1]/div[4]/div[2]/div[2]/div"));
        String secondItemPriceInCart = fleeceJacketPriceInCart.getText();

        Assert.assertEquals(firstItemPrice, firstItemPriceInCart);
        System.out.println("First Item price is: " + firstItemPrice + " = " + " First Item price IN CART: " + firstItemPriceInCart );
        Assert.assertEquals(secondItemPrice, secondItemPriceInCart);
        System.out.println("Second Item price is: " + secondItemPrice + " = " + "Second Item price IN CART: " + secondItemPriceInCart);
        

    }
}
