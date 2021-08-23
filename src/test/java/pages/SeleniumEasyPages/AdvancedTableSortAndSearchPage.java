package pages.SeleniumEasyPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BrowserUtils;
import utilities.Driver;

public class AdvancedTableSortAndSearchPage {
    public AdvancedTableSortAndSearchPage() {
        PageFactory.initElements(Driver.getDriver(), this); }

        @FindBy(xpath = "//*[@id=\"example_filter\"]/label/input")
        public WebElement searchTextBox;

        @FindBy(xpath = "//*[@id=\"example_length\"]/label/select")
        public WebElement showDropDown;

        @FindBy(xpath = "//*[@id=\"example_paginate\"]/span/a[2]")
        public WebElement twoNextButton;

        @FindBy(xpath = "//*[@id=\"example\"]/thead/tr/th[2]")
        public WebElement sortingByPosition;

        @FindBy(xpath = "//*[@id=\"example\"]/tbody/tr[1]/td[2]")
        public WebElement accountantPosition;

    @FindBy(xpath = "//*[@id=\"example\"]/tbody/tr[1]/td[1]")
    public WebElement nameACox;



        public void clickTwoNextButton(){
            twoNextButton.click();
        }
    public void clickShowDropDown(){
        BrowserUtils.dropdownValue(showDropDown,"50");
    }
    public String clickName(){
        return nameACox.getText();
    }


}
