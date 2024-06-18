package nastja.SauceDemoProject.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    WebDriver driver; // Null

    String usernameFieldId = "user-name";
    String passwordFieldId = "password";
    String loginButtonId = "login-button";
    String errorMessageTextClassName = "error-message-container";

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void login(String login, String password) {
        WebElement usernameField = driver.findElement(By.id(usernameFieldId));
        WebElement passwordField = driver.findElement(By.id(passwordFieldId));
        WebElement loginButton = driver.findElement(By.id(loginButtonId));

        usernameField.sendKeys(login);
        passwordField.sendKeys(password);
        loginButton.click();
    }

    public Boolean isErrorMessageDisplayed() {

        try {
            WebElement errorMessageText = driver.findElement(By.className(errorMessageTextClassName));
            if ( errorMessageText.isDisplayed() ) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            return false;
        }
    }

}
