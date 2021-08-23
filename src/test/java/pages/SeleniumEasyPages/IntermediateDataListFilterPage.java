package pages.SeleniumEasyPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class IntermediateDataListFilterPage {
    public IntermediateDataListFilterPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//*[@id=\"input-search\"]")
    public WebElement inputSearchTextBox;

    @FindBy(xpath = "/html/body/div[2]/div/div[2]/section/div/div[2]/div[2]/div/h4")
    public WebElement brendaTreeCustomerName;

    @FindBy(xpath = "/html/body/div[2]/div/div[2]/section/div/div[2]/div[3]/div/h4")
    public WebElement glenTreeCustomerName;



    public void inputDataIntoInputSearchTextBox(String CutomerName){
        inputSearchTextBox.clear();
        inputSearchTextBox.sendKeys(CutomerName);
    }
    public String getBrendaTreeCustomerName(){
        return brendaTreeCustomerName.getText();
    }
    public String getGlennTreeCustomerName(){
        return glenTreeCustomerName.getText();
    }

}

