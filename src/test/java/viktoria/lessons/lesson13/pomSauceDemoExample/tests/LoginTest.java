package viktoria.lessons.lesson13.pomSauceDemoExample.tests;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import viktoria.lessons.lesson13.pomSauceDemoExample.pages.InventoryPage;
import viktoria.lessons.lesson13.pomSauceDemoExample.pages.LoginPage;

public class LoginTest extends BaseTest {
    @Test
    @Parameters({"name", "password"})
    void successfulCheck(String name, String password){
        //Create all page objects
        LoginPage loginPage = new LoginPage(driver);
        InventoryPage inventoryPage = new InventoryPage(driver);

        //Step 1: login with correct credentials
        loginPage.login(name, password);

        //Step 2: check login has happened
        Assert.assertTrue(inventoryPage.isOpen());
    }
    @Test
    @Parameters({"name", "incorrectPassword"})
    void wrongPasswordCheck(String name, String password){
        //Create all page objects
        LoginPage loginPage = new LoginPage(driver);
        InventoryPage inventoryPage = new InventoryPage(driver);

        // Step 1: try to login with incorrect password
        loginPage.login(name, password + "0");

        // Step 2: check that error message is displayed
        Assert.assertTrue( loginPage.isErrorMessageDisplayed() );

        // Step 3: check that Inventory page is not open
        Assert.assertFalse( inventoryPage.isOpen() );

    }
    @Test
    @Parameters({"incorrectName", "password"})
    void wrongUserNameCheck(String name, String password){
        //Create all page objects
        LoginPage loginPage = new LoginPage(driver);
        InventoryPage inventoryPage = new InventoryPage(driver);

        // Step 1: try to login with incorrect password
        loginPage.login(name, password);

        // Step 2: check that error message is displayed
        Assert.assertTrue( loginPage.isErrorMessageDisplayed() );

        // Step 3: check that Inventory page is not open
        Assert.assertFalse( inventoryPage.isOpen() );

    }

}
