package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.*;

import java.util.ArrayList;
import java.util.List;

public class PrestaShopLoginTest extends PrestaShopTestBase {

    AllPages allPages = new AllPages();

    //Successfully Log into account with email and password
    @Test
    public void logon() {
        //login();
        //allPages.signInPage().login(ConfigurationReader.getProperty("username"), ConfigurationReader.getProperty("password"));
        System.out.println("Actual Welcome Message is: " + allPages.myAccountPage().captureWelcomeMessage());
        System.out.println("Expected Welcome Message is: " + allPages.constantVariables().expectedWelcomeMessage);
        System.out.println("----------------------------------");
        System.out.println("Actual Name on account is: " + allPages.myAccountPage().captureAccountHolderName());
        System.out.println("Expected Name on account is: " + allPages.constantVariables().expectedLoginName);
        Assert.assertEquals(allPages.myAccountPage().captureWelcomeMessage(), allPages.constantVariables().expectedWelcomeMessage);
        Assert.assertEquals(allPages.myAccountPage().captureAccountHolderName(), allPages.constantVariables().expectedLoginName);
    }

    //Successfully add a product to Cart
    @Test
    public void addToCartSuccessMessage() {
        //allPages.signInPage().login(ConfigurationReader.getProperty("username"), ConfigurationReader.getProperty("password"));
        allPages.homePage().goToTshirtsSubsection();
        allPages.productPage().gotoProductPage();
        allPages.productPage().HomePageAddToCartButton();
        System.out.println("Actual  Success message is: " + allPages.homePage().getProductSuccessfullyAddedToYourShoppingCarttext());
        System.out.println("Expected  Success message is: " + allPages.constantVariables().expectedAddToCartSuccessMessage);
        Assert.assertEquals(allPages.homePage().getProductSuccessfullyAddedToYourShoppingCarttext(), allPages.constantVariables().expectedAddToCartSuccessMessage);
    }

    //Name of Products on home page test
    @Test
    public void productListTest1() {
        allPages.homePage().clickOnHeaderLogoButton();
        //allPages.homePage().goToWomenTab();
        System.out.println("Name of products: " + allPages.homePage().productList());
    }

    //Prices of products on home page test
    @Test
    public void productPriceTest1() {
        allPages.homePage().clickOnHeaderLogoButton();
        System.out.println("Products Price: " + allPages.homePage().productPrice());
    }

    //Lowest Priced Product on Home page
    @Test
    public void productPriceTest2() { //Job interview Question
        allPages.homePage().clickOnHeaderLogoButton();
        String item = "Printed Chiffon Dress";
        List<String> ProductList = allPages.homePage().productList();
        List<String> ProductPrice = allPages.homePage().productPrice();
        for (int i = 0; i < ProductList.size(); i++) {   //multiple string use size, single string use length
            if (ProductList.get(i).equals(item)) {
                System.out.println(item + " price is " + ProductPrice.get(i));
                break;
            }
        }
    }

    //Print all prices of the products that start with word "Printed" on the Home page
    @Test
    public void productPriceTest3() { //Job interview Question
        allPages.homePage().clickOnHeaderLogoButton();
        String item = "Printed";
        List<String> ProductList = allPages.homePage().productList();
        List<String> ProductPrice = allPages.homePage().productPrice();
        for (int i = 0; i < ProductList.size(); i++) {   //multiple string use size, single string use length
            if (ProductList.get(i).contains(item)) {
                System.out.println(item + " price is " + ProductPrice.get(i));
            }
        }
    }

    // Select cheapest product with "Printed" in title
    @Test
    public void productPriceTest4() { //Job interview Question
        allPages.homePage().clickOnHeaderLogoButton();
        String item = "Printed";
        List<String> ProductList = allPages.homePage().productList(); // 7 items
        List<String> printedProductList = new ArrayList<>();
        List<Double> printedProductPrice = new ArrayList<>();
        List<String> productPrice = allPages.homePage().productPrice();
        for (int i = 0; i < ProductList.size(); i++) {   //multiple string use size, single string use length
            if (ProductList.get(i).contains(item)) {
                printedProductList.add(ProductList.get(i)); //catching array list
                Double proPrice = Double.parseDouble(productPrice.get(i));
                printedProductPrice.add(proPrice); //catching array list or price
            }
        }
        Double cheapestProductPrice = printedProductPrice.get(0);
        int cheapestProductPriceIndex = 0;
        for (int i=0; i< printedProductPrice.size(); i++){
            if (printedProductPrice.get(i)< cheapestProductPrice){
               cheapestProductPrice = printedProductPrice.get(i);
               cheapestProductPriceIndex = i;
            }
        }
        System.out.println(printedProductList);
        System.out.println(printedProductPrice);
        System.out.println(printedProductList.get(cheapestProductPriceIndex) + " Is the cheapest product and its price is: " + cheapestProductPrice);
    }

    //Verify at least one blouse is in the list after searching for blouse
    @Test
    public void SearchButtonTest1() {
        String product = "Printed";
        allPages.homePage().enterTextInSearchTextbox(product);
        allPages.homePage().clickSearchButton();
        allPages.inventoryPage().getInventoryPageProductName();
        Assert.assertTrue(allPages.inventoryPage().getInventoryPageProductName().contains(product));
       // Assert.assertTrue("Printed Summer Dress".contains("Printed"));
    }


    //Print number of products
    @Test
    public void SummerDressTest1() {
        allPages.homePage().goTosummerDressesSubsection();
        BrowserUtils.waitFor(5);
        System.out.println(allPages.homePage().summerDressesList());
        System.out.println(allPages.homePage().summerDressesList().size());

    }
    @Test
    public void CallUsNumberNegativeTest1 (){
        allPages.homePage().getCallUsNowHeader();
        allPages.homePage().getCallUsNowFooter();
        Assert.assertEquals(allPages.homePage().getCallUsNowHeader(),allPages.homePage().getCallUsNowFooter());
    }

}

//if else , switch statements, for loop (2types 1. for loop 2. for each loop)
//Use for loop when you are looking for index. When index is not important you can use for each loop