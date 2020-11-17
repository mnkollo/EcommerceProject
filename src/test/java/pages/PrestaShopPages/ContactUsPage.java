package pages.PrestaShopPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utilities.BrowserUtils;
import utilities.Driver;

public class ContactUsPage {

    public ContactUsPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id=\"message\"]")
    public WebElement contactPageEnterMessageText;

    @FindBy(id = "id_contact")
    public WebElement contactPageSubjectHeadingDropdown;

    @FindBy(xpath = "//*[@id=\"email\"]")
    public WebElement contactPageEmailtextbox;

    @FindBy(xpath = "//*[@id=\"center_column\"]/form/fieldset/div[1]/div[1]/div[2]/div/select")
    public WebElement contactPageOrderReferenceDropdown;

    @FindBy(xpath = "//*[@id=\"submitMessage\"]/span")
    public WebElement contactPageSendButton;

    @FindBy(xpath = "/html/body/div/div[2]/div/div[3]/div/p")
    public WebElement contactUsPageSuccessMessage;


    public void contactPageSelectSubjectHeading() {
        WebElement optionsDropdown = contactPageSubjectHeadingDropdown; //Get WebElement
        Select oSelect = new Select(optionsDropdown); //Create object of Select class
        oSelect.selectByValue("1");
    }

    public void contactPageClickONEmailAddress() {
        contactPageEmailtextbox.click();
    }

    public void contactPageEnterTextInTextBox() {
        contactPageEnterMessageText.sendKeys("This is just a test. I really think the product that is being sold on this site is excellent!");
    }

    public void contactPageSelectOrderReference() {
        WebElement optionsDropdown = contactPageOrderReferenceDropdown; //Get WebElement
        Select oSelect = new Select(optionsDropdown); //Create object of Select class
        oSelect.selectByValue("252696");
    }

    public void sendingMessageByClickingSendButton() {
        contactPageSendButton.click();
    }

    public String getContactUsSuccessMessage() {
        BrowserUtils.waitFor(6);
        return contactUsPageSuccessMessage.getText();

    }
}


