package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage extends BasePage{
    public CheckoutPage(WebDriver driver) {
        super(driver);
    }
    By firstNameBy = By.id("first-name");
    By lastNameBy = By.id("last-name");
    By postalCodeBy = By.id("postal-code");
    By continueButtonBy = By.id("continue");
    By finishButtonBy = By.id("finish");

    public void writeFirstName(String firstName){
        writeText(firstNameBy, firstName);
    }
    public void writeLastName(String lastname){
        writeText(lastNameBy, lastname);
    }
    public void writePostalCode(String postalCode){
        writeText(postalCodeBy, postalCode);
    }
    public void clickOnContinueButton(){
        click(continueButtonBy);
    }
    public void clickOnFinishButtonToPlaceAnOrder(){
        click(finishButtonBy);
    }
}