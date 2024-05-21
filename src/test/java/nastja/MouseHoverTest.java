package nastja;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import static java.lang.Thread.sleep;

public class MouseHoverTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.janisroze.lv/en/?___from_store=lv");

        Actions actions = new Actions(driver);
        WebElement UserProfile = driver.findElement(By.className("account-dropdown"));
        actions.moveToElement(UserProfile).build().perform();

        //sleep(3000);
        driver.quit();

    }
}
