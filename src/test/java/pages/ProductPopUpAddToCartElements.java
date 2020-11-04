package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import static utilities.BrowserUtils.waitFor;
import static utilities.BrowserUtils.waitForVisibility;

public class ProductPopUpAddToCartElements {
    public ProductPopUpAddToCartElements(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //Elements on Evening Dresses Products (PopUp AddToCart page)

    @FindBy(xpath = "//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span")
    public WebElement eveningDressesAddToCartButton;

    @FindBy(xpath = "//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/span/span")
    public WebElement eveningDressesContinueShoppingButton;

}

