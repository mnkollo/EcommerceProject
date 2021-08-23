package pages.MaroPostPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MaroPostHomePage {
    public MaroPostHomePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id=\"email-e9a364c3-b22a-40bc-bc37-5d2ba413ca53\"]")
    public WebElement emailTextBox;

    @FindBy(xpath = "//*[@id=\"main-menu\"]/li[2]/a")
    public WebElement priceTab;

    @FindBy(id = "phone-e9a364c3-b22a-40bc-bc37-5d2ba413ca53")
    public WebElement phoneNumberTextBox;

    @FindBy(id = "message-e9a364c3-b22a-40bc-bc37-5d2ba413ca53")
    public WebElement messageInTextBox;

    @FindBy(id = "LEGAL_CONSENT.subscription_type_10173427-e9a364c3-b22a-40bc-bc37-5d2ba413ca53")
    public WebElement agreeTORecieve;

    @FindBy(xpath= "//*[@id=\"firstname-e9a364c3-b22a-40bc-bc37-5d2ba413ca53\"]")
    public WebElement firstName;

    @FindBy(xpath= "//input[@class='hs-button primary large']")
    public WebElement submitButton;

    @FindBy(xpath= "//*[@id=\"wrapper\"]/div[1]/div[2]/div/h1\n")
    public WebElement thanksForContactingUsMessage;

    @FindBy(xpath= "//*[@id=\"hsForm_e9a364c3-b22a-40bc-bc37-5d2ba413ca53\"]/div[4]/ul/li/label")
    public WebElement errorMessage;

    public String getErrorMessage(){
        return errorMessage.getText();
    }


    public void enterTextInEmailTextBox(){
        emailTextBox.sendKeys("mnkollo101@gmail.com");
    }
    public void enterphoneNumberTextBox(String number){
       phoneNumberTextBox.sendKeys(number);
    }
    public void enterMessageInTextBox(){
        messageInTextBox.sendKeys("This is just a test");
    }
    public void clickAgreeToRecieve(){
        agreeTORecieve.click();
    }
    public void enterFirstName(String name){
        firstName.sendKeys(name);
    }
    public void clickSubmitButton(){
        submitButton.click();
    }
    public String getThanksForContactingUsMessage(){
        return thanksForContactingUsMessage.getText().toLowerCase();
    }
    public void clickPriceTab(){
        priceTab.click();
    }
}
