package testsuite;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

public class TopMenuTest extends Utility {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    //4.1
    public void userShouldNavigateToComputerPageSuccessfully() {
        // find computer link and click on it
        clickOnElement(By.linkText("Computers"));

        String expectedName = "Computers";

        // find the log out text is their in log out button
        String actualName = getTextFromElement(By.linkText("Computers"));

        //Verify both expeceted text and actual text
        Assert.assertEquals("Computers Tab is not available", expectedName, actualName);
    }

    @Test
    //4.2
    public void userShouldNavigateToElectronicsPageSuccessfully() {
        // find electronics link and click on it

        clickOnElement(By.xpath("//a[@href='/electronics']"));

        String expectedName = "Electoronics";

        // verify the Electoronics text is on the page

          String actualName = getTextFromElement(By.linkText("/html/body/div[6]/div[3]/div/div[3]/div/div[1]/h1"));

        //compare both expeceted text and actual text
        Assert.assertEquals("Electronics Tab is not available", expectedName, actualName);
    }

    //4.3
    @Test
    public void userShouldNavigateToApparelPageSuccessfully() {
        // find Apparel link and click on it
        clickOnElement(By.xpath("//a[@href=\"/apparel\"]"));

        String expectedName = "Apparel";

        // verify the Apparel text is on the page
        String actualName = getTextFromElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[1]/h1"));

        //compare both expeceted text and actual text
        Assert.assertEquals("Apparel Tab is not available", expectedName, actualName);
    }

    //4.4
    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully() {

        // find Digital downloads link and click on it
        clickOnElement(By.linkText("Digital downloads"));

        String expectedName = "Digital downloads";

        //verify the Digital downloads is visbile on web page
        String actualName = getTextFromElement(By.linkText("Digital downloads"));

        //compare both expeceted text and actual text
        Assert.assertEquals("Digital Downloads Tab is not available", expectedName, actualName);
    }

    //4.5
    @Test
    public void userShouldNavigateToBooksPageSuccessfully() {

        // find Books link and click on it
        clickOnElement(By.linkText("Books"));

        String expectedName = "Books";

        // verify Books visible on web page
        String actualName = getTextFromElement(By.linkText("Books"));

        //compare both expeceted text and actual text
        Assert.assertEquals("Books Tab is not available", expectedName, actualName);
    }

    //4.6
    @Test
    public void userShouldNavigateToJewelryPageSuccessfully() {
    // find Jewelry link and click on it
        clickOnElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[6]/a"));

        String expectedName = "Jewelry";

        // find the log out text is their in log out button
        String actualName = getTextFromElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[1]/h1"));

        //compare both expeceted text and actual text
        Assert.assertEquals("Jewelry Tab is not available", expectedName, actualName);
    }

    //4.7
    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfully() {
        // find Gift Cards link and click on it
        clickOnElement(By.linkText("Gift Cards"));

        String expectedName = "Gift Cards";

        // verify Gift Cards on visible on web page
        String actualName = getTextFromElement(By.linkText("Gift Cards"));

        //compare both expeceted text and actual text
        Assert.assertEquals("Gift Cards Tab is not available", expectedName, actualName);
    }
    @After
        public void tearDown() {
        closeBrowser();
    }

}