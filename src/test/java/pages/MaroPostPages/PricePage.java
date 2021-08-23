package pages.MaroPostPages;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class PricePage {
    public PricePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(linkText = "Pricing")
    public WebElement enterpriseContactUSButton;

    @FindBy(id = "email-6a0c95b7-6ea9-4b5c-87da-c5d2ed6c234c")
    public WebElement pricePageEnterEmail;

    @FindBy(id = "message-6a0c95b7-6ea9-4b5c-87da-c5d2ed6c234c")
    public WebElement pricePageEnterMessage;

    @FindBy(xpath = "//*[@id=\"hsForm_6a0c95b7-6ea9-4b5c-87da-c5d2ed6c234c\"]/div[8]/div/div/div/div/ul/li/label/span")
    public WebElement pricePageIAgreeButton;

    @FindBy(xpath = "//*[@id=\"hsForm_6a0c95b7-6ea9-4b5c-87da-c5d2ed6c234c\"]/div[9]/div[2]/input")
    public WebElement pricePageSubmitButton;

    @FindBy(id = "firstname-6a0c95b7-6ea9-4b5c-87da-c5d2ed6c234c")
    public WebElement pricePageEnterFirstName;

    @FindBy(id = "phone-6a0c95b7-6ea9-4b5c-87da-c5d2ed6c234c")
    public WebElement pricePagePhoneNumber;

    @FindBy(xpath = "firstname-6a0c95b7-6ea9-4b5c-87da-c5d2ed6c234c")
    public WebElement pricePageFirstName;

    @FindBy(xpath = "//*[@id=\"wrapper\"]/div[1]/div[2]/div/h1")
    public WebElement pricePageContactUS;


    public String getPricePageContactUs(){
        return pricePageContactUS.getText();
    }
    public void enterPhoneNumber(){
        Faker faker = new Faker();
        String fakerCellNumber = faker.phoneNumber().cellPhone();
        pricePagePhoneNumber.sendKeys(fakerCellNumber);
    }
    public void enterFirstName(){
        Faker faker = new Faker();
        String fakerFirstName = faker.name().firstName();
        pricePageEnterFirstName.sendKeys(fakerFirstName);
    }

    public void clickEnterpriseContactUsButton(){
        enterpriseContactUSButton.click();
    }
    public void enterPricePageEnterEmail(){
        Faker faker = new Faker();
        String fakerName = faker.name().firstName();
        pricePageEnterEmail.sendKeys(fakerName + "@gmail.com");
    }
    public void pricePageEnterMessage(){
        pricePageEnterMessage.sendKeys("This is just a test. It really does not mean anyting.");
    }
    public void clickPricePageIAgreeButton(){
        pricePageIAgreeButton.click();
    }
    public void pricePageSubmitButton(){
        pricePageSubmitButton.click();
    }
}
