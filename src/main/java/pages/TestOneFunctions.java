package pages;

import helpers.WebDriverSetUp;
import helpers.errorMessages;
import locators.TestOneLocators;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import java.util.ArrayList;

public class TestOneFunctions extends WebDriverSetUp{


    TestOneLocators testOneLocators = new TestOneLocators();

    //Function for try to assert webpage title
    public void assertingTitle(){
        try {
            setUp();
            String expectedTitle = "Cryptocurrency Prices, Charts And Market Capitalizations | CoinMarketCap";
            String currentTitle = driver.getTitle();
            Assert.assertEquals(expectedTitle, currentTitle);
            System.out.println("Title assert passed!");
        } catch (Exception e) {
            System.out.println(errorMessages.titleNotMatching + ", check the webpage on which you are...");
        }
    }

    //Function for try to find categories button and click on it
    public void categoriesButton(){
        try {
            testOneLocators.categoryButtonLocator();
            System.out.println("Button categories found and clicked!");
        } catch (Exception e){
            System.out.println(errorMessages.elementNotFound);
        }
    }

    //Function for try to verify that all categories are displayed
    public void areCategoiresDisplayed() {
        try {
            testOneLocators.categoriesTableLocator();
            System.out.println("All categories are displayed!");
        } catch (Exception e) {
            System.out.println(errorMessages.elementNotFound);
        }
    }
}
