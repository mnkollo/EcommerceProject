package pages.DemoQAPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BrowserUtils;
import utilities.Driver;

import javax.swing.*;

public class ElementsButtonsPage {

    public ElementsButtonsPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(id = "doubleClickBtn")
    public WebElement doubleClickButton;

    @FindBy(id = "rightClickBtn")
    public WebElement rightClickButton;

    @FindBy(xpath = "//*[text()='Click Me']")
    public WebElement clickButton;

    @FindBy(xpath = "//*[@id=\"dynamicClickMessage\"]")
    public WebElement nameText;

//-------------------------------------------------------------------------

    public void clickDoubleClickButton(){
        Actions actions = new Actions(Driver.getDriver());
        actions.doubleClick(doubleClickButton).perform();
    }
    public void clickRightClickButton(){
        Actions actions = new Actions(Driver.getDriver());
        actions.contextClick(rightClickButton).perform();
    }
    public void clickButton(){
        Actions actions = new Actions(Driver.getDriver());
        actions.click(clickButton).perform();
    }
    public String getNameText(){
        return nameText.getText();
    }
}
