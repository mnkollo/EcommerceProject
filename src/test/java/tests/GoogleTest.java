package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.GooglePages.GoogleHomePage;
import utilities.GoogleTestBase;

public class GoogleTest extends GoogleTestBase {

    GoogleHomePage googleHomePage = new GoogleHomePage();

    @Test
    public void GoogleTest1() {
        googleHomePage.clickImFeelingLuckyButton();
        System.out.println();
    }

    @Test
    public void GoogleTest2() {
        String Team = "Dallas Cowboys";
        googleHomePage.googleSearch(Team);
        googleHomePage.clickOnDallasCowboysLink();
        Assert.assertTrue(driver.getCurrentUrl().contains("dallas"));
    }

    @Test
    public void GoogleTest3() {
        String Team = "Atlanta Falcons";
        googleHomePage.googleSearch(Team);
        googleHomePage.clickOnDallasCowboysLink();
        Assert.assertTrue(driver.getCurrentUrl().contains("atlanta"));
    }

    @Test
    public void GoogleGmailTest1() {


    }
}
