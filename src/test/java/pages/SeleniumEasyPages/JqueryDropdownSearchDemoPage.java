package pages.SeleniumEasyPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import utilities.BrowserUtils;
import utilities.Driver;

public class JqueryDropdownSearchDemoPage {
    public JqueryDropdownSearchDemoPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //-------------------------------------------------------------------------
    @FindBy(xpath = "//*[@id=\"country\"]")
    public WebElement dropDownWithSearchBox;

    @FindBy(xpath = "/html/body/div[2]/div/div[2]/div[2]/div/div[2]/select")
    public WebElement selectMultipleValuesDropdown;

    @FindBy(xpath = "//select[@class='js-example-disabled-results select2-hidden-accessible']")
    public WebElement selectDropDownWithDisabledValues;

    @FindBy(xpath = "//*[@id=\"files\"]")
    public WebElement selectDropDownWithCCategoryRelatedOptions;


    public void clickDropDownWithSearchBox(){
        Select oSelect = new Select(dropDownWithSearchBox); //Create object of Select class
        oSelect.selectByVisibleText("Denmark");
    }

    public void clickSelectMultipleValuesDropdown(){
        Select oSelect = new Select(selectMultipleValuesDropdown);
        oSelect.selectByVisibleText("Arkansas");
        oSelect.selectByVisibleText("Arizona");
        oSelect.selectByValue("DE");

    }

    public void clickselectDropDownWithDisabledValues(){
        Select oSelect = new Select(selectDropDownWithDisabledValues);
        oSelect.selectByValue("PR");
    }

    public void selectDropDownWithCCategoryRelatedOptions(){
        Select oSelect = new Select(selectDropDownWithCCategoryRelatedOptions);
        oSelect.selectByVisibleText("Ruby");

    }
}
