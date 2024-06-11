package viktoria.lessons.lesson13.pomSauceDemoExample.tests;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

import static viktoria.lessons.lesson13.pomSauceDemoExample.utils.DriverProvider.closeDriver;
import static viktoria.lessons.lesson13.pomSauceDemoExample.utils.DriverProvider.getCurrentDriver;

public class BaseTest {
     WebDriverWait wait;
    @BeforeMethod
    void setUp(){
        wait = new WebDriverWait(getCurrentDriver(), Duration.ofSeconds(5));
        //getCurrentDriver().manage().window().maximize();
        getCurrentDriver().get("https://www.saucedemo.com");
    }
    @AfterMethod
    public void tearDown() {
        // Quit the driver
        closeDriver();
    }
}
