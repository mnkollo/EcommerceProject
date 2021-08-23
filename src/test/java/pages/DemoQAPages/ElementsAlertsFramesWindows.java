package pages.DemoQAPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ElementsAlertsFramesWindows {

    public ElementsAlertsFramesWindows() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "/html/body/div/div/div/div[2]/div[2]/div[1]/div[1]/button")
    public WebElement newTabButton;

    @FindBy(xpath = "/html/body/div/div/div/div[2]/div[2]/div[1]/div[2]/button")
    public WebElement newWindowButton;

    @FindBy(xpath = "//h1[@id='sampleHeading']")
    public WebElement thisIsASamplePagetext;

    @FindBy(xpath = "//*[@id=\"sampleHeading\"]")
    public WebElement headingMessage;

    @FindBy(id = "messageWindowButton")
    public WebElement newWindowMessageButton;

    @FindBy(xpath = "//body")
    public WebElement thirdMessage;



    //--------------------------------------------------------------------------------------------------

    public String getThirdMessage(){
        return thirdMessage.getText();
    }

    public void clickNewWindowMessageButton(){
        newWindowMessageButton.click();
    }

    public String getHeadingMessage(){
        return headingMessage.getText();
    }
    public String getThisIsASamplePageText(){
        return thisIsASamplePagetext.getText();
    }
    public void clickNewTabButton(){
        newTabButton.click();
    }
    public void clickNewWindowButton(){
        newWindowButton.click();
    }
}
