package sergey.homework10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.ArrayList;

public class AliexpressListTest {

    public static void main(String[] args) {

        System.setProperty("web driver.chrome.driver", "path/to/chromedriver");

        WebDriver driver = new ChromeDriver();

        try {

            driver.get("https://www.aliexpress.com/");

            String searchText = "tattoo";

            WebElement searchBox = driver.findElement(By.id("search-key"));
            searchBox.sendKeys(searchText);

            WebElement searchButton = driver.findElement(By.className("search-button"));
            searchButton.click();


            Thread.sleep(5000);


            List<WebElement> linkElements = driver.findElements(By.xpath("//a[contains(@href, '/item/')]"));


            List<String> links = new ArrayList<>();
            for (WebElement element : linkElements) {
                links.add(element.getAttribute("href"));
            }

            System.out.println("Number of links: " + links.size());

            printLinks(links);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            driver.quit();
        }
    }

    private static void printLinks(List<String> links) {
        for (String link : links) {
            System.out.println(link);
        }
    }
}