package pages.SeleniumEasyPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utilities.Driver;

public class BootstrapAlertsPage {
    public BootstrapAlertsPage() {
        PageFactory.initElements(Driver.getDriver(), this); }

    @FindBy(xpath = "//*[@id=\"autoclosable-btn-success\"]")
    public WebElement autocloseableSuccessMessage;

    @FindBy(xpath = "//*[@id=\"normal-btn-success\"]")
    public WebElement normalSuccessMessage;

    @FindBy(xpath = "/html/body/div[2]/div/div[2]/div/div[2]/div[2]/button")
    public WebElement normalSuccessMessagePopup;

    @FindBy(xpath = "//div[@class='modal-body'][1]")
    public WebElement normalSuccessMessagePopupText;


    @FindBy(xpath = "//*[@id=\"autoclosable-btn-warning\"]")
    public WebElement autocloseableWarningMessage;

    @FindBy(xpath = "//*[@id=\"normal-btn-warning\"]")
    public WebElement normalWarningMessage;

    public String getnormalSuccessMessagePopupText () {
        return normalSuccessMessagePopupText.getText();
    }

    public void clickautocloseableSuccessMessage(){
        autocloseableSuccessMessage.click();
    }
    public void clickNormalSuccessMessage(){
        normalSuccessMessage.click();
    }
    public void clickNormalSuccessMessagePopup(){
        normalSuccessMessagePopup.click();

    }

}
