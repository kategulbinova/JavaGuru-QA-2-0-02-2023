package yury.homeworks.homework11;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class JanisRozeLoginTest {
    private WebDriver driver;


    @BeforeTest

    public void setUp() {
        WebDriverManager.chromedriver().clearDriverCache().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }


    @Test

    public void testLogin() {

        driver.get("https://www.janisroze.lv/");

        WebElement profileIcon = driver.findElement(By.className("account-dropdown"));
        Actions actions = new Actions(driver);
        actions.moveToElement(profileIcon).perform();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        wait.until(ExpectedConditions.visibilityOf(profileIcon));

        WebElement loginLink = driver.findElement(By.className("last"));
        loginLink.click();

        WebElement nameInput = driver.findElement(By.id("email"));
        nameInput.sendKeys("yury.81518@gmail.com");

        WebElement passwordInput = driver.findElement(By.id("pass"));
        passwordInput.sendKeys("PasswordTest12345");

        WebElement loginButton = driver.findElement(By.id("send2"));
        loginButton.click();

        WebElement footer = driver.findElement(By.className("footer-copyright"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", footer);

        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait2.until(ExpectedConditions.visibilityOf(footer));

    }

    @AfterTest
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }

    }
}