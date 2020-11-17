package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.AllPages;
import utilities.PrestaShopTestBase;

public class PrestaShopContactUsTest extends PrestaShopTestBase {

    AllPages allPages = new AllPages();


    // Send Message to Customer Service on Contact Us page
    @Test
    public void SubmitContactFormtest1(){
        allPages.homePage().goToContactUsPage();
        allPages.contactUsPage().contactPageSelectSubjectHeading();
        allPages.contactUsPage().contactPageClickONEmailAddress();
        allPages.contactUsPage().contactPageSelectOrderReference();
        allPages.contactUsPage().contactPageEnterTextInTextBox();
        allPages.contactUsPage().sendingMessageByClickingSendButton();
        String customerServiceSuccessMessage = "Your message has been successfully sent to our team.";
        Assert.assertEquals(allPages.contactUsPage().getContactUsSuccessMessage(),customerServiceSuccessMessage);
        System.out.println("Expected Customer Service success message: " + customerServiceSuccessMessage);
        System.out.println("Actual Customer Service success message:" + allPages.contactUsPage().getContactUsSuccessMessage());
    }
}
