package pages.SeleniumEasyPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class IntermediateFileDownloadPage {
    public IntermediateFileDownloadPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//textarea[@id='textbox']")
    public WebElement enterDataTextBox;

    @FindBy(xpath = "//button[@id='create']")
    public WebElement generateFile;

    @FindBy(xpath = "//*[@id=\"link-to-download\"]")
    public WebElement downloadButton;

    public void enterDataInDataTextBox(){
        enterDataTextBox.sendKeys("Article is a piece of writing that is included with others in a newspaper, magazine or other publication. Essay is a short piece of writing on a particular subject. ... Articles are objective as they merely describe a topic. Essays are subjective as they analyse and criticize a topic.");
    }
    public void clickGenerateFile(){
        generateFile.click();
    }
    public void clickDownloadButton(){
        downloadButton.click();
    }
    public String getDownloadButton(){
        return downloadButton.getText();
    }
}
