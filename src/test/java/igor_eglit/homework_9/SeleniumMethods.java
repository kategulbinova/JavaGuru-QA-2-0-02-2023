package igor_eglit.homework_9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static java.lang.Thread.sleep;

class SeleniumMethods {
    static boolean checkUrlContainsSubString(String subString, WebDriver driver) {
        return driver.getCurrentUrl().contains(subString);
    }

    static void searchByIdAndClick(String id, WebDriver driver) throws InterruptedException {
        try {
            WebElement element = driver.findElement(By.id(id));
            element.click();
            System.out.println("Clicked on element with id: " + id);
            sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException("Element with id: " + id + " not found. " + e);
        }
    }

    static void searchByClassNameAndClick(String className, WebDriver driver) throws InterruptedException {
        try {
            WebElement element = driver.findElement(By.className(className));
            element.click();
            System.out.println("Clicked on element with class name: " + className);
            sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException("Element with className " + className + " not found. " + e);
        }
    }

    static void searchByIdAndFillInField(String id, String value, WebDriver driver) {
        try {
            WebElement field = driver.findElement(By.id(id));
            field.sendKeys(value);
            System.out.println("Filled in field with id: " + id + " with value: " + value);
        } catch (Exception e) {
            throw new RuntimeException("Element with id " + id + " was not filled in. " + e);
        }
    }

    static void searchByPartialLinkTextAndClick(String partialLinkText, WebDriver driver) throws InterruptedException {
        try {
            WebElement element = driver.findElement(By.partialLinkText(partialLinkText));
            element.click();
            System.out.println("Clicked on element with partial link text: " + partialLinkText);
            sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException("Element with partial link " + partialLinkText + " was not found" + e);
        }
    }

    static void searchByCssSelectorAndClick(String cssSelector, WebDriver driver) throws InterruptedException {
        try {
            WebElement element = driver.findElement(By.cssSelector(cssSelector));
            element.click();
            System.out.println("Clicked on element with css selector: " + cssSelector);
            sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException("Element with css selector: " + cssSelector + " was not found. " + e);
        }
    }
}
