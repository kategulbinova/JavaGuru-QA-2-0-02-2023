package viktoria.lessons.lesson13.pomSauceDemoExample.tests;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import viktoria.lessons.lesson13.pomSauceDemoExample.dataModels.User;
import viktoria.lessons.lesson13.pomSauceDemoExample.pages.InventoryPage;
import viktoria.lessons.lesson13.pomSauceDemoExample.pages.LoginPage;

import static viktoria.lessons.lesson13.pomSauceDemoExample.utils.AssertionsUtils.assertFalse;
import static viktoria.lessons.lesson13.pomSauceDemoExample.utils.AssertionsUtils.assertTrue;

public class LoginTest extends BaseTest {
    @Test
    @Parameters({"name", "password"})
    void successfulCheck(String name, String password){
        //Create all page objects
        LoginPage loginPage = new LoginPage();
        InventoryPage inventoryPage = new InventoryPage();
        User standartUser = new User(name, password, "standard");

        //Step 1: login with correct credentials
        loginPage.login(standartUser.getLogin(), standartUser.getPassword());

        //Step 2: check login has happened
        assertTrue(inventoryPage.isOpen(),"InventoryPage is open");
    }
    @Test
    @Parameters({"name", "incorrectPassword"})
    void wrongPasswordCheck(String name, String password){
        //Create all page objects
        LoginPage loginPage = new LoginPage();
        InventoryPage inventoryPage = new InventoryPage();

        // Step 1: try to login with incorrect password
        loginPage.login(name, password + "0");

        // Step 2: check that error message is displayed
        assertTrue(loginPage.isErrorMessageDisplayed(), "" );

        // Step 3: check that Inventory page is not open
        assertFalse(inventoryPage.isOpen() );

    }
    @Test
    @Parameters({"incorrectName", "password"})
    void wrongUserNameCheck(String name, String password){
        //Create all page objects
        LoginPage loginPage = new LoginPage();
        InventoryPage inventoryPage = new InventoryPage();

        // Step 1: try to login with incorrect password
        loginPage.login(name, password);

        // Step 2: check that error message is displayed
        assertTrue(loginPage.isErrorMessageDisplayed(), "" );

        // Step 3: check that Inventory page is not open
        assertFalse(inventoryPage.isOpen() );

    }

}
