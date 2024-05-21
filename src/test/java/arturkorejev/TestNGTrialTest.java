package arturkorejev;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGTrialTest {
    @Test
    @Parameters({"login","password"})
    public void MyFirstTest(String userName, String userPwd) {
        System.out.println("Hello, Tests " + userName + ", " + userPwd);
        Boolean isTheSame;
        if (userPwd == userName) isTheSame = true;
        else isTheSame = false;
        Assert.assertFalse(isTheSame);
    }
}
