package pages.SeleniumEasyPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class WindowPopupModal {
    public WindowPopupModal() {
        PageFactory.initElements(Driver.getDriver(), this); }

        //--------------------------------------------------------------------------------
        //Single Window Popup

    @FindBy(xpath = "/html/body/div[2]/div/div[2]/div[1]/div/div[2]/div[1]/a")
    public WebElement followOnTwitterButton;

    @FindBy(xpath = "(//a[@class='btn btn-primary followeasy'])[2]")
    public WebElement likeUsOnFacebookButton;

    @FindBy(xpath = "/html/body/div[2]/div/div[2]/div[2]/div/div[2]/div[1]/a")
    public WebElement followtwitterandFacebookButton;

    @FindBy(xpath = "//*[@id=\"followall\"]")
    public WebElement followAllButton;






    public void clickFollowOnTwitter(){
        followOnTwitterButton.click();
    }


    public void clickLikeUsOnFacebookButton(){
        likeUsOnFacebookButton.click();
    }
    public void clickfollowtwitterandFacebookButton(){
        followtwitterandFacebookButton.click();
    }
    public void clickFollowAllButton(){
        followAllButton.click();
    }


}
