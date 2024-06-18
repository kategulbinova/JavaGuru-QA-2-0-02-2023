package sergey.homework11;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
public class JanisRozeLoginTest {

    private WebDriver driver;

    @BeforeClass
    public void setUp() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.janisroze.lv/");
    }

    @Test
    public void LoginTest() {
        WebElement profileLink = driver.findElement(By.className("account-dropdown"));
        Actions actions = new Actions(driver);
        actions.moveToElement(profileLink).build().perform();
        try {
                wait(2000);
        } catch (InterruptedException e) {
                throw new RuntimeException(e);

        }


        WebElement logIn = driver.findElement(By.name("Ielogoties"));
        logIn.click();

        WebElement emailField = driver.findElement(By.id("email"));
        WebElement passwordField = driver.findElement(By.id("pass"));
        WebElement loginButton = driver.findElement(By.id("send2"));

        emailField.sendKeys("hawaji@gmail.com");
        passwordField.sendKeys("123456");
        loginButton.click();
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}


