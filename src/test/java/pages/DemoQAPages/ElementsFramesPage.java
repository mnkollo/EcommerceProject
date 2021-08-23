package pages.DemoQAPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ElementsFramesPage {

    public ElementsFramesPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(id = "frame1")
    public WebElement iframeOne;

    @FindBy(xpath = "/html/body")
    public WebElement sampleMessage;

    @FindBy(xpath = "//*[@id=\"sampleHeading\"]")
    public WebElement sampleMessageTwo;


    //---------------------------------------------------------

    public String getSampleMessage(){
        return sampleMessage.getTagName();
    }
    public String getSampleMessageTwo(){
        return sampleMessageTwo.getText();
    }

}
