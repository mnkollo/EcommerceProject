package tests.DemoQA;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DemoQAPages.*;
import utilities.BrowserUtils;
import utilities.DemoQATestBase;

public class PracticeForm extends DemoQATestBase {

    ElementsHomePage elementsHomePage = new ElementsHomePage();
    ElementsTextBoxPages elementsTextBoxPages = new ElementsTextBoxPages();
    ElementsCheckBoxPage elementsCheckBoxPage = new ElementsCheckBoxPage();
    ElementsRadioButton elementsRadioButton = new ElementsRadioButton();
    ElementsWebTables elementsWebTables = new ElementsWebTables();
    ElementsButtonsPage elementsButtonsPage = new ElementsButtonsPage();
    ElementsLinksPage elementsLinksPage = new ElementsLinksPage();
    ElementsFormsPage elementsFormsPage = new ElementsFormsPage();
    ElementsAlertsFramesWindows elementsAlertsFramesWindows = new ElementsAlertsFramesWindows();
    ElementsAlertsPage elementsAlertsPage = new ElementsAlertsPage();
    ElementsModalDialogsPage elementsModalDialogsPage = new ElementsModalDialogsPage();
    ElementsAccordianPage elementsAccordianPage = new ElementsAccordianPage();
    ElementsAutoCompletePage elementsAutoCompletePage = new ElementsAutoCompletePage();

    @Test
    public void formsTest() {
        String thankyouMessage = "Thanks for submitting the form";
        elementsHomePage.clickFormsButton();
        elementsHomePage.clickPracticeFormButton();
        elementsFormsPage.enterFirstName();
        BrowserUtils.waitFor(2);
        elementsFormsPage.enterLastName();
        BrowserUtils.waitFor(2);
        elementsFormsPage.enterEmailAddress();
        BrowserUtils.waitFor(2);
        elementsFormsPage.clickOtherGender();
        BrowserUtils.waitFor(2);
        elementsFormsPage.enterPhoneNumberTextBox();
        BrowserUtils.waitFor(2);
        elementsFormsPage.EnterBirthDay();
        BrowserUtils.waitFor(2);
        //elementsFormsPage.enterSubjectInTextBox();
        elementsFormsPage.selectSportRadioButton();
        elementsFormsPage.enterCurrentAddressInTextBox();
        //elementsFormsPage.selectStateFromDropdown();
        elementsFormsPage.clickSubmitButton();
        Assert.assertEquals(elementsFormsPage.getThanksMessage(),thankyouMessage);


    }
}
