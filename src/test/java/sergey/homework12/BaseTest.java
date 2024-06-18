package sergey.homework12;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class BaseTest {
        WebDriver driver;
        WebDriverWait wait;

        @BeforeMethod
        public void setUp() {

            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://www.saucedemo.com");
            wait = new WebDriverWait (driver,Duration.ofSeconds(10));
        }

        @AfterMethod
        public void tearDown() {
            if (driver != null) {
                driver.quit();
            }

        }
    }
