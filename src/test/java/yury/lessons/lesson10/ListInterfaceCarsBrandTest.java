package yury.lessons.lesson10;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class ListInterfaceCarsBrandTest {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ss.lv");

        WebElement switchLanguageLink = driver.findElement(By.className("menu_lang"));
        switchLanguageLink.click();

        WebElement carsLink = driver.findElement(By.id("mtd_97"));
        carsLink.click();

        List<WebElement> carProducers = driver.findElements(By.className("a_category"));

        for (WebElement carProducer : carProducers) {
            System.out.println(carProducer.getText());
        }
        driver.quit();
    }
}
