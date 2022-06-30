package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import helpers.WebDriverSetUp;
import org.openqa.selenium.By;
import pages.TestTwoFunctions;


public class TestTwoSteps extends WebDriverSetUp {


    @Given("user is on coinmarketcap home page")
    public void user_is_on_coinmarketcap_home_page() {

        setUp();
        System.out.println("Opening coinmarketcap website");
    }

    @When("user selects random five to ten cryptocurrencies")
    public void user_selects_random_five_to_ten_cryptocurrencies() throws InterruptedException {

        TestTwoFunctions testTwoFunctions = new TestTwoFunctions();
        testTwoFunctions.wholeOrdeal();

        }
    @And("user clicks on view historical data")
    public void user_clicks_on_view_historical_data () {


    }
    @Then("user should see results for last seven days")
    public void user_should_see_results_for_last_seven_days () {
        closeBrowser();
    }


}
