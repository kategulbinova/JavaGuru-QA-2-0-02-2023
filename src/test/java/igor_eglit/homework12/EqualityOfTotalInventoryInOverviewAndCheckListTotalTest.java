package igor_eglit.homework12;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.List;

class EqualityOfTotalInventoryInOverviewAndCheckListTotalTest extends BaseTest {
    @Test
    @Parameters({"user-name", "passwordSauce"})
    void checkTotalInventorySumInCheckoutWith(String userName, String password) {
        login(userName, password);

        List<String> priceCheckList = putItemInCartSavePriceToCheckList(
                id_itemBackPack,
                id_itemBikeLight,
                id_itemBoltTshirt,
                id_fleeceJacket
        );
        proceedToCheckOutOverview(
                "First",
                "Last",
                "1234"
        );
        scrollPageTillElement(className_itemTotalCheckOutOverview);

        var actualTotalCheckout = getParseDouble(className_itemTotalCheckOutOverview, 13);
        var checkSum = getListTotalPriceAndParseDouble(priceCheckList);

        Assert.assertEquals(actualTotalCheckout,checkSum);
    }
}
