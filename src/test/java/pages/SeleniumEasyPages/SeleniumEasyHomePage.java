package pages.SeleniumEasyPages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BrowserUtils;
import utilities.Driver;

import java.util.List;

import static utilities.BrowserUtils.*;

public class SeleniumEasyHomePage {
    public SeleniumEasyHomePage() {
        PageFactory.initElements(Driver.getDriver(), this); }

//------------------------------------------------------------------------------
    //Elements on Lean Selenium Popup

    @FindBy(linkText = "No, thanks!")
    public WebElement noThanksPopup;

    public void clicknoThanksPopup() {
        BrowserUtils.waitFor(3);
        noThanksPopup.click();
        //Alert alert = Driver.getDriver().switchTo().alert();
        //alert.dismiss();
    }
//------------------------------------------------------------------------------
        //Menu Buttons


        @FindBy(css = "#basic_example > span > i")
        public WebElement basicMenuButton;

        @FindBy(xpath = "//*[@id=\"inter_example\"]/span")
        public WebElement intermediateMenuButton;

        @FindBy(xpath = "//*[@id=\"advanced_example\"]/span/i")
        public WebElement advancedMenuButton;

        @FindBy(className = "glyphicon glyphicon-ok")
        public WebElement completeMenuButton;

        public void clickbasicMenuButton(){
            basicMenuButton.click();
    }
        public void clickIntermediateMenuButtion(){
            intermediateMenuButton.click();
        }
        public void clickAdvancedMenuButton(){
            advancedMenuButton.click();
        }

}

