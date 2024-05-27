package igor_eglit.lesson12;


import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

class SaucedemoNGTest extends BaseTest {

    @Test
    @Parameters({"user-name", "passwordSauce"})
    void openSauceDemoSelectItemPutIntoBusketCheckPrice(String username, String password) {

        driver.findElement(By.id("user-name")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("login-button")).click();

        driver.findElement(By.xpath("//a[@id = 'item_4_title_link']")).click();

        String price = driver.findElement(By.xpath("//div[@class = 'inventory_details_price']")).getText();

        System.out.println(price);

        driver.findElement(By.id("add-to-cart")).click();

        driver.findElement(By.id("shopping_cart_container")).click();

        Assert.assertEquals(driver.findElement(By.xpath("//div[@class = 'inventory_item_price']"))
                .getText(), price);

        driver.findElement(By.id("remove-sauce-labs-backpack")).click();

    }


}
