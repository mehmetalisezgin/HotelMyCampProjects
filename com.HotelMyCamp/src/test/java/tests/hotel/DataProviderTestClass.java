package tests.hotel;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HotelMCPAddUser;
import pages.HotelMCPAddUserMethods;
import utilities.Driver;
import utilities.ReusableMethods;

public class DataProviderTestClass{

   @DataProvider
   public static Object[][] negativepasswordtestList(){


     return  new String [][]{{" "},{"istanbul34"},{"Istanbul34"},{"Ist4."}} ;
   }

    @DataProvider
    public static Object[][] negativePhoneBoxTesti(){


        return  new String [][]{{" "},{"0000000000"},{"999888"},{"1234567890"}} ;
    }

}
