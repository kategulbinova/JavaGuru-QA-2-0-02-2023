package igor_eglit.homework12;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

class BaseTest {
    //credentials
    protected static final By id_credentialField_user = By.id("user-name");
    protected static final By id_credentialField_password = By.id("password");
    //person information
    protected static final By id_firstNameFieldInCheckOut = By.id("first-name");
    protected static final By id_lastNameFieldInCheckOut = By.id("last-name");
    protected static final By id_postalCodeFieldInCheckOut = By.id("postal-code");
    //navigation
    protected static final By id_backToProductListing = By.id("back-to-products");
    //in cart action buttons
    protected static final By id_checkOutButtonInCart = By.id("checkout");
    protected static final By id_continueButtonInCheckOut = By.id("continue");
    protected static final By id_addToCartOnItemPage = By.id("add-to-cart");
    protected static final By id_continueShoppingButton = By.id("continue-shopping");
    //items
    protected static final By id_itemBackPack = By.id("item_4_title_link");
    protected static final By id_itemBikeLight = By.id("item_0_title_link");
    protected static final By id_itemBoltTshirt = By.id("item_1_title_link");
    protected static final By id_fleeceJacket = By.id("item_5_title_link");
    //prices
    protected static final By className_itemTotalCheckOutOverview = By.className("summary_subtotal_label");
    protected static final By className_itemPriceFromItemPage = By.className("inventory_details_price");
    protected static final By id_itemInventoryPrice = By.className("inventory_item_price");
    //action button
    protected static final By id_loginButton = By.id("login-button");
    protected static final By id_shoppingCartButton = By.id("shopping_cart_container");
    protected static List<String> itemPricesCheckList = new ArrayList<>();

    private int IMPLICIT_WAIT = 2;

    WebDriver driver;
    WebDriverWait wait;
    JavascriptExecutor js;

    @BeforeClass
    void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com");
        wait = new WebDriverWait(driver, Duration.ofSeconds(IMPLICIT_WAIT));
        js = (JavascriptExecutor) driver;
    }

    @AfterClass(alwaysRun = true)
    void tearDown() {
        driver.quit();
    }
}
