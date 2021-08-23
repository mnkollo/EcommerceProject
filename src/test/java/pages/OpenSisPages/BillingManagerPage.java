package pages.OpenSisPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class BillingManagerPage {
    public BillingManagerPage(){
        PageFactory.initElements(Driver.getDriver(), this); }

    @FindBy(xpath = "//body/div[@id='container_div']/div[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/select[1]/option[1]")
    public WebElement dateOfService;

    @FindBy(xpath = "//input[@id='master_from_date_form_encounter_date']")
    public WebElement fromTextBox;

    @FindBy(xpath = "//option[contains(text(),'Billing Status = Unbilled')]")
    public WebElement unbilledCriteria;

    @FindBy(xpath = "//body[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[2]/div[1]/div[2]/div[1]/span[1]/i[1]")
    public WebElement yellowTrash;

    @FindBy(xpath = "//strong[contains(text(),'Update List')]")
    public WebElement updateList;

    @FindBy(xpath = "//span[contains(text(),'Phil Belford')]")
    public WebElement findPhilBelford;

    @FindBy(xpath = "//body[1]/div[2]/form[1]/div[1]/table[1]/tbody[1]/tr[3]/td[1]/div[1]/a[1]")
    public WebElement philBelfordEncounterButton;

    @FindBy(xpath = "//a[@id='form-edit-button-newpatient-1']")
    public WebElement philBelfordEditButton;

    @FindBy(xpath = "//button[@id='menuAdministrative']")
    public WebElement adminDropdownButton;

    @FindBy(xpath = "//span[contains(text(),'Billing Manager')]")
    public WebElement billingManagerTab;



    //--------------------------------------------------------Methods Below-----------------------------------------

    public void clickBillingManagerTab(){
        billingManagerTab.click();
    }

    public void clickAdminDropdownButton(){
        adminDropdownButton.click();
    }

    public void clickPhilBelfordEditButton(){
        philBelfordEditButton.click();
    }
    public void clickPhilBelfordEncounterButton(){
        philBelfordEncounterButton.click();
    }

    public void clickDateOfService(){
        dateOfService.click();
    }
    public void clickUpdateList(){
        fromTextBox.clear();
        fromTextBox.sendKeys("2012-05-03");
        unbilledCriteria.click();
        yellowTrash.click();
        updateList.click();
    }


}
