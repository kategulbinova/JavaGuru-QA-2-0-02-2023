package sergey.homework11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class JanisRozeLoginTest {

    WebDriver driver;

    @BeforeTest
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "path_to_chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.janisroze.lv/");
    }

    @Test
    public void userLoginTest() {
        WebElement userProfileIcon = driver.findElement(By.xpath("//xpath_to_user_profile_icon"));
        Actions action = new Actions(driver);
        action.moveToElement(userProfileIcon).perform();

        WebElement loginLink = driver.findElement(By.xpath("//xpath_to_login_link"));
        loginLink.click();

        // Wait for Login page to appear
        // Implement wait logic here

        WebElement usernameField = driver.findElement(By.id("username"));
        WebElement passwordField = driver.findElement(By.id("password"));

        usernameField.sendKeys("your_username");
        passwordField.sendKeys("your_password");

        // Click on login button
        // Implement login button click logic here
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}



