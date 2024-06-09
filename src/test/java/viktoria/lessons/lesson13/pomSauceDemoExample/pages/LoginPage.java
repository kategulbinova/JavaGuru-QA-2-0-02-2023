package viktoria.lessons.lesson13.pomSauceDemoExample.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static viktoria.lessons.lesson13.pomSauceDemoExample.utils.DriverProvider.getCurrentDriver;

public class LoginPage {
     String userNameFieldId = "user-name";
    String passwordFieldId = "password";
    String loginButtonId = "login-button";
    String errorMessageTextClassName = "error-message-container";

    public void login(String userName, String password){
        WebElement userNameField = getCurrentDriver().findElement(By.id(userNameFieldId));
        WebElement passwordField = getCurrentDriver().findElement(By.id(passwordFieldId));
        WebElement loginButton = getCurrentDriver().findElement(By.id(loginButtonId));

        userNameField.sendKeys(userName);
        passwordField.sendKeys(password);
        loginButton.click();
    }
    public boolean isErrorMessageDisplayed() {
        WebElement errorMessageText = getCurrentDriver().findElement(By.className(errorMessageTextClassName));

        try {
            if (errorMessageText.isDisplayed()) {
                return true;
            } else return false;
        } catch (Exception e){
            return false;
        }
    }
}
