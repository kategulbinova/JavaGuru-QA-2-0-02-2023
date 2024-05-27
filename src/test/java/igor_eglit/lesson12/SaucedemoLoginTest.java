package igor_eglit.lesson12;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SaucedemoLoginTest extends BaseTest {

    @Test
    @Parameters({"user-name", "passwordSauce"})
    void successfulLogin(String username, String password) {
        driver.findElement(By.id("user-name")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("login-button")).click();
        try {
            Assert.assertTrue(driver.findElement(By.id("react-burger-menu-btn")).isDisplayed());
        } catch (Exception e) {
            Assert.fail("Login failed");
        }
    }

    @Test
    void wrongCredentialsLoginFails() {
        driver.findElement(By.id("user-name")).sendKeys("wronguser");
        driver.findElement(By.id("password")).sendKeys("wrongpassword");
        driver.findElement(By.id("login-button")).click();
        try {
            Assert.assertTrue(driver.findElement(By.className("error-message-container")).isDisplayed());
        } catch (Exception e) {
            Assert.fail("Login successful with wrong credentials");
        }
    }
}
