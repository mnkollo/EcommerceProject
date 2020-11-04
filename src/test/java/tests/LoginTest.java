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
    @Test
    public void ShoppingCartSummaryTest1() {
        allPages.signInPage().login(ConfigurationReader.getProperty("username"), ConfigurationReader.getProperty("password"));
        allPages.homePage().goToeveningDressesSubsection();
        allPages.eveningDressesPage().gotoPrintedDressQuickView();
        //TODO Update Color and Size
//        allPages.eveningDressesPage().printedDressAddToCartPopup();
//        allPages.eveningDressesPage().goToCheckOutPage();
//        allPages.shoppingCartSummaryPage().productDescriptionColor();
    }
    @Test
    public void ShoppingCartSummaryTest2() {
        allPages.signInPage().login(ConfigurationReader.getProperty("username"), ConfigurationReader.getProperty("password"));
        allPages.homePage().goToTshirtsSubsection();
        allPages.homePage().gotoProductPageFadedShortSleeveTshirts();
        String unitPrice = allPages.homePage().getFadedShortSleeveTshirtsPrice();
        String selectedColor = "blue";
        String selectedSize = "M";
        String selectedQuantity = "2";

        allPages.homePage().updateQuantityNumber(selectedQuantity);

        allPages.productPopUpQuickViewElements().SelectProductColor(selectedColor);
        allPages.homePage().productDropdownMenuSizeChart("2");
        allPages.homePage().HomePageAddToCartButton();
        BrowserUtils.waitFor(4);
        allPages.homePage().clickProceedToCheckOut();
        String totalPrice = allPages.shoppingCartSummaryPage().getshoppingCartSummaryPageTotalPrice();

        System.out.println("Expected Result of color is: " +  allPages.shoppingCartSummaryPage().productDescriptionColor());
        Assert.assertEquals(selectedColor, allPages.shoppingCartSummaryPage().productDescriptionColor().toLowerCase());

        System.out.println("Expected Result of size is: " +  allPages.shoppingCartSummaryPage().productDescriptionSize());
        Assert.assertEquals(selectedSize, allPages.shoppingCartSummaryPage().productDescriptionSize());

        Assert.assertEquals(unitPrice, allPages.shoppingCartSummaryPage().getSummaryCartPageUnitPrice());
        String unitPriceWithoutDollarSign = unitPrice.replace("$","");
        double calculateTotalPrice = Double.parseDouble(unitPriceWithoutDollarSign);
        System.out.println("Expected Result of Shopping Cart Summary Page Total Price: " + totalPrice);
        double callTotalPrice = calculateTotalPrice*2+2;
        System.out.println("Expected Result of Calculated Total Price: " + callTotalPrice);
        Assert.assertEquals("$" +callTotalPrice, totalPrice);






    }
}
