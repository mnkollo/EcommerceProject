package pages.USVPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DirectDepositPage {
    public DirectDepositPage() {
        PageFactory.initElements(Driver.getDriver(), this); }


    @FindBy(id = "Custom_Employee/IDInput")
    public WebElement employeeID;

    @FindBy(id = "Custom_SSN4Input")
    public WebElement SSNumber;

    @FindBy(xpath = "//*[@id=\"form\"]/form/button")
    public WebElement continueButton;

    @FindBy(xpath = "//*[@id=\"amountSelectedInputGroup\"]/div/div[2]/div/div/div[1]/div/label")
    public WebElement flatRateRadioButton;

    @FindBy(id = "depositAmountInput")
    public WebElement depositAmountInput;

    @FindBy(id = "depositAmountSubmitButton")
    public WebElement setupButtonComplete;

    @FindBy(xpath = "//*[@id=\"directDepositConfirmationSection\"]/div/div[3]/div[2]/div/span")
    public WebElement onItsWayMessage;

    @FindBy(xpath = "//*[@id=\"returnToDashboardButton\"]")
    public WebElement doneButton;

    //-------------------------------------------------------------------------

    public void clickDoneButton(){
        doneButton.click();
    }

    public String getOnItsWayMessage(){
        return onItsWayMessage.getText();
    }

    public void clickSetupButtonComplete(){
        setupButtonComplete.click();
    }

    public void enterDepositAmount(){
        depositAmountInput.sendKeys("400");
    }

    public void clickFlateRateRadioButton(){
        flatRateRadioButton.click();
    }
    public void enterSSN(String SSN){
        SSNumber.sendKeys(SSN);
    }
    public void enterEmployeeID(String EmployeeID){
        employeeID.sendKeys(EmployeeID);
    }
    public void clickContinueButton(){
        continueButton.click();
    }
}
