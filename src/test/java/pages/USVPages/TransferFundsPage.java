package pages.USVPages;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TransferFundsPage {
    public TransferFundsPage() {
        PageFactory.initElements(Driver.getDriver(), this); }

    @FindBy(xpath = "//*[@id=\"TransferFundsSection\"]/div/div[3]/div[2]/div/div/button")
    public WebElement universeSilverButton;

    @FindBy(xpath = "/html/body/div[1]/div/div[2]/div[2]/div/div[2]/div[1]/div[4]/div/div/div[3]/div[3]/div/button/span")
    public WebElement addExternalAccountButton;

    @FindBy(xpath = "//*[@id=\"routingNumberInput\"]")
    public WebElement routingNumberTextBox;

    @FindBy(xpath = "//*[@id=\"accountNumberInput\"]")
    public WebElement accountNumberTextBox;

    @FindBy(xpath = "//*[@id=\"confirmingAccountNumberInput\"]")
    public WebElement confirmAccountNumberTextBox;

    @FindBy(xpath = "//*[@id=\"AddExternalAmountSection\"]/div/div[3]/div[9]/div/button")
    public WebElement transferFundsContinueButton;

    @FindBy(xpath = "//input[@id='nicknameInput']")
    public WebElement accountNickName;

    @FindBy(xpath = "//label[@id='didConsentLabel']")
    public WebElement authorizationButton;

    @FindBy(xpath = "//button[contains(text(),'Add Account')]")
    public WebElement addAccount;




    //-------------------------------------------------------------------------------------
    public void clickAddAccount(){
        addAccount.click();
    }
    public void clickAuthorizationButton(){
        authorizationButton.click();
    }

    public void enterAccountNickName(String name){
        accountNickName.sendKeys(name);
    }
    public void clickaddExternalAccountButton(){
        addExternalAccountButton.click();
    }
    public void enterRoutingNumber(){
        Faker faker = new Faker();
        String routingNumber = faker.number().digits(9);
        routingNumberTextBox.sendKeys(routingNumber);
    }
    public void enterAccountNumber(String accountNumber){
        accountNumberTextBox.sendKeys(accountNumber);
    }
    public void confirmAccountNumber(String confirmAccountNumber){
        confirmAccountNumberTextBox.sendKeys(confirmAccountNumber);
    }
    public void clickTransferFundsContinueButton(){
        transferFundsContinueButton.click();
    }

}
