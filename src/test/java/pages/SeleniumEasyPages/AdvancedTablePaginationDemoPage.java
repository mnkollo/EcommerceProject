package pages.SeleniumEasyPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AdvancedTablePaginationDemoPage {
    public AdvancedTablePaginationDemoPage() {
        PageFactory.initElements(Driver.getDriver(), this); }

    @FindBy(xpath = "//*[@id=\"myPager\"]/li[5]/a")
    public WebElement rightNextButton;

    @FindBy(xpath = "//*[@id=\"myPager\"]/li[1]/a")
    public WebElement leftNextButton;

    @FindBy(xpath = "//*[@id=\"myPager\"]/li[2]/a")
    public WebElement number1;

    @FindBy(xpath = "//*[@id=\"myTable\"]/tr[1]/td[2]")
    public WebElement cellName;

    public void clickRightNextButton(){
        rightNextButton.click();
    }
    public void clickLeftNextButton() {
        leftNextButton.click();
    }
    public void clickNumberOne(){
        number1.click();
    }
    public String getCellName(){
       return cellName.getText();
    }
}
