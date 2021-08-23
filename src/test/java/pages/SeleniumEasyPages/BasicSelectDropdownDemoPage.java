package pages.SeleniumEasyPages;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utilities.BrowserUtils;
import utilities.Driver;

public class BasicSelectDropdownDemoPage {
    public BasicSelectDropdownDemoPage() {
        PageFactory.initElements(Driver.getDriver(), this); }

    @FindBy(id = "select-demo")
    public WebElement pleaseSelectDropdown;

    @FindBy(xpath = "//*[@id=\"easycont\"]/div/div[2]/div[1]/div[2]/p[2]")
    public WebElement daySelected;


    public void setPleaseSelectDropdowntest(){
        BrowserUtils.dropdownValue(pleaseSelectDropdown, "Sunday");
    }
    public String getDaySelected() {
        return daySelected.getText();
    }

    //----------------------------------------------------------------------
    //Multi Select List Demo

    @FindBy(xpath = "//*[@id=\"multi-select\"]")
    public WebElement multiSelectDropdown;

    @FindBy(id = "printMe")
    public WebElement firstSelectedButton;

    @FindBy(id = "printAll")
    public WebElement getAllSelectedButton;

    @FindBy(xpath = "//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/p[2]")
    public WebElement firstSelectedOption;

    public String getFirstSelectedOption(){
        return firstSelectedOption.getText();
    }

    public void clickMultiSelectDropdown() {
        WebElement optionDropdown = multiSelectDropdown; //Get WebElement
        Select oSelect = new Select(optionDropdown); //Create object of Select class
        oSelect.selectByVisibleText("Ohio");
    }
    public void clickGetAllSelectedButton(){
        firstSelectedButton.click();
    }
}
