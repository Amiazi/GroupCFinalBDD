Feature: This is a script for Home Depot automated test cases.

  Scenario: Searching a product in the search bar.
    Given I am on Home Depot homepage
    When I type a product in the search bar
    And I click on the search icon
    Then I get the search results
