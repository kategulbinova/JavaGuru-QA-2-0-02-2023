package viktoria.homeworks.homework11;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.time.Duration;

public class JanisRozeLoginTest {
    private WebDriver driver;
    private Actions action;
    private WebDriverWait wait;
    private JavascriptExecutor jse;

    // Test data definition & initialization
    //private String testMail = "test_email";
    //private String testPassword = "test_pass";

    @BeforeTest
    public void setUp() {
        // Initialize ChromeDriver & actions
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        action = new Actions(driver);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        jse = (JavascriptExecutor) driver;
    }

    @Test
    @Parameters({"testMail", "testPassword"})
    public void loginTest(String testMail, String testPassword) {
        // Open the JanisRoze website
        driver.get("https://www.janisroze.lv/");

        // Hover mouse on "User profile" icon and choose "Login" option
        WebElement userProfileIcon = driver.findElement(By.xpath("//ul[@class = 'account-dropdown long']"));
        action.moveToElement(userProfileIcon).perform();
        WebElement loginLink = driver.findElement(By.xpath("//li[@class = ' last']"));
        loginLink.click();

        // Wait for Login page to appear
         wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));

        // Fill user credentials & log in
        WebElement usernameInput = driver.findElement(By.id("email"));
        usernameInput.sendKeys(testMail);

        WebElement passwordInput = driver.findElement(By.id("pass"));
        passwordInput.sendKeys(testPassword);

        WebElement loginButton = driver.findElement(By.id("send2"));
        loginButton.click();

        // Scroll down until the footer is visible
        WebElement footer = driver.findElement(By.className("footer-copyright"));
        jse.executeScript("arguments[0].scrollIntoView(true);", footer);

        // Additional wait to ensure the footer is visible
        wait.until(ExpectedConditions.visibilityOf(footer));
    }

    @AfterTest
    public void tearDown() {
        // Quit the driver
        if (driver != null) {
            driver.quit();
        }
    }
}
