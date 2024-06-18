package teacher.pomSauceDemoTestExample.tests;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

import static teacher.pomSauceDemoTestExample.utils.DriverProvider.closeDriver;
import static teacher.pomSauceDemoTestExample.utils.DriverProvider.getCurrentDriver;

public class BaseTest {
    WebDriverWait wait;

    @BeforeMethod
    void setUp() {
        this.wait = new WebDriverWait( getCurrentDriver(), Duration.ofSeconds(5));
        getCurrentDriver().get("http://www.saucedemo.com");
        getCurrentDriver().manage().window().maximize();
    }
    @AfterMethod
    void tearDown() {
        closeDriver();
    }
}