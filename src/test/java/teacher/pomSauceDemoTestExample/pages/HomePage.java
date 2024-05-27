package teacher.pomSauceDemoTestExample.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    WebDriver driver;

    String loginFieldLocatorId = "user-name";
    String passwordFieldLoactorId = "password";
    String loginButtonLocatorId = "login-button";

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void login(String login, String password) {
        WebElement loginField = driver.findElement(By.id(loginFieldLocatorId));
        WebElement passwordField = driver.findElement(By.id(passwordFieldLoactorId));
        WebElement loginButton = driver.findElement(By.id(loginButtonLocatorId));

        loginField.sendKeys(login);
        passwordField.sendKeys(password);
        loginButton.click();
    }
}
