package pages.GooglePages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class GoogleHomePage {

    public GoogleHomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[starts-with(@id,'gbqfbb')]")
    public WebElement imFeelingLuckyButton;

    @FindBy(xpath = "//input[contains(@class,'gsfi')]")
    public WebElement searchField;

    @FindBy(xpath = "(//h3[@class='LC20lb DKV0Md'])[1]")
    public WebElement dallasCowboysLink;

    @FindBy(className = "gNO89b")
    public WebElement searchButton;




    public void googleSearch(String team){
        searchField.sendKeys(team + Keys.ENTER);
    }
    public void clickSearchButton (){
        searchButton.click();
    }

    public void clickImFeelingLuckyButton(){
        imFeelingLuckyButton.click();
    }
    public void clickOnDallasCowboysLink(){
        dallasCowboysLink.click();
    }
//----------------------------------------------------------------------
//Gmail Elements

    @FindBy(xpath = "//a[@class='gb_D gb_wc']")
    public WebElement googleAppsIcons;

    @FindBy(xpath = "//*[@id=\"yDmH0d\"]/c-wiz/div/div/c-wiz/div/div/ul[1]/li[7]/a/div/span")
    public WebElement gmailAppsIcons;

    public void clickGoogleAppIcons(){
        googleAppsIcons.click();
    }
    public void clickgmailAppsIcons() {
        gmailAppsIcons.click();
    }
}
