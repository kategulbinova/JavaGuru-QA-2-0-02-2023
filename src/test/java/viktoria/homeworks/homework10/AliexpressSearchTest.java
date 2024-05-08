package viktoria.homeworks.homework10;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class AliexpressSearchTest {

    // Method to print out links from the List of WebElements
    static void printLinks(List<WebElement> links) {
        for (WebElement link : links) {
            System.out.println(link.getAttribute("href"));
        }
    }
    public static void main(String[] args) {
        WebDriverManager.chromedriver().clearDriverCache().setup();

        WebDriver driver = new ChromeDriver();

        // Open the AliExpress website
        driver.get("https://www.aliexpress.com/");

        // Close the float window "Subscribe to notifications" with OK
        WebElement allow = driver.findElement(By.className("_1-SOk"));
        allow.click();

        // Search for anything, for example "iphone 13"
        String searchText = "iphone 13";
        WebElement searchInput = driver.findElement(By.className("search--keyword--15P08Ji"));
        searchInput.sendKeys(searchText);
        WebElement searchSubmit = driver.findElement(By.className("search--submit--2VTbd-T"));
        searchSubmit.click();

        // Save all results in the List
        List<WebElement> searchResults = driver.findElements(By.className("search-card-item"));

        // Print out the size of the List
        System.out.println("Number of search results: " + searchResults.size());

        // Print out links from the List
        printLinks(searchResults);

        driver.quit();
    }
}
