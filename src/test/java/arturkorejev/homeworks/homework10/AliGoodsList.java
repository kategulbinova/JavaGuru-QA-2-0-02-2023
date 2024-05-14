package arturkorejev.homeworks.homework10;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;


public class AliGoodsList {

    //Optional: print out all the links of the List using custom method
    static void printLinksOfGoods(List<WebElement> goodsList) {
        for (WebElement LinksToGoods : goodsList)
            System.out.println(LinksToGoods.getAttribute("href"));

    }

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.aliexpress.com/");


        WebElement searchField = driver.findElement(By.id("search-words"));
        searchField.sendKeys("raspberry pi");

        WebElement searchButton = driver.findElement(By.className("search--submit--2VTbd-T"));
        searchButton.click();

        List<WebElement> goodsList = driver.findElements(By.xpath("//a[@class = 'multi--container--1UZxxHY cards--card--3PJxwBm search-card-item']"));

        System.out.println("===== > Number of goods is " + goodsList.size() + " < =====");

        printLinksOfGoods(goodsList);

        driver.quit();

    }

}

