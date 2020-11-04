package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BrowserUtils;
import utilities.Driver;

import static utilities.BrowserUtils.waitFor;
import static utilities.BrowserUtils.waitForVisibility;

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

    public void goToTshirtsSubsection() {
        BrowserUtils.hover(womenTab);
        BrowserUtils.waitForClickablility(tshirtSubsection,5);
        tshirtSubsection.click();
    }
    public void goToBlousesSubsection() {
        BrowserUtils.hover(womenTab);
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

    //Popular Tab
    @FindBy(xpath = "//a[@class='homefeatured']")
    public WebElement popularTab;

    @FindBy(xpath = "//*[@id=\"center_column\"]/ul/li/div/div[1]/div/a[1]/img")
    public WebElement fadedShortSleeveTshirtsImage;

    @FindBy(xpath = "//*[@id=\"center_column\"]/ul/li/div/div[1]/div/a[2]/span")
    public WebElement fadedShortSleeveTshirtsQuickView;

    @FindBy(xpath = "//*[@id=\"add_to_cart\"]/button/span")
    public WebElement fadedShortSleeveTshirtsAddToCartButton;

    @FindBy(xpath = "//*[@id=\"homefeatured\"]/li[1]/div/div[2]/div[2]/a[2]/span")
    public WebElement fadedShortSleeveTshirtsMoreButton;

    @FindBy(xpath = "//*[@id=\"homefeatured\"]/li[1]/div/div[1]/div/a[1]")
    public WebElement fadedShortSleeveTshirtsLink;

    @FindBy(xpath = "//*[@id=\"homefeatured\"]/li[1]/div/div[1]/div/div[2]/span")
    public WebElement fadedShortSleeveTshirtsPrice;


    // Product Page
    @FindBy(xpath = "//*[@id=\"center_column\"]/ul/li/div/div[1]/div/a[1]/img")
    public WebElement productPageFadedShortSleeveTshirts;

    @FindBy(id = "our_price_display")
    public WebElement productPageFadedShortSleeveTshirtsPrice;

    @FindBy(xpath = "//input[@id='quantity_wanted']")
    public WebElement productPageFadedShortSleeveTshirtsQuantity;

    @FindBy(xpath = "//select[@id='group_1']")
    public WebElement productPageFadedShortSleeveTshirtsSizeDropDown;


    @FindBy(xpath = "//*[@id=\"add_to_cart\"]/button/span")
    public WebElement productPageFadedShortSleeveTshirtsAddToCart;

    @FindBy(xpath = "//*[@id=\"center_column\"]/ul/li/div/div[1]/div/div[2]/span")
    public WebElement productPageProductPrice;



    //-----------------------------------------------------------

public String getProductPageProductPrice(){
    return productPageProductPrice.getText();
}

    public void productDropdownMenuSizeChart(String size) {
        BrowserUtils.dropdown(productPageFadedShortSleeveTshirtsSizeDropDown, size);
    }

    public void updateQuantityNumber(String num) {
       productPageFadedShortSleeveTshirtsQuantity.clear();
       productPageFadedShortSleeveTshirtsQuantity.sendKeys(num);
    }

    public String getFadedShortSleeveTshirtsPrice() {
        return productPageFadedShortSleeveTshirtsPrice.getText();
    }
    public String getfadedShortSleeveTshirtsLink() {
        return fadedShortSleeveTshirtsLink.getText();
    }
    public void gotoProductPageFadedShortSleeveTshirts() {
        System.out.println("go to Product Page Faded Short Sleeve Tshirts");
        fadedShortSleeveTshirtsImage.click();
    }
    public void gotofadedShortSleeveTshirtsQuickView() {
        fadedShortSleeveTshirtsQuickView.click();
    }
    public void HomePageAddToCartButton() {
        fadedShortSleeveTshirtsAddToCartButton.click();
    }

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

}

