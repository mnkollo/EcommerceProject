package pages.SeleniumEasyPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class EmailVerificationPage {
    public EmailVerificationPage() {
        PageFactory.initElements(Driver.getDriver(), this); }

    @FindBy(xpath = "//a[@style=\"color:#ffffff;text-decoration:none;font-size:21px\"]")
    public WebElement verifyEmailButton;

    public void clickVerifyEmailButton(){
        verifyEmailButton.click();

    }
}
