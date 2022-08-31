package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends BasePage {
    public CartPage(WebDriver driver) {
        super(driver);
    }
    By addToCartBy = By.id("add-to-cart-sauce-labs-backpack");
    By removeButtonBy = By.id("remove-sauce-labs-backpack");
    By shoppingCartBy = By.id("shopping_cart_container");
    By checkoutButtonBy = By.id("checkout");
    public void clickOnAddToCartButton() {
        click(addToCartBy);
    }
    public void clickONShoppingCartIcon() {
        click(shoppingCartBy);
    }
    public void clickOnRemoveButton() {
        click(removeButtonBy);
    }
    public void clickOnCheckoutButton() {
        click(checkoutButtonBy);
    }
}