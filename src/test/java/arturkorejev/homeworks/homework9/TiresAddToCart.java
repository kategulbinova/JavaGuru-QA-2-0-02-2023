package arturkorejev.homeworks.homework9;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import static java.lang.Thread.sleep;

public class TiresAddToCart {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://220.lv");

        WebElement agreement = driver.findElement(By.className("c-btn--secondary"));
        agreement.click();


        WebElement mainMenu = driver.findElement(By.id("menuBurger"));
        mainMenu.click();


    }
}
