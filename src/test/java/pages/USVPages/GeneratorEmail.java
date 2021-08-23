package pages.USVPages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import javax.swing.*;

public class GeneratorEmail {
    public GeneratorEmail() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id=\"userName\"]")
    public WebElement emailName;

    @FindBy(xpath = "//*[@id=\"domainName2\"]")
    public WebElement addressName;

    @FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div/div[2]/div/div/div[1]")
    public WebElement closeButton;

    @FindBy(xpath = "//*[@id=\"refresh\"]/button/span")
    public WebElement refreshButton;

    @FindBy(id = "ad_position_box")
    public WebElement outsideTheBox;

    @FindBy(xpath = "//*[@id=\":2f\"]")
    public WebElement topEmail;

    @FindBy(xpath = "/html/body/div[7]/div[3]/div/div[2]/div[1]/div[2]/div/div/div/div/div[2]/div/div[1]/div/div[2]/div/table/tr/td[1]/div[2]/div[2]/div/div[3]/div/div/div/div/div/div[1]/div[2]/div[1]/table/tbody/tr[1]/td[4]/div[2]")
    public WebElement hamburgerMenuThreeDots;

    @FindBy(xpath = "/html/body/div[7]/div[3]/div/div[2]/div[1]/div[2]/div/div/div/div/div[2]/div/div[1]/div/div[2]/div/table/tr/td[1]/div[2]/div[2]/div/div[1]/div/div[8]/div/div/div")
    public WebElement deleteThisMessage;








    //-----------------------------------------------------------
    public void clickDeleteThisMessage(){
    deleteThisMessage.click();
    }

    public void clickHamburgerMenuThreeDots(){
        hamburgerMenuThreeDots.click();
    }

    public void RightClickTopEmail(){
        Actions act = new Actions(Driver.getDriver());
        act.moveToElement(topEmail).contextClick().sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).build().perform();
    }
    public void clickOutSideTheBox(){
        outsideTheBox.click();
        outsideTheBox.click();
    }

    public void clickRefreshButton(){
        refreshButton.click();
    }
    public void clickCloseButton(){
        closeButton.click();
    }

    public void enterEmailName(){
        emailName.clear();
        emailName.sendKeys("obila");
    }
    public void enterAddressName(){
        addressName.sendKeys(Keys.BACK_SPACE);
        addressName.sendKeys(Keys.BACK_SPACE);
        addressName.sendKeys(Keys.BACK_SPACE);
        addressName.sendKeys(Keys.BACK_SPACE);
        addressName.sendKeys(Keys.BACK_SPACE);
        addressName.sendKeys(Keys.BACK_SPACE);
        addressName.sendKeys(Keys.BACK_SPACE);
        addressName.sendKeys(Keys.BACK_SPACE);
        addressName.sendKeys(Keys.BACK_SPACE);
        addressName.sendKeys(Keys.BACK_SPACE);
        addressName.sendKeys(Keys.BACK_SPACE);
        addressName.sendKeys(Keys.BACK_SPACE);
        addressName.sendKeys(Keys.BACK_SPACE);
        addressName.sendKeys(Keys.BACK_SPACE);
        addressName.sendKeys(Keys.BACK_SPACE);
        addressName.sendKeys(Keys.BACK_SPACE);
        addressName.sendKeys(Keys.BACK_SPACE);
        addressName.sendKeys(Keys.BACK_SPACE);
        addressName.sendKeys("mixalo.com");
        //addressName.sendKeys("mixalo.com");
    }
}



