package teacher;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.sleep;

public class FindDogTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.ss.lv");

        WebElement switchLanguageLink = driver.findElement(By.className("menu_lang"));
        switchLanguageLink.click();

        WebElement dogsPuppiesLink = driver.findElement(By.id("mtd_300"));
        dogsPuppiesLink.click();

        WebElement ageFromField = driver.findElement(By.id("f_o_1276_min"));
        ageFromField.sendKeys("1");

        WebElement ageToField = driver.findElement(By.id("f_o_1276_max"));
        ageToField.sendKeys("1");

        WebElement searchButton = driver.findElement(By.className("s12"));
        searchButton.submit();

        //sleep(500);

        driver.quit();
    }
}
