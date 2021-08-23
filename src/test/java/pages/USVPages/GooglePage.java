package pages.USVPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class GooglePage {
    public GooglePage() {
        PageFactory.initElements(Driver.getDriver(), this); }

    @FindBy(xpath = "//*[@id=\"gb\"]/div/div[2]/a")
    public WebElement signInButton;

    @FindBy(xpath = "//*[@id=\"identifierId\"]")
    public WebElement enterEmail;

    @FindBy(xpath = "//*[@id=\"identifierNext\"]/div/button/div[2]")
    public WebElement nextButton;

    @FindBy(xpath = "//*[@id=\"password\"]/div[1]/div/div[1]/input")
    public WebElement enterPassword;

    @FindBy(xpath = "//*[@id=\"passwordNext\"]/div/button/div[2]")
    public WebElement nextButtonTwo;

    @FindBy(xpath = "//*[@id=\"gbwa\"]/div/a")
    public WebElement appsIcon;

    @FindBy(xpath = "//*[@id=\"yDmH0d\"]/c-wiz/div/div/c-wiz/div/div/ul[1]/li[7]")
    public WebElement gmailIcon;

    @FindBy(xpath = "//tr[@tabindex='-1']")
    public WebElement verificationEmail;

    @FindBy(xpath = "//*[@id=\":2k\"]/span/span")
    public WebElement verificationEmailTwo;

    @FindBy(xpath = "//*[@id=\":7f\"]/div[1]/table/tbody/tr/td/table/tbody/tr[5]/td/div/a")
    public WebElement verifyEmail;

    @FindBy(xpath = "//img[@class=\"ajT\"]")
    public WebElement email;






    //--------------------------------------------------------------------------------------

    public void clickEmail(){
        email.click();
    }
    public void clickVerifyEmail() {
        verifyEmail.click();
    }

    public void clickVerificationEmailTwo(){
        verificationEmailTwo.click();
    }
    public void clickVerificationEmail() {
        verificationEmail.click();
    }
    public void clickSignInButton(){
        signInButton.click();
    }
    public void enterEmail(String username){
            enterEmail.sendKeys(username);
    }
    public void clickNextButton() {
        nextButton.click();
    }
    public void enterPassword(String password) {
        enterPassword.sendKeys(password);
    }
    public void clickNextButtonTwo(){
        nextButtonTwo.click();
    }
    public void clickAppsIcon(){
        appsIcon.click();
    }
    public void clickGmailIcon() {
        gmailIcon.click();
    }
}
