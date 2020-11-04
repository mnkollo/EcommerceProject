package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BrowserUtils;
import utilities.Driver;

public class MyAccountPage {
    public MyAccountPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //Links on Account Page

    @FindBy(xpath = "//*[@id=\"center_column\"]/div/div[1]/ul/li[1]/a/span")
    public WebElement orderHistoryAndDetailsButton;

    @FindBy(xpath = "//*[@id=\"center_column\"]/div/div[1]/ul/li[2]/a/span")
    public WebElement myCreditSlipsButton;

    @FindBy(xpath = "//*[@id=\"center_column\"]/div/div[1]/ul/li[3]/a/span")
    public WebElement myAddressesButton;

    @FindBy(xpath = "//*[@id=\"center_column\"]/div/div[1]/ul/li[4]/a/span")
    public WebElement myPersonalInformationButton;

    @FindBy(xpath = "//*[@id=\"center_column\"]/div/div[2]/ul/li/a/span")
    public WebElement myWishListButton;

    @FindBy(xpath = "//*[@id=\"center_column\"]/p")
    public WebElement accountPageWelcomeMessage;

    @FindBy(xpath = "//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a/span")
    public WebElement accountHolderName;

    public void goToOrderHistoryPage() {
        orderHistoryAndDetailsButton.click();
}
    public void goTomyCreditSlipsPage() {
        myCreditSlipsButton.click();
    }
    public void goToMyAddresses() {
        myAddressesButton.click();
    }
    public void goToMyPersonalInformationPage() {
        myPersonalInformationButton.click();
    }
    public void goToMyWishListButtonPage() {
        myWishListButton.click();
    }
    public String captureWelcomeMessage() {
        BrowserUtils.waitForClickablility(accountPageWelcomeMessage, 3);
        return accountPageWelcomeMessage.getText();
    }
    public String captureAccountHolderName() {
        BrowserUtils.waitForClickablility(accountHolderName, 3);
        return accountHolderName.getText();
    }
}
