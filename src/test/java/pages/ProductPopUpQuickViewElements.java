package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ProductPopUpQuickViewElements {
    public ProductPopUpQuickViewElements(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //Elements on Product Quick Review Popup page

    @FindBy(xpath = "//*[@id=\"center_column\"]/ul/li/div/div[1]/div/a[2]")
    public WebElement productQuickReviewLink;

    public void gotoProductPopUpQuickReviewPage(){
        productQuickReviewLink.click();

    }
    //Elements on Product Quick Review Popup page

    @FindBy(id = "color_7")
    public WebElement productColorBeige;

    @FindBy(id = "color_24")
    public WebElement productColorPink;

    @FindBy(id = "color_13")
    public WebElement productColorOrange;

    @FindBy(id = "color_14")
    public WebElement productColorBlue;

    public void SelectProductColor(String color){
        switch (color){
            case "beige":
                productColorBeige.click();
                break;
            case "pink":
                productColorPink.click();
                break;
            case "blue":
                productColorBlue.click();
                break;
            case "orange":
                productColorOrange.click();
                break;

            }
        }



}
