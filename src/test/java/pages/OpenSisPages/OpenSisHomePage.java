package pages.OpenSisPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class OpenSisHomePage {
    public OpenSisHomePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

//---------------------------Header Tab--------------------------------------------------

    @FindBy(xpath = "//*[@id=\"mainMenu\"]/div/div[6]/div/div")
    public WebElement feesMainTab;

    @FindBy(xpath = "//*[@id=\"mainMenu\"]/div/div[6]/div/ul/li[4]/div")
    public WebElement feesBillingManagerSubTab;

    @FindBy(xpath = "//*[@id=\"mainMenu\"]/div/div[6]/div/ul/li[5]/div")
    public WebElement feesBatchPaymentsSubTab;

    @FindBy(xpath = "//*[@id=\"mainMenu\"]/div/div[6]/div/ul/li[6]/div")
    public WebElement feesPostingPaymentsSubTab;

    @FindBy(xpath = "//*[@id=\"mainMenu\"]/div/div[6]/div/ul/li[7]/div")
    public WebElement feesEDIHistorySubTab;




    public void clickFeesMainTab(){
        feesMainTab.click();
    }
    public void clickfeesBillingManagerSubTab(){
        feesBillingManagerSubTab.click();
    }
}
