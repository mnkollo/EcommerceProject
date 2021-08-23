package pages.DemoQAPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ElementsAccordianPage {

    public ElementsAccordianPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "section2Heading")
    public WebElement whereDoesITComeFrom;

    @FindBy(id = "section3Heading")
    public WebElement whyDoWeUseIt;

    public void clickWhereDoesItCome(){
        whereDoesITComeFrom.click();
    }
    public void clickWhyDoWeUseIt(){
        whyDoWeUseIt.click();
    }
}
