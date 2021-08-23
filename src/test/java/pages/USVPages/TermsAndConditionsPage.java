package pages.USVPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TermsAndConditionsPage {
    public TermsAndConditionsPage() {
        PageFactory.initElements(Driver.getDriver(), this); }

    @FindBy(xpath = "//*[@id=\"headerRow\"]/div[1]/div/label")
    public WebElement radioButton;

    @FindBy(xpath = "//*[@id=\"consentButton\"]")
    public WebElement continueButton;



    public void clickRadioButton(){
        radioButton.click();
    }
    public void clickContinueButton(){
        continueButton.click();
    }
}



