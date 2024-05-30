package viktoria.lessons.lesson13.pomSauceDemoExample.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    WebDriver driver;
    String userNameFieldId = "user-name";
    String passwordFieldId = "password";
    String loginButtonId = "login-button";
    String errorMessageTextClassName = "error-message-container";

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }
    public void login(String userName, String password){
        WebElement userNameField = driver.findElement(By.id(userNameFieldId));
        WebElement passwordField = driver.findElement(By.id(passwordFieldId));
        WebElement loginButton = driver.findElement(By.id(loginButtonId));

        userNameField.sendKeys(userName);
        passwordField.sendKeys(password);
        loginButton.click();
    }
    public boolean isErrorMessageDisplayed() {
        WebElement errorMessageText = driver.findElement(By.className(errorMessageTextClassName));

        try {
            if (errorMessageText.isDisplayed()) {
                return true;
            } else return false;
        } catch (Exception e){
            return false;
        }
    }
}
