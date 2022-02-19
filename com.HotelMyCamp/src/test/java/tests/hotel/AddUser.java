package tests.hotel;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HotelMCPAddUser;
import pages.HotelMCPAddUserMethods;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

import java.io.IOException;

public class AddUser extends TestBaseRapor {

    HotelMCPAddUser hotelMCPAddUser = new HotelMCPAddUser();
    HotelMCPAddUserMethods hotelMCPAddUserMethods = new HotelMCPAddUserMethods();
    SoftAssert softAssert = new SoftAssert();
    Actions actions = new Actions(Driver.getDriver());
    ReusableMethods reusableMethods=new ReusableMethods();
    @BeforeClass
    public void beforeMethodLoginHotel() {
        hotelMCPAddUserMethods.hotelMyCampLoginAddUser();
    }


    @Test(priority = 1)
    public void userNameNegativeTest() {

        extentTest = extentReports.createTest("userNameNegativeTest", "User Name Negative Test Scenerio Has Been Created");
        extentTest.info("Onur Hoca Oturur Oturur Kod Yazar Icad Cikarir");
        hotelMCPAddUser.addusernamebox.sendKeys(ConfigReader.getProperty("HMCAddUserWrongUserName"));
        actions.sendKeys(Keys.END).perform();
        hotelMCPAddUserMethods.wait(1);
        hotelMCPAddUser.saveclickbutton.click();
        softAssert.assertTrue(hotelMCPAddUser.addUserUserNameIncorrect.isDisplayed());
        hotelMCPAddUserMethods.wait(3);
        hotelMCPAddUserMethods.tumSayfaScreenshot();
        hotelMCPAddUser.addusernamebox.clear();

        hotelMCPAddUser.addusernamebox.sendKeys(ConfigReader.getProperty("HMCAddUserWrongUserName1"));
        actions.sendKeys(Keys.END).perform();
        hotelMCPAddUserMethods.wait(1);
        hotelMCPAddUser.saveclickbutton.click();
        softAssert.assertTrue(hotelMCPAddUser.addUserUserNameIncorrect.isDisplayed());
        hotelMCPAddUserMethods.wait(3);
        hotelMCPAddUserMethods.tumSayfaScreenshot();
        hotelMCPAddUser.addusernamebox.clear();

        hotelMCPAddUser.addusernamebox.sendKeys(ConfigReader.getProperty("HMCAddUserWrongUserName2"));
        actions.sendKeys(Keys.END).perform();
        hotelMCPAddUserMethods.wait(1);
        hotelMCPAddUser.saveclickbutton.click();
        softAssert.assertTrue(hotelMCPAddUser.addUserUserNameIncorrect.isDisplayed());
        hotelMCPAddUserMethods.wait(3);
        hotelMCPAddUserMethods.tumSayfaScreenshot();
        hotelMCPAddUser.addusernamebox.clear();


    }

    @Test(priority = 2)
    public void userNamePositiveTest() {
        extentTest = extentReports.createTest(" userNamePositiveTest", "Made in GURU");
        extentTest.info("Bu Test Kubra hanimin onuruna ");
        hotelMCPAddUser.addusernamebox.sendKeys(ConfigReader.getProperty("HMCAddUserTrueUserName"));
        actions.sendKeys(Keys.END).perform();
        hotelMCPAddUserMethods.wait(1);
        hotelMCPAddUser.saveclickbutton.click();
        softAssert.assertFalse(hotelMCPAddUser.addUserUserNameIncorrect.isDisplayed());
        hotelMCPAddUserMethods.wait(3);
        hotelMCPAddUserMethods.tumSayfaScreenshot();


    }

    @Test(priority = 3)
    public void negativepasswordtestAddUser() throws IOException {
        extentTest = extentReports.createTest("negativepasswordtestAddUser", "Made in GURU");
        extentTest.info("Bu Test Sezen hanimin onuruna ");
        hotelMCPAddUser.addUserpasswordbox.sendKeys(ConfigReader.getProperty("HMCAddUserWrongPassword1"));
        actions.sendKeys(Keys.END).perform();
        hotelMCPAddUserMethods.wait(1);
        hotelMCPAddUser.saveclickbutton.click();
        softAssert.assertTrue(hotelMCPAddUser.addUserPassWordIncorrect.isDisplayed());
        hotelMCPAddUserMethods.wait(1);
        hotelMCPAddUserMethods.tumSayfaScreenshot();
        hotelMCPAddUser.addUserpasswordbox.clear();


        hotelMCPAddUser.addUserpasswordbox.sendKeys(ConfigReader.getProperty("HMCAddUserWrongPassword2"));
        actions.sendKeys(Keys.END).perform();
        hotelMCPAddUserMethods.wait(1);
        hotelMCPAddUser.saveclickbutton.click();
        softAssert.assertTrue(hotelMCPAddUser.addUserPassWordIncorrect.isDisplayed());
        hotelMCPAddUserMethods.wait(1);
        hotelMCPAddUserMethods.tumSayfaScreenshot();
        hotelMCPAddUser.addUserpasswordbox.clear();

        hotelMCPAddUser.addUserpasswordbox.sendKeys(ConfigReader.getProperty("HMCAddUserWrongPassword3"));
        actions.sendKeys(Keys.END).perform();
        hotelMCPAddUserMethods.wait(1);
        hotelMCPAddUser.saveclickbutton.click();
        softAssert.assertTrue(hotelMCPAddUser.addUserPassWordIncorrect.isDisplayed());
        hotelMCPAddUserMethods.wait(1);
        hotelMCPAddUserMethods.tumSayfaScreenshot();
        hotelMCPAddUser.addUserpasswordbox.clear();

        hotelMCPAddUser.addUserpasswordbox.sendKeys(ConfigReader.getProperty("HMCAddUserWrongPassword4"));
        actions.sendKeys(Keys.END).perform();
        hotelMCPAddUserMethods.wait(1);
        hotelMCPAddUser.saveclickbutton.click();
        softAssert.assertTrue(hotelMCPAddUser.addUserPassWordIncorrect.isDisplayed());
        hotelMCPAddUserMethods.wait(1);
        hotelMCPAddUserMethods.tumSayfaScreenshot();
        hotelMCPAddUser.addUserpasswordbox.clear();

        hotelMCPAddUser.addUserpasswordbox.sendKeys(ConfigReader.getProperty("HMCAddUserWrongPassword5"));
        actions.sendKeys(Keys.END).perform();
        hotelMCPAddUserMethods.wait(1);
        hotelMCPAddUser.saveclickbutton.click();
        softAssert.assertTrue(hotelMCPAddUser.addUserPassWordIncorrect.isDisplayed());
        hotelMCPAddUserMethods.wait(1);
        hotelMCPAddUserMethods.tumSayfaScreenshot();
        hotelMCPAddUser.addUserpasswordbox.clear();


    }

    @Test(priority = 4)
    public void positivePasswordtestAddUser() {
        extentTest = extentReports.createTest("positivePasswordtestAddUser", "Made in GURU");
        extentTest.info("Bu Test Sena hanimin onuruna ");
        hotelMCPAddUser.addUserpasswordbox.sendKeys(ConfigReader.getProperty("HMCAddUserTruePassword"));
        actions.sendKeys(Keys.END).perform();
        hotelMCPAddUserMethods.wait(1);
        hotelMCPAddUser.saveclickbutton.click();
        softAssert.assertFalse(hotelMCPAddUser.addUserPassWordIncorrect.isDisplayed());
        hotelMCPAddUserMethods.wait(1);
        hotelMCPAddUserMethods.tumSayfaScreenshot();


    }

    @Test(priority = 5)
    public void negativeEmailtestAddUser() {
        extentTest = extentReports.createTest("negativeEmailtestAddUser", "Made in GURU");
        extentTest.info("Bu Test Zeynep hanimin onuruna ");
        hotelMCPAddUser.addUseremailbox.sendKeys(ConfigReader.getProperty("HCMAddUserWrongEmail1"));
        actions.sendKeys(Keys.END).perform();
        hotelMCPAddUserMethods.wait(2);
        hotelMCPAddUser.saveclickbutton.click();

        hotelMCPAddUserMethods.wait(1);
        softAssert.assertTrue(hotelMCPAddUser.addUserEmailIncorrect.isDisplayed());
        hotelMCPAddUserMethods.tumSayfaScreenshot();

        hotelMCPAddUser.addUseremailbox.clear();

        hotelMCPAddUser.addUseremailbox.sendKeys(ConfigReader.getProperty("HCMAddUserWrongEmail2"));
        actions.sendKeys(Keys.END).perform();
        hotelMCPAddUserMethods.wait(1);
        hotelMCPAddUser.saveclickbutton.click();

        hotelMCPAddUserMethods.wait(1);
        softAssert.assertTrue(hotelMCPAddUser.addUserEmailIncorrect.isDisplayed());
        hotelMCPAddUserMethods.tumSayfaScreenshot();

        hotelMCPAddUser.addUseremailbox.clear();

        hotelMCPAddUser.addUseremailbox.sendKeys(ConfigReader.getProperty("HCMAddUserWrongEmail3"));
        actions.sendKeys(Keys.END).perform();
        hotelMCPAddUserMethods.wait(2);
        hotelMCPAddUser.saveclickbutton.click();

        hotelMCPAddUserMethods.wait(1);
        softAssert.assertTrue(hotelMCPAddUser.addUserEmailIncorrect.isDisplayed());
        hotelMCPAddUserMethods.tumSayfaScreenshot();

        hotelMCPAddUser.addUseremailbox.clear();

        hotelMCPAddUser.addUseremailbox.sendKeys(ConfigReader.getProperty("HCMAddUserWrongEmail4"));
        actions.sendKeys(Keys.END).perform();
        hotelMCPAddUserMethods.wait(1);
        hotelMCPAddUser.saveclickbutton.click();

        hotelMCPAddUserMethods.wait(1);
        softAssert.assertTrue(hotelMCPAddUser.addUserEmailIncorrect.isDisplayed());
        hotelMCPAddUserMethods.tumSayfaScreenshot();
        hotelMCPAddUser.addUseremailbox.clear();
        hotelMCPAddUser.addUseremailbox.sendKeys(ConfigReader.getProperty("HCMAddUserWrongEmail5"));
        actions.sendKeys(Keys.END).perform();
        hotelMCPAddUserMethods.wait(1);
        hotelMCPAddUser.saveclickbutton.click();

        hotelMCPAddUserMethods.wait(1);
        softAssert.assertTrue(hotelMCPAddUser.addUserEmailIncorrect.isDisplayed());
        hotelMCPAddUserMethods.tumSayfaScreenshot();
        hotelMCPAddUser.addUseremailbox.clear();
        hotelMCPAddUser.addUseremailbox.sendKeys(ConfigReader.getProperty("HCMAddUserWrongEmail6"));
        actions.sendKeys(Keys.END).perform();
        hotelMCPAddUserMethods.wait(1);
        hotelMCPAddUser.saveclickbutton.click();

        hotelMCPAddUserMethods.wait(1);
        softAssert.assertTrue(hotelMCPAddUser.addUserEmailIncorrect.isDisplayed());
        hotelMCPAddUserMethods.tumSayfaScreenshot();
        hotelMCPAddUser.addUseremailbox.clear();

    }

    @Test(priority = 6)
    public void possitiveEmailtestAddUser() {
        extentTest = extentReports.createTest("possitiveEmailtestAddUser", "Made in GURU");
        extentTest.info("Bu Test Salih beyin onuruna ");
        hotelMCPAddUser.addUseremailbox.sendKeys(ConfigReader.getProperty("HCMAddUserTrueEmail"));
        actions.sendKeys(Keys.END).perform();
        hotelMCPAddUserMethods.wait(1);
        hotelMCPAddUser.saveclickbutton.click();

        hotelMCPAddUserMethods.wait(1);
        softAssert.assertFalse(hotelMCPAddUser.addUserEmailIncorrect.isDisplayed());
        hotelMCPAddUserMethods.tumSayfaScreenshot();


    }

    @Test(priority = 7)
    public void negativeFulnameTest() {
        extentTest = extentReports.createTest("negativeFulnameTest", "Made in GURU");
        extentTest.info("Bu Test Gunter beyin onuruna ");
        hotelMCPAddUser.addUserFullNamebox.sendKeys(ConfigReader.getProperty("HMCAddUserWrongFullname"));
        actions.sendKeys(Keys.END).perform();
        hotelMCPAddUser.saveclickbutton.click();
        softAssert.assertTrue(hotelMCPAddUser.userFullNameincorrect.isDisplayed());
        hotelMCPAddUserMethods.tumSayfaScreenshot();
        hotelMCPAddUser.addUserFullNamebox.clear();

        hotelMCPAddUser.addUserFullNamebox.sendKeys(ConfigReader.getProperty("HMCAddUserWrongFullname1"));
        actions.sendKeys(Keys.END).perform();
        hotelMCPAddUser.saveclickbutton.click();
        softAssert.assertTrue(hotelMCPAddUser.userFullNameincorrect.isDisplayed());
        hotelMCPAddUserMethods.tumSayfaScreenshot();
        hotelMCPAddUser.addUserFullNamebox.clear();
    }

    @Test(priority = 8)
    public void positiveFulnameTest() {
        extentTest = extentReports.createTest("positiveFulnameTest", "Made in GURU");
        extentTest.info("Bu Test Cem beyin onuruna ");
        hotelMCPAddUser.addUserFullNamebox.sendKeys(ConfigReader.getProperty("HMCAddUserTrueFullname"));
        actions.sendKeys(Keys.END).perform();
        hotelMCPAddUser.saveclickbutton.click();
        softAssert.assertFalse(hotelMCPAddUser.userFullNameincorrect.isDisplayed());
        hotelMCPAddUserMethods.tumSayfaScreenshot();
    }

    @Test(priority = 9)
    public void negativePhoneBoxTesti() {
        extentTest = extentReports.createTest("negativePhoneBoxTesti", "Made in GURU");
        extentTest.info("Bu Test benim onuruma ");
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        hotelMCPAddUser.addUserPhoneNobox.sendKeys(ConfigReader.getProperty("HMCAddUserWrongPhone"));
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).perform();
        hotelMCPAddUserMethods.wait(1);
        hotelMCPAddUser.saveclickbutton.click();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        softAssert.assertTrue(hotelMCPAddUser.userPhoneIncorrect.isDisplayed());
        hotelMCPAddUserMethods.tumSayfaScreenshot();
        hotelMCPAddUser.addUserPhoneNobox.clear();


        hotelMCPAddUser.addUserPhoneNobox.sendKeys(ConfigReader.getProperty("HMCAddUserWrongPhone1"));
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).perform();
        hotelMCPAddUserMethods.wait(1);
        hotelMCPAddUser.saveclickbutton.click();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        softAssert.assertTrue(hotelMCPAddUser.userPhoneIncorrect.isDisplayed());
        hotelMCPAddUserMethods.tumSayfaScreenshot();
        hotelMCPAddUser.addUserPhoneNobox.clear();


        actions.sendKeys(Keys.PAGE_DOWN).perform();
        hotelMCPAddUser.addUserPhoneNobox.sendKeys(ConfigReader.getProperty("HMCAddUserWrongPhone2"));
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).perform();
        hotelMCPAddUserMethods.wait(1);
        hotelMCPAddUser.saveclickbutton.click();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        softAssert.assertTrue(hotelMCPAddUser.userPhoneIncorrect.isDisplayed());
        hotelMCPAddUserMethods.tumSayfaScreenshot();
        hotelMCPAddUser.addUserPhoneNobox.clear();


        hotelMCPAddUser.addUserPhoneNobox.sendKeys(ConfigReader.getProperty("HMCAddUserWrongPhone3"));
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).perform();
        hotelMCPAddUserMethods.wait(1);
        hotelMCPAddUser.saveclickbutton.click();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        softAssert.assertTrue(hotelMCPAddUser.userPhoneIncorrect.isDisplayed());
        hotelMCPAddUserMethods.tumSayfaScreenshot();
        hotelMCPAddUser.addUserPhoneNobox.clear();




    }

    @Test(priority = 10)
    public void positivePhoneBoxTesti() {
        extentTest = extentReports.createTest("positivePhoneBoxTesti", "Made in GURU");

        extentTest.info("Bu Test Mistikin onuruna ");
        hotelMCPAddUser.addUserPhoneNobox.sendKeys(ConfigReader.getProperty("HMCAddUserTruePhone"));
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).perform();
        hotelMCPAddUserMethods.wait(1);
        hotelMCPAddUser.saveclickbutton.click();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        softAssert.assertFalse(hotelMCPAddUser.userPhoneIncorrect.isDisplayed());
        hotelMCPAddUserMethods.tumSayfaScreenshot();

    }


    @Test(priority = 11)
    public void negativeSSNTest() {
        extentTest = extentReports.createTest("negativeSSNTest", "Made in GURU");
        extentTest.info("Bu Test Dursunun onuruna ");
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        hotelMCPAddUser.addUserSocialSecurityNumberbox.sendKeys(ConfigReader.getProperty("HMCAddUserWrongSSN"));
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        hotelMCPAddUserMethods.wait(1);
        hotelMCPAddUser.saveclickbutton.click();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        hotelMCPAddUserMethods.wait(1);
        softAssert.assertTrue(hotelMCPAddUser.addUserSSNIncorrect.isDisplayed());
        hotelMCPAddUserMethods.tumSayfaScreenshot();
        hotelMCPAddUser.addUserSocialSecurityNumberbox.clear();


        hotelMCPAddUser.addUserSocialSecurityNumberbox.sendKeys(ConfigReader.getProperty("HMCAddUserWrongSSN1"));
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        hotelMCPAddUser.saveclickbutton.click();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        hotelMCPAddUserMethods.wait(1);
        softAssert.assertTrue(hotelMCPAddUser.addUserSSNIncorrect.isDisplayed());
        hotelMCPAddUserMethods.tumSayfaScreenshot();
        hotelMCPAddUser.addUserSocialSecurityNumberbox.clear();

    }

    @Test(priority = 12)
    public void possitiveSSNTest() {
        extentTest = extentReports.createTest("possitiveSSNTest", "Made in GURU");
        extentTest.info("Bu Test Kaynanamin onuruna ");
        hotelMCPAddUser.addUserSocialSecurityNumberbox.sendKeys(ConfigReader.getProperty("HMCAddUSerTrueSSN"));
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        hotelMCPAddUser.saveclickbutton.click();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        hotelMCPAddUserMethods.wait(1);
        softAssert.assertFalse(hotelMCPAddUser.addUserSSNIncorrect.isDisplayed());
        hotelMCPAddUserMethods.tumSayfaScreenshot();

    }


    @Test(priority = 13)
    public void drivingLicenseNegativeTest() {
        extentTest = extentReports.createTest("drivingLicenseNegativeTest", "Made in GURU");
        extentTest.info("Bu Test Esim Aslinin onuruna ");
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        hotelMCPAddUser.addUserDrivingLicensebox.sendKeys(ConfigReader.getProperty("HMCAddUserWrongDrivingLicense"));
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        hotelMCPAddUserMethods.wait(1);
        hotelMCPAddUser.saveclickbutton.click();
        softAssert.assertTrue(hotelMCPAddUser.addDrivingLicenseIncorrect.getText().contains("This field is required."),
                "'This field is required.' is not appearing");
        hotelMCPAddUserMethods.wait(1);
        hotelMCPAddUserMethods.tumSayfaScreenshot();
        hotelMCPAddUser.addUserDrivingLicensebox.clear();


        actions.sendKeys(Keys.PAGE_DOWN).perform();
        hotelMCPAddUser.addUserDrivingLicensebox.sendKeys(ConfigReader.getProperty("HMCAddUserWrongDrivingLicense1"));
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        hotelMCPAddUserMethods.wait(1);
        hotelMCPAddUser.saveclickbutton.click();
        softAssert.assertTrue(hotelMCPAddUser.addDrivingLicenseIncorrect.getText().contains("This field is required."),
                "'This field is required.' is not appearing");
        hotelMCPAddUserMethods.wait(1);
        hotelMCPAddUserMethods.tumSayfaScreenshot();
        hotelMCPAddUser.addUserDrivingLicensebox.clear();

        actions.sendKeys(Keys.PAGE_DOWN).perform();
        hotelMCPAddUser.addUserDrivingLicensebox.sendKeys(ConfigReader.getProperty("HMCAddUserWrongDrivingLicense2"));
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        hotelMCPAddUserMethods.wait(1);
        hotelMCPAddUser.saveclickbutton.click();
        softAssert.assertTrue(hotelMCPAddUser.addDrivingLicenseIncorrect.getText().contains("This field is required."),
                "'This field is required.' is not appearing");
        hotelMCPAddUserMethods.wait(1);
        hotelMCPAddUserMethods.tumSayfaScreenshot();
        hotelMCPAddUser.addUserDrivingLicensebox.clear();


        actions.sendKeys(Keys.PAGE_DOWN).perform();
        hotelMCPAddUser.addUserDrivingLicensebox.sendKeys(ConfigReader.getProperty("HMCAddUserWrongDrivingLicense3"));
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        hotelMCPAddUser.saveclickbutton.click();
        softAssert.assertTrue(hotelMCPAddUser.addDrivingLicenseIncorrect.getText().contains("This field is required."),
                "'This field is required.' is not appearing");
        hotelMCPAddUserMethods.wait(1);
        hotelMCPAddUserMethods.tumSayfaScreenshot();
        hotelMCPAddUser.addUserDrivingLicensebox.clear();


    }

    @Test(priority = 14)
    public void drivingLicensePositiveTest() {
        extentTest = extentReports.createTest("drivingLicensePositiveTest", "Made in GURU");
        extentTest.info("Bu Test Prensesimin onuruna ");
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        hotelMCPAddUser.addUserDrivingLicensebox.sendKeys(ConfigReader.getProperty("HMCAddUserTrueDrivingLicense4"));
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        hotelMCPAddUserMethods.wait(1);
        hotelMCPAddUser.saveclickbutton.click();
        softAssert.assertTrue(hotelMCPAddUser.addDrivingLicenseIncorrect.isDisplayed(), " 'This field is required.' " +
                "is not appearing...");
        hotelMCPAddUserMethods.wait(1);
        hotelMCPAddUserMethods.tumSayfaScreenshot();
        hotelMCPAddUser.addUserDrivingLicensebox.clear();


        actions.sendKeys(Keys.PAGE_DOWN).perform();
        hotelMCPAddUser.addUserDrivingLicensebox.sendKeys(ConfigReader.getProperty("HMCAddUserTrueDrivingLicense5"));
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        hotelMCPAddUserMethods.wait(1);
        hotelMCPAddUser.saveclickbutton.click();
        softAssert.assertTrue(hotelMCPAddUser.addDrivingLicenseIncorrect.isDisplayed(), " 'This field is required.' " +
                "is not appearing...");
        hotelMCPAddUserMethods.wait(1);
        hotelMCPAddUserMethods.tumSayfaScreenshot();
        hotelMCPAddUser.addUserDrivingLicensebox.clear();


        actions.sendKeys(Keys.PAGE_DOWN).perform();
        hotelMCPAddUser.addUserDrivingLicensebox.sendKeys(ConfigReader.getProperty("HMCAddUserTrueDrivingLicense6"));
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        hotelMCPAddUserMethods.wait(1);
        hotelMCPAddUser.saveclickbutton.click();
        softAssert.assertTrue(hotelMCPAddUser.addDrivingLicenseIncorrect.isDisplayed(), " 'This field is required.' " +
                "is not appearing...");
        hotelMCPAddUserMethods.wait(1);
        hotelMCPAddUserMethods.tumSayfaScreenshot();
        hotelMCPAddUser.addUserDrivingLicensebox.clear();


        actions.sendKeys(Keys.PAGE_DOWN).perform();
        hotelMCPAddUser.addUserDrivingLicensebox.sendKeys(ConfigReader.getProperty("HMCAddUserTrueDrivingLicense7"));
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        hotelMCPAddUserMethods.wait(1);
        hotelMCPAddUser.saveclickbutton.click();
        softAssert.assertTrue(hotelMCPAddUser.addDrivingLicenseIncorrect.isDisplayed(), " 'This field is required.' " +
                "is not appearing...");
        hotelMCPAddUserMethods.wait(1);
        hotelMCPAddUserMethods.tumSayfaScreenshot();
        hotelMCPAddUser.addUserDrivingLicensebox.clear();


        actions.sendKeys(Keys.PAGE_DOWN).perform();
        hotelMCPAddUser.addUserDrivingLicensebox.sendKeys(ConfigReader.getProperty("HMCAddUserTrueDrivingLicense8"));
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        hotelMCPAddUserMethods.wait(1);
        hotelMCPAddUser.saveclickbutton.click();
        softAssert.assertTrue(hotelMCPAddUser.addDrivingLicenseIncorrect.isDisplayed(), " 'This field is required.' " +
                "is not appearing...");
        hotelMCPAddUserMethods.wait(1);
        hotelMCPAddUserMethods.tumSayfaScreenshot();

    }

    @Test(priority = 15)
    public void countryNegativeTest() {
        extentTest = extentReports.createTest("countryNegativeTest", "Made in GURU");
        extentTest.info("Bu Test Lilanin onuruna ");
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Select select = new Select(hotelMCPAddUser.addUserCountrybox);
        select.selectByIndex(0);
        hotelMCPAddUserMethods.wait(2);
        // hotelMCPAddUser.adUserCountrybox.click();
        //hotelMCPAddUser.adUserCountrybox.click();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        hotelMCPAddUserMethods.wait(2);
        hotelMCPAddUser.saveclickbutton.click();
        softAssert.assertTrue(hotelMCPAddUser.adduserCountryincorrect.isDisplayed());
        hotelMCPAddUserMethods.wait(1);
        hotelMCPAddUserMethods.tumSayfaScreenshot();

    }

    @Test(priority = 16)
    public void countryPozitiveTest() {
        extentTest = extentReports.createTest("countryPozitiveTest", "Made in GURU");
        extentTest.info("Bu Test Lusinin onuruna ");
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        Select select = new Select(hotelMCPAddUser.addUserCountrybox);
        select.selectByIndex(5);
        hotelMCPAddUserMethods.wait(1);
        // hotelMCPAddUser.adUserCountrybox.click();
        //hotelMCPAddUser.adUserCountrybox.click();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        hotelMCPAddUserMethods.wait(1);
        hotelMCPAddUser.saveclickbutton.click();
        softAssert.assertFalse(hotelMCPAddUser.adduserCountryincorrect.isDisplayed());
        hotelMCPAddUserMethods.wait(1);
        hotelMCPAddUserMethods.tumSayfaScreenshot();

    }

    @Test(priority = 17)
    public void adressNegativeTest() {
        extentTest = extentReports.createTest("adressNegativeTest", "Made in GURU");
        extentTest.info("Bu Test Emin abinin  onuruna ");
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        hotelMCPAddUser.addUserAddressbox.click();
        hotelMCPAddUserMethods.wait(1);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        hotelMCPAddUserMethods.wait(1);
        hotelMCPAddUser.saveclickbutton.click();
        softAssert.assertTrue(hotelMCPAddUser.addAdressIncorrect.isDisplayed());
        hotelMCPAddUserMethods.wait(1);
        hotelMCPAddUserMethods.tumSayfaScreenshot();

        actions.sendKeys(Keys.PAGE_DOWN).perform();
        hotelMCPAddUser.addUserAddressbox.sendKeys(ConfigReader.getProperty("HMCAddUserWrongAddress"));
        hotelMCPAddUserMethods.wait(1);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        hotelMCPAddUserMethods.wait(1);
        hotelMCPAddUser.saveclickbutton.click();
        softAssert.assertTrue(hotelMCPAddUser.addAdressIncorrect.getText().contains("Address must be a maximum of 20 characters"));
        hotelMCPAddUserMethods.wait(1);
        hotelMCPAddUserMethods.tumSayfaScreenshot();
        hotelMCPAddUser.addUserAddressbox.clear();


    }

    @Test(priority = 18)
    public void adressPositiveTest() {
        extentTest = extentReports.createTest("adressPositiveTest", "Made in GURU");
        extentTest.info("Bu Test Mehmet Bulutluoz onuruna ");
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        hotelMCPAddUser.addUserAddressbox.sendKeys(ConfigReader.getProperty("HMCAddUserTrueAddress"));
        hotelMCPAddUserMethods.wait(1);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        hotelMCPAddUserMethods.wait(1);
        hotelMCPAddUser.saveclickbutton.click();
        softAssert.assertFalse(hotelMCPAddUser.addAdressIncorrect.isDisplayed());
        hotelMCPAddUserMethods.wait(1);
        hotelMCPAddUserMethods.tumSayfaScreenshot();

    }

    @Test
    public void dateNegativeTest() {
        extentTest = extentReports.createTest("dateNegativeTest", "Made in GURU");
        extentTest.info("Bu Test Techpronun onuruna ");
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        hotelMCPAddUser.addUserAddressbox.click();
        hotelMCPAddUserMethods.wait(1);
        hotelMCPAddUser.saveclickbutton.click();
        softAssert.assertFalse(hotelMCPAddUser.addBirthDateIncorrect.isDisplayed());
        hotelMCPAddUserMethods.wait(1);
        hotelMCPAddUserMethods.tumSayfaScreenshot();


    }


}
