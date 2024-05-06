package viktoria.homework9;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.sleep;

public class TiresPurchase220lv {

    static void clickWebElementFoundByClassName(String className, WebDriver driver) throws InterruptedException {

        WebElement webElement = driver.findElement(By.className(className));
        webElement.click();
        sleep(500);
    }
    static void clickWebElementFoundById(String id, WebDriver driver) throws InterruptedException {

        WebElement webElement = driver.findElement(By.id(id));
        webElement.click();
        sleep(500);
    }
    static void clickWebElementFoundByLinkText(String linkText, WebDriver driver) throws InterruptedException {

        WebElement webElement = driver.findElement(By.linkText(linkText));
        webElement.click();
        sleep(500);
    }
    static void clickWebElementFoundByCssSelector(String cssSelector, WebDriver driver) throws InterruptedException {

        WebElement webElement = driver.findElement(By.cssSelector(cssSelector));
        webElement.click();
        sleep(500);
    }

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().clearDriverCache().setup();
        WebDriver driver = new ChromeDriver();

        // Open the 220.lv website
        driver.get("https://220.lv");

        // Allow all cookies
        clickWebElementFoundByClassName("c-btn--secondary", driver);

        // Choose the menu item "Auto preces"
        clickWebElementFoundById("department-4579", driver);

        // Choose the category "Riepas"
        clickWebElementFoundByLinkText("Riepas", driver);

        // Choose "Vasaras riepas"
        clickWebElementFoundByLinkText("Vasaras riepas", driver);

        // Locate and fill the search input fields:
        // Platums - open dropdown and set 215
        clickWebElementFoundById("dropDownf1502", driver);
        clickWebElementFoundById("dropDownf150214073483",driver);

        // Profils - open dropdown and set 60
        clickWebElementFoundById("dropDownf1511",driver);
        clickWebElementFoundById("dropDownf151114836200",driver);

        // Ražotājs - click the Bridgestone checkbox
        clickWebElementFoundById("filterItem_31293_24848211", driver);


        // Click on the first search result to add it to the cart
        clickWebElementFoundByClassName("product-item-inner", driver);

        // Add the product to the cart
        clickWebElementFoundByCssSelector("a[widget-attachpoint = 'addToCart']", driver);
        clickWebElementFoundById("buy", driver);

        sleep(1000);

        // Close the browser
        driver.quit();
    }
}
