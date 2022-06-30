package helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class WebDriverSetUp {

    public static WebDriver driver;
    private static String getURL = "https://coinmarketcap.com";
    private static String driverPath = "resources/chromedriver";

    public void setUp() {

        System.setProperty("webdriver.chrome.driver", driverPath);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(getURL);
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        try {
            driver.get(getURL);
            driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        } catch (Exception e){
            System.out.println(errorMessages.websiteDidNotReached + ", check the website link...");
        }
    }

    public void closeBrowser(){
        System.out.println("Closing browser...");
        driver.quit();
    }
}



