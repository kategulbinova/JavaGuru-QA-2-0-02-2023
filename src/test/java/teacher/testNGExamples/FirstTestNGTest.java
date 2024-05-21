package teacher.testNGExamples;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class FirstTestNGTest {
    @Test(enabled = false)
    void MySecondTest() {
        System.out.println("Hello, tests 2!");
    }

    @Test(enabled = false)
    void MyThirdTest() {
        System.out.println("Hello, tests 3!");
    }

    @Test(enabled = false)
    void MyFourthTest() {
        System.out.println("Hello, tests 4!");
    }
}
