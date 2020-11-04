package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class CasualDressesPage {

    public CasualDressesPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
}
