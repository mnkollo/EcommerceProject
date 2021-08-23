package pages.SeleniumEasyPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class IntermediateProgressBarModalPage {
    public IntermediateProgressBarModalPage() {
        PageFactory.initElements(Driver.getDriver(), this); }

    @FindBy(xpath = "/html/body/div[2]/div/div[2]/button[1]")
    public WebElement showDialog2Seconds;

    @FindBy(xpath = "/html/body/div[2]/div/div[2]/button[2]")
    public WebElement showDialog3Seconds;

    @FindBy(xpath = "/html/body/div[2]/div/div[2]/button[3]")
    public WebElement showDialog3SecondsYello;

    @FindBy(css = "body > div.modal.fade > div > div > div.modal-header > h3")
    public WebElement helloMessage;


    public void clickShowDialog2Seconds(){
        showDialog2Seconds.click();
    }
    public void clickshowDialog3Seconds(){
        showDialog3Seconds.click();
    }
    public void clickshowDialog3SecondsYello(){
        showDialog3SecondsYello.click();
    }
    public String getHelloMessage(){
        return helloMessage.getText();
    }
}
