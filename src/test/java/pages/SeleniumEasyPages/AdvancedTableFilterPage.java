package pages.SeleniumEasyPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AdvancedTableFilterPage {
    public AdvancedTableFilterPage() {
        PageFactory.initElements(Driver.getDriver(), this); }

        @FindBy(xpath = "/html/body/div[2]/div/div[2]/section/div/div/div[2]/div[1]/div/button[1]")
        public WebElement greenButton;

    @FindBy(xpath = "/html/body/div[2]/div/div[2]/section/div/div/div[2]/div[1]/div/button[2]")
    public WebElement orangeButton;

    @FindBy(xpath = "/html/body/div[2]/div/div[2]/section/div/div/div[2]/div[1]/div/button[3]")
    public WebElement redButton;

    @FindBy(xpath = "/html/body/div[2]/div/div[2]/section/div/div/div[2]/div[1]/div/button[4]")
    public WebElement allButton;

    @FindBy(xpath = "/html/body/div[2]/div/div[2]/section/div/div/div[2]/div[2]/table/tbody/tr[1]/td[1]/div")
    public WebElement loremImpsumGreen;


//-----------------------------------------------------------------------------------------------------

    public void clickAllButton(){
        allButton.click();
    }
    public void clickLoremImpsumGreencheckbox(){
        loremImpsumGreen.click();
    }
    public void clickGreenButton(){
        greenButton.click();
    }
    public void clickOrangeButton(){
        orangeButton.click();
    }
    public void clickRedButton(){
        redButton.click();
    }
    public void getLoremImpsumGreen(){
        loremImpsumGreen.isSelected();
    }

}
