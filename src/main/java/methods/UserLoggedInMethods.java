package methods;

import org.openqa.selenium.WebDriver;
import pages.UserLoggedInPage;

public class UserLoggedInMethods extends UserLoggedInPage {
    public UserLoggedInMethods(WebDriver driver) {
        super(driver);
    }
    public void logout(){
        clickOnBurgerButton();
        clickOnLogOutButton();
    }
}
