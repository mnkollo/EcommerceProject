package pages.PrestaShopPages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SummerDressesPage {

    public SummerDressesPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
}
