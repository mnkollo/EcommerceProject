package pages.DemoQAPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ElementsLinksPage {
    public ElementsLinksPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(id = "simpleLink")
    public WebElement homeLink;

    @FindBy(xpath = "//*[@id=\"dynamicLink\"]")
    public WebElement homeztvbl;

    @FindBy(linkText = "Created")
    public WebElement createdLink;

    @FindBy(linkText = "No Content")
    public WebElement noContentLink;

    public void clickhomeLink(){
        homeLink.click();
    }
    public void clickhomeztvbl(){
        homeztvbl.click();
    }
    public void clickNoContentLink(){
        noContentLink.click();
    }
    public void clickCreatedLink(){
        createdLink.click();
    }

}
