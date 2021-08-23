package pages.SeleniumEasyPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BrowserUtils;
import utilities.Driver;

public class JqueryDualListBoxDemoPage {
    public JqueryDualListBoxDemoPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    //-------------------------------------------------------------------------
    @FindBy(css = "#pickList > div > div:nth-child(1) > select")
    public WebElement pickListDropdown;

    @FindBy(css = "#pickList > div > div.col-sm-2.pickListButtons > button.pAdd.btn.btn-primary.btn-sm")
    public WebElement addButton;

    @FindBy(xpath = "//*[@id=\"pickList\"]/div/div[2]/button[2]")
    public WebElement addAllButton;

    @FindBy(xpath = "//button[@class='pRemove btn btn-primary btn-sm']")
    public WebElement removeButton;

    @FindBy(xpath = "//*[@id=\"pickList\"]/div/div[2]/button[4]")
    public WebElement removeAllButton;

    public void clickPickListDropdown() {
        BrowserUtils.dropdownVisible(pickListDropdown,"Sophia");
    }
    public void clickAddButton() {
        addButton.click();
    }
    public void clickaddAllButton(){
        addAllButton.click();
    }
    public void clickRemoveButton(){
        removeButton.click();
    }
    public void removeAllButton(){
        removeAllButton.click();
    }

}
