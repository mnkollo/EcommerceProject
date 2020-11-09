package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BrowserUtils;
import utilities.Driver;

public class ProductPage {

    public ProductPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span")
    public WebElement ProductPageAddToCartButton;

    @FindBy(xpath = "//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/span/span")
    public WebElement ProductPageContinueShoppingButton;



    //---------------------------------------------------------------------
    //Popular Tab
    @FindBy(xpath = "//a[@class='homefeatured']")
    public WebElement popularTab;

    @FindBy(xpath = "//*[@id=\"center_column\"]/ul/li/div/div[1]/div/a[1]/img")
    public WebElement productPageImage;

    @FindBy(xpath = "//*[@id=\"center_column\"]/ul/li/div/div[1]/div/a[2]/span")
    public WebElement productPageProductQuickView;

    @FindBy(xpath = "//*[@id=\"add_to_cart\"]/button/span")
    public WebElement productPageProductAddToCartButton;

    @FindBy(xpath = "//*[@id=\"homefeatured\"]/li[1]/div/div[2]/div[2]/a[2]/span")
    public WebElement productPageMoreButton;

    @FindBy(xpath = "//*[@id=\"homefeatured\"]/li[1]/div/div[1]/div/a[1]")
    public WebElement productPageProductLink;

    @FindBy(xpath = "//*[@id=\"homefeatured\"]/li[1]/div/div[1]/div/div[2]/span")
    public WebElement productPagePrice;



//--------------------------------------------------------------------------------
    // Product Page
    @FindBy(xpath = "//*[@id=\"center_column\"]/ul/li/div/div[1]/div/a[1]/img")
    public WebElement productPageFadedShortSleeveTshirts;

    @FindBy(id = "our_price_display")
    public WebElement quickViewPageProductPrice;

    @FindBy(xpath = "//input[@id='quantity_wanted']")
    public WebElement productPageProductQuantity;

    @FindBy(xpath = "//select[@id='group_1']")
    public WebElement productPageProductSizeDropDown;

    @FindBy(xpath = "//*[@id=\"add_to_cart\"]/button/span")
    public WebElement productPageFadedShortSleeveTshirtsAddToCart;

    @FindBy(xpath = "//*[@id=\"center_column\"]/ul/li/div/div[1]/div/div[2]/span")
    public WebElement productPageProductPrice;

    @FindBy(xpath = "//*[@id=\"center_column\"]/ul/li/div/div[2]/div[2]/a[1]/span")
    public WebElement productPageProductAddToCart;

    public String getProductPageProductPrice(){
        BrowserUtils.hover(productPageImage);
        return productPageProductPrice.getText();
    }

    public void productDropdownMenuSizeChart(String size) {
        BrowserUtils.dropdown(productPageProductSizeDropDown, size);
    }

    public void updateQuantityNumber(String num) {
        productPageProductQuantity.clear();
        productPageProductQuantity.sendKeys(num);

    }
    public String getproductPageProductLink() {
        return productPageProductLink.getText();
    }
    public void gotoProductPage() {
        //System.out.println("go to Product Page Faded Short Sleeve Tshirts");
        productPageImage.click();
    }
    public void gotofadedShortSleeveTshirtsQuickView() {
        productPageProductQuickView.click();
    }
    public void HomePageAddToCartButton() {
        productPageProductAddToCartButton.click();
    }

    public void clickonAddToCartOnProductPage(){
        BrowserUtils.hover(productPageImage);
        productPageProductAddToCart.click();
    }
}
