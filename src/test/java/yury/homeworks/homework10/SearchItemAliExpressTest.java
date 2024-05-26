package yury.homeworks.homework10;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class SearchItemAliExpressTest {
    static void printItemsLinks(List<WebElement> links) {
        for (WebElement link : links) {
            System.out.println(link.getAttribute("href"));
        }
    }
    public static void main(String[] args) {
        WebDriverManager.chromedriver().clearDriverCache().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.aliexpress.com/");

        String searchText = "Football Ball";

        WebElement searchInput = driver.findElement(By.className("search--keyword--15P08Ji"));
        searchInput.sendKeys(searchText);

        WebElement searchSubmit = driver.findElement(By.className("search--submit--2VTbd-T"));
        searchSubmit.click();

        List<WebElement> searchResults = driver.findElements(By.xpath("//a[@class = 'multi--container--1UZxxHY cards--card--3PJxwBm search-card-item']"));
        //Absolute Xpath: //*[@id="card-list"]/div[1]/div/div/a

        System.out.println("Search results: " + searchResults.size());

        printItemsLinks(searchResults);

        driver.quit();
    }
}
