package pages.USVPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ManageCardPage<pubic> {
    public ManageCardPage() {
        PageFactory.initElements(Driver.getDriver(), this); }

    @FindBy(xpath = "//*[@class ='card-button manage-card-option last-child']")
    public WebElement viewCardDetails;

    @FindBy(id = "freezeMyCardButton")
    public WebElement freezeMyCard;

    @FindBy(xpath = "//*[@id=\"freezeMyCardSection\"]/div/div[3]/div[1]/div/div")
    public WebElement freezeMyCardSlider;

    @FindBy(xpath = "//*[@id=\"freezeMyCardSection\"]/div/div[3]/div[2]/div[2]/div[1]/div/span")
    public WebElement frozenMessage;

    @FindBy(xpath = "//*[@id=\"freezeMyCardSection\"]/div/div[3]/div[5]/div/a")
    public WebElement returnToMyAccountLink;

    @FindBy(xpath = "//*[@id=\"activateNewCardButton\"]/div/div[1]/span")
    public WebElement activateCardButton;

    @FindBy(xpath = "    //*[@id=\"customizeCardButton\"]/div/div[1]/span\n")
    public WebElement customizeCardButton;






//-------------------------------------------------------------------------------------------------------------
    public void clickReturnToMyAccountLink(){
        returnToMyAccountLink.click();
    }
    public void clickCustomizeCardButton(){
        customizeCardButton.click();

    }
    public void clickActivateCard(){
        activateCardButton.click();
    }

    public void clickViewCardDetails(){
        viewCardDetails.click();
    }
    public void clickFreezeMyCard(){
        freezeMyCard.click();
    }
    public void clickFreezeMyCardSlider(){
        freezeMyCardSlider.click();
    }
    public String getFrozenMessageText() {
        return frozenMessage.getText().toLowerCase();
    }

}
