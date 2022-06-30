package helpers;

import org.openqa.selenium.By;
import org.testng.Assert;

import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class Utility extends WebDriverSetUp {


    public  String generateNumFrom1to13() {
        int randomNum = ThreadLocalRandom.current().nextInt(1, 13 + 1);
        String s = String.valueOf(randomNum);
        return s;
    }

    public  int generateNumFrom5to10() {
        int randomNum2 = ThreadLocalRandom.current().nextInt(5, 10 + 1);
        return  randomNum2;
    }
    public  String createLocator(String coinRow) {
        String newLocator = "//tbody/tr[" + coinRow + "]/td[11]";
        return newLocator;
    }

    public void implicitWait(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    public void assertDataRange() {
        try {
            String expectedText = "Selected: 7 days   ";
            String currentText = driver.findElement(By.xpath("//p[contains(.,'Selected: 7 days')]")).getText();
            Assert.assertEquals(expectedText, currentText);
            System.out.println("Last 7 days period is selected");
        } catch (Exception e) {
            System.out.println(errorMessages.elementNotFound);
        }


    }
}
