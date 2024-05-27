package nastja;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SauceDemoAddRemoveItemTest {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com//");

        WebElement userInput = driver.findElement(By.id("user-name"));
        userInput.sendKeys("standard_user");

        WebElement passwInput = driver.findElement(By.id("password"));
        passwInput.sendKeys("secret_sauce");

        WebElement loginButton = driver.findElement(By.id("login-button"));
        loginButton.submit();

        WebDriverWait myWait = new WebDriverWait(driver, Duration.ofSeconds(2));
        myWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("inventory_container")) );

        //String price = driver.findElement(By.xpath()).getText();

        driver.findElement(By.id("add-to-cart")).click();

        driver.findElement(By.cssSelector("*[data-test=\"shopping-cart-badge\"]")).click(); //item_4_title_link

        //Assert
        driver.findElement(By.id("remove-sauce-labs-backpack"));

        driver.findElement(By.id("react-burger-menu-btn")).click();


        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        wait.until(ExpectedConditions.elementToBeClickable(By.id("logout_sidebar_link")));

        WebElement logoutMenuItem = driver.findElement(By.id("logout_sidebar_link"));
        logoutMenuItem.click();

        //sleep(3000);

        driver.quit();

    }
}
