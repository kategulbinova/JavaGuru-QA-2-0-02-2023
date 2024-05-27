package nastja;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class FirstNGTest {
    @Test
    @Parameters({"login", "password"})
    public void MyFirstTest(String userName, String userPwd){

        System.out.println("Hello TestNG!" + userName + ", " + userPwd);
        Boolean isTheSame;
        if (userPwd == userName) isTheSame = true;
        else isTheSame = false;
        Assert.assertTrue(isTheSame);
    }
}
