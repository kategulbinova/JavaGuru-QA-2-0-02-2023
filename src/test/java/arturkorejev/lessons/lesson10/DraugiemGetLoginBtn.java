package arturkorejev.lessons.lesson10;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class DraugiemGetLoginBtn {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https:www.draugiem.lv");

        WebElement loginButton = driver.findElement(By.className("buttonC"));
        System.out.println(loginButton.getAttribute("name"));

        WebElement rememberMe = driver.findElement(By.id("Forms_remember_me"));
        System.out.println(rememberMe.getText());

    }
}
