package teacher.pomSauceDemoTestExample.utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverProvider {
    static WebDriver driver; // null

    public static WebDriver getCurrentDriver() {
        if (driver == null) {
            init();
        }
        return driver;
    }

    private static void init() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        //driver.manage().window().maximize();
    }

    public static void closeDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
