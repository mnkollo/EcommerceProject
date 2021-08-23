package pages.DemoQAPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ElementsModalDialogsPage {
    public ElementsModalDialogsPage() { PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(id = "showSmallModal")
    public WebElement smallModalButton;

    @FindBy(id = "closeSmallModal")
    public WebElement closeButtonSmall;

    @FindBy(id = "showLargeModal")
    public WebElement largeModalButton;

    @FindBy(id = "closeLargeModal")
    public WebElement closeButtonLarge;

    @FindBy(xpath = "//p[contains(text(),'Lorem Ipsum is simply dummy text of the printing a')]")
    public WebElement largeModalText;




    public void clickSmallModalButton(){
        smallModalButton.click();
    }
    public void clickCloseButton(){
        closeButtonSmall.click();
    }
    public void clickLargeModalButton(){
        largeModalButton.click();
    }
    public void clickCloseButtonLarge(){
        closeButtonLarge.click();
    }
}
