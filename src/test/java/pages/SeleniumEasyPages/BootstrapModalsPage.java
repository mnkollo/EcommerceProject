package pages.SeleniumEasyPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class BootstrapModalsPage {
    public BootstrapModalsPage() {
        PageFactory.initElements(Driver.getDriver(), this); }

    @FindBy(xpath = "/html/body/div[2]/div/div[2]/div[1]/div/div/div[2]/a")
    public WebElement singleModalButton;

    @FindBy(xpath = "/html/body/div[2]/div/div[2]/div[2]/div/div/div[2]/a")
    public WebElement multipleModalButton;

    @FindBy(xpath = "//*[@id=\"myModal0\"]/div/div/div[4]/a[2]")
    public WebElement saveChangesPopup;


    @FindBy(css = "#myModal > div > div > div.modal-footer > a.btn.btn-primary")
    public WebElement saveChangesPopupTwo;

    public void clickSingleModalButton (){
        singleModalButton.click();
    }
    public void clickMultipleModalButton (){
        multipleModalButton.click();
    }
    public void clickSaveChangesPopup() {
        saveChangesPopup.click();
    }
    public void clickSaveChangesPopupTwo(){
        saveChangesPopupTwo.click();
    }
}
