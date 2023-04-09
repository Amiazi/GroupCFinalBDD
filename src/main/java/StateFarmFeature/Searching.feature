Feature: User can search anything on the site

    Scenario Outline: When user searches "Auto insurance" keyword, they should see more than one search result
        Given I am on StateFarm homepage
        When I click on the search link
        And I enter "<search keyword>" to search and click the search button
        Then I should be taken to the search result page
        And There I can verify that more than one search result for the keyword is shown

        Examples:
        | search keyword |
        | Auto insurance |
