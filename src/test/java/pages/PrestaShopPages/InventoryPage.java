package pages.PrestaShopPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class InventoryPage {
    public InventoryPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    // This page is designated for all products (it can be one or multiple products on page)

    @FindBy(xpath = "/html/body/div/div[2]/div/div[3]/div[2]/ul/li[1]/div/div[2]/h5/a")
    public WebElement inventoryPageProductName;

    public String getInventoryPageProductName (){
        return inventoryPageProductName.getText();
    }
}




