package tests.proje;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC_0003_MainPageButtonTests extends TestBaseRapor {
    HomePage homePage = new HomePage();

    SoftAssert softAssert = new SoftAssert();
    Actions actions = new Actions(Driver.getDriver());
    utilities.ReusableMethods reusableMethods = new ReusableMethods();

    @BeforeClass
    public void beforeMethodLoginHotel() {
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
    }

    @Test(priority = 1)
    public void mainPageRoomsButtonTest() {
        extentTest = extentReports.createTest("mainPageRoomsButtonTest", "US_0001>>TC_0002");
        extentTest.info("Visibility of elements on the main page");
        homePage.mainPageRoomsButton.click();
        softAssert.assertTrue(homePage. mainPageRoomPageRoomWord.isDisplayed());
    }

    @Test (priority = 2)
    public void mainPageRestaurantButtonTest() {
        extentTest = extentReports.createTest("mainPageRestaurantButtonTest", "US_0001>>TC_0002");
        extentTest.info("Visibility of elements on the main page");
        homePage.mainPageRestaurantButton.click();
        softAssert.assertTrue(homePage. mainPageRestaurantPageRestaurantWord.isDisplayed());
    }
    @Test (priority = 3)
    public void mainPageAboutButtonTest() {
        extentTest = extentReports.createTest(" mainPageAboutButtonTest", "US_0001>>TC_0002");
        extentTest.info("Visibility of elements on the main page");
        homePage.mainPageAboutButton.click();
        softAssert.assertTrue(homePage. mainPageAboutPageAboutWord.isDisplayed());
    }
    @Test (priority = 4)
    public void mainPageBlogButtonTest() {
        extentTest = extentReports.createTest("mainPageBlogButtonTest", "US_0001>>TC_0002");
        extentTest.info("Visibility of elements on the main page");
        homePage.mainPageBlogButton.click();
        softAssert.assertTrue(homePage. mainPageBlogPageBlogWord.isDisplayed());
    }
    @Test (priority = 5)
    public void mainPageContactButtonTest() {
        extentTest = extentReports.createTest("mainPageContactButtonTest", "US_0001>>TC_0002");
        extentTest.info("Visibility of elements on the main page");
        homePage.mainPageContactButton.click();
        softAssert.assertTrue(homePage. mainPageContactPageContactWord.isDisplayed());
    }

    @Test (priority = 6)
    public void mainPageLoginButtonTest() {
        extentTest = extentReports.createTest("mainPageLoginButtonTest", "US_0001>>TC_0002");
        extentTest.info("Visibility of elements on the main page");
        homePage.mainPageLoginButton.click();
        softAssert.assertTrue(homePage. mainPageLoginPageLoginWord.isDisplayed());
    }
    @Test (priority = 7)
    public void mainPageHomeButtonTest() {
        extentTest = extentReports.createTest("mainPageHomeButtonTest", "US_0001>>TC_0002");
        extentTest.info("Visibility of elements on the main page");
        homePage.mainPageHotelMyCampPageWord.click();
        softAssert.assertTrue(homePage. mainPageHotelMyCampPageWord.isDisplayed());
    }

}
