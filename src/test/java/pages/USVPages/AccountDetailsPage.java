package pages.USVPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AccountDetailsPage {
    public AccountDetailsPage() {
        PageFactory.initElements(Driver.getDriver(), this); }

    @FindBy(xpath = "//*[@class=\"btn button-unfreeze btn-secondary\"]")
    public WebElement unfreezeCaveManMessage;

    @FindBy(xpath = "//span[contains(text(),'My Profile')]")
    public WebElement profileTab;

        @FindBy(xpath = "//*[@id=\"sidebarMenuButton\"]/svg")
        public WebElement hamburgerMenu;

    @FindBy(id = "activateCardButton")
    public WebElement activateCard;

    @FindBy(xpath = "//*[@class ='svg-inline icon--hamburger']")
    public WebElement topLeftHamburgerMenu;

    @FindBy(xpath = "//*[@id=\"routerViewElement\"]/div/div[2]/div[4]/div[2]/div[1]/div[1]/button/img")
    public WebElement animatedVirtualCard;

    @FindBy(id = "manageCardButton")
    public WebElement manageCardButton;

    @FindBy(xpath = "//*[@id=\"virtualCardSection\"]/div/div[3]/div[1]/div/span")
    public WebElement cardDetailsMessage;

    @FindBy(id = "directDepositButton")
    public WebElement directDepositIcon;

    @FindBy(xpath = "//*[@id=\"employeeInput\"]")
    public WebElement employername;

    @FindBy(id = "searchButton")
    public WebElement ddSearchButton;

    @FindBy(xpath = "//*[@id=\"employerList\"]/a/span")
    public WebElement selectEmployerName;

    @FindBy(xpath = "//*[@id=\"ActionSection\"]/div/div[3]/div/div[3]")
    public WebElement payBillsButton;

    @FindBy(xpath = "//*[@id=\"transferFundsButton\"]")
    public WebElement transferFundsButton;




    //----------------------------------------------------------------------------------------------

    public void clickProfileTab(){
        profileTab.click();
    }

    public void clickTransferFundsButton(){
        transferFundsButton.click();
    }
    public void clickPayBillsButton(){
        payBillsButton.click();
    }

    public void clickSelectEmployerName(){
        selectEmployerName.click();
    }

    public void clickDDSearchButton(){
        ddSearchButton.click();
    }

    public void enterEmployerName (String employer){
        employername.sendKeys(employer);
    }

    public void clickDirectDepositIcon(){
        directDepositIcon.click();
    }

    public String getCardDetailsMessage(){
        return cardDetailsMessage.getText();
    }

    public void clickanimatedVirtualCard(){
        animatedVirtualCard.click();
    }

    public void clickUnfreezeCaveManMessage(){
        unfreezeCaveManMessage.click();
    }

    public void clickHamburgerMenu(){
            hamburgerMenu.click();
    }
    public void clickManageCardButton(){
        manageCardButton.click();
    }
    public void clickagainHamburgerMenu(){
        topLeftHamburgerMenu.click();
    }

    public void clickActivateCard(){
            activateCard.click();
    }


}
