package arturkorejev.homework9;

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
        WebElement UsernameField = driver.findElement(By.id("user-name"));
        UsernameField.sendKeys("standard_user");
        WebElement PasswordField = driver.findElement(By.id("password"));
        PasswordField.sendKeys("secret_sauce");
        WebElement LoginButton = driver.findElement(By.id("login-button"));
        LoginButton.click();

        String currentURL = driver.getCurrentUrl();
        System.out.println(currentURL);

        if (currentURL.contains("inventory")) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Login failed - Username or Password is incorrect.");
        }

        driver.quit();
    }

}

