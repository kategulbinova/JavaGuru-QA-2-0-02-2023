package igor_eglit.lesson11;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

class JanisrozesHoverTest {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().clearDriverCache().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.janisroze.lv/");

        Actions actions = new Actions(driver);
        WebElement hoverElement = driver.findElement(By.xpath("//ul[@class = 'account-dropdown long']"));
        actions.moveToElement(hoverElement).build().perform();

        driver.quit();
    }
}
