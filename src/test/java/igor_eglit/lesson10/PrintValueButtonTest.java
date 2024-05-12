package igor_eglit.lesson10;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class PrintValueButtonTest {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().clearDriverCache().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://draugiem.lv");

        WebElement printValueButton = driver.findElement(By.className("buttonC"));
        var string = printValueButton.getAttribute("name");
        System.out.println(string);

        WebElement printValueCheckBox = driver.findElement(By.className("formItemCheckbox"));
        var string2 = printValueCheckBox.getText();
        System.out.println(string2);


        driver.quit();
    }
}
