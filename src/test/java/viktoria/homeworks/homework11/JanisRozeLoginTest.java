package viktoria.homeworks.homework11;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class JanisRozeLoginTest {
    private WebDriver driver;
    private Actions action;
    private int waitTime = 10;

    @BeforeTest
    public void setUp() {
        // Initialize ChromeDriver
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        action = new Actions(driver);
    }

    @Test
    public void loginTest() {
        // Open the JanisRoze website
        driver.get("https://www.janisroze.lv/");

        // Hover mouse on "User profile" icon
        WebElement userProfileIcon = driver.findElement(By.xpath("//ul[@class = 'account-dropdown long']"));
        action.moveToElement(userProfileIcon).perform();

        // Click on "Login"
        WebElement loginLink = driver.findElement(By.xpath("//li[@class = ' last']"));
        loginLink.click();

        // Wait for Login page to appear
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(waitTime));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));

        // Fill user credentials & log in
        WebElement usernameInput = driver.findElement(By.id("email"));
        usernameInput.sendKeys("your_email");

        WebElement passwordInput = driver.findElement(By.id("pass"));
        passwordInput.sendKeys("your_password");

        WebElement loginButton = driver.findElement(By.id("send2"));
        loginButton.click();
    }

    @AfterTest
    public void tearDown() {
        // Quit the driver
        if (driver != null) {
            driver.quit();
        }
    }
}
