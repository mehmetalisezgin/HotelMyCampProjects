package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.ArrayList;
import java.util.List;

public class HotelMyCampPage {

    public HotelMyCampPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    // https://www.hotelmycamp.com/ main page log in click button
    @FindBy(xpath = "//a[@href='/Account/Logon']")
    public WebElement mainPageLogin;
    // mainpage>>logIn admin page userid box
    @FindBy(xpath = "//input[@id='UserName']")
    public WebElement userNameBox;
    // mainpage>>logIn admin page password box
    @FindBy(xpath = "//input[@id='Password']")
    public WebElement passwordBox;
    // mainpage>>logIn admin page save click button
    @FindBy(xpath = "//input[@id='btnSubmit']")
    public WebElement userLogIn;
    // mainpage>>logIn>>ADD USER  click button for adding new user management
    @FindBy(xpath = "//a[@class='btn btn-circle btn-default']")
    public WebElement addUserElement;
    // mainpage>>LogIN>>AddUser>>usernamebox
    @FindBy(xpath = "//input[@placeholder='UserName']")
    public WebElement addusernamebox;
    // mainpage>>LogIN>>AddUser>>usernamebox>>save
    @FindBy(xpath = " //button[@type='submit']")
    public WebElement saveclickbutton;
    // mainpage>>LogIN>>AddUser>>passwordbox>>save
    @FindBy(xpath = "//input[@id='txtPassword']")
    public WebElement adUserpasswordbox;
    // mainpage>>LogIN>>AddUser>>emailbox
    @FindBy(xpath = "//input[@id='Email']")
    public WebElement adUseremailbox;
    //manager login page error word
    @FindBy(xpath = "//div[@class='validation-summary-errors']")
    public WebElement userLoginClickErrorWord;









     // it is a login path until the ADD USER page
    //  mainpage>>LogIN>>AddUser
    public void hotelMyCampLogin() {

        Driver.getDriver().get(ConfigReader.getProperty("HMYCUrl"));
        mainPageLogin.click();
        userNameBox.sendKeys(ConfigReader.getProperty("HMYCValidUserName"));
        passwordBox.sendKeys(ConfigReader.getProperty("HMYCValidPassword"));
        wait(2);
        userLogIn.click();
        wait(2);
        addUserElement.click();

    }
// It has not finished yet
    @DataProvider
    public Object[][] testData() {

        Object[][] test = new Object[1][3];
        test[0][0] = (" ");
        test[0][1] = ("mng");
        test[0][2] = ("mistafa");

        return test;
    }

    public List<String> listData() {

        List<String> listdata = new ArrayList<>();
        listdata.add(" ");
        listdata.add("mng");
        listdata.add("mistafa");
       return listdata ;
    }

    public List<String> passwordData() {

        List<String> passworddata = new ArrayList<>();
        //passworddata .add("");
        passworddata .add("istanbul34");
        passworddata .add("Istanbul34");
        passworddata .add("Ista");
        passworddata .add("Istanbul34.");
        return passworddata  ;
    }




    public List<String> emaillistData() {

        List<String> emaildata = new ArrayList<>();
        emaildata.add("");
        emaildata.add("hshdgmail.com");
        emaildata.add("mehmet@gmailcom");
        emaildata.add("mehmet@gmail..com");

        return emaildata ;
    }

    public void wait(int second){
        try{
            Thread.sleep(second*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }




}
