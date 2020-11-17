package pages.SeleniumEasyPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class BasicFirstFormDemoPage {

    public BasicFirstFormDemoPage() {
        PageFactory.initElements(Driver.getDriver(), this); }

//------------------------------------------------------------------------------
    //Elements on Basics First Form Demo

    @FindBy(id = "user-message")
    public WebElement basicFirstFormDemoTextBox;

    @FindBy(className = "btn-default")
    public WebElement basicFirstFormDemoShowMessageButton;

    @FindBy(id = "sum1")
    public WebElement basicFirstFormDemoEnterValueTextBox;

    @FindBy(id = "sum2")
    public WebElement basicFirstFormDemoEnterValueTextBoxTwo;

    @FindBy(xpath = "//*[@id=\"gettotal\"]/button")
    public WebElement basicFirstFormDemoGetTotalButton;


    public void enterTextInTextBox (){
        basicFirstFormDemoTextBox.sendKeys("This is just a demo practice. Hello World!");
    }
    public void clickShowMessageButton() {
        basicFirstFormDemoShowMessageButton.click();
    }
    public void enterValueInTextBox (){
        basicFirstFormDemoEnterValueTextBox.sendKeys("12");
    }
    public void enterSecondValueInTextBox (){
        basicFirstFormDemoEnterValueTextBoxTwo.sendKeys("20");
    }
    public void clickGetTotalButton() {
        basicFirstFormDemoGetTotalButton.click();
    }

}
