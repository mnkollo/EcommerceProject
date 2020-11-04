package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.*;

public class LoginTest extends TestBase {

    AllPages allPages = new AllPages();

    @Test
    public void logon(){
        allPages.signInPage().login(ConfigurationReader.getProperty("username"), ConfigurationReader.getProperty("password"));
        System.out.println("Actual Welcome Message is: " + allPages.myAccountPage().captureWelcomeMessage());
        System.out.println("Expected Welcome Message is: " + allPages.constantVariables().expectedWelcomeMessage);
        System.out.println("----------------------------------");
        System.out.println("Actual Name on account is: " + allPages.myAccountPage().captureAccountHolderName() );
        System.out.println("Expected Name on account is: " + allPages.constantVariables().expectedLoginName);
        Assert.assertEquals(allPages.myAccountPage().captureWelcomeMessage(),allPages.constantVariables().expectedWelcomeMessage);
        Assert.assertEquals(allPages.myAccountPage().captureAccountHolderName(),allPages.constantVariables().expectedLoginName);
    }
    // Login , Hover over Women tab, Click T-shirt, Select Faded Short Sleeve T-shirts product, Add to Cart, Verify Success Message
    @Test
    public void addToCartSuccessMessage() {
        allPages.signInPage().login(ConfigurationReader.getProperty("username"), ConfigurationReader.getProperty("password"));
        allPages.homePage().goToTshirtsSubsection();
        allPages.homePage().gotoProductPageFadedShortSleeveTshirts();
        allPages.homePage().HomePageAddToCartButton();
        System.out.println("Actual  Success message is: " + allPages.homePage().getProductSuccessfullyAddedToYourShoppingCarttext());
        System.out.println("Expected  Success message is: " + allPages.constantVariables().expectedAddToCartSuccessMessage);
        Assert.assertEquals(allPages.homePage().getProductSuccessfullyAddedToYourShoppingCarttext(), allPages.constantVariables().expectedAddToCartSuccessMessage);
    }

}
