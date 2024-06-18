package nastja;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static java.lang.Thread.sleep;

public class IkeaLoginTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.ikea.ee/en/");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        //myWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("inventory_container")));

        driver.findElement(By.linkText("Login or Register")).click();

        WebElement emailinput = driver.findElement(By.id("loginForm_email"));
        emailinput.sendKeys("amatitova@gmail.com");

        WebElement passwinput = driver.findElement(By.id("loginForm_password"));
        passwinput.sendKeys("Movalis1!");

        WebElement logininput = driver.findElement(By.id("btnSubmitLogin"));
        logininput.click();

        sleep(5000);

        driver.quit();

    }
}
