Feature: Testing button functionality on coinmarketcap websitetestTwoLocators.clickHistAndData();
        testTwoLocators.getDataRange();

  Scenario: Opening coinmarketcap webise and testing categories button functionality

    Given user is on coinmarketcap website
    When user clicks on categories button
    Then user should see all categories

