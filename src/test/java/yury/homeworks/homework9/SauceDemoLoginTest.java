package yury.homeworks.homework9;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SauceDemoLoginTest {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com");
        WebElement usernameInput = driver.findElement(By.id("user-name"));
        usernameInput.sendKeys("error_user");
        WebElement passwordInput = driver.findElement(By.id("password"));
        passwordInput.sendKeys("secret_sauce");
        WebElement loginButton = driver.findElement(By.id("login-button"));
        loginButton.click();

        String currentUrl = driver.getCurrentUrl();
        if (currentUrl.contains("inventory.html")) {
            System.out.println("Login successful");
        } else {
            System.out.println("Login failed");
        }
        driver.quit();
    }
}
