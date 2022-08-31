package testsWithLogin;

import methods.LoginPageMethods;
import org.testng.annotations.BeforeMethod;
import tests.BaseTest;
import utilities.PropertyManager;

public class BaseTestWithLogin extends BaseTest {
    @Override
    @BeforeMethod
    public void setup(){
        super.setup();
        LoginPageMethods loginPageMethods = new LoginPageMethods(driver);
        loginPageMethods.login(PropertyManager.getInstance().getLoginUsername(), PropertyManager.getInstance().getLoginPassword());
    }
}
