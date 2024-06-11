package teacher.pomSauceDemoTestExample.tests;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import teacher.pomSauceDemoTestExample.dataModels.User;
import teacher.pomSauceDemoTestExample.pages.HomePage;
import teacher.pomSauceDemoTestExample.pages.InventoryPage;

import static java.lang.Thread.sleep;
import static teacher.pomSauceDemoTestExample.dataModels.User.getCounter;

public class LoginTest extends BaseTest {
    @Test
    @Parameters({"username", "password"})
    void successfulLoginCheck(String username, String password)  {
        // Initialize all pages that this test wil need
        HomePage homePage = new HomePage();
        InventoryPage inventoryPage = new InventoryPage();

        // Perform steps by calling page methods
        homePage.login(username, password);

        // Do not forget to check results - by using at least one assert per test
        Assert.assertTrue(inventoryPage.isOpen());
    }

    @Test
    @Parameters({"username", "password"})
    void unSuccessfulLoginCheck(String username, String password) {
        // Initialize all pages that this test will need
        HomePage homePage = new HomePage();
        InventoryPage inventoryPage = new InventoryPage();

        User standardUser = new User(username, password, "Standard");

        homePage.login( standardUser.getLogin(), standardUser.getPassword() + "1" );

        Reporter.log( "There are so many users created right now: " + getCounter() + "." );

        Assert.assertFalse(inventoryPage.isOpen());
    }
}
