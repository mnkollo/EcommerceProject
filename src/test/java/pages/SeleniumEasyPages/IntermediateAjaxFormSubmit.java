package pages.SeleniumEasyPages;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class IntermediateAjaxFormSubmit {
    public IntermediateAjaxFormSubmit() {
        PageFactory.initElements(Driver.getDriver(), this);}


    @FindBy(xpath = "//input[@name='title']")
    public WebElement nameTextBox;

    @FindBy(xpath = "//textarea[@id='description']")
    public WebElement commentTextBox;

    @FindBy(xpath = "//input[@id='btn-submit']")
    public WebElement submitButton;

    @FindBy(xpath = "//*[@id=\"submit-control\"]")
    public WebElement successMessage;

    public void enterTextinNameTextBox(){
        Faker faker = new Faker();
        nameTextBox.sendKeys(faker.name().fullName());
    }
    public void enterTextInCommentTextBox() {
        commentTextBox.sendKeys("This is just a test");
    }
    public void clickSubmitButton(){
        submitButton.click();
    }
    public String getSuccessMessage(){
        return successMessage.getText();
    }

}



