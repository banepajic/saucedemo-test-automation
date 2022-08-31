package methods;

import org.openqa.selenium.WebDriver;
import pages.CheckoutPage;

public class CheckoutPageMethods extends CheckoutPage {
    public CheckoutPageMethods(WebDriver driver) {
        super(driver);
    }
    public void purchaseOrder(String firstName, String lastName, String postalCode) {
        writeFirstName(firstName);
        writeLastName(lastName);
        writePostalCode(postalCode);
        clickOnContinueButton();
        clickOnFinishButtonToPlaceAnOrder();
    }
}
