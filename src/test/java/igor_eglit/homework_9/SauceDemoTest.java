package igor_eglit.homework_9;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static igor_eglit.homework_9.SeleniumMethods.*;

class SauceDemoTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().clearDriverCache().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com");

        searchByIdAndFillInField("user-name", "standard_user", driver);
        searchByIdAndFillInField( "password", "secret_sauce", driver);

        searchByIdAndClick("login-button",driver);

        if (checkUrlContainsSubString("inventory", driver)) {
            System.out.println("Login successful");
        } else {
            System.out.println("Login failed");
        }
        driver.quit();
    }
}
