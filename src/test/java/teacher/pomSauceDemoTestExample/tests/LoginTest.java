package teacher.pomSauceDemoTestExample.tests;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import teacher.pomSauceDemoTestExample.pages.HomePage;
import teacher.pomSauceDemoTestExample.pages.InventoryPage;

import static java.lang.Thread.sleep;

public class LoginTest extends BaseTest {
    @Test
    @Parameters({"username", "password"})
    void successfulLoginCheck(String username, String password)  {
        // Initialize all pages that this test wil need
        HomePage homePage = new HomePage(driver);
        InventoryPage inventoryPage = new InventoryPage(driver);

        // Perform steps by calling page methods
        homePage.login(username, password);

        // Do not forget to check results - by using at least one assert per test
        Assert.assertTrue(inventoryPage.isOpen());
    }

    @Test
    @Parameters({"username", "password"})
    void unSuccessfulLoginCheck(String username, String password) {
        // Initialize all pages that this test wil need
        HomePage homePage = new HomePage(driver);
        InventoryPage inventoryPage = new InventoryPage(driver);

        homePage.login(username, password + "1");

        Assert.assertFalse(inventoryPage.isOpen());
    }
}
