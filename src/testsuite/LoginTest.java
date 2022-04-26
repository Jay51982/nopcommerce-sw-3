package testsuite;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

public class LoginTest extends Utility {

    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToLoginPageSuccessfully(){
        //find loin link and click on login link

        clickOnElement(By.className("ico-login"));

        //this is from requirement
        String expectedMessage = "Welcome, Please Sign In!";

        // find the welcome text element and get the text

        String actualMessage = getTextFromElement(By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]\n"));

        //validate actual and expected message
        Assert.assertEquals("Not navigate to login page",expectedMessage,actualMessage);
    }

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials(){
        //find loin link and click on login link
        clickOnElement(By.className("ico-login"));

        // find email field and insert valid value in it
          getTextFromElement(By.xpath("//input[@id='Email']"));
          sendTextToElement(By.xpath("//input[@id='Email']"),"abc123@xyz.com");


        // find passworld field and insert valid value in it
        getTextFromElement(By.xpath("//input[@class='password']"));
        sendTextToElement(By.xpath("//input[@class='password']"),"abcxyz1234");

        //find Login button and click it
        clickOnElement(By.xpath("//button[@class ='button-1 login-button']"));

        String expectedName = "Log out";

        // find the log out text is their in log out button
        String actualName = getTextFromElement(By.xpath("//a[@class='ico-logout']"));

        //To verify both expeceted text and actual text
        Assert.assertEquals("Log out is not available",expectedName,actualName);
    }
    @Test
    public void verifyTheErrorMessage(){
        //find loin link and click on login link
        clickOnElement(By.className("ico-login"));

        // find email field and insert invalid value in it
        getTextFromElement(By.xpath("//input[@id='Email']"));
        sendTextToElement(By.xpath("//input[@id='Email']"),"abc123@xyz.com");


        // find passworld field and insert invalid value in it
        getTextFromElement(By.xpath("//input[@class='password']"));
        sendTextToElement(By.xpath("//input[@class='password']"),"abcxyz1234");

        //find Login button and click it
        clickOnElement(By.xpath("//button[@class='button-1 login-button']"));


        String expectedMessage = "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";

        // to store error message in variable
        String actualMessage = getTextFromElement(By.xpath("//div[@class='message-error validation-summary-errors']"));

        //to check error message apper or not
        Assert.assertEquals("Error message not found",expectedMessage,actualMessage);
    }


    @After
    public void tearDown() {
        closeBrowser();
    }
}