package pages.SeleniumEasyPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BrowserUtils;
import utilities.Driver;

public class IntermediateBootstrapPage {
    public IntermediateBootstrapPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "/html/body/div[2]/div/div[2]/div/div[1]/div/ul/li[1]")
    public WebElement bootstrapDuellist;

    @FindBy(xpath = "//button[@class='btn btn-default btn-sm move-right']")
    public WebElement arrowButtonMoveRight;

    @FindBy(xpath = "//*[@id=\"listhead\"]/div[2]/div/input")
    public WebElement rightSearchBox;

    @FindBy(xpath = "//*[@id=\"listhead\"]/div[2]/div/span")
    public WebElement rightSearchButton;

    @FindBy(xpath = "/html/body/div[2]/div/div[2]/div/div[2]/button[1]/span")
    public WebElement arrowButtonMoveLeft;

    @FindBy(xpath = "//li[@class='list-group-item active']")
    public WebElement crasJustoOdio;

    @FindBy(xpath = "//*[@id=\"listhead\"]/div[1]/div/a")
    public WebElement selectAllButton;

//-----------------------------------------------------------------------------

    public void clickBootStrapDuellist(){
        bootstrapDuellist.click();
    }
    public void clickArrowButton(){
        arrowButtonMoveRight.click();
    }
    public void enterTextInRightSearchBoxAndMoveLeft(){
        rightSearchBox.sendKeys("Cras");
        BrowserUtils.waitFor(2);
        selectAllButton.click();
        arrowButtonMoveLeft.click();
    }
}
