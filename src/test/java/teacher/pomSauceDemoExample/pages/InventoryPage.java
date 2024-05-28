package teacher.pomSauceDemoExample.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InventoryPage {
    WebDriver driver;
    String burgerMenuItemId = "react-burger-menu-btn";

    public InventoryPage(WebDriver driver) {
        this.driver = driver;
    }

    public Boolean isOpen() {
        try {
            WebElement burgerMenuItem = driver.findElement(By.id(burgerMenuItemId));
            if (burgerMenuItem.isDisplayed()) {
                return true;
            } else { return false; }
        } catch (Exception e) {
            return false;
        }
    }

}
