package teacher.advancedSelectors;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class PrintCarMakesTest {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.ss.com");

        WebElement switchLanguageLink = driver.findElement(By.className("menu_lang"));
        switchLanguageLink.click();

        List<WebElement> carMakesLinks = driver.findElements(By.xpath("//a[@class='a_category']"));

        System.out.println(carMakesLinks.size());

        for (WebElement carMake : carMakesLinks) {
            System.out.println(carMake.getText());
        }

        driver.quit();
    }
}
