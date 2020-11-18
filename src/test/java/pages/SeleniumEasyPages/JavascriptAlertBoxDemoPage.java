package pages.SeleniumEasyPages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class JavascriptAlertBoxDemoPage {
    public JavascriptAlertBoxDemoPage() {
        PageFactory.initElements(Driver.getDriver(), this); }

//------------------------------------------------------------------------------
    //Elements on javascript alert box page

    @FindBy(xpath = "//button[@class='btn btn-default']")
    public WebElement javaScriptAlertBoxclickMeButton;

    @FindBy(xpath = "//*[@id=\"easycont\"]/div/div[2]/div[3]/div[2]/button")
    public WebElement ForPromptBoxButton;

    @FindBy(xpath = "//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/button")
    public WebElement JavaScriptConfirmationButton;



    public void clickJavaScriptAlertBoxClickMeButton(){
        javaScriptAlertBoxclickMeButton.click();
    }
    public void clickForPromptBoxButton(){
        ForPromptBoxButton.click();
    }
    public void clickJavaScriptConfirmationButton(){
        JavaScriptConfirmationButton.click();
    }


}
