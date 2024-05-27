package viktoria.homeworks.homework12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class SauceDemoPriceCheckTest extends BaseTest {

    void addItemToCart() {
        WebElement addToCartButton = driver.findElement(By.id("add-to-cart"));
        addToCartButton.click();
    }
    @Test
    @Parameters({"name", "password"})
    void priceCheck(String name, String password) {

        login(name, password);

        // Find item 1, add to the cart and compare prices
        WebElement item1TitleLink = driver.findElement(By.id("item_1_title_link"));
        item1TitleLink.click();

        WebElement item1PriceField = driver.findElement(By.className("inventory_details_price"));
        String item1PriceInTheShop = item1PriceField.getText();

        addItemToCart();

        // Back to products list
        WebElement backToProductsButton = driver.findElement(By.id("back-to-products"));
        backToProductsButton.click();

        // Find item 2, add to the cart and compare prices
        WebElement item2TitleLink = driver.findElement(By.id("item_5_title_link"));
        item2TitleLink.click();

        WebElement item2PriceField = driver.findElement(By.className("inventory_details_price"));
        String item2PriceInTheShop = item2PriceField.getText();

        addItemToCart();

        // Open shopping cart
        WebElement shoppingCartIcon = driver.findElement(By.id("shopping_cart_container"));
        shoppingCartIcon.click();

        // Find item prices in the shopping cart and compare this with shop prices
        WebElement item1CartPriceField = driver.findElement(By.xpath("//*[@id=\"cart_contents_container\"]/div/div[1]/div[3]/div[2]/div[2]/div"));
        String item1PriceInCart = item1CartPriceField.getText();

        WebElement item2CartPriceField = driver.findElement(By.xpath("//*[@id=\"cart_contents_container\"]/div/div[1]/div[4]/div[2]/div[2]/div"));
        String item2PriceInCart = item2CartPriceField.getText();

        Assert.assertEquals(item1PriceInTheShop, item1PriceInCart);
        System.out.println("Item 1 prices are equal.");

        Assert.assertEquals(item2PriceInTheShop, item2PriceInCart);
        System.out.println("Item 2 prices are equal.");


        // Remove items from the shopping cart
        WebElement item1RemoveButton = driver.findElement(By.id("remove-sauce-labs-bolt-t-shirt"));
        item1RemoveButton.click();

        WebElement item2RemoveButton = driver.findElement(By.id("remove-sauce-labs-fleece-jacket"));
        item2RemoveButton.click();

    }
}

