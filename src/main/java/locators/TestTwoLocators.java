package locators;

import helpers.WebDriverSetUp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import helpers.Utility;
import org.openqa.selenium.interactions.Actions;
import helpers.errorMessages;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;


public class TestTwoLocators extends WebDriverSetUp {

    Utility utility = new Utility();

    public void getDataRange(){
        try{
            List<WebElement> historyList = driver.findElements(By.tagName("li"));
            for (WebElement li : historyList) {
                if (li.getText().equals("Last 7 days")) {
                    li.click();
                    }
                }
            }
        catch(Exception e){
            System.out.println(errorMessages.elementNotFound);
            }
        }

    public void clickContinue(){
        try{
            List<WebElement> continueButton = driver.findElements(By.tagName("button"));
            for (WebElement button : continueButton) {
                if (button.getText().equals("Continue")) {
                    System.out.println("Confirming selected data range");
                    button.click();
                    }
                 }
            }
        catch(Exception e){
                System.out.println(errorMessages.elementNotFound);
                }
         }

    public void clickHistAndData(){
        //this method finds locators and clicks on them
        try {
            utility.implicitWait();
            WebElement histData = driver.findElement(By.linkText("View Historical Data"));
            histData.click();
            System.out.println("Clicking View Historical Data button");
            WebElement dateButton = driver.findElement(By.xpath("/html/body/div/div[1]/div/div[2]/div/div[3]/div/div/div[1]/span/button"));
            dateButton.click();
            System.out.println("Clicking data range button");
        }
        catch (Exception e){
                System.out.println(errorMessages.elementNotFound);
            }
    }

    public void clickRandomCrypto() {
      try {
            WebElement randomCrypto = driver.findElement(By.xpath(utility.createLocator(utility.generateNumFrom1to13())));
            Actions actions = new Actions(driver);
            actions.moveToElement(randomCrypto);
            randomCrypto.click();
        }
      catch (Exception e){
            System.out.println(errorMessages.elementNotFound);
        }
    }

    public void closeCookieBanner(){
        try{
            driver.findElement(By.className("cmc-cookie-policy-banner__close")).click();
            System.out.println("Cookie banner closed");
        }
        catch (Exception e){
            System.out.println("Cookie banner not found");
        }
    }

}

