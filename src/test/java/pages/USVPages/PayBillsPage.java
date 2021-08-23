package pages.USVPages;

import com.github.javafaker.Faker;
import com.github.javafaker.Number;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class PayBillsPage {
    public PayBillsPage() {
        PageFactory.initElements(Driver.getDriver(), this); }

    @FindBy(xpath = "//*[@id=\"payeeInput\"]")
    public WebElement employerTextBox;

    @FindBy(xpath = "//*[@id=\"payBillsSection\"]/div/div[3]/div[1]/div/button[2]")
    public WebElement payBillSearchButton;

    @FindBy(xpath = " //*[@id=\"payBillsSection\"]/div/div[3]/div[3]/div/div/button/span")
    public WebElement employerResult;

    @FindBy(xpath = "//*[@id=\"accountNumberInput\"]")
    public WebElement accountNumber;

    @FindBy(xpath = "//*[@id=\"payeeDetailsSection\"]/div/div[3]/div[4]/div/button")
    public WebElement payBillContinueButton;

    @FindBy(xpath = "//*[@id=\"paymentAmountInput\"]")
    public WebElement dollarAmount;

    @FindBy(xpath = " //*[@id=\"payBillMakePaymentSection\"]/div/div[3]/div[6]/div/button")
    public WebElement confirmAmount;

    @FindBy(xpath = "//*[@id=\"confirmPaymentModal___BV_modal_body_\"]/div/div[3]/div/button")
    public WebElement submitPaymentButton;

    @FindBy(xpath = "//*[@id=\"paymentInitiatedSection\"]/div/div[2]/div/div/div/div[2]/span")
    public WebElement confirmationMessage;

    @FindBy(xpath = "//*[@id=\"paymentInitiatedSection\"]/div/div[3]/div[8]/div/button")
    public WebElement viewAccountButton;


    //---------------------------------------------------------------------------

    public void clickViewAccountButton(){
        viewAccountButton.click();
    }

    public void clickSubmitPayment(){
        submitPaymentButton.click();
    }

    public void clickConfirmAmount(){
        confirmAmount.click();
    }

    public void enterDollarAmount(){
        dollarAmount.sendKeys("50");
    }

    public void setPayBillContinueButton(){
        payBillContinueButton.click();
    }

    public void enterAccountNumber(){
        accountNumber.sendKeys("5822222222222");
    }

    public void enterEmployerInTextBox(String employer){
        employerTextBox.sendKeys(employer);
    }
    public void clickPayBillSearchButton(){
        payBillSearchButton.click();
    }
    public void clickEmployerResult(){
        employerResult.click();
    }
}
