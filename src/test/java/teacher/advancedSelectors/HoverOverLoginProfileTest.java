package teacher.advancedSelectors;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import static java.lang.Thread.sleep;

public class HoverOverLoginProfileTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://www.janisroze.lv");

        WebElement profileLink = driver.findElement(By.className("account-dropdown"));
        Actions actions = new Actions(driver);
        actions.moveToElement(profileLink).build().perform();

        driver.quit();
    }
}
