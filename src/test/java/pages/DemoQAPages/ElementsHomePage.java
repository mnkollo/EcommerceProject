package pages.DemoQAPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ElementsHomePage {

    public ElementsHomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div/div[1]")
    public WebElement elementsBox;

    @FindBy(id = "item-1")
    public WebElement checkBox;

    @FindBy(xpath = "//*[@id=\"item-2\"]/span")
    public WebElement radioButton;

    @FindBy(xpath = "//*[@id=\"item-3\"]")
    public WebElement webTablesButton;

    @FindBy(xpath = "//*[@id=\"item-4\"]")
    public WebElement Buttons;

    @FindBy(id = "item-5")
    public WebElement linksButton;

    @FindBy(xpath = "//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div/div[1]")
    public WebElement formsButton;

    @FindBy(xpath = "//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[2]/div/ul")
    public WebElement practiceFormButton;

    @FindBy(xpath = "//*[@id=\"app\"]/div/div/div[2]/div/div[3]/div/div[1]")
    public WebElement alertsFramesWindows;

    @FindBy(xpath = "/html/body/div/div/div/div[2]/div[1]/div/div/div[3]/div/ul/li[1]/span")
    public WebElement browserWindows;

    @FindBy(xpath = "/html/body/div/div/div/div[2]/div[1]/div/div/div[3]/div/ul/li[2]")
    public WebElement alertsButton;

    @FindBy(xpath = "/html/body/div/div/div/div[2]/div[1]/div/div/div[3]/div/ul/li[5]")
    public WebElement modalDialogsButton;

    @FindBy(xpath = "//*[@id=\"app\"]/div/div/div[2]/div/div[4]/div/div[1]")
    public WebElement widgetsButton;

    @FindBy(xpath = "/html/body/div/div/div/div[2]/div[1]/div/div/div[4]/div/ul/li[1]")
    public WebElement accordianButton;

    @FindBy(xpath = "/html/body/div/div/div/div[2]/div[1]/div/div/div[4]/div/ul/li[2]/span")
    public WebElement autoCompleteButton;

    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/ul[1]/li[3]")
    public WebElement framesTab;

    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/ul[1]/li[5]")
    public WebElement modalDialogsTab;



    //-----------------------------------------------------------------------------------------

    public void clickModalDialogsTab(){
        modalDialogsTab.click();
    }
    public void clickAutoCompleteButton(){
        autoCompleteButton.click();
    }

    public void clickAccordianButton(){
        accordianButton.click();
    }

    public void clickWidgetsButton(){
        widgetsButton.click();
    }
    public void clickModalDialogsButton(){
        modalDialogsButton.click();
    }
    public void clickAlertsButton(){
        alertsButton.click();
    }

    public void clickBrowserWindows(){
        browserWindows.click();
    }

    public void clickAlertsFramesWindows(){
        alertsFramesWindows.click();
    }

    public void clickPracticeFormButton(){
        practiceFormButton.click();
    }
    public void clickFormsButton(){
        formsButton.click();
    }
    public void clickLinksButton(){
        linksButton.click();
    }

    public void clickButtons(){
        Buttons.click();
    }
    public void clickElementsBox(){
        elementsBox.click();
    }
    public void clickCheckBox(){
        checkBox.click();
    }
    public void clickRadioButton(){
        radioButton.click();
    }
    public void clickwebTablesButton(){
        webTablesButton.click();
    }

    public void clickFramesButton() {
        framesTab.click();
    }
}
