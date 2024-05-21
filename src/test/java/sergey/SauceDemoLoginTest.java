package sergey;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebElement;

public class SauceDemoLoginTest {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        try {

            driver.get("https://www.saucedemo.com");
            driver.findElement(By.id("user-name")).sendKeys("standard_user");
            driver.findElement(By.id("password")).sendKeys("secret_sauce");
            driver.findElement(By.id("login-button")).click();

            String currentURL = driver.getCurrentUrl();
            System.out.println(currentURL);


            if (currentURL.contains("inventory")) {
                System.out.println("Login successful!");
            } else {
                System.out.println("Login failed - Username or Password is incorrect.");
            }
        } finally {

            driver.quit();
        }
    }
}