package pages.DemoQAPages;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utilities.BrowserUtils;
import utilities.Driver;

public class ElementsFormsPage {

    public ElementsFormsPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id=\"firstName\"]")
    public WebElement firstNameTextBox;

    @FindBy(xpath = "//*[@id=\"lastName\"]")
    public WebElement lastNameTextBox;

    @FindBy(xpath = "//*[@id=\"userEmail\"]")
    public WebElement emailAddressTextBox;

    @FindBy(xpath = "//*[@id=\"genterWrapper\"]/div[2]/div[3]/label")
    public WebElement otherGender;

    @FindBy(css = "#userNumber")
    public WebElement phoneNumberTextBox;

    @FindBy(id = "dateOfBirthInput")
    public WebElement dateOfBirthTextBox;

    @FindBy(xpath = "//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/select")
    public WebElement monthDropDown;

    @FindBy(xpath = "//div[contains(@class,'react-datepicker__day react-datepicker__day--011')]")
    public WebElement dayEleven;

    @FindBy(xpath = "//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/select")
    public WebElement year1990;

    @FindBy(xpath = "//*[@id=\"subjectsContainer\"]/div/div[1]")
    public WebElement subjectTextBox;

    @FindBy(xpath = "//*[@id=\"hobbiesWrapper\"]/div[2]/div[1]/label")
    public WebElement sportRadioButton;

    @FindBy(id = "currentAddress")
    public WebElement homeAddressTextBox;

    @FindBy(xpath = "//div[contains(@class,' css-tlfecz-indicatorContainer')]")
    public WebElement stateDropdown;

    @FindBy(xpath = "//*[@id=\"submit\"]")
    public WebElement submitButton;

    @FindBy(xpath = "//*[@id=\"example-modal-sizes-title-lg\"]")
    public WebElement thanksMessage;

    public String getThanksMessage(){
        return thanksMessage.getText();
    }
    public void clickSubmitButton(){
        submitButton.click();
    }


    public void selectStateFromDropdown(){
        //Select selectState = new Select(stateDropdown);
        //selectState.selectByVisibleText("Haryana");
        stateDropdown.sendKeys("Haryana");
    }

    public void enterCurrentAddressInTextBox(){
        Faker faker = new Faker();
        String address = faker.address().fullAddress();
        homeAddressTextBox.sendKeys(address);
    }

    public void selectSportRadioButton(){
        sportRadioButton.click();
    }
    public void enterSubjectInTextBox(){
        subjectTextBox.sendKeys("English");
    }
    public void EnterBirthDay(){
        dateOfBirthTextBox.click();
        Select selectMonth = new Select (monthDropDown); //Create object of Select class
        selectMonth.selectByValue("2");
        Select selectYear = new Select (year1990);
        selectYear.selectByValue("1990");
        dayEleven.click();
    }

    public void enterPhoneNumberTextBox(){
        Faker faker = new Faker();
        String phoneNumber = faker.phoneNumber().subscriberNumber();
        phoneNumberTextBox.sendKeys("3439843404");
    }
    public void clickOtherGender(){
        otherGender.click();
    }
    public void enterFirstName(){
        Faker faker = new Faker();
        String firstname = faker.name().firstName();
        firstNameTextBox.sendKeys(firstname);
    }
    public void enterLastName(){
        Faker faker = new Faker();
        String lastName = faker.name().lastName();
        lastNameTextBox.sendKeys(lastName);
    }
    public void enterEmailAddress(){
        Faker faker = new Faker();
        emailAddressTextBox.sendKeys(faker.name().firstName() + faker.name().lastName() + "@gmail.com");
    }
}
