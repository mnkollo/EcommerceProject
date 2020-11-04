package utilities;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;

public abstract class TestBase {

    protected WebDriver driver;

    @Parameters("browser")
    @BeforeMethod
    public void setup (@Optional String browser){

        driver = Driver.getDriver(browser);
        driver.get(ConfigurationReader.getProperty("url"));
    }
    @AfterMethod
    public void tearDown(){

        Driver.closeDriver();
    }
}
