package pages.SeleniumEasyPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class BasicRadioButtonPage {
    public BasicRadioButtonPage() {
        PageFactory.initElements(Driver.getDriver(), this); }

        //------------------------------------------------------------------------------------------------------------
    //Radio Button
    @FindBy(xpath = "//*[@id=\"easycont\"]/div/div[2]/div[1]/div[2]/label[1]/input")
    public WebElement maleRadioButton;

    @FindBy(css = "#easycont > div > div.col-md-6.text-left > div:nth-child(4) > div.panel-body > label:nth-child(3) > input[type=radio]")
    public WebElement femaleRadioButton;

    @FindBy(id = "buttoncheck")
    public WebElement getCheckedValue;

    public void clickMaleRadioButton (){
        maleRadioButton.click();
    }
    public void clickGetCheckedValue(){
        getCheckedValue.click();
    }
//-----------------------------------------------------------------------------------------------
    //Group Radio Button Demo

    @FindBy(css = "#easycont > div > div.col-md-6.text-left > div:nth-child(5) > div.panel-body > div:nth-child(2) > label:nth-child(2) > input[type=radio]")
    public WebElement groupMaleRadioButton;

    @FindBy(css = "#easycont > div > div.col-md-6.text-left > div:nth-child(5) > div.panel-body > div:nth-child(2) > label:nth-child(3) > input[type=radio]")
    public WebElement groupFemaleRadioButton;

    @FindBy(xpath = " //*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/div[1]/label[2]")
    public WebElement groupFemaleRadioButtonText;


    @FindBy(xpath = "//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/div[2]/label[1]/input")
    public WebElement ageGroupzerotofive;

    @FindBy(xpath = "//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/div[2]/label[1]")
    public WebElement ageGroupZerotoFiveText;

    @FindBy(xpath = "//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/button")
    public WebElement getValuesButton;
    @FindBy(xpath = "//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/p[2]")
    public WebElement ageGroupAndSexResult;

    public void clickGroupMaleRadioButton(){
        groupFemaleRadioButton.click();
    }
    public void clickAgeGroupZeroToFive(){
        ageGroupzerotofive.click();
    }
    public void clickGetValuesButton(){
        getValuesButton.click();
    }
    public String getAgeGroupAndSexResult(){
        return ageGroupAndSexResult.getText();

    }
    public String getGroupFemaleRadioButtonText(){
        return groupFemaleRadioButtonText.getText();

    }
    public String getAgeGroupZerotoFiveText(){
        return ageGroupZerotoFiveText.getText();

    }
}
