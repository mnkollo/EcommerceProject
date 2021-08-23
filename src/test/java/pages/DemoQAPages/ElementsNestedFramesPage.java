package pages.DemoQAPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ElementsNestedFramesPage {

    public ElementsNestedFramesPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/ul[1]/li[4]")
    public WebElement nestedFrames;

    @FindBy(xpath = "/html/body/p")
    public WebElement childIframeMessage;

    public void clickNestedFrames(){
        nestedFrames.click();
    }
    public String getChildIframeMessage(){
        return childIframeMessage.getText();
    }
}
