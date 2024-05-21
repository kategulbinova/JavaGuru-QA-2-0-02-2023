package teacher.testNGExamples;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SauceDemoPriceCheckTest {
    @Test(priority = 50)
    @Parameters({"login", "password"})
    void priceCheck(String login, String password) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com");

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

        driver.quit();
    }
}
