package pages.SeleniumEasyPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AdvancedTableDataSearchPage {
    public AdvancedTableDataSearchPage(){
        PageFactory.initElements(Driver.getDriver(), this); }

    @FindBy(id = "task-table-filter")
    public WebElement filterSearchBox;

    @FindBy(xpath = "/html/body/div[2]/div/div[2]/div[2]/div/div/div/button")
    public WebElement filterButton;

    @FindBy(xpath = "//*[@id=\"task-table\"]/tbody/tr[4]/td[3]")
    public WebElement emilyJohn;

    @FindBy(xpath = "/html/body/div[2]/div/div[2]/div[2]/div/table/thead/tr/th[3]/input")
    public WebElement firstName;

    @FindBy(xpath = "/html/body/div[2]/div/div[2]/div[2]/div/table/tbody/tr[1]/td[2]")
    public WebElement userName;

    public void enterDataInFilterSearchBox(String Task){
        filterSearchBox.sendKeys(Task);
    }
    public String getEmilyJohn(){
        return emilyJohn.getText().toLowerCase();
    }
    public void clickFilterButton(){
        filterButton.click();
    }
    public void enterFirstName(String name) {
        firstName.sendKeys(name);
    }
    public String getUserName(){
        return userName.getText().toLowerCase();
    }

}
