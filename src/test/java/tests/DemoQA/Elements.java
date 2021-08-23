package tests.DemoQA;

import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DemoQAPages.*;
import utilities.BrowserUtils;
import utilities.DemoQATestBase;

import java.util.Set;

public class Elements extends DemoQATestBase {

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
    ElementsDynamicPropertiesPage elementsDynamicPropertiesPage = new ElementsDynamicPropertiesPage();
    private final int sec = 8;

    @Test
    public void elementsTest() {
        elementsHomePage.clickElementsBox();
        elementsTextBoxPages.clickTextBox();
        elementsTextBoxPages.enterFullName();
        elementsTextBoxPages.enterEmail();
        elementsTextBoxPages.enterCurrentAddress();
        elementsTextBoxPages.enterPermanentAddress();
        elementsTextBoxPages.clickSubmitButton();
        BrowserUtils.waitFor(8);
    }
    @Test
    public void checkBoxTest() {
        String SuccessMessage = "workspace";
        elementsHomePage.clickElementsBox();
        elementsHomePage.clickCheckBox();
        BrowserUtils.waitFor(2);
        elementsCheckBoxPage.clickHomeArrow();
        BrowserUtils.waitFor(2);
        elementsCheckBoxPage.clickDocumentsArrow();
        BrowserUtils.waitFor(2);
        elementsCheckBoxPage.clickWorkSpaceCheckBox();
        elementsCheckBoxPage.getSuccessMessage();
        BrowserUtils.waitFor(2);
        Assert.assertEquals(elementsCheckBoxPage.getSuccessMessage(),SuccessMessage);


    }
    @Test
    public void radioButtonTest() {
        String answer = "Yes";
        elementsHomePage.clickElementsBox();
        elementsHomePage.clickRadioButton();
        elementsRadioButton.clickYesRadioButton();
        elementsRadioButton.getYesText();
        BrowserUtils.waitFor(8);
        Assert.assertEquals(elementsRadioButton.getYesText(),answer);
    }
    @Test
    public void webTablesTest() {
        String name = "Cierra";
        elementsHomePage.clickElementsBox();
        elementsHomePage.clickwebTablesButton();
        elementsWebTables.enterTextInSearchBox(name);
        elementsWebTables.clickSearchButton();
        BrowserUtils.waitFor(8);
    }
    @Test
    public void buttonsTest() {
        String name = "You have done a dynamic click";
        elementsHomePage.clickElementsBox();
        elementsHomePage.clickButtons();
        BrowserUtils.waitFor(2);
        elementsButtonsPage.clickDoubleClickButton();
        BrowserUtils.waitFor(2);
        elementsButtonsPage.clickRightClickButton();
        BrowserUtils.waitFor(2);
        elementsButtonsPage.clickButton();
        BrowserUtils.waitFor(2);
        elementsButtonsPage.getNameText();
        Assert.assertEquals(elementsButtonsPage.getNameText(),name);
    }
    @Test
    public void linksTest(){
        elementsHomePage.clickElementsBox();
        elementsHomePage.clickLinksButton();
        elementsLinksPage.clickhomeLink();
        elementsLinksPage.clickhomeztvbl();
        elementsLinksPage.clickCreatedLink();
        elementsLinksPage.clickNoContentLink();
        BrowserUtils.waitFor(8);
    }

    @Test
    public void modalDialogsTest() {
        elementsHomePage.clickAlertsFramesWindows();
        elementsHomePage.clickModalDialogsButton();
        elementsModalDialogsPage.clickSmallModalButton();
        BrowserUtils.waitFor(2);
        elementsModalDialogsPage.clickCloseButton();
        BrowserUtils.waitFor(2);
        elementsModalDialogsPage.clickLargeModalButton();
        BrowserUtils.waitFor(2);
        elementsModalDialogsPage.clickCloseButtonLarge();
    }
    @Test
    public void accordianTest(){
        elementsHomePage.clickWidgetsButton();
        elementsHomePage.clickAccordianButton();
        elementsAccordianPage.clickWhereDoesItCome();
        elementsAccordianPage.clickWhyDoWeUseIt();
        BrowserUtils.waitFor(5);

    }
    @Test
    public void autoCompleteTest() {
        elementsHomePage.clickWidgetsButton();
        elementsHomePage.clickAutoCompleteButton();
        BrowserUtils.waitFor(2);
        elementsAutoCompletePage.enterTextInMultipleColorNameBox();
        BrowserUtils.waitFor(5);
    }
    @Test
    public void dynamicProperties(){
        elementsHomePage.clickElementsBox();
        BrowserUtils.waitFor(2);
        elementsDynamicPropertiesPage.clickDynamicPropertiesButton();
        BrowserUtils.waitFor(7);
        elementsDynamicPropertiesPage.clickWillEnable5SecondsButton();

    }
}
