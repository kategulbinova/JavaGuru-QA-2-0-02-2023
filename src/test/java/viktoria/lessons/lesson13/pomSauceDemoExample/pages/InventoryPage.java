package viktoria.lessons.lesson13.pomSauceDemoExample.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InventoryPage {
    WebDriver driver;
    String burgerMenuIconId = "react-burger-menu-btn";

    public InventoryPage(WebDriver driver) {

        this.driver = driver;
    }

    public Boolean isOpen() {
        try {
            WebElement burgerMenuIcon = driver.findElement(By.id(burgerMenuIconId));
            if (burgerMenuIcon.isDisplayed()) return true;
            else return false;
        } catch (Exception e) {
            return false;
        }
    }
}
