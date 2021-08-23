package tests.Maropost;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MaroPostPages.MaroPostHomePage;
import pages.MaroPostPages.PricePage;
import utilities.BrowserUtils;
import utilities.MaroPostTestBase;

public class OptInFormTest extends MaroPostTestBase {

    MaroPostHomePage maroPostHomePage = new MaroPostHomePage();
    PricePage pricePage = new PricePage();

    @Test
    public void OptInFormSuccess() {
        String successMessage = "thanks for contacting us!";
        String name = "Mike";
        String number = "8174324593";
        maroPostHomePage.enterTextInEmailTextBox();
        BrowserUtils.waitFor(2);
        maroPostHomePage.enterphoneNumberTextBox(number);
        maroPostHomePage.enterMessageInTextBox();
        maroPostHomePage.clickAgreeToRecieve();
        maroPostHomePage.enterFirstName(name);
        maroPostHomePage.clickSubmitButton();
        maroPostHomePage.getThanksForContactingUsMessage();
        Assert.assertEquals(maroPostHomePage.getThanksForContactingUsMessage(), successMessage);
        BrowserUtils.waitFor(5);
    }

    @Test
    public void OptInFormInvalidPhoneNumber() {
        String successMessage = "thanks for contacting us!";
        String name = "Mike";
        String number = "testone";
        String errorMessage = "Must contain only numbers, +()-. and x.";
        maroPostHomePage.enterTextInEmailTextBox();
        BrowserUtils.waitFor(2);
        maroPostHomePage.enterphoneNumberTextBox(number);
        maroPostHomePage.enterMessageInTextBox();
        maroPostHomePage.clickAgreeToRecieve();
        maroPostHomePage.enterFirstName(name);
        maroPostHomePage.getErrorMessage();
        Assert.assertEquals(maroPostHomePage.getErrorMessage(), errorMessage);

    }

    @Test
    public void OptInFormSucces() {
        String successMessage = "thanks for contacting us!";
        String name = "Mike";
        String number = "8174324593";
        String contactUsMessage = "Thanks for Contacting Us!";
        maroPostHomePage.enterTextInEmailTextBox();
        BrowserUtils.waitFor(2);
        maroPostHomePage.enterphoneNumberTextBox(number);
        maroPostHomePage.enterMessageInTextBox();
        maroPostHomePage.clickAgreeToRecieve();
        maroPostHomePage.enterFirstName(name);
        maroPostHomePage.clickSubmitButton();
        maroPostHomePage.getThanksForContactingUsMessage();
        BrowserUtils.waitFor(2);
        maroPostHomePage.clickPriceTab();
        pricePage.enterPricePageEnterEmail();
        pricePage.enterPhoneNumber();
        pricePage.enterFirstName();
        pricePage.pricePageEnterMessage();
        pricePage.clickPricePageIAgreeButton();
        BrowserUtils.waitFor(2);
        pricePage.pricePageSubmitButton();
        pricePage.getPricePageContactUs();
        Assert.assertEquals(pricePage.getPricePageContactUs(),contactUsMessage);
    }
}
