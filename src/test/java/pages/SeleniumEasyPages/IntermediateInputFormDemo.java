package pages.SeleniumEasyPages;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utilities.BrowserUtils;
import utilities.Driver;

public class IntermediateInputFormDemo {
    public IntermediateInputFormDemo() {
        PageFactory.initElements(Driver.getDriver(), this); }

    @FindBy(xpath = "//input[@name='first_name']")
    public WebElement firstNameTextBox;

    @FindBy(xpath = "//input[@name='last_name']")
    public WebElement lastNameTextBox;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement emailTextBox;

    @FindBy(xpath = "//input[@name='phone']")
    public WebElement phoneTextBox;

    @FindBy(xpath = "//input[@name='address']")
    public WebElement addressTextBox;

    @FindBy(xpath = "//input[@name='city']")
    public WebElement cityTextBox;

    @FindBy(xpath = "//select[@name='state']")
    public WebElement stateDropdown;

    @FindBy(xpath = "//input[@name='zip']")
    public WebElement zipcodeTextBox;

    @FindBy(xpath = " //input[@name='website']")
    public WebElement websiteDomainTextBox;

    @FindBy(xpath = "//input[@name='hosting']")
    public WebElement yesHostingRadioButton;

    @FindBy(xpath = "//textarea[@class='form-control']")
    public WebElement projectDescriptionEnterText;

    @FindBy(xpath = "//*[@id=\"contact_form\"]/fieldset/div[13]/div/button")
    public WebElement sendButton;



    public void inputDataInFirstNameTextBox(){
        Faker faker = new Faker();
        firstNameTextBox.sendKeys(faker.name().firstName());
    }
    public void inputDataInLastNameTextBox(){
        Faker faker = new Faker();
        lastNameTextBox.sendKeys(faker.name().lastName());
    }
    public  void inputDataInEmailTextBox(){
        Faker faker = new Faker();
        emailTextBox.sendKeys(faker.name().firstName() +" "+ faker.name().lastName()+ "@gmail.com");
    }
    public void inputDataInPhoneNumberTextBox(){
        Faker faker = new Faker();
        phoneTextBox.sendKeys(faker.phoneNumber().cellPhone());
    }
    public void inputDataInaddressTextBox(){
        Faker faker = new Faker();
        addressTextBox.sendKeys(faker.address().fullAddress());
    }
    public void inputDataInCityTextBox(){
        Faker faker = new Faker();
        cityTextBox.sendKeys(faker.address().city());
    }
    //public void pickStateDropdown(){
        //BrowserUtils.dropdown(stateDropdown,"Texas");
    //}
    public void pickStateDropdown2() {
         //Get WebElement
        Select oSelect = new Select(stateDropdown); //Create object of Select class
        oSelect.selectByVisibleText("Texas");
    }
    public void inputDataInZipCodeTextBox(){
        Faker faker = new Faker();
        zipcodeTextBox.sendKeys(faker.address().zipCode());
    }
    public void inputDataInWebsiteTextBox(){
        Faker faker = new Faker();
        websiteDomainTextBox.sendKeys(faker.name().username()+".com");
    }
    public void clickYesHostingRadioButton(){
        yesHostingRadioButton.click();
    }
    public void enterTextInProjectDescriptionEnterText(){
        projectDescriptionEnterText.sendKeys("This is just a test");
    }
    public void clicksendButton(){
        sendButton.click();
    }

}
