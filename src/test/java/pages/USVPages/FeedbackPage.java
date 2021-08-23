package pages.USVPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class FeedbackPage {
    public FeedbackPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//*[@id=\"appFeedbackButton\"]")
    public WebElement sendFeedbackButton;

    @FindBy(xpath = "//*[@id=\"AppFeedbackGoodLabel\"]/div[1]/div")
    public WebElement goodbubbleicon;

    @FindBy(xpath = "//*[@id=\"feedbackCommentsInput\"]")
    public WebElement commentsTextBox;

    @FindBy(xpath = "//*[@id=\"feedbackAllowContactCheckboxContainer\"]/label")
    public WebElement authorizationBox;

    @FindBy(xpath = "//*[@id=\"tileId\"]/div/div[3]/form/div[5]/div/button")
    public WebElement feedbackSubmitButton;

    @FindBy(xpath = "//*[@id=\"notification-3\"]/div/div/div[2]")
    public WebElement feedbackCavemanMessage;



    public void clickSendFeedbackButton(){
        sendFeedbackButton.click();
    }
    public void clickGoodBubbleIcon(){
        goodbubbleicon.click();
    }
    public void enterCommentsInTextBox(){
        commentsTextBox.sendKeys("Blah Blah Blah this is just a test");
    }
    public void clickAuthorizationBox(){
        authorizationBox.click();
    }
    public void clickFeedbackSubmitButton(){
        feedbackSubmitButton.click();
    }
    public String getFeedbackCavemanMessage(){
    return feedbackCavemanMessage.getText();
    }
}
