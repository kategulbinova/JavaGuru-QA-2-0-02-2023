package nastja.testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.time.Duration;

public class SauceDemoComparePricesTest extends BaseTest {
    @Test
    @Parameters({"login", "password"})
    void comparePrice(String login, String password) {

        WebElement usernameInput = driver.findElement(By.id("user-name"));
        usernameInput.sendKeys(login);

        WebElement passwordInput = driver.findElement(By.id("password"));
        passwordInput.sendKeys(password);

        WebElement loginButton = driver.findElement(By.id("login-button"));
        loginButton.click();

       // WebDriverWait myWait = new WebDriverWait(driver, Duration.ofSeconds(2));
      //  myWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("item_4_title_link")) );

        WebElement backPackLink = driver.findElement(By.id("item_4_title_link"));
        backPackLink.click();

        WebElement backPackPriceField = driver.findElement(By.className("inventory_details_price"));
        String backPackPriceInTheShop = backPackPriceField.getText();

        WebElement backPackAddButton = driver.findElement(By.id("add-to-cart"));
        backPackAddButton.click();


        WebElement backToProductsLink = driver.findElement(By.id("back-to-products"));
        backToProductsLink.click();


        WebElement bikeLightLink = driver.findElement(By.id("item_0_title_link"));
        bikeLightLink.click();

        WebElement bikeLightPriceField = driver.findElement(By.className("inventory_details_price"));
        String bikeLightPriceInTheShop = bikeLightPriceField.getText();

        WebElement bikeLightAddButton = driver.findElement(By.id("add-to-cart"));
        bikeLightAddButton.click();

        WebElement shoppingCartIcon = driver.findElement(By.id("shopping_cart_container"));
        shoppingCartIcon.click();

        WebElement backPackPriceInShoppingCartField = driver.findElement(By.xpath("//*[@id=\"cart_contents_container\"]/div/div[1]/div[3]/div[2]/div[2]/div"));
        String backPackPriceInShoppingCart = backPackPriceInShoppingCartField.getText();
        Assert.assertEquals(backPackPriceInTheShop, backPackPriceInShoppingCart);
        System.out.println("Backpack price is: " + backPackPriceInTheShop + " = " + " Backpack price in the shopping cart is: " + backPackPriceInShoppingCart );

        WebElement bikeLightPriceInShoppingCartField = driver.findElement(By.xpath("//*[@id=\"cart_contents_container\"]/div/div[1]/div[4]/div[2]/div[2]/div"));
        String bikeLightPriceInShoppingCart = bikeLightPriceInShoppingCartField.getText();
        Assert.assertEquals(bikeLightPriceInTheShop, bikeLightPriceInShoppingCart);
        System.out.println("Bike Light price is: " + bikeLightPriceInTheShop + " = " + "Bike Light price the shopping cart is: " + bikeLightPriceInShoppingCart);



    }
}