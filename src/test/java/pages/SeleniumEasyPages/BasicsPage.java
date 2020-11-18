package pages.SeleniumEasyPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utilities.Driver;

public class BasicsPage {
    public BasicsPage() {
        PageFactory.initElements(Driver.getDriver(), this); }

//------------------------------------------------------------------------------
    //Elements on Basics List group item

    @FindBy(linkText = "Simple Form Demo")
    public WebElement simpleFormDemoListGroupItem;

    @FindBy(linkText = "Check Box Demo")
    public WebElement checkBoxListGroupItem;

    @FindBy(linkText = "Radio Buttons Demo")
    public WebElement radioButtonsDemoListGroupitem;

    @FindBy(linkText = "Select Dropdown List")
    public WebElement selectDropdownListDemoListGroupitem;

    @FindBy(linkText = "Javascript Alerts")
    public WebElement javascriptAlertsListGroupitem;

    @FindBy(linkText = "Window Popup Modal")
    public WebElement windowPopupModalListGroupitem;

    @FindBy(linkText = "Bootstrap Alerts")
    public WebElement bootstrapAlertsListGroupitem;

    @FindBy(xpath = "//*[@id=\"basic\"]/div/a[8]")
    public WebElement bootstrapModalsListGroupitem;

    public void clickSelectDropdownListDemoListGroupitem(){
        selectDropdownListDemoListGroupitem.click();
    }

    public void clickSimpleFormDemoListGroupItem (){
        simpleFormDemoListGroupItem.click();
    }
    public void clickCheckBoxListGroupItem(){
        checkBoxListGroupItem.click();
    }
    public void clickRadioButtonsDemoListGroupitem(){
        radioButtonsDemoListGroupitem.click();
    }
    public void clickJavascriptAlertsListGroupitem(){
        javascriptAlertsListGroupitem.click();
    }
    public void clickWindowPopupModalListGroupitem(){
        windowPopupModalListGroupitem.click();
    }
    public void clickBootstrapAlertsListGroupItem(){
        bootstrapAlertsListGroupitem.click();
    }
    public void clickbootstrapModalsListGroupitem(){
        bootstrapModalsListGroupitem.click();
    }


}
