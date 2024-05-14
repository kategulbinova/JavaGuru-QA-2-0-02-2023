package teacher.advancedSelectors;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ErrorMessagePrintTest {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://www.draugiem.lv");

        WebDriverWait myWait = new WebDriverWait(driver, Duration.ofSeconds(2));
        myWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")) );

        WebElement loginField = driver.findElement(By.id("email"));
        loginField.sendKeys("dy@lt.lv");

        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("wrong password");

        WebElement loginButton = driver.findElement(By.id("loginSubmit"));
        loginButton.click();

        WebElement errorMessage = driver.findElement(By.className("infoMsg"));
        System.out.println(errorMessage.getText());

        driver.quit();
    }
}
