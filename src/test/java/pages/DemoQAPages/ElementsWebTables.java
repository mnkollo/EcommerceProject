package pages.DemoQAPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ElementsWebTables {

    public ElementsWebTables() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id=\"searchBox\"]")
    public WebElement searchBox;

    @FindBy(xpath = "//*[@id=\"basic-addon2\"]")
    public WebElement searchButton;

    public void enterTextInSearchBox(String name){
        searchBox.sendKeys(name);
    }
    public void clickSearchButton(){
        searchButton.click();
    }
}
