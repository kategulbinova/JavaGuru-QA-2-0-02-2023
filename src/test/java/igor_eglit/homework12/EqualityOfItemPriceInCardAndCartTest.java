package igor_eglit.homework12;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.List;

class EqualityOfItemPriceInCardAndCartTest extends BaseTest {

    @Test
    @Parameters({"user-name", "passwordSauce"})
    void checkAddedItemPriceWithListingItemPrice(String userName, String password){
        login(userName, password);

        List<String> priceCheckList = putItemInCartSavePriceToCheckList(id_itemBackPack,
                id_itemBikeLight,
                id_itemBoltTshirt,
                id_fleeceJacket);

        List<String> inventoryPricesInCart = getItemsPricesFromCartToList();

        Assert.assertEquals(priceCheckList,inventoryPricesInCart);
    }
}
