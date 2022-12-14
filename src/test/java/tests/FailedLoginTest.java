package tests;

import methods.LoginPageMethods;
import org.testng.annotations.Test;
import pages.VerificationPage;

public class FailedLoginTest extends BaseTest{
    @Test(dataProvider = "failedLogin", dataProviderClass = data.DataProvider.class)
    public void failedLogin(String username, String password, String errorMessage) {
        LoginPageMethods loginPageMethods = new LoginPageMethods(driver);
        VerificationPage verificationPage = new VerificationPage(driver);

        loginPageMethods.login(username, password);
        verificationPage.verifyFailedLogin(errorMessage);
    }
}