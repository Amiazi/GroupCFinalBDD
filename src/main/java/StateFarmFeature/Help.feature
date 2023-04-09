Feature: Help button redirects to Customer Care Page

    Scenario: Clicking help button would take to the customer care page
        Given I am on StateFarm homepage
        When I click on the help button
        Then I should be taken to the customer care page
