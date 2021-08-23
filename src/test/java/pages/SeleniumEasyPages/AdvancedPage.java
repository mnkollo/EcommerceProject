package pages.SeleniumEasyPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AdvancedPage {
    public AdvancedPage() {
        PageFactory.initElements(Driver.getDriver(), this); }

    @FindBy(linkText = "Table Pagination")
    public WebElement tablePagination;

    @FindBy(linkText = "Table Data Search")
    public WebElement tableDataSearch;

    @FindBy(linkText = "Table Filter")
    public WebElement tableFilter;

    @FindBy(linkText = "Table Sort & Search")
    public WebElement tableSortAndSearch;

    @FindBy(linkText = "Table Data Download")
    public WebElement tableDataDownload;

    //---------------------------------------------------------------------------------

    public void clickTablePagination(){
        tablePagination.click();
    }
    public void clickTableDataSearch(){
        tableDataSearch.click();
    }
    public void clickTableFilter(){
        tableFilter.click();
    }
    public void clickTableSortAndSearch(){
        tableSortAndSearch.click();
    }
}

