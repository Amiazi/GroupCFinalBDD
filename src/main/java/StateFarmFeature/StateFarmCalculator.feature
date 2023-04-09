Feature: Homepage Discover more articles carousel has calculator card. When users clicks on the card, they should be taken to the calculator page

    Scenario Outline: User clicks next button on the homepage Discover more articles carousel and after seeing the calculator card
    they clicks it. This will load the calculator page on the current tab
        Given I am on StateFarm homepage
        When I scroll to the discover more articles sections
        And clicks the next button until the calculator card is being displayed and clicks the card
        Then I should be taken to the calculator page whose url should be as "<calculator page url>"

        Examples:
        |calculator page url|
        |https://www.statefarm.com/simple-insights/calculators|
