package testsWithLogin;

import data.DataCreation;
import methods.CheckoutPageMethods;
import methods.RemoveItemFromCartMethods;
import org.testng.annotations.Test;
import pages.VerificationPage;

public class PurchaseOrderTest extends BaseTestWithLogin{
    @Test
    public void purchaseOrder() {
        RemoveItemFromCartMethods removeItemFromCartMethods = new RemoveItemFromCartMethods(driver);
        CheckoutPageMethods checkoutPageMethods = new CheckoutPageMethods(driver);
        VerificationPage verificationPage = new VerificationPage(driver);

        removeItemFromCartMethods.navigateToCeckoutPage();
        checkoutPageMethods.purchaseOrder(DataCreation.fakeFirstName(),DataCreation.fakeLastName(),DataCreation.fakePostalCode());
        verificationPage.verifyPurchase("BACK HOME");
        verificationPage.verifyIfRightItemIsAddedToCart(removeItemFromCartMethods.selectedItem, removeItemFromCartMethods.itemAddedToCart);
    }

}
