package pages;

import helpers.WebDriverSetUp;
import helpers.Utility;
import locators.TestTwoLocators;
import org.openqa.selenium.By;
import org.testng.Assert;


public class TestTwoFunctions extends WebDriverSetUp {

    TestTwoLocators testTwoLocators = new TestTwoLocators();
    Utility utility = new Utility();


    public void wholeOrdeal() throws InterruptedException {

        testTwoLocators.closeCookieBanner();
        for (int i = 0; i < utility.generateNumFrom5to10(); i++) {
            utility.implicitWait();
            testTwoLocators.clickRandomCrypto();
            System.out.println("Generated number is: " + utility.generateNumFrom1to13());
            clickerFunction();
            System.out.println("Going back to the homepage");

        }
    }

    private void clickerFunction()  {
        utility.implicitWait();
        //selecting 7 days period from the data range
        testTwoLocators.clickHistAndData();
        testTwoLocators.getDataRange();
        utility.assertDataRange();
        testTwoLocators.clickContinue();
        //going back to the homepage, from which new crypto will be selected
        driver.navigate().back();
    }
}


