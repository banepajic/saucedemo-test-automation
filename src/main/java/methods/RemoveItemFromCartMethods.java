package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.CartPage;

public class RemoveItemFromCartMethods extends CartPage {
    public RemoveItemFromCartMethods(WebDriver driver) {
        super(driver);
    }
    public String selectedItem;
    public String itemAddedToCart;
    public void removeItem(){
        clickOnAddToCartButton();
        clickONShoppingCartIcon();
        clickOnRemoveButton();
    }
    public void navigateToCeckoutPage() {
        clickOnAddToCartButton();
        selectedItem = driver.findElement(By.className("inventory_item_name")).getText();
        clickONShoppingCartIcon();
        itemAddedToCart = driver.findElement(By.className("inventory_item_name")).getText();
        clickOnCheckoutButton();
    }
}
