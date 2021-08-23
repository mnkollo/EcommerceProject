package pages.DemoQAPages;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ElementsTextBoxPages {

    public ElementsTextBoxPages() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "item-0")
    public WebElement textBox;

    @FindBy(id = "userName")
    public WebElement fullName;

    @FindBy(id = "userEmail")
    public WebElement emailAddress;

    @FindBy(xpath = "//*[@id=\"currentAddress\"]")
    public WebElement currentAddressOne;

    @FindBy(id = "permanentAddress")
    public WebElement permanentAddressOne;

    @FindBy(id = "submit")
    public WebElement submitButton;

    //---------------------------------------------Methods Below--------------------------------------------------------

    public void clickTextBox(){
        textBox.click();
    }
    public void enterFullName(){
        Faker faker = new Faker();
        String fullname = faker.name().fullName();
        fullName.sendKeys(fullname);
    }
    public void enterEmail(){
        Faker faker = new Faker();
        String firstName = faker.name().firstName();
        String lastName = faker.name().lastName();
        String email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@gmail.com";
        emailAddress.sendKeys(email);
    }
    public void enterCurrentAddress(){
        Faker faker = new Faker();
        String currentAddress = faker.address().fullAddress();
        currentAddressOne.sendKeys(currentAddress);
    }
    public void enterPermanentAddress(){
        Faker faker = new Faker();
        String permanentAddress = faker.address().fullAddress();
        permanentAddressOne.sendKeys(permanentAddress);
    }
    public void clickSubmitButton(){
        submitButton.click();
    }
}
