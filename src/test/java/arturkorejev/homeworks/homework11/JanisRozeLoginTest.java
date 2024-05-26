package arturkorejev.homeworks.homework11;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;


public class JanisRozeLoginTest {

    private String testLoginEmail = "3.droog.000743@gmail.com";
    private String testPassword = "Test321";
    private String xPathForPopUpMenuLogin = "//*[@id=\"header-account\"]/ul/li/ul/li[3]/a";
    private String xPathForUserProfile = "//*[@id=\"header-account\"]/ul/li/a/span[1]";
    private String xPathForFooter = "//*[@id=\"root-wrapper\"]/div/div/div[3]/div/div/div[2]/div/div/div/div[1]/div";


    @Test
    public void janisRozeLoginTest() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.janisroze.lv/");

        Actions actions = new Actions(driver);
        WebElement element = driver.findElement(By.xpath(xPathForUserProfile));
        actions.moveToElement(element).build().perform();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(0,1));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xPathForPopUpMenuLogin)));

        WebElement loginPopUpMenu = driver.findElement(By.xpath(xPathForPopUpMenuLogin));
        loginPopUpMenu.click();

        WebElement emailField = driver.findElement(By.id("email"));
        emailField.sendKeys(testLoginEmail);

        WebElement passwordField = driver.findElement(By.id("pass"));
        passwordField.sendKeys(testPassword);

        WebElement loginButton = driver.findElement(By.id("send2"));
        loginButton.click();

        WebElement footer = driver.findElement(By.xpath(xPathForFooter));

        //(Optional) using JavascriptExecutor, scroll down until you see the footer

        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].scrollIntoView(true)",footer);

        driver.quit();

    }
}
