package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.AllPages;
import utilities.BrowserUtils;
import utilities.ConfigurationReader;
import utilities.TestBase;

public class ShoppingCartSummaryTest  extends TestBase {

    AllPages allPages = new AllPages();

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
