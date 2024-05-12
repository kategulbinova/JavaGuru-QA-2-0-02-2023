package arturkorejev.lessons.lesson9;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.sleep;

public class MyFirstTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(); // read about interfaces
        driver.get("https://www.draugiem.lv");
        WebElement registretiesLink = driver.findElement(By.id("loginRegister"));
        WebElement emailInput = driver.findElement(By.id("email"));
        emailInput.sendKeys("My email");
        //sleep(5000); // - not good decision
        driver.quit();
    }
}
