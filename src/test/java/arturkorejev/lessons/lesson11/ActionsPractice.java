package arturkorejev.lessons.lesson11;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class ActionsPractice {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.janisroze.lv");



        Actions actions = new Actions(driver);
        WebElement element = driver.findElement(By.xpath("//*[@id=\"header-account\"]/ul/li/a/span[1]"));
        actions.moveToElement(element).build().perform();

        driver.quit();

    }
}
