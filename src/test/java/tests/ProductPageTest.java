package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.AllPages;
import utilities.ConfigurationReader;
import utilities.TestBase;

public class ProductPageTest extends TestBase {

    AllPages allPages = new AllPages();

    @Test (priority=1)
    public void ProductPageTest1() {
        allPages.signInPage().login(ConfigurationReader.getProperty("username"), ConfigurationReader.getProperty("password"));
        allPages.homePage().goToeveningDressesSubsection();
        allPages.productPage().clickonAddToCartOnProductPage();
        System.out.println("Expected  Success message is: " + allPages.constantVariables().expectedAddToCartSuccessMessage);
        Assert.assertEquals(allPages.homePage().getProductSuccessfullyAddedToYourShoppingCarttext(), allPages.constantVariables().expectedAddToCartSuccessMessage);

    }
    @Test (priority=0)
    public void ProductPageTest2(){

        allPages.homePage().goToBlousesSubsection();
        allPages.blousesPage().clickBlousesListButton();
        System.out.println("Is this Blouses in stock? " +  allPages.blousesPage().getInStockElement() );
        String expectedStockStatus = "In stock";
        Assert.assertEquals(expectedStockStatus,allPages.blousesPage().getInStockElement());
    }
}
