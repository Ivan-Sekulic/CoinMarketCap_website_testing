package steps;

import helpers.WebDriverSetUp;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.TestOneFunctions;

public class TestOneSteps {
    TestOneFunctions testOneFunctions = new TestOneFunctions();
    WebDriverSetUp webDriverSetUp =  new WebDriverSetUp();

    @Given("user is on coinmarketcap website")
    public void user_is_on_coinmarketcap_website() {
        System.out.println("User is on coinmarketcap website...");
        System.out.println("Trying to match titles...");
        testOneFunctions.assertingTitle();
    }

    @When("user clicks on categories button")
    public void user_clicks_on_categories_button() {
        System.out.println("Trying to find and click the categories button...");
        testOneFunctions.categoriesButton();
    }

    @Then("user should see all categories")
    public void user_should_see_all_categories() {
        testOneFunctions.areCategoiresDisplayed();
        webDriverSetUp.closeBrowser();
    }
}
