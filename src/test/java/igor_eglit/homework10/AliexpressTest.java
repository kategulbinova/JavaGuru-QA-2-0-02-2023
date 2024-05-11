package igor_eglit.homework10;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

class AliexpressTest {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.aliexpress.com");

        WebElement searchField = driver.findElement(By.id("search-words"));
        searchField.sendKeys("tattoo");
        System.out.println("Search field filled");

        WebElement searchButton = driver.findElement(By.className("search--submit--2VTbd-T"));
        searchButton.click();
        System.out.println("Search button clicked");

        List<WebElement> searchResultsGallery = driver.findElements(By.className("multi--container--1UZxxHY"));
        System.out.println(searchResultsGallery.size() + " search results found");

        //Optional: print out all the links of the List using custom method
        searchResultsGallery.stream()
                .map(element -> element.getAttribute("href"))
                .forEach(System.out::println);

        driver.quit();
    }
}
