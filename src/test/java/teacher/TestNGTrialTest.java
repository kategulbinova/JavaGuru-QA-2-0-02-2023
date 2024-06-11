package teacher;

import org.testng.annotations.Test;

public class TestNGTrialTest {
    @Test (priority = 1)
    public void MyFirstTest() {
        System.out.println("Hello, TestNG!");
    }

    @Test(priority = 2)
    public void MySecondTest() {
        System.out.println("Hello, JavaGuru students!");
    }
}
