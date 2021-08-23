package tests.OpenSisTest;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MaroPostPages.MaroPostHomePage;
import pages.MaroPostPages.PricePage;
import pages.OpenSisPages.BillingManagerPage;
import pages.OpenSisPages.OpenSisHomePage;
import pages.OpenSisPages.OpenSisLoginPage;
import utilities.BrowserUtils;
import utilities.OpenSisTestBase;

import java.sql.SQLOutput;

public class LoginPage extends OpenSisTestBase {

    OpenSisLoginPage openSisLoginPage = new OpenSisLoginPage();
    OpenSisHomePage openSisHomePage = new OpenSisHomePage();
    BillingManagerPage billingManagerPage = new BillingManagerPage();

    @Test
    public void LoginSystem() {
        String Username = "admin";
        String Password = "pass";
        openSisLoginPage.enterUsername(Username);
        openSisLoginPage.enterPassword(Password);
        openSisLoginPage.clickOpenSisLoginButton();
        BrowserUtils.waitFor(5);
    }
    @Test
    public void NavigateToBillingManagerPage() {
        String Username = "admin";
        String Password = "pass";
        openSisLoginPage.enterUsername(Username);
        openSisLoginPage.enterPassword(Password);
        openSisLoginPage.clickOpenSisLoginButton();
        BrowserUtils.waitFor(2);
        openSisHomePage.clickFeesMainTab();
        BrowserUtils.waitFor(1);
        openSisHomePage.clickfeesBillingManagerSubTab();
        BrowserUtils.waitFor(5);
    }
    @Test
    public void MakePayment() {
        String Username = "admin";
        String Password = "pass";
        openSisLoginPage.enterUsername(Username);
        openSisLoginPage.enterPassword(Password);
        openSisLoginPage.clickOpenSisLoginButton();
        BrowserUtils.waitFor(2);
        openSisHomePage.clickFeesMainTab();
        BrowserUtils.waitFor(1);
        openSisHomePage.clickfeesBillingManagerSubTab();
        driver.switchTo().frame("bil");
        billingManagerPage.clickDateOfService();
        BrowserUtils.waitFor(2);
        billingManagerPage.clickUpdateList();
        billingManagerPage.clickPhilBelfordEncounterButton();
        //driver.switchTo().frame(
        //billingManagerPage.clickBillingManagerTab();
        BrowserUtils.waitFor(2);
        billingManagerPage.clickPhilBelfordEditButton();
        BrowserUtils.waitFor(5);
    }
}
