package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BrowserUtils;
import utilities.Driver;

import java.util.List;

import static utilities.BrowserUtils.*;

public class HomePage {
    public HomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    // Main Tabs
    @FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[1]/a")
    public WebElement womenTab;

    @FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[2]/a")
    public WebElement dressesTab;

    @FindBy(xpath = "(//a[@title='T-shirts'])[2]")
    public WebElement tshirtTab;

    public void goToWomenTab(){
        womenTab.click();
    }
    public void goToDressesTab() {
        dressesTab.click();
    }
    public void goToTshirtsTab() {
        tshirtTab.click();
    }

    //--------------------------------------------------------------------

    // Sub-sections under Tabs
    @FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[1]/ul/li[1]/ul/li[1]/a")
    public WebElement tshirtSubsection;

    @FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[1]/ul/li[1]/ul/li[2]/a")
    public WebElement blousesSubsection;

    @FindBy(xpath = "//a[@title='Casual Dresses']")
    public WebElement casualDressesSubsection;
    //*[@id="block_top_menu"]/ul/li[1]/ul/li[2]/ul/li[1]/a

    @FindBy(xpath= "/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[1]/ul/li[2]/ul/li[2]/a")
    public WebElement eveningDressesSubsection;

    @FindBy(xpath = "(//a[@title='Summer Dresses'])[2]")
    public WebElement summerDressesSubsection;

    @FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[2]/ul/li[1]/a")
    public WebElement dressesTabCasualDressessSubLink;

    @FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[2]/ul/li[2]/a")
    public WebElement dressesTabEveningDressessSubLink;

    @FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[2]/ul/li[3]/a")
    public WebElement dressesTabSummerDressessSubLink;



    public void goToTshirtsSubsection() {
        BrowserUtils.hover(womenTab);
        //BrowserUtils.waitForClickablility(tshirtSubsection,5);
        tshirtSubsection.click();
    }
    public void goToBlousesSubsection() {
        BrowserUtils.hover(womenTab);
        BrowserUtils.waitFor(2);
        blousesSubsection.click();
    }
    public void goTocasualDressesSubsection() {
        BrowserUtils.hover(womenTab);
        casualDressesSubsection.click();
    }
    public void goToeveningDressesSubsection() {
        BrowserUtils.hover(womenTab);
        BrowserUtils.waitFor(3);
        eveningDressesSubsection.click();
    }
    public void goTosummerDressesSubsection() {
        BrowserUtils.hover(womenTab);
        summerDressesSubsection.click();
    }

    //--------------------------------------------------------------------------
    // header Tabs
    @FindBy(xpath = "//a[@title='Contact Us']")
    public WebElement contactUsheader;

    @FindBy(xpath = "//a[@title='Log in to your customer account']")
    public WebElement signInHeader;

    public void goToContactUsPage() {
        contactUsheader.click();
    }
    public void goToSignInPage() {
        signInHeader.click();
    }

//-----------------------------------------------------------------------------
    // Product Quick Review Page
    @FindBy(xpath = "//*[@id=\"center_column\"]/ul/li/div/div[1]/div/a[2]/span")
    public WebElement productQuickViewLink;

    @FindBy(xpath = "//*[@id=\"quantity_wanted\"]")
    public WebElement productQuickViewQuantity;

    @FindBy(xpath = "//*[@id=\"group_1\"]")
    public WebElement productQuickViewSize;

    // TODO: Move QuickView Colors to HomePage and Switch Statement
    @FindBy(xpath = "//*[@id=\"color_13\"]")
    public WebElement productQuickViewOrangeColor;

    @FindBy(xpath = "//*[@id=\"color_14\"]")
    public WebElement productQuickViewBlueColor;

    @FindBy(xpath = "//*[@id=\"add_to_cart\"]/button/span")
    public WebElement productQuickViewAddToCart;

    //-----------------------------------------------------------------------------------------
    // ShoppingCart Popup
    @FindBy(css = "#layer_cart > div.clearfix > div.layer_cart_product.col-xs-12.col-md-6 > h2")
    public WebElement productSuccessfullyAddedToYourShoppingCarttext;

    @FindBy(xpath = "/html/body/div/div[1]/header/div[3]/div/div/div[4]/div[1]/div[2]/div[4]/a")
    public WebElement proceedToCheckOut;

    public String getProductSuccessfullyAddedToYourShoppingCarttext() {
        //        waitForVisibility(productSuccessfullyAddedToYourShoppingCarttext, 7);
        waitFor(10);
        return productSuccessfullyAddedToYourShoppingCarttext.getText();
    }
    public void productQuickViewAddToCartButton(){
        productQuickViewAddToCart.click();
    }
    public void clickProceedToCheckOut(){
        proceedToCheckOut.click();
    }

    //Click on Product Quick View Popup
    public void goToProductQuickViewPopup() {
        productQuickViewLink.click();
    }
    public void productQuickViewInsertQuantity(String count) {
        productQuickViewQuantity.clear();
        productQuickViewQuantity.sendKeys(count);
    }
    public void productQuickViewSelectSize(String size){
        BrowserUtils.dropdown(productQuickViewSize, size);
    }

    //TODO create another page called Product Details Page (assuming if you select any product locators will be the same)
//    public void gotoFadedShortSleeveTshirtsQuickViewOrangeColor() {
//        FadedShortSleeveTshirtsQuickViewOrangeColor.click();
//    }
//    public void gotoFadedShortSleeveTshirtsQuickViewBlueColor() {
//        FadedShortSleeveTshirtsQuickViewBlueColor.click();
//    }
//    public void gotoFadedShortSleeveTshirtsQuickViewAddToCart() {
//        FadedShortSleeveTshirtsQuickViewAddToCart.click();
//    }
//------------------------------------------------------------------------------
    //Cart Dropdown Elements
    @FindBy(css = "#header > div:nth-child(3) > div > div > div:nth-child(3) > div > a")
    public WebElement cartdropdown;

    @FindBy(xpath = "//*[@id=\"header\"]/div[3]/div/div/div[3]/div/div/div/div/dl/dt[1]/span/a")
    public WebElement itemInShoppingCartdropdown;

    @FindBy(xpath = "//*[@id=\"header_logo\"]/a/img")
    public WebElement headerLogoButton;





    public void removeitemfromdropdownshoppingcart(){
        BrowserUtils.hover(cartdropdown);
        itemInShoppingCartdropdown.click();
    }
    public List <String> productList(){
        return  getElementsText(By.xpath("//a[@class='product-name']"));
    }
    public List <String> productPrice(){
        return  getElementsText(By.xpath("//span[@class='price product-price']"));
    }
    public void clickOnHeaderLogoButton(){
        headerLogoButton.click();
    }
}

