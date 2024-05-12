package viktoria.homeworks.homework9;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.sleep;

public class SauceDemoLoginTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().clearDriverCache().setup();

        WebDriver driver = new ChromeDriver();

        // Open the SauceDemo website
        driver.get("https://www.saucedemo.com/");

        // Locate the username and password input field,
        // enter valid data and click the "Login" button
        WebElement usernameInput = driver.findElement(By.id("user-name"));
        usernameInput.sendKeys("standard_user");

        WebElement passwordInput = driver.findElement(By.id("password"));
        passwordInput.sendKeys("secret_sauce");

        sleep(500);

        WebElement loginButton = driver.findElement(By.id("login-button"));
        loginButton.click();

        sleep(2000);

        // Check if the user has successfully logged in by checking the current URL
        String currentUrl = driver.getCurrentUrl();
        if (currentUrl.contains("inventory.html")) {
            System.out.println("***** Login successful! *****");
        } else {
            System.out.println("### Login failed. Invalid username or password. ###");
        }

        // Close the browser
        driver.quit();
    }
}
