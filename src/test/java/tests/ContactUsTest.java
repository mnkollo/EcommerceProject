package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.AllPages;
import utilities.ConfigurationReader;
import utilities.TestBase;

import java.util.ArrayList;
import java.util.List;

public class ContactUsTest extends TestBase {

    AllPages allPages = new AllPages();

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
