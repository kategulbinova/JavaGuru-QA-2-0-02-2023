package arturkorejev.lessons.lesson9;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.sleep;

public class FindDogTest1 {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https:www.ss.lv");

        WebElement switchLanguageLink = driver.findElement(By.className("menu_lang"));
        switchLanguageLink.click();

        WebElement dogsPuppiesLink = driver.findElement(By.id("mtd_300"));
        dogsPuppiesLink.click();

        WebElement ageFromField = driver.findElement(By.id("f_0_1276_min"));
        ageFromField.sendKeys("1");

        WebElement ageToField = driver.findElement(By.id("f_0_1276_max"));
        ageToField.sendKeys("1");

        WebElement searchButton = driver.findElement(By.className("s12"));
        searchButton.click();


        sleep(1500);

        driver.quit();
    }
}
