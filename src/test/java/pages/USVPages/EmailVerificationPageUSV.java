package pages.USVPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class EmailVerificationPageUSV {
    public EmailVerificationPageUSV() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
        @FindBy(xpath = "//*[@id=\"verifyWarningSendVerificationButton\"]")
        public WebElement sendVerificationsecond;

        public void clickSendVerificationsecond(){
            sendVerificationsecond.click();
    }
}
