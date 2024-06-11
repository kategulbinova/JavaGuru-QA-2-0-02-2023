package arturkorejev.lessons.lesson13.pomSauceDemoExample.tests;

import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    @Test
    void succesfulCheck() {
        //Create startPage object
        LoginPage loginPage = new LoginPage (driver);

        // Step 1: login with correct credentials
        loginPage.login("")

        // Step 2: check login has happened

    }

    @Test
    void wrongPasswordCheck() {

    }

    @Test
    void wrongLoginTest() {

    }
}
