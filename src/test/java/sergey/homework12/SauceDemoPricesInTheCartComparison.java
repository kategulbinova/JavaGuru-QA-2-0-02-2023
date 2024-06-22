package sergey.homework12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static java.lang.Thread.sleep;

public class SauceDemoPricesInTheCartComparison extends BaseTest {

    @Test
    @Parameters({"login", "password"})


    void priceCheck(String login, String password) throws InterruptedException {

        // Log in

        WebElement usernameInput = driver.findElement(By.id("user-name"));
        usernameInput.sendKeys(login);

        WebElement passwordInput = driver.findElement(By.id("password"));
        passwordInput.sendKeys(password);

        WebElement loginButton = driver.findElement(By.id("login-button"));
        loginButton.click();

        Thread.sleep(2000);

        // Adding the first item (T-Shirt) to the cart

        WebElement tShirtLink = driver.findElement(By.id("item_1_title_link"));
        tShirtLink.click();

        WebElement tShirtPriceField = driver.findElement(By.className("inventory_details_price"));
        String firstItemPrice = tShirtPriceField.getText();

        WebElement addTShirtToCart = driver.findElement(By.className("btn_primary"));
        addTShirtToCart.click();

        WebElement backToProductsButton = driver.findElement(By.className("inventory_details_back_button"));
        backToProductsButton.click();

        Thread.sleep(2000);

        // Adding the second item (Fleece Jacket) to the cart

        WebElement fleeceJacketLink = driver.findElement(By.id("item_5_title_link"));
        fleeceJacketLink.click();


        WebElement fleeceJacketPriceField = driver.findElement(By.className("inventory_details_price"));
        String secondItemPrice = fleeceJacketPriceField.getText();

        WebElement addFleeceJacketToCart = driver.findElement(By.className("btn_primary"));
        addFleeceJacketToCart.click();

        Thread.sleep(2000);

        // Go to cart

        WebElement shoppingCartIcon = driver.findElement(By.id("shopping_cart_container"));
        shoppingCartIcon.click();

        WebElement tShirtPriceInCart = driver.findElement(By.xpath("//*[@id=\"cart_contents_container\"]/div/div[1]/div[3]/div[2]/div[2]/div"));
        String firstItemPriceInCart = tShirtPriceInCart.getText();


        WebElement fleeceJacketPriceInCart = driver.findElement(By.xpath("//*[@id=\"cart_contents_container\"]/div/div[1]/div[4]/div[2]/div[2]/div"));
        String secondItemPriceInCart = fleeceJacketPriceInCart.getText();

        Thread.sleep(2000);



        Assert.assertEquals(firstItemPrice, firstItemPriceInCart, "First Item price doesn't match");
        System.out.println("First Item price is: " + firstItemPrice + " = " + " First Item price IN CART: " + firstItemPriceInCart);
        Assert.assertEquals(secondItemPrice, secondItemPriceInCart, "Second Item price doesn;t match");
        System.out.println("Second Item price is: " + secondItemPrice + " = " + "Second Item price IN CART: " + secondItemPriceInCart);
    }

}
