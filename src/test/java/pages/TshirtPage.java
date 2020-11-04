package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TshirtPage {

    public TshirtPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
}
