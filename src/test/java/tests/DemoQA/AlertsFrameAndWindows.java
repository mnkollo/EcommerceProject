package tests.DemoQA;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DemoQAPages.*;
import utilities.BrowserUtils;
import utilities.DemoQATestBase;

import java.util.Set;

public class AlertsFrameAndWindows extends DemoQATestBase {

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
        ElementsFramesPage elementsFramesPage = new ElementsFramesPage();
        ElementsNestedFramesPage elementsNestedFramesPage = new ElementsNestedFramesPage();

        @Test
        public void BrowserWindows() {
            String headingMessage = "This is a sample page";
            String samplePageText = "This is a sample page";
            String thirdMessage = "Knowledge increases by sharing but not by saving. Please share this website with your friends and in your organization.";
            elementsHomePage.clickAlertsFramesWindows();
            elementsHomePage.clickBrowserWindows();
            elementsAlertsFramesWindows.clickNewTabButton();
            Set<String> handles = driver.getWindowHandles();
            String firstWindowhandle = driver.getWindowHandle();
            handles.remove(firstWindowhandle);
            String winHandle = handles.iterator().next();
            String secondWindowhandle = winHandle;
            driver.switchTo().window(secondWindowhandle);
            elementsAlertsFramesWindows.getThisIsASamplePageText();
            Assert.assertEquals(elementsAlertsFramesWindows.getThisIsASamplePageText(),samplePageText);
            driver.switchTo().window(firstWindowhandle);
            elementsAlertsFramesWindows.clickNewWindowButton();
            BrowserUtils.waitFor(5);
        }
        @Test
        public void alerts(){
            String name = "You entered Michael Nkollo";
            elementsHomePage.clickAlertsFramesWindows();
            elementsHomePage.clickAlertsButton();
            elementsAlertsPage.clickClickMeButton();
            Alert alert = driver.switchTo().alert();
            String alertMessage = driver.switchTo().alert().getText();
            System.out.println(alertMessage);
            alert.accept();
            elementsAlertsPage.clickclickMeButtonFiveSeconds();
            BrowserUtils.waitFor(8);
            Alert alertTwo = driver.switchTo().alert();
            String alertMessagetwo = driver.switchTo().alert().getText();
            System.out.println(alertMessagetwo);
            alertTwo.accept();
            elementsAlertsPage.clickclickMeButtonConfirmBox();
            Alert alertThree = driver.switchTo().alert();
            String confirmClickMeButton = driver.switchTo().alert().getText();
            System.out.println(confirmClickMeButton);
            alertThree.accept();
            elementsAlertsPage.clickMeButtonPromtButton();
            Alert alertFour = driver.switchTo().alert();
            String alertMessageFour = driver.switchTo().alert().getText();
            System.out.println(alertMessageFour);
            alertFour.sendKeys("Michael Nkollo");
            alertFour.accept();
            elementsAlertsPage.getSuccessMessage();
            Assert.assertEquals(elementsAlertsPage.getSuccessMessage(),name);
        }
    @Test
    public void framesTest() {
        String messageOne = "This is a sample page";
        elementsHomePage.clickAlertsFramesWindows();
        elementsHomePage.clickFramesButton();
        driver.switchTo().frame("frame1");
        BrowserUtils.waitFor(2);
        elementsFramesPage.getSampleMessage();
        BrowserUtils.waitFor(2);
        //Assert.assertEquals(elementsFramesPage.getSampleMessage(),messageOne);
        driver.switchTo().frame("frame2");
        elementsFramesPage.getSampleMessageTwo();
    }
    @Test
    public void nestedFrames() {
        elementsHomePage.clickAlertsFramesWindows();
        elementsNestedFramesPage.clickNestedFrames();
        driver.switchTo().frame("frame1").switchTo().frame(0);
        String displayText = driver.findElement(By.tagName("p")).getText();
        System.out.println("Child iFrame Text : " +displayText);
        driver.switchTo().parentFrame();
        System.out.println("Parent iFrame Source : " + driver.getPageSource());
        driver.switchTo().defaultContent();
        System.out.println("Main Doc : " + driver.getPageSource());

        //NoSuchFrame
        //NosuchElementException
    }
    @Test
    public void modalDialogs() {
        elementsHomePage.clickAlertsFramesWindows();
        BrowserUtils.waitFor(2);
        elementsHomePage.clickModalDialogsTab();
        BrowserUtils.waitFor(2);
        elementsModalDialogsPage.clickSmallModalButton();
        String displaySmallText = driver.findElement(By.xpath("//div[contains(text(),'This is a small modal. It has very less content')]")).getText();
        System.out.println("Small Text : " +displaySmallText);
        BrowserUtils.waitFor(2);
        elementsModalDialogsPage.clickCloseButton();
        BrowserUtils.waitFor(2);
        elementsModalDialogsPage.clickLargeModalButton();
        BrowserUtils.waitFor(2);
        String displayText = driver.findElement(By.xpath("//p[contains(text(),'Lorem Ipsum is simply dummy text of the printing a')]")).getText();
        System.out.println("Large Text : " + displayText);
        elementsModalDialogsPage.clickCloseButtonLarge();
        BrowserUtils.waitFor(2);
    }
}
