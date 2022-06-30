Feature: Testing history data for random cryptocurrencies

  Scenario: Showing history data for random five to ten cryptocurrencies
    Given user is on coinmarketcap home page
    When user selects random five to ten cryptocurrencies
    And user clicks on view historical data
    Then user should see results for last seven days
