package teacher.testNGExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    @Test
    @Parameters({"login", "password"})
    void loginHappyPath(String login, String password) {
        WebElement usernameInput = driver.findElement(By.id("user-name"));
        usernameInput.sendKeys(login);

        WebElement passwordInput = driver.findElement(By.id("password"));
        passwordInput.sendKeys(password);

        WebElement loginButton = driver.findElement(By.id("login-button"));
        loginButton.click();

        try {
            WebElement burgerMenuIcon = driver.findElement(By.id("react-burger-menu-btn"));
            Assert.assertTrue(burgerMenuIcon.isDisplayed());
        } catch (Exception e) {
            Assert.fail("Burger menu item was not found");
        }
    }

    @Test
    @Parameters({"login", "password"})
    void loginWrongPassword(String login, String password) {
        // input login
        WebElement usernameInput = driver.findElement(By.id("user-name"));
        usernameInput.sendKeys(login);

        // input WRONG password
        WebElement passwordInput = driver.findElement(By.id("password"));
        passwordInput.sendKeys(password + "1");

        // click login button
        WebElement loginButton = driver.findElement(By.id("login-button"));
        loginButton.click();

        try {
            WebElement errorMessage = driver.findElement(By.className("error-message-container"));
            Assert.assertTrue(errorMessage.isDisplayed());
        } catch (Exception e) {
            Assert.fail("Error message was not displayed");
        }

        try {
            WebElement burgerMenuIcon = driver.findElement(By.id("react-burger-menu-btn"));
            Assert.fail("User has logged in, which is wrong for wrong password");
        } catch (Exception e) {
            Assert.assertTrue(true, "We do not see burger menu item");
        }

    }


}
