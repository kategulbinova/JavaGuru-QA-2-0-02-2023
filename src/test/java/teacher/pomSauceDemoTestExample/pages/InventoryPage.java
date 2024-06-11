package teacher.pomSauceDemoTestExample.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static teacher.pomSauceDemoTestExample.utils.DriverProvider.getCurrentDriver;

public class InventoryPage {
    String burgerMenuIconLocatorId = "react-burger-menu-btn";


    public Boolean isOpen() {
        try {
            WebElement burgerMenuIcon = getCurrentDriver().findElement(By.id(burgerMenuIconLocatorId));
            if (burgerMenuIcon.isDisplayed()) return true;
            else return false;
        } catch (Exception e) {
            return false;
        }
    }
}
