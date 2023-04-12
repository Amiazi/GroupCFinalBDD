Feature: This is a script for Home Depot automated test cases.

Feature: This is an automated testing script for StateFarm

  Scenario: Continue as guest test
    Given I am on the StateFarm homepage
    When I click on Banking link
    And I click on Payment Solutions
    And I click on Find Solutions
    And I click on Continue As Guest
    Then I will land on US Bank page

  Scenario: This is the test case for finding an agent
    Given I am on the StateFarm homepage
    When I click on Find An Agent
    And I type in the zipcode
    And I click on Find an agent search button
    Then I get the search results


  Scenario: This is the test case for finding insurance in NY
    Given I am on the StateFarm home page
    When I click on insurance
    And click on Life button
    And click on NY
    And click on go button
    Then I get the NY results

  Scenario: This is the test case for the help button
    Given I am on the StateFarm homepage
    When I click on help
    Then I land on page with help options

  Scenario:This is the test case for starting and ending a chat box
    Given I am on the StateFarm homepage
    When I click on Track a claim
    And I click start chat
    And I click cancel
    And I click the yes button
    Then I land back on claim tracking page
