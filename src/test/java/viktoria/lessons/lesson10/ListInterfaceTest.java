package viktoria.lessons.lesson10;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class ListInterfaceTest {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.ss.lv");

        WebElement switchLanguageLink = driver.findElement(By.className("menu_lang"));
        switchLanguageLink.click();

        WebElement personalCarLink = driver.findElement(By.id("mtd_97"));
        personalCarLink.click();

        List<WebElement> carBrands = driver.findElements(By.className("a_category"));

        for (WebElement carBrand : carBrands) {
            System.out.println(carBrand.getText());
        }

        driver.quit();
    }
}
