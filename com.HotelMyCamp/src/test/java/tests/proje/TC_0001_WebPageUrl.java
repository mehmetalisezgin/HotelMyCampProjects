package tests.proje;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class TC_0001_WebPageUrl extends TestBaseRapor {

    HomePage homePage = new HomePage();

    SoftAssert softAssert = new SoftAssert();
    Actions actions = new Actions(Driver.getDriver());
    ReusableMethods reusableMethods = new ReusableMethods();
    @BeforeClass
    public void beforeClassAccessWebPage(){
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));

    }
   // access from chrome to https://www.hotelmycamp.com/ (
    @Test
    public void urlTestHotelMyCamp(){
        extentTest = extentReports.createTest("urlTestHotelMyCamp", "Created by M.Ali");
        extentTest.info("HotelMyCamp url is working with different browsers");
        softAssert.assertTrue(homePage.mainPageHotelMyCampPageWord.isDisplayed());
       Driver.closeDriver();

    }

}
