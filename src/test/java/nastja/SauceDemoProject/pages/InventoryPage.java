package nastja.SauceDemoProject.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InventoryPage {
    WebDriver driver;
    String burgerMenuIconLocatorId = "react-burger-menu-btn";

    public InventoryPage(WebDriver driver) {
        this.driver = driver;
    }

    public Boolean isOpen() {
        try {
            WebElement burgerMenuIcon = driver.findElement(By.id(burgerMenuIconLocatorId));
            if (burgerMenuIcon.isDisplayed()) return true;
            else return false;
        } catch (Exception e) {
            return false;
        }
    }
}