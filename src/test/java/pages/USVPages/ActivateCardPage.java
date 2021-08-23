package pages.USVPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ActivateCardPage {
    public ActivateCardPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "cardLastFourInput")
    WebElement lastfourdigitsofCardTextBox;

    @FindBy(id = "cardExpirationInput")
    WebElement cardExpirationTextBox;

    @FindBy(xpath = "//*[@id=\"activateCardTile\"]/div/div[3]/div[3]/div/form/button")
    WebElement activateCardButton;

    @FindBy(xpath = "//*[@id=\"ctl-set-pin\"]")
    WebElement pinTextBox;

    @FindBy(xpath = "//*[@id=\"ctl-confirm-set-pin\"]")
    WebElement reenterpinTextBox;

    @FindBy(xpath = "//*[@id=\"btn-submit\"]")
    WebElement submitButton;

    @FindBy(xpath = "//input[@name=\"pin\"]")
    WebElement enterPin;



    @FindBy(id = "ctl-confirm-set-pin")
    WebElement reEnterPin;

    @FindBy(xpath = "//*[@id=\"btn-submit\"]")
    WebElement pinSubmitButton;


    //--------------------------------------------------------------------------------------------




public void clickPinSubmitButton(){
    pinSubmitButton.click();
}
public void enterPinNumber(String keys){
    enterPin.sendKeys(keys);
}
    public void reEnterPinNumber(String keys){
        reEnterPin.sendKeys(keys);
    }



    public void enterLastfourdigitsofCardTextBox(String lastfour) {
        lastfourdigitsofCardTextBox.sendKeys(lastfour);
    }

    public void entercardExpirationTextBox(String expiration) {
        cardExpirationTextBox.sendKeys(expiration);
    }
    public void clickActivateCardButton(){
        activateCardButton.click();
    }
}
