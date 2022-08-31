package tests;

import methods.LoginPageMethods;
import org.testng.annotations.Test;
import pages.VerificationPage;
import utilities.PropertyManager;

public class LoginTest extends BaseTest{
    @Test
    public void goodlogin() {
        LoginPageMethods loginPageMethods = new LoginPageMethods(driver);
        VerificationPage verificationPage = new VerificationPage(driver);

        loginPageMethods.login(PropertyManager.getInstance().getLoginUsername(), PropertyManager.getInstance().getLoginPassword());
        verificationPage.verifyLogin("Open Menu");
    }
}