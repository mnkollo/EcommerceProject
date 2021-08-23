package tests.SeleniumEasy;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SeleniumEasyPages.*;
import utilities.BrowserUtils;
import utilities.SeleniumEasyTestBase;

public class SeleniumEasyAdvancedPage extends SeleniumEasyTestBase {

    SeleniumEasyHomePage seleniumEasyHomePage = new SeleniumEasyHomePage();
    AdvancedPage advancedPage = new AdvancedPage();
    AdvancedTablePaginationDemoPage advancedTablePaginationDemoPage = new AdvancedTablePaginationDemoPage();
    AdvancedTableDataSearchPage advancedTableDataSearchPage = new AdvancedTableDataSearchPage();
    AdvancedTableFilterPage advancedTableFilterPage = new AdvancedTableFilterPage();
    AdvancedTableSortAndSearchPage advancedTableSortAndSearchPage = new AdvancedTableSortAndSearchPage();
    @Test
    public void TablePaginationDemo() {
        String cellname = "Table cell";
        seleniumEasyHomePage.clicknoThanksPopup();
        seleniumEasyHomePage.clickAdvancedMenuButton();
        advancedPage.clickTablePagination();
        advancedTablePaginationDemoPage.clickRightNextButton();
        BrowserUtils.waitFor(2);
        advancedTablePaginationDemoPage.clickLeftNextButton();
        advancedTablePaginationDemoPage.clickNumberOne();
        advancedTablePaginationDemoPage.getCellName();
        Assert.assertEquals(advancedTablePaginationDemoPage.getCellName(),cellname);
    }

    @Test
    public void TabeDataSearch() {
        String name = "emily john";
        String Task = "Bootstrap 3";
        seleniumEasyHomePage.clicknoThanksPopup();
        seleniumEasyHomePage.clickAdvancedMenuButton();
        advancedPage.clickTableDataSearch();
        BrowserUtils.waitFor(3);
        advancedTableDataSearchPage.enterDataInFilterSearchBox(Task);
        BrowserUtils.waitFor(3);
        advancedTableDataSearchPage.getEmilyJohn();
        Assert.assertEquals(advancedTableDataSearchPage.getEmilyJohn(), name);
        advancedTableDataSearchPage.clickFilterButton();
        name = "Zieko";
        String userName = "markino";
        BrowserUtils.waitFor(3);
        advancedTableDataSearchPage.enterFirstName(name);
        BrowserUtils.waitFor(3);
        advancedTableDataSearchPage.getUserName();
        Assert.assertEquals(advancedTableDataSearchPage.getUserName(), userName);
    }
    @Test
    //TODO need to find a Assert for this test
    public void TableFilter(){
        seleniumEasyHomePage.clicknoThanksPopup();
        seleniumEasyHomePage.clickAdvancedMenuButton();
        advancedPage.clickTableFilter();
        BrowserUtils.waitFor(3);
        advancedTableFilterPage.clickGreenButton();
        BrowserUtils.waitFor(4);
        advancedTableFilterPage.clickLoremImpsumGreencheckbox();
        BrowserUtils.waitFor(3);
        advancedTableFilterPage.clickAllButton();
        advancedTableFilterPage.getLoremImpsumGreen();
    }
    @Test
    public void TableSortAndSearh(){
        String Name = "A. Cox";
        seleniumEasyHomePage.clicknoThanksPopup();
        seleniumEasyHomePage.clickAdvancedMenuButton();
        advancedPage.clickTableSortAndSearch();
        BrowserUtils.waitFor(4);
        advancedTableSortAndSearchPage.clickTwoNextButton();
        BrowserUtils.waitFor(4);
        advancedTableSortAndSearchPage.clickShowDropDown();
        advancedTableSortAndSearchPage.clickName();
        Assert.assertEquals(advancedTableSortAndSearchPage.clickName(),Name);

    }
}