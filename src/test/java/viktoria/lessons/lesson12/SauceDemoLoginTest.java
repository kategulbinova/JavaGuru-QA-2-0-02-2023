package viktoria.lessons.lesson12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SauceDemoLoginTest extends BaseTest{

    @Test
    @Parameters({"name", "password"})
    //@Ignore
    public void correctLoginTest(String name, String password){

        WebElement usernameInput = driver.findElement(By.id("user-name"));
        usernameInput.sendKeys(name);

        WebElement passwordInput = driver.findElement(By.id("password"));
        passwordInput.sendKeys(password);


        WebElement loginButton = driver.findElement(By.id("login-button"));
        loginButton.click();

        try {
            WebElement burgerMenuIcon = driver.findElement(By.id("react-burger-menu-btn"));
            Assert.assertTrue(burgerMenuIcon.isDisplayed());
       } catch (Exception e) {
            Assert.fail("Burger menu icon is not found");
        }
    }
    @Test
    @Parameters({"incorrectName", "incorrectPassword"})
    @Ignore
    public void incorrectLoginTest(String name, String password) {

        WebElement usernameInput = driver.findElement(By.id("user-name"));
        usernameInput.sendKeys(name);

        WebElement passwordInput = driver.findElement(By.id("password"));
        passwordInput.sendKeys(password);

        WebElement loginButton = driver.findElement(By.id("login-button"));
        loginButton.click();

        WebElement errorMessage = driver.findElement(By.className("error-message-container"));
        Assert.assertTrue(errorMessage.isDisplayed());
    }
}
