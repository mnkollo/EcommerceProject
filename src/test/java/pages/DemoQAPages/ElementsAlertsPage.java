package pages.DemoQAPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ElementsAlertsPage {

    public ElementsAlertsPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
   @FindBy(xpath = "//*[@id=\"item-1\"]")
    public WebElement alertsButton;

    @FindBy(xpath = "//*[@id=\"alertButton\"]")
    public WebElement clickMeButton;

    @FindBy(id = "timerAlertButton")
    public WebElement clickMeButtonFiveSeconds;

    @FindBy(id = "confirmButton")
    public WebElement clickMeButtonConfirmBox;

    @FindBy(id = "promtButton")
    public WebElement clickMeButtonPromtButton;

    @FindBy(xpath = "/html/body/div/div/div/div[2]/div[2]/div[1]/div[4]/div[1]/span[2]")
    public WebElement successMessage;

    public String getSuccessMessage(){
        return successMessage.getText();
    }

    public void clickMeButtonPromtButton(){
        clickMeButtonPromtButton.click();
    }

    public void clickAlertsButton(){
        alertsButton.click();
    }
    public void clickClickMeButton(){
        clickMeButton.click();
    }
    public void clickclickMeButtonFiveSeconds(){
        clickMeButtonFiveSeconds.click();
    }
    public void clickclickMeButtonConfirmBox(){
        clickMeButtonConfirmBox.click();
    }

}
