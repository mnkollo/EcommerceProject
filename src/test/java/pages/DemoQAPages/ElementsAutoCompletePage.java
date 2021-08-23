package pages.DemoQAPages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ElementsAutoCompletePage {

    public ElementsAutoCompletePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "/html/body/div/div/div/div[2]/div[2]/div[1]/div[1]/div/div/div/div/div[1]")
    public WebElement multipleColorNameBox;

    public void enterTextInMultipleColorNameBox(){
        multipleColorNameBox.click();
        multipleColorNameBox.sendKeys("Blue");
        multipleColorNameBox.sendKeys(Keys.ARROW_DOWN);
        //multipleColorNameBox.sendKeys(Keys.ENTER);
    }
}
