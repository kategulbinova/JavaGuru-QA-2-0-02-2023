package arturkorejev.lessons.lesson12;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.time.Duration;

/*public class SauceDemoPriceCheck {


    WebDriver driver;
    WebDriverWait wait;

    @BeforeMethod
    void setUp(){

    }

    @Test
    @Parameters
    public void priceCheck() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com");
        WebDriverWait wait = new WebDriver(driver, Duration.ofSeconds(5));

    }

        WebElement usernameField = driver.findElement(By.id("user-name"));
        usernameField.sendKeys("standard_user");
        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("secret_sauce");
        WebElement loginButton = driver.findElement(By.id("login-button"));
        loginButton.click();

        String currentURL = driver.getCurrentUrl();
        System.out.println(currentURL);

        if (currentURL.contains("inventory")) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Login failed - Username or Password is incorrect.");
        }

        WebElement addBackpackToCart = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
        addBackpackToCart.click();

        WebElement transitToCart = driver.findElement(By.id("shopping_cart_container"));
        transitToCart.click();

        //Assert.assertEquals();

        //driver.quit();
    }

}

*/