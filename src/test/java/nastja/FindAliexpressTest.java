package nastja;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import static java.lang.Thread.sleep;

public class FindAliexpressTest {
    //use size method
    //get href in webpage to calculate size
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.aliexpress.com");

        WebElement searchFiled = driver.findElement(By.id("search-words"));
        searchFiled.sendKeys("bracelet"); //create String variable for word

        WebElement searchButton = driver.findElement(By.className("search--submit--2VTbd-T"));
        searchButton.click();

        List<WebElement> searchResults = driver.findElements(By.xpath("//*[@id='card-list']"));

        System.out.println(searchResults.size());


        sleep(3000);
        driver.quit();

    }
}