package igor_eglit.homework_9;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static igor_eglit.homework_9.SeleniumMethods.*;
import static java.lang.Thread.sleep;

class Www220lvTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().clearDriverCache().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.220.lv");
        sleep(1500);

        var atlautVisasSikdatnes = "c-btn--secondary";
        searchByClassNameAndClick(atlautVisasSikdatnes, driver);

        var autopreces = "department-4579";
        searchByIdAndClick(autopreces, driver);

        var riepas = "Riepas";
        searchByPartialLinkTextAndClick(riepas, driver);

        var vasarasRiepas = "Vasaras riepas";
        searchByPartialLinkTextAndClick(vasarasRiepas, driver);

        var dropdownPlatums = "dropDownf1502";
        searchByIdAndClick(dropdownPlatums, driver);

        var optionPlatums215 = "dropDownf150214073483";
        searchByIdAndClick(optionPlatums215, driver);

        var dropdownProfils = "dropDownf1511";
        searchByIdAndClick(dropdownProfils, driver);

        var optionProfils60 = "dropDownf151114836200";
        searchByIdAndClick(optionProfils60, driver);

        var checkboxBridgestoneTyreProducer = "filterItem_31293_24848211";
        searchByIdAndClick(checkboxBridgestoneTyreProducer, driver);

        var firstProductBlockOnPage = "product-item-inner";
        searchByClassNameAndClick(firstProductBlockOnPage, driver);

        var uzGrozuButton = "a[widget-attachpoint='addToCart']";
        searchByCssSelectorAndClick(uzGrozuButton, driver);

        var pirktButton = "buy";
        searchByIdAndClick(pirktButton, driver);

        var successfullyAddedToCart = "cart";
        checkSubStringInUrl(successfullyAddedToCart, driver);

        driver.quit();
    }

    private static void checkSubStringInUrl(String subStringToCheck, WebDriver driver) {
        if (checkUrlContainsSubString(subStringToCheck, driver)) {
            System.out.println("Product added to cart successfully");
        } else {
            System.out.println("Product not added to cart");
        }
    }
}
