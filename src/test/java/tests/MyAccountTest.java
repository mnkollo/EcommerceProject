package tests;


import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.AllPages;
import utilities.ConfigurationReader;
import utilities.TestBase;

public class MyAccountTest extends TestBase {

    AllPages allPages = new AllPages();

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
