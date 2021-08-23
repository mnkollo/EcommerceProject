package pages.OpenSisPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class OpenSisLoginPage {
    public OpenSisLoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//*[@id=\"authUser\"]")
    public WebElement username;

    @FindBy(xpath = "//*[@id=\"clearPass\"]")
    public WebElement password;

    @FindBy(xpath = "//*[@id=\"login_form\"]/div[1]/div[1]/div[4]/button")
    public WebElement loginButton;

    @FindBy(xpath = "/html/body/section/div/div/div[2]/div/div/div")
    public WebElement invalidLoginMessage;

    public void login (String name){
        username.sendKeys(name);
        password.sendKeys(name);
        loginButton.click();
    }
    public void enterUsername(String nameOne){
        username.sendKeys(nameOne);
    }
    public void enterPassword(String passwordOne){
        password.sendKeys(passwordOne);
    }
    public void clickOpenSisLoginButton(){
        loginButton.click();
    }
    public String getInvalidLoginMessage(){
        return invalidLoginMessage.getText().toLowerCase();
    }

}