package pages.SeleniumEasyPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class IntermediatePage {
    public IntermediatePage() {
        PageFactory.initElements(Driver.getDriver(), this); }

    @FindBy(linkText = "Input Form with Validations")
    public WebElement inputFormWithValidations;

    @FindBy(linkText = "Ajax Form Submit")
    public WebElement ajaxFormSubmit;

    @FindBy(xpath = "//*[@id=\"intermediate\"]/div/a[3]")
    public WebElement jqueryDropdownSearch;

    @FindBy(linkText = "Bootstrap List Box")
    public WebElement bootstrapListBox;

    @FindBy(linkText = "JQuery List Box")
    public WebElement jqueryListBox;

    @FindBy(linkText = "Data List Filter")
    public WebElement dataListFilter;

    @FindBy(linkText = "Progress Bar Modal")
    public WebElement progressBarModal;

    @FindBy(linkText = "File Download")
    public WebElement fileDownload;


    public void clickInputFormWithValidations(){
        inputFormWithValidations.click();
    }
    public void clickAjaxFormSubmit(){
        ajaxFormSubmit.click();
    }
    public void clickjqueryDropdownSearch(){
        jqueryDropdownSearch.click();
    }
    public void clickBootStrapListBox(){
        bootstrapListBox.click();
    }
    public void clickJqueryListBox(){
        jqueryListBox.click();
    }
    public void clickDataListFilter(){
        dataListFilter.click();
    }
    public void clickprogressBarModal(){
        progressBarModal.click();
    }
    public void clickFileDownload(){
        fileDownload.click();
    }
}
