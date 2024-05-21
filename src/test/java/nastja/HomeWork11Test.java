package nastja;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

import static java.lang.Thread.sleep;

public class HomeWork11Test {

    @Test
    public void JanisRoseLoginTest() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.janisroze.lv/");

        Actions actions = new Actions(driver);
        WebElement UserProfile = driver.findElement(By.className("account-dropdown"));
        actions.moveToElement(UserProfile).build().perform();

        WebElement login = driver.findElement(By.linkText("Ielogoties"));
        login.click();

        WebDriverWait myWait = new WebDriverWait(driver, Duration.ofSeconds(2));
        myWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")) );

        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("romashka321@gmail.com");

        WebElement password = driver.findElement(By.id("pass"));
        password.sendKeys("Romashka876!!!");

        WebElement loginButton = driver.findElement(By.id("send2"));
        loginButton.click();

        driver.quit();

    }
}
