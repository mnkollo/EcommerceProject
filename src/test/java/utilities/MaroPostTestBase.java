package utilities;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class MaroPostTestBase {

    protected WebDriver driver;
    AllPages allPages = new AllPages();

    @Parameters("browser")
    @BeforeMethod
    public void setup (@Optional String browser){

        driver = Driver.getDriver(browser);
        driver.get(ConfigurationReader.getProperty("maroposturl"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //allPages.signInPage().login(ConfigurationReader.getProperty("username"), ConfigurationReader.getProperty("password"));
    }
    @AfterMethod
    public void tearDown(){

        Driver.closeDriver();
    }
    @BeforeClass
    public void login(){
        //allPages.signInPage().login(ConfigurationReader.getProperty("username"), ConfigurationReader.getProperty("password"));
    }
}
