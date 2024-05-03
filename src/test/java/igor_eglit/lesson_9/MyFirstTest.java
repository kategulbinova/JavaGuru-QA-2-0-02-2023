package igor_eglit.lesson_9;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class MyFirstTest {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().clearDriverCache().setup();
        WebDriver driver =  new ChromeDriver();
        driver.get("https://www.google.com");
        driver.quit();
    }
}
