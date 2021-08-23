package pages.USVPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LoginPage {
    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this); }

    @FindBy(id = "loginUsernameInput")
    public WebElement emailTextBox;

    @FindBy(id = "loginPasswordInput")
    public WebElement passwordTextBox;

    @FindBy(id = "signInButton")
    public WebElement signInButton;

    @FindBy(xpath = "//*[@id=\"verifyWarningSendVerificationButton\"]")
    public WebElement sendVerification;

    @FindBy(xpath = "//*[@id=\"ddaDisclosuresModal___BV_modal_body_\"]/div/div[2]/div[1]/div/label")
    public WebElement radioButtonDocs;

    @FindBy(xpath = "//*[@id=\"ddaDisclosuresModal___BV_modal_body_\"]/div/div[3]/div[1]/div/label")
    public WebElement radioButtonDocstwo;

    @FindBy(xpath = "//*[@id=\"ddaAccountDisclosuresAccept\"]")
    public WebElement continueButton;

    @FindBy(xpath = "//*[@id=\"ddaTextConsentModal___BV_modal_body_\"]/div/div[2]/div/div/div[4]/div[1]/div/label")
    public WebElement radioButtonNotifications;

    @FindBy(id = "confirmDialogCancelLink")
    public WebElement dontoptin;

    @FindBy(xpath = "//*[@id=\"verifyWarningSendVerificationButton\"]")
    public WebElement sendVerificationNow;



    public void clickDontOptIn(){
        dontoptin.click();
    }

    public void clickRadioButtonNotifications(){
        radioButtonNotifications.click();
    }

    public void clickContinueButton(){
        continueButton.click();
    }
    public void clickRadioButtonDocs(){
        radioButtonDocs.click();
    }
    public void clickRadioButtonDocstwo(){
        radioButtonDocstwo.click();
    }



    public void clickSendVerification(){
        sendVerification.click();
    }
    public void clickEmailTextBox(String number){
        emailTextBox.sendKeys(number);
    }
    public void clickPasswordTextBox(String password){
        passwordTextBox.sendKeys(password);
    }
    public void clickSignInButton(){
        signInButton.click();
    }
}



