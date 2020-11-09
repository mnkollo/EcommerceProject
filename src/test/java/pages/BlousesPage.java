package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;
import utilities.BrowserUtils;
import utilities.Driver;


public class BlousesPage {
    public BlousesPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    // Elements on Blouses Page
    @FindBy(xpath = "//h1[.='Web Orders']")
    public WebElement webOrders;

    @FindBy(xpath = "//*[@id=\"list\"]/a/i")
    public WebElement productListButton;

    @FindBy(xpath = "//*[@id=\"center_column\"]/ul/li/div/div/div[2]/span/span")
    public WebElement inStockElement;

    public void clickBlousesListButton(){
        BrowserUtils.waitFor(2);
        productListButton.click();
    }
    public String getInStockElement(){
        return inStockElement.getText();
    }

}
//--------------------------------------------------------------------------------
