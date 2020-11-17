package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.AllPages;
import utilities.PrestaShopTestBase;

public class PrestaShopProductPageTest extends PrestaShopTestBase {

    AllPages allPages = new AllPages();


    //Verify Product is successfully added to shopping cart
    @Test (priority=1)
    public void ProductPageTest1() {
        //allPages.signInPage().login(ConfigurationReader.getProperty("username"), ConfigurationReader.getProperty("password"));
        allPages.homePage().goToeveningDressesSubsection();
        allPages.productPage().clickonAddToCartOnProductPage();
        System.out.println("Expected  Success message is: " + allPages.constantVariables().expectedAddToCartSuccessMessage);
        Assert.assertEquals(allPages.homePage().getProductSuccessfullyAddedToYourShoppingCarttext(), allPages.constantVariables().expectedAddToCartSuccessMessage);

    }

    //Verify product is in stock
    @Test (priority=0)
    public void ProductPageTest2(){

        allPages.homePage().goToBlousesSubsection();
        allPages.blousesPage().clickBlousesListButton();
        System.out.println("Is this Blouses out of stock or in stock? " +  allPages.blousesPage().getInStockElement() );
        String expectedStockStatus = "In stock";
        Assert.assertEquals(expectedStockStatus,allPages.blousesPage().getInStockElement());
    }

    //Find xpath
    @Test
    public void SummerPageTest1() { //Job interview Question
        allPages.homePage().goToeveningDressesSubsection();
        allPages.homePage().productList2();
        System.out.println(allPages.homePage().productList2());
    }
}
