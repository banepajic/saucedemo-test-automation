package data;

import utilities.PropertyManager;

public class DataProvider {
    @org.testng.annotations.DataProvider(name = "failedLogin")
    public Object[][]dpMethod(){
        return new Object[][]{
                {"", PropertyManager.getInstance().getLoginPassword(), "Epic sadface: Username is required"},
                {PropertyManager.getInstance().getLoginUsername(), "", "Epic sadface: Password is required"},
                {DataCreation.fakeUsername(), DataCreation.fakePassword(), "Epic sadface: Username and password do not match any user in this service"}
        };
    }
}
