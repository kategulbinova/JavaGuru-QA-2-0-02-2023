package viktoria.lessons.lesson13.pomSauceDemoExample.utils;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;

public class AssertionsUtils {

    public static void assertEquals(String actual, String expected){
        Reporter.log("We are validating whether 2 strings are equal " + actual + " and " + expected + ".");
        Assert.assertEquals(actual, expected);
    }
    public static void assertTrue(boolean condition, String request){
        Reporter.log("Assert is true: " + condition);
        Assert.assertTrue(condition,request);
    }

    public static void assertFalse(boolean condition){
        Reporter.log("*******");
        Assert.assertFalse(condition);
    }
    public static void assertElementDisplayed(WebElement element){
        try {
            Assert.assertTrue(element.isDisplayed(), "Element is not displayed!");
        } catch (Exception e) {
            Reporter.log("Element is not displayed " + element.toString());
        }
    }

    public static void assertElementNotDisplayed(WebElement element){
        Assert.assertFalse(element.isDisplayed(), "Element is displayed.");
    }
}
