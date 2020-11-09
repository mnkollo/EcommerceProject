package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BrowserUtils;
import utilities.Driver;

public class ShoppingCartSummaryPage {
    public ShoppingCartSummaryPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    //Elements on Shopping Cart Summary Page 01.Summary
    @FindBy(xpath = "/html/body/div/div[2]/div/div[3]/div/div[2]/table/tbody/tr/td[2]/small[2]/a")
    public WebElement productDescriptionColorAndSize;

    //Color : Blue, Size : M
    public String productDescriptionColor() {
        BrowserUtils.waitFor(2);
        String colorAndSize = productDescriptionColorAndSize.getText();
        int colorIndex = colorAndSize.indexOf(",");
        String color = colorAndSize.substring(8, colorIndex);
        return color;
    }

    // extract size
    public String productDescriptionSize() {
        BrowserUtils.waitFor(2);
        String colorAndSize = productDescriptionColorAndSize.getText();
        String size = colorAndSize.substring(colorAndSize.length() - 1, colorAndSize.length());
        return size;
    }

    public String totalPrice() {
        return "";

    }

    @FindBy(id = "total_product_price_4_44_387585")
    public WebElement productTotalPrice;

    @FindBy(id = "//*[@id=\"product_4_44_0_387585\"]/td[5]/input[2]")
    public WebElement productTotalQuantity;

    @FindBy(xpath = "/html/body/div/div[2]/div/div[3]/div/div[2]/table/tbody/tr/td[4]/span/span")
    public WebElement productPageUnitPrice;

    @FindBy(id = "total_price")
    public WebElement shoppingCartSummaryPageTotalPrice;

    @FindBy(xpath = "/html/body/div/div[2]/div/div[3]/div/p")
    public WebElement emptyShoppingCartMessage;

    @FindBy(xpath = "/html/body/div/div[2]/div/div[3]/div/div[2]/table/tbody/tr/td[7]/div/a/i")
    public WebElement trashIconInShoppingCart;

    //---------------------------------------------------------------------

    public String getSummaryCartPageUnitPrice() {
       return productPageUnitPrice.getText();
    }
    public String getshoppingCartSummaryPageTotalPrice() {
        return shoppingCartSummaryPageTotalPrice.getText();
    }
    public String getEmptyShoppingCartMessage() {
        BrowserUtils.waitFor(5);
        return emptyShoppingCartMessage.getText();
    }
    public void clickTrashIconToDeleteItem(){
        trashIconInShoppingCart.click();
    }


}
