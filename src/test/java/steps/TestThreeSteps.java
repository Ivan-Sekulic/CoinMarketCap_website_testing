package steps;

import helpers.WebDriverSetUp;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.TestThreeFunctions;

public class TestThreeSteps {
    TestThreeFunctions testThreeFunctions = new TestThreeFunctions();
    WebDriverSetUp webDriverSetUp =  new WebDriverSetUp();

    @Given("user is on the coinmarket home page")
    public void user_is_on_the_coinmarket_home_page() {
        System.out.println("User is on coinmarketcap website...");
    }

    @When("user clicks on the Spotlight option")
    public void user_clicks_on_the_spotlight_option() {
        testThreeFunctions.cryptocurrenciesDropDown();
        System.out.println("Cryptocurrencies dropdown howered...");
        testThreeFunctions.spotlightButton();
        System.out.println("Spotlight section selected...");
    }

    @And("record data in the most visited category")
    public void record_data_in_the_most_visited_category() {
        testThreeFunctions.mostVisitedSection();
        System.out.println("Most visited section found, all results printed...");
        testThreeFunctions.navigateToNewTab();
        System.out.println("New tab opened and navigated to it...");
    }

    @Then("user should open Most Visited link in the new tab")
    public void user_should_open_most_visited_link_in_the_new_tab() {
       webDriverSetUp.closeBrowser();

    }
}
