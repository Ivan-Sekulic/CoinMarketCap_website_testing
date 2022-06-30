Feature: Testing Spotlight option and recording data from Most visited category

  Scenario: Displaying and recording most visited cryptocurrencies in the Spotlight option
    
    Given user is on the coinmarket home page
    When user clicks on the Spotlight option
    And record data in the most visited category
    Then user should open Most Visited link in the new tab