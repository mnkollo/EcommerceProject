package pages.PrestaShopPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BrowserUtils;
import utilities.Driver;

public class EveningDressesPage {

    public EveningDressesPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //Elements on Printed Dress Image
    @FindBy(xpath = "//*[@id=\"center_column\"]/ul/li/div/div[1]/div/a[1]/img")
    public WebElement printedDressImage;

    @FindBy(xpath = "/html/body/div/div[2]/div/div[3]/div[2]/ul/li/div/div[1]/div/a[2]/span")
    public WebElement printedDressQuickView;

    @FindBy(xpath = "/html/body/div/div/div[3]/form/div/div[3]/div[1]/p/button/span")
    public WebElement printedDressAddToCart;

    @FindBy(xpath = "//*[@id=\"center_column\"]/ul/li/div/div[2]/div[2]/a[2]/span")
    public WebElement printedDressMoreButton;

    @FindBy(xpath = "//*[@id=\"color_7\"]")
    public WebElement productBeigeColorOption;

    @FindBy(xpath = "//*[@id=\"color_24\"]")
    public WebElement productPinkColorOption;

    @FindBy(xpath = "//*[@id=\"center_column\"]/ul/li/div/div[3]/div[1]/a")
    public WebElement printedDressAddToWishList;

    @FindBy(xpath = "//*[@id=\"center_column\"]/ul/li/div/div[3]/div[2]/a\n")
    public WebElement printedDressAddToCompare;

    @FindBy(xpath = "//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span\n")
    public WebElement productProceedToCheckOutButton;

    @FindBy(xpath = "//*[@id=\"fancybox-frame1604430840325\"]")
    public WebElement quickViewIframe;

    public void gotoProductpagePrintedDress(){
        printedDressImage.click();
    }
    public void gotoPrintedDressQuickView() {
        BrowserUtils.hover(printedDressImage);
        BrowserUtils.waitForClickablility(printedDressQuickView,3);
        printedDressQuickView.click();
    }
    public void printedDressAddToCartPopup () {
        BrowserUtils.iframe(quickViewIframe);
        printedDressAddToCart.click();
    }
    public void goToCheckOutPage(){
        productProceedToCheckOutButton.click();
    }

}
//------------------------------------------------------------------------------



