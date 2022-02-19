package tests.proje;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC_004_ChecKIn extends TestBaseRapor{
    HomePage homePage = new HomePage();

    SoftAssert softAssert = new SoftAssert();
    Actions actions = new Actions(Driver.getDriver());
    utilities.ReusableMethods reusableMethods = new ReusableMethods();

    @BeforeClass
    public void beforeMethodLoginHotel() {
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
    }

@Test
    public void checkInCheckOutDateTest(){
    extentTest = extentReports.createTest("checkInCheckOutDateTest", "US_0001>>TC_0002");
    extentTest.info("Visibility of elements on the main page");
    actions.sendKeys(Keys.PAGE_DOWN).perform();
    homePage.mainPageCheckInButton.clear();
    homePage.mainPageCheckInButton.sendKeys("2/25/2022");
    homePage.mainPageCheckOutButton.clear();
    homePage.mainPageCheckOutButton.sendKeys("2/23/2022");
    Select selectRoom = new Select(homePage.mainPageSelectRoomButton);
    selectRoom.selectByIndex(2);
    Select selectCustomer = new Select(homePage.mainPageSelectCustomerButton);
    selectCustomer.selectByIndex(2);
    //homePage.mainPageCheckAvailabilityButton.click();
    String errorWord = "Please correct check out" ;
    softAssert.assertTrue(homePage.mainPageCheckAvailabilityButton.getText().contains(errorWord),"Check out can not be smaller than Check in");
}




}
