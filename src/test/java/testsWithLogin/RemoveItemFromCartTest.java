package testsWithLogin;

import methods.RemoveItemFromCartMethods;
import org.testng.annotations.Test;
import pages.VerificationPage;

public class RemoveItemFromCartTest extends BaseTestWithLogin{
    @Test
    public void removeItemFromCartTest() {
        RemoveItemFromCartMethods removeItemFromCartMethods = new RemoveItemFromCartMethods(driver);
        VerificationPage verificationPage = new VerificationPage(driver);

        removeItemFromCartMethods.removeItem();
        verificationPage.verifyIfItemIsRemoved();
    }
}
