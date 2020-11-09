package utilities;

import pages.*;

public class AllPages {
    private BlousesPage blousesPage;
    private CasualDressesPage casualDressesPage;
    private EveningDressesPage eveningDressesPage;
    private HomePage homePage;
    private SignInPage signInPage;
    private SummerDressesPage summerDressesPage;
    private TshirtPage tshirtPage;
    private WomenPage womenPage;
    private MyAccountPage myAccountPage;
    private ConstantVariables constantVariables;
    private ProductPopUpAddToCartElements productPopUpAddToCartElements;
    private ShoppingCartSummaryPage shoppingCartSummaryPage;
    private ProductPopUpQuickViewElements productPopUpQuickViewElements;
    private ProductPage productPage;
    private ContactUsPage contactUsPage;

    public BlousesPage blousesPage() {
        if (blousesPage == null) {
            blousesPage = new BlousesPage();
        }
        return blousesPage;
    }

    public CasualDressesPage casualDressesPage() {
        if (casualDressesPage == null) {
            casualDressesPage = new CasualDressesPage();
        }
        return casualDressesPage;
    }

    public EveningDressesPage eveningDressesPage() {
        if (eveningDressesPage == null) {
            eveningDressesPage = new EveningDressesPage();
        }
        return eveningDressesPage;
    }

    public HomePage homePage() {
        if (homePage == null) {
            homePage = new HomePage();
        }
        return homePage;
    }

    public SignInPage signInPage() {
        if (signInPage == null) {
            signInPage = new SignInPage();
        }
        return signInPage;
    }

    public SummerDressesPage summerDressesPage() {
        if (summerDressesPage == null) {
            summerDressesPage = new SummerDressesPage();
        }
        return summerDressesPage;
    }

    public WomenPage womenPage() {
        if (womenPage == null) {
            womenPage = new WomenPage();
        }
        return womenPage;
    }

    public TshirtPage tshirtPage() {
        if (tshirtPage == null) {
            tshirtPage = new TshirtPage();
        }
        return tshirtPage;
    }

    public MyAccountPage myAccountPage() {
        if (myAccountPage == null) {
            myAccountPage = new MyAccountPage();
        }
        return myAccountPage;
    }

    public ConstantVariables constantVariables() {
        if (constantVariables == null) {
            constantVariables = new ConstantVariables();
        }
        return constantVariables;
    }

    public ProductPopUpAddToCartElements productPopUpAddToCartElements() {
        if (productPopUpAddToCartElements == null) {
            productPopUpAddToCartElements = new ProductPopUpAddToCartElements();
        }
        return productPopUpAddToCartElements;
    }

    public ShoppingCartSummaryPage shoppingCartSummaryPage() {
        if (shoppingCartSummaryPage == null) {
            shoppingCartSummaryPage = new ShoppingCartSummaryPage();
        }
        return shoppingCartSummaryPage;
    }

    public ProductPopUpQuickViewElements productPopUpQuickViewElements() {
        if (productPopUpQuickViewElements == null) {
            productPopUpQuickViewElements = new ProductPopUpQuickViewElements();
        }
        return productPopUpQuickViewElements;
    }

    public ProductPage productPage() {
        if (productPage == null) {
            productPage = new ProductPage();
        }
        return productPage;
    }
    public ContactUsPage contactUsPage() {
        if (contactUsPage == null) {
            contactUsPage = new ContactUsPage();
        }
        return contactUsPage;
    }
}
