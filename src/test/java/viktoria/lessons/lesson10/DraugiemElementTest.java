package viktoria.lessons.lesson10;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DraugiemElementTest {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();  // WebDriver - interface
        driver.get("https://www.draugiem.lv");
        driver.findElement(By.id("Forms_remember_me"));
        System.out.println("*** Text: " + driver.findElement(By.id("Forms_remember_me")).getText());

        driver.quit();
    }
}
