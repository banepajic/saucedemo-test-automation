package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    protected WebDriver driver;
    @BeforeMethod
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(new ChromeOptions().addArguments("--start-maximized"));

        //WebDriverManager.firefoxdriver().setup();
        //driver = new FirefoxDriver(new FirefoxOptions());
        //driver.manage().window().maximize();

        driver.get("https://www.saucedemo.com/");
    }
    @AfterMethod
    public void teardown(){
        driver.quit();
    }
}