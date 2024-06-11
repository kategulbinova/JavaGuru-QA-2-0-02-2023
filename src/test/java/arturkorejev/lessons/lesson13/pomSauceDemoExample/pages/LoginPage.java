package arturkorejev.lessons.lesson13.pomSauceDemoExample.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class StartPage = new StartPage {
    WebDriver driver; // NULL

    WebElement usernameField = driver.findElement(By.id("user-name"));
    WebElement passwordField = driver.findElement(By.id("password"));
    WebElement loginButton = driver.findElement(By.id("login-button"));
    WebElement errorMessageText = driver.findElement(By.className("error-message-container"));

    void login(String login, String password) {
        usernameField.sendKeys(login);
        passwordField.sendKeys(password);
        loginButton.click();
    }

    Boolean isErrorMessageIsDisplayed() {
        try {
            if(isErrorMessageIsDisplayed()) {
            return true;
        }
        else {
            return false;
        }

    } catch (Exception e) {
            return false;
        }
    }
}
