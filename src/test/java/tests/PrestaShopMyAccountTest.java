package tests;


import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.AllPages;
import utilities.PrestaShopTestBase;

public class PrestaShopMyAccountTest extends PrestaShopTestBase {

    AllPages allPages = new AllPages();

    //update customer's profile company name
    @Test
    public void AccountPageTest1() {
        String newCompany = "Sogeti";
        allPages.myAccountPage().goToMyAddress();
        allPages.myAccountPage().accountPageClickUpdateButton();
        allPages.myAccountPage().setAccountPageCompanytextbox(newCompany);
        allPages.myAccountPage().accountPageClickSaveButton();
        Assert.assertEquals(allPages.myAccountPage().getEmployerName(),newCompany);
    }
}
