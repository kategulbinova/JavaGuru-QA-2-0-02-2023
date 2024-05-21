package yury.lessons.lesson10;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FindCarTest {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.ss.lv");

        WebElement switchLanguageLink = driver.findElement(By.className("menu_lang"));
        switchLanguageLink.click();

        WebElement personalCarLink = driver.findElement(By.id("mtd_97"));
        personalCarLink.click();

        WebElement priceFromField = driver.findElement(By.id("f_o_8_min"));
        priceFromField.sendKeys("6000");

        WebElement priceToField = driver.findElement(By.id("f_o_8_max"));
        priceToField.sendKeys("10000");

        Select yearFromSelect = new Select(driver.findElement(By.id("f_o_18_min")));
        yearFromSelect.selectByValue("2001");

        Select engineToSelect = new Select(driver.findElement(By.id("f_o_15_max")));
        engineToSelect.selectByValue("3.0");

        Select color = new Select(driver.findElement(By.id("f_o_17")));
        color.selectByValue("6318");

        WebElement searchButton = driver.findElement(By.className("s12"));
        searchButton.submit();

        driver.quit();
    }
}
