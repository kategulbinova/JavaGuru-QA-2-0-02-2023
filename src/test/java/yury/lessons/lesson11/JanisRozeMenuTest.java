package yury.lessons.lesson11;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JanisRozeMenuTest {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().clearDriverCache().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.janisroze.lv/");
        driver.manage().window().maximize();

        Actions actions = new Actions(driver);
        WebElement userProfile = driver.findElement(By.className("account-dropdown"));
        actions.moveToElement(userProfile).build().perform();
        //hover mouth

        driver.quit();
    }
}
