package igor_eglit.lesson10;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import static java.lang.Thread.sleep;

class FindCarTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ss.lv");

        WebElement switchLanguageLink = driver.findElement(By.className("menu_lang"));
        switchLanguageLink.click();

        WebElement carsLink = driver.findElement(By.id("mtd_97"));
        carsLink.click();

        WebElement priceFromField = driver.findElement(By.id("f_o_8_min"));
        priceFromField.sendKeys("6000");

        WebElement priceToField = driver.findElement(By.id("f_o_8_max"));
        priceToField.sendKeys("10000");

        Select yearFromSelect = new Select(driver.findElement(By.id("f_o_18_min")));
        yearFromSelect.selectByVisibleText("2001");

        Select yearToSelect = new Select(driver.findElement(By.id("f_o_18_max")));
        yearToSelect.selectByVisibleText("2020");

        Select engineSelect = new Select(driver.findElement(By.id("f_o_15_min")));
        engineSelect.selectByValue("3.0");

        Select colorSelect = new Select(driver.findElement(By.id("f_o_17")));
        colorSelect.selectByValue("6318");

        WebElement searchButton = driver.findElement(By.className("s12"));
        searchButton.click();

        sleep(1500);

        driver.quit();
    }
}
