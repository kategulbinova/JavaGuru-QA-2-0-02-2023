package sergey.homework11;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class JanisRozeLoginTest {


        private WebDriver driver;


        @BeforeClass
        public void setUp() {

            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://www.janisroze.lv");
            WebDriverWait wait;
            wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        }

        @Test

        public void loginTest() {


            WebElement profileLink = driver.findElement(By.className("account-dropdown"));
            Actions actions = new Actions(driver);
            actions.moveToElement(profileLink).build().perform();

            WebElement logIn = driver.findElement(By.xpath("//*[@id=\"header-account\"]/ul/li/ul/li[3]/a"));
            logIn.click();

            WebElement emailField = driver.findElement(By.id("email"));
            WebElement passwordField = driver.findElement(By.id("pass"));
            WebElement loginButton = driver.findElement(By.id("send2"));

            emailField.sendKeys("hawaji@gmail.com");
            passwordField.sendKeys("123456");
            actions.doubleClick(loginButton).perform();
        }

        @AfterClass

        public void tearDown() {

            driver.quit();
        }
}



