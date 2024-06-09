package viktoria.lessons.lesson13.pomSauceDemoExample.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static viktoria.lessons.lesson13.pomSauceDemoExample.utils.DriverProvider.getCurrentDriver;

public class InventoryPage {
    String burgerMenuIconId = "react-burger-menu-btn";

    public Boolean isOpen() {
        try {
            WebElement burgerMenuIcon = getCurrentDriver().findElement(By.id(burgerMenuIconId));
            if (burgerMenuIcon.isDisplayed()) return true;
            else return false;
        } catch (Exception e) {
            return false;
        }
    }
}
