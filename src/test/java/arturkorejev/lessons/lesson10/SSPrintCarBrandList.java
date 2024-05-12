package arturkorejev.lessons.lesson10;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static java.lang.Thread.sleep;

public class SSPrintCarBrandList {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https:www.ss.lv");

        WebElement switchLanguageLink = driver.findElement(By.className("menu_lang"));
        switchLanguageLink.click();

        WebElement personalCarsLink = driver.findElement(By.id("mtd_97"));
        personalCarsLink.click();

        List<WebElement> carProducers = driver.findElements(By.className("a_category"));

        for (WebElement carProducer : carProducers) {
            System.out.println(carProducer.getText());


        }

        //driver.quit();

    }
}
