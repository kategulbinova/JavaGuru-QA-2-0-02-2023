package nastja;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class ListsTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ss.lv");

        WebElement switchLangLink = driver.findElement(By.className("menu_lang"));
        switchLangLink.click();

        WebElement personalCarsLink = driver.findElement(By.id("mtd_97"));
        personalCarsLink.click();

        List<WebElement> cars = driver.findElements(By.className("a_category"));
        //print text of each link
        for (WebElement car : cars) {
            System.out.println(car.getText());
        }
        driver.quit();
    }
}