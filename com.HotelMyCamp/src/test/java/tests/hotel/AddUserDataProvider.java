package tests.hotel;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HotelMCPAddUser;
import pages.HotelMCPAddUserMethods;
import tests.proje.TestBaseRapor;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;

public class AddUserDataProvider extends TestBaseRapor {

    HotelMCPAddUser hotelMCPAddUser = new HotelMCPAddUser();
    HotelMCPAddUserMethods hotelMCPAddUserMethods = new HotelMCPAddUserMethods();
    SoftAssert softAssert = new SoftAssert();
    Actions actions = new Actions(Driver.getDriver());
    ReusableMethods reusableMethods=new ReusableMethods();
    DataProviderTestClass dataProviderTestClass = new DataProviderTestClass();
    @BeforeClass
    public void beforeMethodLoginHotel() {
        hotelMCPAddUserMethods.hotelMyCampLoginAddUser();
    }



    @DataProvider
    public static Object[][] userNameNegativeList(){
        return  new String [][]{{"  "}} ;
    }

    @Test(priority = 1,dataProvider = "userNameNegativeList")
    public void userNameNegativeTest(String userName) {

        extentTest = extentReports.createTest("userNameNegativeTest", "User Name Negative Test Scenerio Has Been Created");
        extentTest.info("Onur Hoca Oturur Oturur Kod Yazar Icad Cikarir");
        hotelMCPAddUser.addusernamebox.sendKeys(userName);
        actions.sendKeys(Keys.END).perform();
        hotelMCPAddUserMethods.wait(2);
        hotelMCPAddUser.saveclickbutton.click();
        softAssert.assertTrue(hotelMCPAddUser.addUserUserNameIncorrect.isDisplayed());
        hotelMCPAddUserMethods.wait(1);
        hotelMCPAddUserMethods.tumSayfaScreenshot();
        hotelMCPAddUser.addusernamebox.clear();
    }
    @DataProvider
    public static Object[][] userNamePositiveList(){
        return  new String [][]{{"Mehmet"}} ;
    }
    @Test(priority = 2,dataProvider = "userNamePositiveList")
    public void userNamePositiveTest(String userNameP) {
        extentTest = extentReports.createTest(" userNamePositiveTest", "Made in GURU");
        extentTest.info("Bu Test Kubra hanimin onuruna ");
        hotelMCPAddUser.addusernamebox.sendKeys();
        actions.sendKeys(Keys.END).perform();
        hotelMCPAddUserMethods.wait(1);
        hotelMCPAddUser.saveclickbutton.click();
        softAssert.assertFalse(hotelMCPAddUser.addUserUserNameIncorrect.isDisplayed());
        hotelMCPAddUserMethods.wait(3);
        hotelMCPAddUserMethods.tumSayfaScreenshot();
    }
    @DataProvider
    public static Object[][] negativepasswordtestList(){
        return  new String [][]{{" "},{"istanbul34"},{"Istanbul34"},{"Ist4."},{"istanbul4455"}} ;
    }
    @Test(priority = 1,dataProvider ="negativepasswordtestList")
    public void negativepasswordtestAddUser(String password) throws IOException {
        extentTest = extentReports.createTest("negativepasswordtestAddUser", "Made in GURU");
        extentTest.info("Bu Test Sezen hanimin onuruna ");
        hotelMCPAddUser.addUserpasswordbox.sendKeys(password);
        actions.sendKeys(Keys.END).perform();
        hotelMCPAddUserMethods.wait(1);
        hotelMCPAddUser.saveclickbutton.click();
        softAssert.assertTrue(hotelMCPAddUser.addUserPassWordIncorrect.isDisplayed());
        hotelMCPAddUserMethods.wait(1);
        hotelMCPAddUserMethods.tumSayfaScreenshot();
        hotelMCPAddUser.addUserpasswordbox.clear();

    }
    @DataProvider
    public static Object[][] negativePhoneBoxTList(){
        return  new String [][]{{" "},{"0000000000"},{"999888"},{"1234567890"}} ;
    }

    @Test(priority = 2,dataProvider = "negativePhoneBoxTList")
    public void negativePhoneBoxTesti(String phoneText) {
        extentTest = extentReports.createTest("negativePhoneBoxTesti", "Made in GURU");
        extentTest.info("Bu Test benim onuruma ");
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        hotelMCPAddUser.addUserPhoneNobox.sendKeys(phoneText);
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).perform();
        hotelMCPAddUserMethods.wait(1);
        hotelMCPAddUser.saveclickbutton.click();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        softAssert.assertTrue(hotelMCPAddUser.userPhoneIncorrect.isDisplayed());
        hotelMCPAddUserMethods.tumSayfaScreenshot();
        hotelMCPAddUser.addUserPhoneNobox.clear();
    }
}
