package pages.SeleniumEasyPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utilities.Driver;

public class BasicCheckBoxDemoPage {

    public BasicCheckBoxDemoPage() {
    PageFactory.initElements(Driver.getDriver(), this); }

    //----------------------------------------------------------------
    //Singe CheckBox Demo
    @FindBy(id = "isAgeSelected")
    public WebElement basicCheckBoxDemoCheckbox;


    //-----------------------------------------------------------
    //Multiple CheckBox Demo
    @FindBy(xpath = "//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/div[1]/label/input")
    public WebElement optionOne;

    @FindBy(xpath = "//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/div[2]/label/input")
    public WebElement optionTwo;

    @FindBy(xpath = "//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/div[3]/label/input")
    public WebElement optionThree;

    @FindBy(xpath = "//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/div[4]/label/input")
    public WebElement optionFour;

    @FindBy(xpath = "//*[@id=\"check1\"]")
    public WebElement checkAllButton;

    public void clickSingleCheckbox () {
        basicCheckBoxDemoCheckbox.click();
    }
        public void clickAllCheckBoxes(){
            //optionOne.click();
            //optionTwo.click();
            //optionThree.click();
            //optionFour.click();
            checkAllButton.click();
        }

        public void clickOptionOne(){
        optionOne.click();
        }
        public boolean optionOneSelected(){
        return optionOne.isSelected();
        }
    public void clickOptionTwo(){
        optionTwo.click();
    }
    public void clickOptionThree(){
        optionThree.click();
    }
    public void clickOptionFour(){
        optionFour.click();
    }
    }




