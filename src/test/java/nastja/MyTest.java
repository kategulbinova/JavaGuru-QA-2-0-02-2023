package nastja;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//import static com.sun.org.apache.xpath.internal.compiler.Token.contains;
import static java.lang.Thread.sleep;

public class MyTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        WebElement emailinput = driver.findElement(By.id("user-name"));
        emailinput.sendKeys("standard_user");
        WebElement passwinput = driver.findElement(By.id("password"));
        passwinput.sendKeys("secret_sauce");
        WebElement logininput = driver.findElement(By.id("login-button"));
        logininput.submit();
        //sleep(3000);
        driver.getCurrentUrl();
        String URL = driver.getCurrentUrl();
        if (URL.contains("inventory.html")) {
            System.out.println("You are successfully logged in");
        } else
            System.out.println("Login failed");

        driver.quit();


    }
}
