package yury.lessons.lesson10;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindDogTest {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().clearDriverCache().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ss.lv");

        WebElement changeLanguageLink = driver.findElement(By.className("menu_lang"));
        changeLanguageLink.click();

        WebElement dogsPuppiesLink = driver.findElement(By.id("mtd_300"));
        dogsPuppiesLink.click();

        WebElement ageFormField = driver.findElement(By.id("f_o_1276_min"));
        ageFormField.sendKeys("1");

        WebElement ageForm2Fiels = driver.findElement(By.id("f_o_1276_max"));
        ageForm2Fiels.sendKeys("5");

        WebElement searcbButton = driver.findElement(By.className("s12"));
        searcbButton.click();



        driver.quit();

    }
}
