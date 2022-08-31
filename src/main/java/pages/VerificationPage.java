package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class VerificationPage extends BasePage{
    public VerificationPage(WebDriver driver) {
        super(driver);
    }
    By errorNotification = By.xpath("//h3[@data-test='error']");
    By burgerButton = By.id("react-burger-menu-btn");
    By logInButton = By.id("login-button");
    By inventoryItemBy = By.className("inventory_item_name");
    By backHomeButton = By.id("back-to-products");
    public void verifyFailedLogin(String expectedText){
        assertStringEquals(readText(errorNotification), expectedText);
    }
    public void verifyLogin(String expectedText){
        assertStringEquals(readText(burgerButton), expectedText);
    }
    public void verifyLogout(String expectedText){
        assertStringEquals(readValue(logInButton), expectedText);
    }
    public void verifyIfItemIsRemoved() {
            try {
                wait.until(ExpectedConditions.invisibilityOfElementLocated(inventoryItemBy));
            }
            catch (Exception e){
                Assert.fail("Item has not been removed from the cart!!!");
            }
    }
    public void verifyPurchase(String expectedText) {
        assertStringEquals(readText(backHomeButton), expectedText);
    }
    public void verifyIfRightItemIsAddedToCart(String actualText, String expectedText){assertStringEquals(actualText, expectedText);}
}