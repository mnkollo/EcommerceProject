package pages.PrestaShopPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BrowserUtils;
import utilities.Driver;

public class SignInPage {
    public SignInPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")
    public WebElement logInButton;

    @FindBy(xpath = "//input[@id='email']")
    public WebElement emailIdField;

    @FindBy(xpath = "//*[@id=\"passwd\"]")
    public WebElement passwordField;

    @FindBy(xpath = "//*[@id=\"SubmitLogin\"]/span")
    public WebElement signInButton;

    @FindBy(xpath = "//*[@id=\"login_form\"]/div/p[1]/a")
    public WebElement forgotPasswordButton;

    @FindBy(xpath = "//*[@id=\"SubmitCreate\"]/span")
    public WebElement createanAccountButton;

    @FindBy(xpath = "//*[@id=\"email_create\"]")
    public WebElement emailFieldtoCreateaccount;

    @FindBy(xpath = "//*[@id=\"columns\"]/div[1]/a/i")
    public WebElement returnToHomeButton;

    @FindBy(xpath = "//*[@id=\"search_query_top\"]")
    public WebElement searchField;

    @FindBy(id = "search_query_top")
    public WebElement searchButton;

    @FindBy(xpath = "//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a/b")
    public WebElement shoppingCartButton;

    @FindBy(className = "logo img-responsive")
    public WebElement myStoreLogo;

    @FindBy(className = "img-responsive")
    public WebElement headerImage;

    @FindBy(linkText = "Contact us")
    public WebElement contactUsTab;

    @FindBy(xpath = "//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")
    public WebElement signInTab;

    @FindBy(linkText = "Women")
    public WebElement womenTab;

    @FindBy(linkText = "Dresses")
    public WebElement dressesTab;

    @FindBy(linkText = "T-shirts")
    public WebElement tshirtTab;



    public void login (String uid, String pwd){
        logInButton.click();
        BrowserUtils.waitForClickablility(emailIdField,3);
        emailIdField.sendKeys(uid);
        passwordField.sendKeys(pwd);
        BrowserUtils.waitForClickablility(signInButton,3);
        signInButton.click();
    }
}


