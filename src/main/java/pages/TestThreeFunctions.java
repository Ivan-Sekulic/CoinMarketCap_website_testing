package pages;

import helpers.WebDriverSetUp;
import helpers.errorMessages;
import locators.TestThreeLocators;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.ArrayList;

public class TestThreeFunctions extends WebDriverSetUp {
    TestThreeLocators testThreeLocators = new TestThreeLocators();
    private String coinMarketCapMostVisitedUrl = "https://coinmarketcap.com/most-viewed-pages/";
    private String mostiVisistedCurrentTitle = "What Are The Most Viewed Cryptocurrencies on CoinMarketCap? | CoinMarketCap";
    public void cryptocurrenciesDropDown(){
        try {
            setUp();
            WebDriverWait wait = new WebDriverWait(driver, 2);
            testThreeLocators.cryptocurrenciesDropLocator();
            System.out.println("Element found!");
        } catch (Exception e){
            System.out.println(errorMessages.elementNotFound);
        }
    }

    public void spotlightButton(){
          try {
            testThreeLocators.spotlightLocation();
              System.out.println("Action performed!");
          } catch (Exception e){
              System.out.println(errorMessages.elementNotFound);
          }
    }

    public void mostVisitedSection(){
        try {
            testThreeLocators.mostVisitedLocation();
            System.out.println("Hisytory passed!");
        } catch (Exception e){
            System.out.println(errorMessages.elementNotFound);
        }
    }

    public void navigateToNewTab(){
            ((JavascriptExecutor)driver).executeScript("window.open()");
            ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
            driver.switchTo().window(tabs.get(1));
            driver.get(coinMarketCapMostVisitedUrl);
        try {
            String currentTitle =  driver.getTitle();
            Assert.assertEquals(mostiVisistedCurrentTitle ,currentTitle);
            System.out.println("Title asssert on most visited page passed!");
        }  catch (Exception e){
            System.out.println(errorMessages.titleNotMatching + ", check the webpage on which you are...");
        }
    }
}
