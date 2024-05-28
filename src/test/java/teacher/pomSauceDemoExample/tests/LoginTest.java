package teacher.pomSauceDemoExample.tests;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import teacher.pomSauceDemoExample.pages.InventoryPage;
import teacher.pomSauceDemoExample.pages.LoginPage;

public class LoginTest extends BaseTest {
    @Test
    @Parameters({"username", "password"})
    void successfulCheck(String username, String password) {
        // Create all page objects
        LoginPage loginPage = new LoginPage(driver);
        InventoryPage inventoryPage = new InventoryPage(driver);

        // Step 1: login with correct credentials
        loginPage.login(username, password);

        // Step 2: check login has happened
        Assert.assertTrue( inventoryPage.isOpen() );
    }

    @Test
    @Parameters({"username", "password"})
    void wrongPasswordCheck(String username, String password) {
        // Create all needed pages
        LoginPage loginPage = new LoginPage(driver);
        InventoryPage inventoryPage = new InventoryPage(driver);

        // Step 1: try to login with incorrect password
        loginPage.login(username, password);

        // Step 2: check that error message is displayed
        Assert.assertTrue( loginPage.isErrorMessageDisplayed() );

        // Step 3: check that Inventory page is not open
        Assert.assertFalse( inventoryPage.isOpen() );

    }

    @Test(enabled = false)
    void wrongLoginCheck() {

    }

}
