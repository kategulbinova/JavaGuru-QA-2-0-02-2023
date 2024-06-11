package teacher.pomSauceDemoTestExample.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static teacher.pomSauceDemoTestExample.utils.DriverProvider.getCurrentDriver;

public class HomePage {
    String loginFieldLocatorId = "user-name";
    String passwordFieldLocatorId = "password";
    String loginButtonLocatorId = "login-button";

    public void login(String login, String password) {
        WebElement loginField = getCurrentDriver().findElement(By.id(loginFieldLocatorId));
        WebElement passwordField = getCurrentDriver().findElement(By.id(passwordFieldLocatorId));
        WebElement loginButton = getCurrentDriver().findElement(By.id(loginButtonLocatorId));

        loginField.sendKeys(login);
        passwordField.sendKeys(password);
        loginButton.click();
    }
}
