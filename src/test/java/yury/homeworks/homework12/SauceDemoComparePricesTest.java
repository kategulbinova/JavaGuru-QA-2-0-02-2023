package yury.homeworks.homework12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SauceDemoComparePricesTest extends BaseTest {
    void addItemToCart() {
        WebElement addToCartButton = driver.findElement(By.id("add-to-cart"));
        addToCartButton.click();
    }

    @Test
    @Parameters({"login", "password"})
    void comparePrices (String login, String password) {

        login(login,password);

        WebElement backPack = driver.findElement(By.id("item_4_img_link"));
        backPack.click();

        WebElement backPackPrice = driver.findElement(By.className("inventory_details_price"));
        String firstItemPrice = backPackPrice.getText();

        addItemToCart();

        WebElement returnToTheList = driver.findElement(By.id("back-to-products"));
        returnToTheList.click();

        WebElement bikeLight = driver.findElement(By.id("item_0_img_link"));
        bikeLight.click();

        WebElement bikeLightPrice = driver.findElement(By.className("inventory_details_price"));
        String secondItemPrice = bikeLightPrice.getText();

        addItemToCart();

        WebElement shoppingCartIcon = driver.findElement(By.id("shopping_cart_container"));
        shoppingCartIcon.click();

        WebElement backPackPriceInCart = driver.findElement(By.xpath("//*[@id=\"cart_contents_container\"]/div/div[1]/div[3]/div[2]/div[2]/div"));
        String firstItemPriceInCart = backPackPriceInCart.getText();

        WebElement bikeLightPriceInCart = driver.findElement(By.xpath("//*[@id=\"cart_contents_container\"]/div/div[1]/div[4]/div[2]/div[2]/div"));
        String secondItemPriceInCart = bikeLightPriceInCart.getText();

        Assert.assertEquals(firstItemPrice, firstItemPriceInCart);
        System.out.println(firstItemPrice + "=" + firstItemPriceInCart );

        Assert.assertEquals(secondItemPrice, secondItemPriceInCart);
        System.out.println(secondItemPrice + "=" + secondItemPriceInCart);

    }
}
