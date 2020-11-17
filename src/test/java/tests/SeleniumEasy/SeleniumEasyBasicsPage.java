package tests.SeleniumEasy;

import org.testng.Assert;
import pages.SeleniumEasyPages.*;
import org.testng.annotations.Test;
import utilities.BrowserUtils;
import utilities.SeleniumEasyTestBase;

public class SeleniumEasyBasicsPage extends SeleniumEasyTestBase {

SeleniumEasyHomePage seleniumEasyHomePage = new SeleniumEasyHomePage();
BasicsPage basicsPage = new BasicsPage();
BasicFirstFormDemoPage basicFirstFormDemo = new BasicFirstFormDemoPage();
BasicCheckBoxDemoPage basicCheckBoxDemo = new BasicCheckBoxDemoPage();
BasicRadioButtonPage basicRadioButtonPage = new BasicRadioButtonPage();


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
        String ExpectedGenderText = basicRadioButtonPage.getGroupFemaleRadioButtonText();
        String ExpectedAgeGroup = basicRadioButtonPage.getAgeGroupZerotoFiveText();
        ResultsOfTheTest = ResultsOfTheTest.replaceAll("Sex : ", "");
        ResultsOfTheTest = ResultsOfTheTest.replaceAll(" Age Group : 0 - 5", "");
        System.out.println(ResultsOfTheTest);

        //String ageGroup = genderAndAge.replaceAll("Sex : Female Age Group :", "");
        //ageGroup = ageGroup.replaceAll("-", "to");
        //System.out.println(ageGroup);
    }
}
