package tests.proje;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class HomePage {
    public HomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //************************ hotelmycamp page Main Page Xpaths **********************************

    // mainPage HOTELMYCAMP  word       US01
    @FindBy(xpath = "//a[@class='navbar-brand']")
    public WebElement mainPageHotelMyCampPageWord;

    // mainPage>>Home button       US01
    @FindBy(xpath = "//li[@id='navHome']")
    public WebElement mainPageHomeButton;


    // mainPage>>Rooms button     US01
    @FindBy(xpath = "//li[@id='navRooms']")
    public WebElement mainPageRoomsButton;

    // mainPage>>Restaurant button     US01
    @FindBy(xpath = "//li[@id='navRestaurant']")
    public WebElement mainPageRestaurantButton;

    // mainPage>>About button     US01
    @FindBy(xpath = "//li[@id='navAbout']")
    public WebElement mainPageAboutButton;

    // mainPage>>Blog button     US01
    @FindBy(xpath = "//li[@id='navBlog']")
    public WebElement mainPageBlogButton;


    // mainPage>>Contact button
    @FindBy(xpath = "//li[@id='navContact']")
    public WebElement mainPageContactButton;


    // mainPage log in click button
    @FindBy(xpath = "//a[@href='/Account/Logon']")
    public WebElement mainPageLoginButton;
    // mainPage Wel come to hotelmycamp
    @FindBy(xpath = "(//h1[@class='mb-3'])[3]")
    public WebElement mainPageWelComeToWord;

    // mainPage Enjoy A Luxury Experience
    @FindBy(xpath = "(//h1[@class='mb-3'])[2]")
    public WebElement mainPageEnjoyALuxuryExperienceToWord;

    // mainPage CEHCK IN DATE word
    @FindBy(xpath = "(//div[@class='wrap'])[1]")
    public WebElement mainPageCEHCKINDATEWord;


    // mainPage CEHCK OUT DATE word
    @FindBy(xpath = "(//div[@class='wrap'])[2]")
    public WebElement mainPageCEHCKOUTDATEWord;

    // mainPage ROOM TYPE word
    @FindBy(xpath = "(//div[@class='wrap'])[3]")
    public WebElement mainPageROOMTYPEWord;

    // mainPage CUSTOMER word
    @FindBy(xpath = "(//div[@class='wrap'])[4]")
    public WebElement mainPageCUSTOMERWord;

    // mainPage Check Availability
    @FindBy(xpath = "//input[@type='submit']")
    public WebElement mainPageCheckAvailabilityWord;



    //mainPage InformationTextVisibility
    @FindBy(xpath = "(//h2[@class='mb-4'])[1]")
    public WebElement mainPageInformationTextVisibility;

    //mainPage under the information text facebook image
    @FindBy(xpath = "(//span[@class='icon-facebook'])[1]")
    public WebElement mainPageFacebookImageVisibility;

    //mainPage under the information text google image
    @FindBy(xpath = "(//span[@class='icon-google-plus'])[1]")
    public WebElement mainPageGoogleImageVisibility;

    //mainPage under the information text Instegram image
    @FindBy(xpath = "(//span[@class='icon-instagram'])[1]")
    public WebElement mainPageInstegramImageVisibility;

    //mainPage 25/7 Front Desk word
    @FindBy(xpath = "(//div[@class='media block-6 services py-4 d-block text-center'])[1]")
    public WebElement mainPageFrontDeskImageAndHeaderVisibility;


    //mainPage Restaurant Bar word
    @FindBy(xpath = "(//div[@class='media block-6 services py-4 d-block text-center'])[2]")
    public WebElement mainPageRestaurantBarImageAndHeaderVisibility;

    //mainPage Transfer Services word
    @FindBy(xpath = "(//div[@class='media block-6 services py-4 d-block text-center'])[3]")
    public WebElement mainPageTransferServicesImageAndHeaderVisibility;

    //mainPage Spa Suites word
    @FindBy(xpath = "(//div[@class='media block-6 services py-4 d-block text-center'])[4]")
    public WebElement mainPageSpaSuiteskImageAndHeaderVisibility;

    //mainPage Our Rooms Header
    @FindBy(xpath = "//h2[@class='mb-4']")
    public WebElement mainPageOurRoomsHeaderVisibility;

    //mainPage Our Rooms >> jjdfkdf1 room
    @FindBy(xpath = "(//div[@class='text p-3 text-center'])[1]")
    public WebElement mainPageOurRoomsjjdfkdf1Visibility;

    //mainPage Our Rooms >> jjdfkdf2 room
    @FindBy(xpath = "(//div[@class='text p-3 text-center'])[2]")
    public WebElement mainPageOurRoomsjjdfkdf2Visibility;

    //mainPage Our Rooms >> jjdfkdf3 room
    @FindBy(xpath = "(//div[@class='text p-3 text-center'])[3]")
    public WebElement mainPageOurRoomsjjdfkdf3Visibility;

    //mainPage Our Rooms >> AubreyRowe room
    @FindBy(xpath = "(//div[@class='text p-3 text-center'])[4]")
    public WebElement mainPageOurRoomsAubreyRoweVisibility;

    //mainPage Our Rooms >> Lajuana room
    @FindBy(xpath = "(//div[@class='text p-3 text-center'])[5]")
    public WebElement mainPageOurRoomsLajuanaVisibility;

    //mainPage Our Rooms >> Clarck room
    @FindBy(xpath = "(//div[@class='text p-3 text-center'])[6]")
    public WebElement mainPageOurRoomsClarckVisibility;

    //MainPage>>Rooms page
    @FindBy(xpath = "//h1[@class='mb-4 bread']")
    public WebElement mainPageRoomPageRoomWord;

    //MainPage>>Restaurant page
    @FindBy(xpath = "//h1[@class='mb-4 bread']")
    public WebElement mainPageRestaurantPageRestaurantWord;

    //MainPage>>About page
    @FindBy(xpath = "//h1[@class='mb-4 bread']")
    public WebElement mainPageAboutPageAboutWord;

    //MainPage>>Blogs page
    @FindBy(xpath = "//h1[@class='mb-4 bread']")
    public WebElement mainPageBlogPageBlogWord;

    //MainPage>>Contact page
    @FindBy(xpath = "//h1[@class='mb-4 bread']")
    public WebElement mainPageContactPageContactWord;

    //MainPage>>Contact page
    @FindBy(xpath = "//h1[@class='mb-4 bread']")
    public WebElement mainPageLoginPageLoginWord;

    //MainPage>>Check In button
    @FindBy(xpath = "//input[@class='form-control checkin_date']")
    public WebElement mainPageCheckInButton;

    //MainPage>>Check Out button
    @FindBy(xpath = "//input[@class='form-control checkout_date']")
    public WebElement mainPageCheckOutButton;

    //MainPage>>Select Room button
    @FindBy(xpath = "(//select[@class='form-control required'])[1]")
    public WebElement mainPageSelectRoomButton;

    //MainPage>>Select Customer button
    @FindBy(xpath = "(//select[@class='form-control required'])[2]")
    public WebElement mainPageSelectCustomerButton;

    //MainPage>>Check Availability r button
    @FindBy(xpath = "//input[@type='submit']")
    public WebElement mainPageCheckAvailabilityButton;


    //********************** Some Usefull Methods *****************************
    // Thread.sleep methods (sayfa gecislerinde beklemele ihtiyaci oldugunda kullanilanilir method)
    public void wait(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }//exception firlatmamasi icin try catch blogunun icine alindi

    public void allPagesScreenShot() {
        TakesScreenshot screenshot = (TakesScreenshot) Driver.getDriver();
        String date = new SimpleDateFormat("yyMMddhhmmss").format(new Date());
        File allPagesScreen = new File("target/screenshot/allPage" + date + ".jpeg");
    }


}
