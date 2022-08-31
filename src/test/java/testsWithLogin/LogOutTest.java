package testsWithLogin;

import methods.UserLoggedInMethods;
import org.testng.annotations.Test;
import pages.VerificationPage;

public class LogOutTest extends BaseTestWithLogin{
    @Test
    public void logoutTest(){
        UserLoggedInMethods userLoggedInMethods = new UserLoggedInMethods(driver);
        VerificationPage verificationPage = new VerificationPage(driver);

        userLoggedInMethods.logout();
        verificationPage.verifyLogout("Login");
    }
}