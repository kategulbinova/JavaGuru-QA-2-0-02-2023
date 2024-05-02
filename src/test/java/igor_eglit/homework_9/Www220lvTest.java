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

        var optionPlatums = "dropDownf150214073483";
        searchByIdAndClick(optionPlatums, driver);

        var dropdownProfils = "dropDownf1511";
        searchByIdAndClick(dropdownProfils, driver);

        var optionProfils = "dropDownf151114836200";
        searchByIdAndClick(optionProfils, driver);

        var checkboxTyreProducer = "filterItem_31293_24848211";
        searchByIdAndClick(checkboxTyreProducer, driver);

        var selectedProductBlockOnPage = "product-item-inner";
        searchByClassNameAndClick(selectedProductBlockOnPage, driver);

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
