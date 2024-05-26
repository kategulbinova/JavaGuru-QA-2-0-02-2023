package arturkorejev.homeworks.homework12;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class BaseTest {
    WebDriver driver;
    WebDriverWait wait;

    @BeforeMethod
    void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com");
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }

    void addItemToCart() {
        WebElement addToCartButton = driver.findElement(By.id("add-to-cart"));
        addToCartButton.click();
    }



    @AfterMethod
    void tearDown() {

        WebElement tShirtRemoveButton = driver.findElement(By.id("remove-sauce-labs-bolt-t-shirt"));
        tShirtRemoveButton.click();

        WebElement fleeceJacketRemoveButton = driver.findElement(By.id("remove-sauce-labs-fleece-jacket"));
        fleeceJacketRemoveButton.click();

        driver.quit();
    }
}
