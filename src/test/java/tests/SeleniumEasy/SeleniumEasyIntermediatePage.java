package tests.SeleniumEasy;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SeleniumEasyPages.*;
import utilities.BrowserUtils;
import utilities.SeleniumEasyTestBase;

public class SeleniumEasyIntermediatePage extends SeleniumEasyTestBase {

    SeleniumEasyHomePage seleniumEasyHomePage = new SeleniumEasyHomePage();
    IntermediatePage intermediatePage = new IntermediatePage();
    IntermediateInputFormDemo intermediateInputFormDemo = new IntermediateInputFormDemo();
    IntermediateAjaxFormSubmit intermediateajaxFormSubmit = new IntermediateAjaxFormSubmit();
    JqueryDropdownSearchDemoPage jqueryDropdownSearchDemoPage = new JqueryDropdownSearchDemoPage();
    IntermediateBootstrapPage intermediateBootstraPage = new IntermediateBootstrapPage();
    JqueryDualListBoxDemoPage jqueryDualListBoxDemoPage = new JqueryDualListBoxDemoPage();
    IntermediateDataListFilterPage intermediateDataListFilterPage = new IntermediateDataListFilterPage();
    IntermediateProgressBarModalPage intermediateProgressBarModalPage = new IntermediateProgressBarModalPage();
    IntermediateFileDownloadPage intermediateFileDownloadPage = new IntermediateFileDownloadPage();

    @Test
    public void SimpleFormTest(){
        seleniumEasyHomePage.clicknoThanksPopup();
        seleniumEasyHomePage.clickIntermediateMenuButtion();
        intermediatePage.clickInputFormWithValidations();
        intermediateInputFormDemo.inputDataInFirstNameTextBox();
        intermediateInputFormDemo.inputDataInLastNameTextBox();
        intermediateInputFormDemo.inputDataInEmailTextBox();
        intermediateInputFormDemo.inputDataInPhoneNumberTextBox();
        intermediateInputFormDemo.inputDataInaddressTextBox();
        intermediateInputFormDemo.inputDataInCityTextBox();
        intermediateInputFormDemo.pickStateDropdown2();
        intermediateInputFormDemo.inputDataInZipCodeTextBox();
        intermediateInputFormDemo.inputDataInWebsiteTextBox();
        intermediateInputFormDemo.clickYesHostingRadioButton();
        intermediateInputFormDemo.enterTextInProjectDescriptionEnterText();
        BrowserUtils.waitFor(5);
        intermediateInputFormDemo.clicksendButton();
        BrowserUtils.waitFor(5);
    }

    @Test
    public void AjaxFormSubmit() {
        String SuccessMessage = "Form submited Successfully!";
        seleniumEasyHomePage.clicknoThanksPopup();
        seleniumEasyHomePage.clickIntermediateMenuButtion();
        intermediatePage.clickAjaxFormSubmit();
        intermediateajaxFormSubmit.enterTextinNameTextBox();
        intermediateajaxFormSubmit.enterTextInCommentTextBox();
        intermediateajaxFormSubmit.clickSubmitButton();
        intermediateajaxFormSubmit.getSuccessMessage();
        BrowserUtils.waitFor(2);
        Assert.assertEquals(intermediateajaxFormSubmit.getSuccessMessage(), SuccessMessage);
        System.out.println(intermediateajaxFormSubmit.getSuccessMessage());
    }

    @Test
    public void JqueryDropdownSearch() {
        seleniumEasyHomePage.clicknoThanksPopup();
        seleniumEasyHomePage.clickIntermediateMenuButtion();
        intermediatePage.clickjqueryDropdownSearch();
        jqueryDropdownSearchDemoPage.clickDropDownWithSearchBox();
        jqueryDropdownSearchDemoPage.clickSelectMultipleValuesDropdown();
        jqueryDropdownSearchDemoPage.clickselectDropDownWithDisabledValues();
        jqueryDropdownSearchDemoPage.selectDropDownWithCCategoryRelatedOptions();
        BrowserUtils.waitFor(5);
    }

    @Test
    public void BootStrapListBox() {
        seleniumEasyHomePage.clicknoThanksPopup();
        seleniumEasyHomePage.clickIntermediateMenuButtion();
        intermediatePage.clickBootStrapListBox();
        intermediateBootstraPage.clickBootStrapDuellist();
        intermediateBootstraPage.clickArrowButton();
        intermediateBootstraPage.enterTextInRightSearchBoxAndMoveLeft();
        BrowserUtils.waitFor(5);
    }

    @Test
    public void JqueryDualListBoxDemo() {
        seleniumEasyHomePage.clicknoThanksPopup();
        seleniumEasyHomePage.clickIntermediateMenuButtion();
        intermediatePage. clickJqueryListBox();
        jqueryDualListBoxDemoPage.clickPickListDropdown();
        jqueryDualListBoxDemoPage.clickAddButton();
        BrowserUtils.waitFor(5);
        jqueryDualListBoxDemoPage.clickaddAllButton();
        BrowserUtils.waitFor(5);
        jqueryDualListBoxDemoPage.removeAllButton();
        BrowserUtils.waitFor(5);
    }
    @Test
    public void DataListFilter() {
        String customerName = "Name: Brenda Tree";
        String brenda = "Brenda Tree";
        seleniumEasyHomePage.clicknoThanksPopup();
        seleniumEasyHomePage.clickIntermediateMenuButtion();
        intermediatePage.clickDataListFilter();
        intermediateDataListFilterPage.inputDataIntoInputSearchTextBox(brenda);
        BrowserUtils.waitFor(5);
        intermediateDataListFilterPage.getBrendaTreeCustomerName();
        BrowserUtils.waitFor(5);
        Assert.assertEquals(intermediateDataListFilterPage.getBrendaTreeCustomerName(), customerName);
        String glen = "Glen";
        String customerName2 = "Name: Glenn Pho shizzle";
        intermediateDataListFilterPage.inputDataIntoInputSearchTextBox(glen);
        BrowserUtils.waitFor(2);
        intermediateDataListFilterPage.getGlennTreeCustomerName();
        BrowserUtils.waitFor(2);
        Assert.assertEquals(intermediateDataListFilterPage.getGlennTreeCustomerName(), customerName2);
    }
        @Test
        public void ProgressBarModal(){
        String ExpectedMessage = "Hello Mr. Alert !";
        seleniumEasyHomePage.clicknoThanksPopup();
        seleniumEasyHomePage.clickIntermediateMenuButtion();
        intermediatePage.clickprogressBarModal();
        intermediateProgressBarModalPage.clickShowDialog2Seconds();
        BrowserUtils.waitFor(5);
        intermediateProgressBarModalPage.clickshowDialog3Seconds();
        BrowserUtils.waitFor(5);
        intermediateProgressBarModalPage.clickshowDialog3SecondsYello();
        intermediateProgressBarModalPage.getHelloMessage();
        BrowserUtils.waitFor(5);
        Assert.assertEquals(intermediateProgressBarModalPage.getHelloMessage(),ExpectedMessage);
    }
    @Test
    public void FileDownload(){
        String downloadButton = "Download";
        seleniumEasyHomePage.clicknoThanksPopup();
        seleniumEasyHomePage.clickIntermediateMenuButtion();
        intermediatePage.clickFileDownload();
        intermediateFileDownloadPage.enterDataInDataTextBox();
        intermediateFileDownloadPage.clickGenerateFile();
        intermediateFileDownloadPage.clickDownloadButton();
        BrowserUtils.waitFor(2);
        intermediateFileDownloadPage.getDownloadButton();
        Assert.assertEquals(intermediateFileDownloadPage.getDownloadButton(),downloadButton);

    }
}