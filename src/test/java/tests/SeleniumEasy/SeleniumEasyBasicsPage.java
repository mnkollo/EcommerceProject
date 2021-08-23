package tests.SeleniumEasy;

import org.testng.Assert;
import pages.SeleniumEasyPages.*;
import org.testng.annotations.Test;
import utilities.BrowserUtils;
import utilities.Driver;
import utilities.SeleniumEasyTestBase;

import java.util.ArrayList;

public class SeleniumEasyBasicsPage extends SeleniumEasyTestBase {

    SeleniumEasyHomePage seleniumEasyHomePage = new SeleniumEasyHomePage();
    BasicsPage basicsPage = new BasicsPage();
    BasicFirstFormDemoPage basicFirstFormDemo = new BasicFirstFormDemoPage();
    BasicCheckBoxDemoPage basicCheckBoxDemo = new BasicCheckBoxDemoPage();
    BasicRadioButtonPage basicRadioButtonPage = new BasicRadioButtonPage();
    BasicSelectDropdownDemoPage basicSelectDropdownDemoPage = new BasicSelectDropdownDemoPage();
    JavascriptAlertBoxDemoPage javascriptAlertBoxDemoPage = new JavascriptAlertBoxDemoPage();
    WindowPopupModal windowPopupModal = new WindowPopupModal();
    BootstrapAlertsPage bootstrapAlerts = new BootstrapAlertsPage();
    BootstrapModalsPage bootstrapModalsPage = new BootstrapModalsPage();



    @Test
    public void SimpleFormTest() {
        seleniumEasyHomePage.clicknoThanksPopup();
        seleniumEasyHomePage.clickbasicMenuButton();
        basicsPage.clickSimpleFormDemoListGroupItem();
        basicFirstFormDemo.enterTextInTextBox();
        basicFirstFormDemo.clickShowMessageButton();
        basicFirstFormDemo.enterValueInTextBox();
        basicFirstFormDemo.enterValueInTextBox();
        basicFirstFormDemo.enterSecondValueInTextBox();
        basicFirstFormDemo.clickGetTotalButton();
    }

    @Test
    public void CheckBoxDemo() {
        seleniumEasyHomePage.clicknoThanksPopup();
        seleniumEasyHomePage.clickbasicMenuButton();
        basicsPage.clickCheckBoxListGroupItem();
        basicCheckBoxDemo.clickSingleCheckbox();
        BrowserUtils.waitFor(5);
        basicCheckBoxDemo.clickAllCheckBoxes();
        basicCheckBoxDemo.clickOptionThree();
        basicCheckBoxDemo.clickOptionFour();
        BrowserUtils.waitFor(5);
        Assert.assertTrue(basicCheckBoxDemo.optionOneSelected());  //Created a method for "Is selected"
        Assert.assertTrue(basicCheckBoxDemo.optionTwo.isSelected());
        Assert.assertFalse(basicCheckBoxDemo.optionThree.isSelected());
        Assert.assertTrue(!basicCheckBoxDemo.optionFour.isSelected());


    }

    @Test
    public void RadioButtonDemo() {
        seleniumEasyHomePage.clicknoThanksPopup();
        seleniumEasyHomePage.clickbasicMenuButton();
        basicsPage.clickRadioButtonsDemoListGroupitem();
        basicRadioButtonPage.clickMaleRadioButton();
        basicRadioButtonPage.clickGetCheckedValue();
        basicRadioButtonPage.clickGroupMaleRadioButton();
        basicRadioButtonPage.clickAgeGroupZeroToFive();
        basicRadioButtonPage.clickGetValuesButton();
        //BrowserUtils.waitFor(5);
        String ResultsOfTheTest = basicRadioButtonPage.getAgeGroupAndSexResult();
        String ExpectedGenderText = basicRadioButtonPage.getGroupFemaleRadioButtonText(); //Female
        String ExpectedAgeGroup = basicRadioButtonPage.getAgeGroupZerotoFiveText();       //0 - 5
        Assert.assertTrue(ResultsOfTheTest.contains(ExpectedGenderText));
        ResultsOfTheTest = ResultsOfTheTest.replace("-", "to");
        Assert.assertTrue(ResultsOfTheTest.contains(ExpectedAgeGroup));

    }

    @Test
    public void SelectDropdownDemo() {
        seleniumEasyHomePage.clicknoThanksPopup();
        seleniumEasyHomePage.clickbasicMenuButton();
        basicsPage.clickSelectDropdownListDemoListGroupitem();
        basicSelectDropdownDemoPage.setPleaseSelectDropdowntest();
        basicSelectDropdownDemoPage.clickMultiSelectDropdown();
        basicSelectDropdownDemoPage.clickGetAllSelectedButton();
        Assert.assertTrue(basicSelectDropdownDemoPage.getDaySelected().contains("Sunday"));
        Assert.assertTrue(basicSelectDropdownDemoPage.getFirstSelectedOption().contains("Ohio"));
    }

    //TODO Work on figuring out solution for sendkeys
    @Test
    public void JavaScriptAlertBoxDemo() {
        String myName = "Michael Nkollo";

        seleniumEasyHomePage.clicknoThanksPopup();
        seleniumEasyHomePage.clickbasicMenuButton();
        basicsPage.clickJavascriptAlertsListGroupitem();
        BrowserUtils.waitFor(5);
        javascriptAlertBoxDemoPage.clickJavaScriptAlertBoxClickMeButton();
        BrowserUtils.waitFor(5);
        Driver.getDriver().switchTo().alert().accept();
        javascriptAlertBoxDemoPage.clickJavaScriptConfirmationButton();
        BrowserUtils.waitFor(3);
        Driver.getDriver().switchTo().alert().dismiss();
        javascriptAlertBoxDemoPage.clickForPromptBoxButton();
        BrowserUtils.waitFor(5);
        Driver.getDriver().switchTo().alert().sendKeys("");
        Driver.getDriver().switchTo().alert().sendKeys(myName);
        Driver.getDriver().switchTo().alert().accept();

    }
//TODO how to switch over to a popup window
    @Test
    public void WindowPopupModalDemo() {
        seleniumEasyHomePage.clicknoThanksPopup();
        seleniumEasyHomePage.clickbasicMenuButton();
        basicsPage.clickWindowPopupModalListGroupitem();
        windowPopupModal.clickFollowOnTwitter();
        BrowserUtils.waitFor(2);
        String tabs = Driver.getDriver().getWindowHandle();
        Driver.getDriver().switchTo().window(tabs);
        BrowserUtils.waitFor(2);
        System.out.println(Driver.getDriver().getTitle());
        System.out.println(Driver.getDriver().getCurrentUrl());
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Twitter"));
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("twitter.com"));
        BrowserUtils.waitFor(2);
        windowPopupModal.clickLikeUsOnFacebookButton();
        BrowserUtils.waitFor(2);
        windowPopupModal.clickfollowtwitterandFacebookButton();
        BrowserUtils.waitFor(2);
        windowPopupModal.clickFollowAllButton();
    }
    @Test void BootstrapAlertMessages(){
        seleniumEasyHomePage.clicknoThanksPopup();
        seleniumEasyHomePage.clickbasicMenuButton();
        basicsPage.clickBootstrapAlertsListGroupItem();
        bootstrapAlerts.clickautocloseableSuccessMessage();
        BrowserUtils.waitFor(5);
        bootstrapAlerts.clickNormalSuccessMessage();
        BrowserUtils.waitFor(5);
        bootstrapAlerts.getnormalSuccessMessagePopupText();
        System.out.println(bootstrapAlerts.getnormalSuccessMessagePopupText());
        Assert.assertTrue(bootstrapAlerts.getnormalSuccessMessagePopupText().contains("I'm a normal success message. "));
        //bootstrapAlerts.clickNormalSuccessMessagePopup();

    }
    @Test void BootstrapModalsPage(){
        String ExpectedModalTitleText = "This is the place where the content for the modal dialog displays";
        seleniumEasyHomePage.clicknoThanksPopup();
        seleniumEasyHomePage.clickbasicMenuButton();
        basicsPage.clickbootstrapModalsListGroupitem();
        bootstrapModalsPage.clickSingleModalButton();
        bootstrapModalsPage.clickSaveChangesPopup();
        BrowserUtils.waitFor(5);
        bootstrapModalsPage.getModalTitleText();
        System.out.println(bootstrapModalsPage.getModalTitleText());
        bootstrapModalsPage.clickMultipleModalButton();
        bootstrapModalsPage.clickSaveChangesPopupTwo();
        BrowserUtils.waitFor(5);
        Assert.assertEquals(bootstrapModalsPage.getModalTitleText(),ExpectedModalTitleText);

    }

}
