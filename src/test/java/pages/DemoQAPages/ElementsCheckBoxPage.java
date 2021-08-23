package pages.DemoQAPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ElementsCheckBoxPage {

    public ElementsCheckBoxPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = "#tree-node > ol > li > span > button > svg")
    public WebElement homeArrow;

    @FindBy(css = "#tree-node > ol > li > ol > li:nth-child(2) > span > button > svg")
    public WebElement documentsArrow;

    @FindBy(xpath = "//*[@id=\"tree-node\"]/ol/li/ol/li[2]/ol/li[1]/span/label/span[3]")
    public WebElement workSpaceCheckBox;

    @FindBy(xpath = "//*[@id=\"result\"]/span[2]")
    public WebElement successMessage;

    public String getSuccessMessage() {
        return successMessage.getText();
    }


    public void clickHomeArrow(){
        homeArrow.click();
    }
    public void clickDocumentsArrow(){
        documentsArrow.click();
    }
    public void clickWorkSpaceCheckBox(){
        workSpaceCheckBox.click();

    }

}
