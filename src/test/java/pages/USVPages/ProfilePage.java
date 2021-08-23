package pages.USVPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ProfilePage {
    public ProfilePage() {
        PageFactory.initElements(Driver.getDriver(), this); }

    @FindBy(xpath = "//button[@id='accountInfoButton']")
    public WebElement accountInfoTab;

    @FindBy(xpath = "//span[contains(text(),'12-09-2000')]")
    public WebElement DOB;

    @FindBy(xpath = "//span[contains(text(),'101019084')]")
    public WebElement routingNumber;

    @FindBy(xpath = "//span[contains(text(),'244106503240')]")
    public WebElement accountNumber;

    @FindBy(xpath = "//span[contains(text(),'Contact Info')]")
    public WebElement contactInfoTab;

    @FindBy(xpath = "//span[contains(text(),'555-894-3984')]")
    public WebElement phoneNumber;

    @FindBy(xpath = "//span[contains(text(),'Address Info')]")
    public WebElement addressInfo;

    @FindBy(xpath = "//span[contains(text(),'4983 Diesel St')]")
    public WebElement homeAddress;

    @FindBy(xpath = "//body/div[@id='child-app']/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/div[8]/div[1]/button[1]/span[1]")
    public WebElement notificationTab;

    @FindBy(xpath = "//span[contains(text(),'Account Notifications')]")
    public WebElement accountNotificatonsTab;

    @FindBy(xpath = "//body/div[@id='child-app']/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/div[3]/div[2]/label[1]/span[1]")
    public WebElement dailyAvailableBalanceNoticeSlider;

    @FindBy(xpath = "//body/div[@id='child-app']/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/div[4]/div[2]/label[1]/span[1]")
    public WebElement moneyhasbeenaddedtoyouraccountSlider;

    @FindBy(xpath = "//body/div[@id='child-app']/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/div[5]/div[2]/label[1]/span[1]")
    public WebElement aNotificationWhenYourAccountHasAnNegativeBalance;

    @FindBy(xpath = "//button[contains(text(),'Done')]")
    public WebElement doneButton;

    //----------------------------------------------------------------

    public void clickDoneButton(){
        doneButton.click();
    }

    public void clickaNotificationWhenYourAccountHasAnNegativeBalance(){
        aNotificationWhenYourAccountHasAnNegativeBalance.click();
    }
    public void clickmoneyhasbeenaddedtoyouraccountSlider(){
        moneyhasbeenaddedtoyouraccountSlider.click();
    }
    public void clickdailyAvailableBalanceNoticeSlider(){
        dailyAvailableBalanceNoticeSlider.click();
    }
    public void clickAccountNotificationsTab(){
        accountNotificatonsTab.click();
    }
    public void clickNotificationTab(){
        notificationTab.click();
    }
    public String getHomeAddress(){
        return homeAddress.getText();
    }
    public void clickAddressInfo(){
        addressInfo.click();
    }

    public String getPhoneNumber(){
        return phoneNumber.getText();
    }

    public void clickContactInfoTab(){
        contactInfoTab.click();
    }

    public String getAccountNumber(){
        return accountNumber.getText();
    }

    public void clickAccountInfoTab(){
        accountInfoTab.click();
    }
    public String getDOB(){
        return DOB.getText();
    }
    public String getRoutingNumber(){
        return routingNumber.getText();
    }
}
