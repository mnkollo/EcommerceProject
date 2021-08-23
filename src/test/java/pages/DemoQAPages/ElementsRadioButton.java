package pages.DemoQAPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ElementsRadioButton {

    public ElementsRadioButton() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id=\"app\"]/div/div/div[2]/div[2]/div[1]/div[2]/label")
    public WebElement yesRadioButton;

    @FindBy(xpath = "//*[@id=\"app\"]/div/div/div[2]/div[2]/div[1]/p/span")
    public WebElement yes;

    @FindBy(xpath = "/html/body/section/div/div/div[2]/div/div/div")
    public WebElement invalidloginmessage;




    public void clickYesRadioButton(){
        yesRadioButton.click();
    }
    public String getYesText(){
        return yes.getText();
    }
}
