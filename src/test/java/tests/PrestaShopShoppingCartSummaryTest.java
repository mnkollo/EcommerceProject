package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.AllPages;
import utilities.BrowserUtils;
import utilities.ConfigurationReader;
import utilities.PrestaShopTestBase;

public class PrestaShopShoppingCartSummaryTest extends PrestaShopTestBase {

    AllPages allPages = new AllPages();


    @Test
    public void ShoppingCartSummaryTest1() {
        //allPages.signInPage().login(ConfigurationReader.getProperty("username"), ConfigurationReader.getProperty("password"));
        allPages.homePage().goToTshirtsSubsection();
        allPages.productPage().gotoProductPage();
        String unitPrice = allPages.productPage().getProductPageProductPrice();
        String selectedColor = "blue";
        String selectedSize = "M";
        String selectedQuantity = "2";

        allPages.productPage().updateQuantityNumber(selectedQuantity);

        allPages.productPopUpQuickViewElements().SelectProductColor(selectedColor);
        allPages.productPage().productDropdownMenuSizeChart("2");
        allPages.productPage().HomePageAddToCartButton();
        BrowserUtils.waitFor(4);
        allPages.homePage().clickProceedToCheckOut();
        String totalPrice = allPages.shoppingCartSummaryPage().getshoppingCartSummaryPageTotalPrice();

        System.out.println("Expected Result of color is: " + allPages.shoppingCartSummaryPage().productDescriptionColor());
        Assert.assertEquals(selectedColor, allPages.shoppingCartSummaryPage().productDescriptionColor().toLowerCase());

        System.out.println("Expected Result of size is: " + allPages.shoppingCartSummaryPage().productDescriptionSize());
        Assert.assertEquals(selectedSize, allPages.shoppingCartSummaryPage().productDescriptionSize());

        Assert.assertEquals(unitPrice, allPages.shoppingCartSummaryPage().getSummaryCartPageUnitPrice());
        String unitPriceWithoutDollarSign = unitPrice.replace("$", "");
        double calculateTotalPrice = Double.parseDouble(unitPriceWithoutDollarSign);
        System.out.println("Expected Result of Shopping Cart Summary Page Total Price: " + totalPrice);
        double callTotalPrice = calculateTotalPrice * 2 + 2;
        System.out.println("Expected Result of Calculated Total Price: " + callTotalPrice);
        Assert.assertEquals("$" + callTotalPrice, totalPrice);

        //TODO remove the product form the cart - verify "Your shopping cart is empty."


    }


    //TODO update: Add assertion
    @Test
    public void ShoppingCartSummaryTest2() {
        allPages.signInPage().login(ConfigurationReader.getProperty("username"), ConfigurationReader.getProperty("password"));
        allPages.homePage().goToTshirtsSubsection();
        allPages.productPage().gotoProductPage();
        String unitPrice = allPages.productPage().getProductPageProductPrice();
        allPages.productPage().HomePageAddToCartButton();
        BrowserUtils.waitFor(4);
        allPages.homePage().clickProceedToCheckOut();

    }

    @Test
    public void ShoppingCartSummaryTest3() {
        allPages.signInPage().login(ConfigurationReader.getProperty("username"), ConfigurationReader.getProperty("password"));
        allPages.homePage().goToTshirtsSubsection();
        allPages.productPage().gotoProductPage();
        allPages.productPage().HomePageAddToCartButton();
        allPages.homePage().getProductSuccessfullyAddedToYourShoppingCarttext();
        allPages.homePage().clickProceedToCheckOut();
        allPages.homePage().removeitemfromdropdownshoppingcart();
        allPages.shoppingCartSummaryPage().getEmptyShoppingCartMessage();
        String shoppingCartStatus = "Your shopping cart is empty.";
        System.out.println("Actual Results of Shopping Cart Message is: " + allPages.shoppingCartSummaryPage().getEmptyShoppingCartMessage());
        System.out.println("Expected Results of Shopping Cart Message is: " + shoppingCartStatus);
        Assert.assertEquals(allPages.shoppingCartSummaryPage().getEmptyShoppingCartMessage(),shoppingCartStatus);

        //Hit (X) when using Cart dropdown in upper right corner
    }

    @Test
    public void ShoppingCartSummaryTest4() {
        allPages.signInPage().login(ConfigurationReader.getProperty("username"), ConfigurationReader.getProperty("password"));
        allPages.homePage().goToTshirtsSubsection();
        allPages.productPage().gotoProductPage();
        allPages.productPage().HomePageAddToCartButton();
        allPages.homePage().getProductSuccessfullyAddedToYourShoppingCarttext();
        allPages.homePage().clickProceedToCheckOut();
        allPages.shoppingCartSummaryPage().clickTrashIconToDeleteItem();
        allPages.shoppingCartSummaryPage().getEmptyShoppingCartMessage();
        String shoppingCartStatus = "Your shopping cart is empty.";
        System.out.println("Actual Results of Shopping Cart Message is: " + allPages.shoppingCartSummaryPage().getEmptyShoppingCartMessage());
        System.out.println("Expected Results of Shopping Cart Message is: " + shoppingCartStatus);
        Assert.assertEquals(shoppingCartStatus, allPages.shoppingCartSummaryPage().getEmptyShoppingCartMessage());
    }
}