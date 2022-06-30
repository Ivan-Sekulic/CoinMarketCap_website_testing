package locators;

import helpers.WebDriverSetUp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class TestThreeLocators extends WebDriverSetUp {
    private Actions actions;
    private WebDriverWait wait;
    public void cryptocurrenciesDropLocator(){
        wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Cryptocurrencies")));
        WebElement mainElement = driver.findElement(By.linkText("Cryptocurrencies"));
        actions = new Actions(driver);
        actions.moveToElement(mainElement).perform();
    }

    public void spotlightLocation(){
        wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Spotlight")));
        WebElement subElement = driver.findElement(By.linkText("Spotlight"));
        actions = new Actions(driver);
        actions.moveToElement(subElement);
        actions.click().build().perform();
    }

    public void mostVisitedLocation() {
        wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"__next\"]/div/div/div[2]/div/div[2]/div[4]/div[2]/table")));
        WebElement table = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div[2]/div/div[2]/div[4]/div[2]/table"));
        actions = new Actions(driver);
        actions.moveToElement(table).perform();

        // Get all the table row elements from the table
        List<WebElement> allRows = driver.findElements(By.xpath("//*[@id=\"__next\"]/div/div/div[2]/div/div[2]/div[4]/div[2]/table/tbody"));

        // Iterate over them and get all the cells
        for (WebElement row : allRows) {
            List<WebElement> fields = row.findElements(By.tagName("td"));

            // Print the contents of each cell
            for (WebElement field : fields) {
                System.out.println("Most visited table data: " + field.getText());
            }
        }
    }
}
