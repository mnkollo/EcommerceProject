package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class WomenPage {
    public WomenPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
}
