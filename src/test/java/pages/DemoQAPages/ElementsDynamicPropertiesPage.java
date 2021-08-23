package pages.DemoQAPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ElementsDynamicPropertiesPage {
    public ElementsDynamicPropertiesPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//button[@id='enableAfter']")
    public WebElement willEnable5SecondsButton;

    @FindBy(xpath = "//*[@id=\"item-8\"]/svg")
    public WebElement dynamicProperties;



    public void clickWillEnable5SecondsButton(){
       willEnable5SecondsButton.click();
    }
    public void clickDynamicPropertiesButton(){
        dynamicProperties.click();
    }
}
