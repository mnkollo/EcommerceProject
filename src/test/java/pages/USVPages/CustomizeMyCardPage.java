package pages.USVPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class CustomizeMyCardPage<pubic> {
    public CustomizeMyCardPage() {
        PageFactory.initElements(Driver.getDriver(), this); }

    @FindBy(xpath = "//img[@alt=\"Animals\"]")
    public WebElement animalsCustomButton;

    @FindBy(xpath = "//*[@id=\"card72094Button\"]/img")
    public WebElement lionCustomCard;

    @FindBy(xpath = "//img[@alt=\"Longhorn\"]")
    public WebElement longhornCustomCard;

    @FindBy(xpath = "//*[@id=\"replaceCardTile\"]/div/div[3]/div[6]/div/button")
    public WebElement orderCustomCardButton;

//-------------------------------------------------------------------------------------------------------------
    public void clickAnimalsCustomButton(){
        animalsCustomButton.click();
    }
    public void clickLionCustomCard(){
        lionCustomCard.click();
    }
    public void clickOrderCustomCardButton(){
        orderCustomCardButton.click();
    }
    public void clickLonghornCustomCard() {
        longhornCustomCard.click();
    }
}
