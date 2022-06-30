package locators;

import helpers.WebDriverSetUp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class TestOneLocators extends WebDriverSetUp {

    public void categoryButtonLocator(){
    WebDriverWait wait = new WebDriverWait(driver, 10);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/div[1]/div[2]/div/div[1]/div[4]/div[2]/div[2]/a[2]/button")));
    var buttonTest = driver.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/div/div[1]/div[4]/div[2]/div[2]/a[2]/button"));
            buttonTest.click();
    }

    public void categoriesTableLocator(){
        var categoriesDiv = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div/div/div[2]"));
        categoriesDiv.isDisplayed();
    }
}
