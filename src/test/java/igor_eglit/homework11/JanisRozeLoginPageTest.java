package igor_eglit.homework11;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

class JanisRozeLoginPageTest {

    private WebDriver driver;
    private Actions actions;

    private String URL = "https://www.janisroze.lv/";
    private int EXPLICIT_WAIT = 10;
    private String locator_Xpath_LietotajaProfils = "//ul[@class = 'account-dropdown long']";
    private String locator_Xpath_dropDownMenuOption_Ielogoties = "//li[@class=' last']";
    private String locator_Id_credentialField_ePastaAdrese = "email";
    private String testAccount_email = "igeglits@gmail.com";
    private String locator_Id_credentialField_parole = "pass";
    private String testAccount_password = "qa2024automation";
    private String locator_Id_button_Ielogoties = "send2";
    private String locator_Xpath_FooterCopyright = "//div[@class ='footer-copyright']";

    @BeforeTest
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        actions = new Actions(driver);
        driver.get(URL);
    }

    @Test
    void hoverOverAccountDropdownClickIelogotiesFillCredentialsClickIelogoties() {
        actions.moveToElement(driver.findElement(By.xpath(locator_Xpath_LietotajaProfils)))
                .build()
                .perform();

        new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT))
                .until(ExpectedConditions.elementToBeClickable(By.xpath(locator_Xpath_dropDownMenuOption_Ielogoties)))
                .click();

        driver.findElement(By.id(locator_Id_credentialField_ePastaAdrese))
                .sendKeys(testAccount_email);

        driver.findElement(By.id(locator_Id_credentialField_parole))
                .sendKeys(testAccount_password);

        driver.findElement(By.id(locator_Id_button_Ielogoties))
                .click();

        //Optional: Scroll to the footer to see the copyright

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();",
                driver.findElement(By.xpath(locator_Xpath_FooterCopyright)));

        driver.quit();
    }
}
