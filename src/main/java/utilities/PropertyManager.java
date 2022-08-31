package utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyManager {
    private static String loginUsername;
    private static String loginPassword;
    private static String configPath = "src/main/resources/configuration.properties";
    private static PropertyManager instance;
    public static PropertyManager getInstance(){
        if (instance == null){
            instance = new PropertyManager();
            instance.loadData();
        }
        return instance;
    }
    private void loadData(){
        Properties properties = new Properties();
        try {
            FileInputStream fi = new FileInputStream(configPath);
            properties.load(fi);
        } catch (Exception e) {
            e.printStackTrace();
        }
        loginUsername = properties.getProperty("loginUsername");
        loginPassword = properties.getProperty("loginPassword");
    }
    public String getLoginUsername() {
        return loginUsername;
    }
    public String getLoginPassword() {
        return loginPassword;
    }

}