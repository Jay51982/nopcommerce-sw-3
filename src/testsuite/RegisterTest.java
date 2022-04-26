package testsuite;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

public class RegisterTest extends Utility {
    // public static WebDriver driver;
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToRegisterPageSuccessfully() {
        //   click on Register link
        clickOnElement(By.linkText("Register"));

        //this is from requirement
        String expectedMessage = "Register";

        // find the welcome text element and get the text
        String actualMessage = getTextFromElement(By.xpath("//div[@class='page-title']"));

        //To verify actual and expected message
        Assert.assertEquals("Not navigate to Register page", expectedMessage, actualMessage);
    }

    @Test
    public void userSholdRegisterAccountSuccessfully() {
        // go to register
        clickOnElement(By.linkText("Register"));

        //select radio button
        clickOnElement(By.id("gender-male"));

        //find First Name field and insert value
        getTextFromElement(By.id("FirstName"));
        sendTextToElement(By.id("FirstName"), "Abc");

        //find Last Name field and insert value

        getTextFromElement(By.id("LastName"));
        sendTextToElement(By.id("LastName"), "Xyz");

        //find Date field and insert value

        getTextFromElement(By.name("DateOfBirthDay"));
        sendTextToElement(By.name("DateOfBirthDay"), "11");

        //find month field and insert value

        getTextFromElement(By.name("DateOfBirthMonth"));
        sendTextToElement(By.name("DateOfBirthMonth"), "11");

        //find year field and insert value

        getTextFromElement(By.name("DateOfBirthYear"));
        sendTextToElement(By.name("DateOfBirthYear"), "2000");

        //find email field and insert value

        getTextFromElement(By.id("Email"));
        sendTextToElement(By.id("Email"), "abc123@xyz.com");

        //find password field and insert value

        getTextFromElement(By.id("Password"));
        sendTextToElement(By.id("Password"), "abcxyz1234");

        //find Confirm password field and insert value

        getTextFromElement(By.id("ConfirmPassword"));
        sendTextToElement(By.id("ConfirmPassword"), "abcxyz1234");

        //find Register button and click
        clickOnElement(By.id("register-button"));

        //this is from requirement
        String expectedMessage = "Your registration completed";

        // find the welcome text element and get the text
        String actualMessage = getTextFromElement(By.xpath("//div[@class='result']"));

        //validate actual and expected message
        Assert.assertEquals("Your registration completed", expectedMessage, actualMessage);

        //find click on Continue button
        clickOnElement(By.xpath("//a[@class='button-1 register-continue-button']"));
    }


     @After
    public void tearDown() {
        closeBrowser();
    }


}