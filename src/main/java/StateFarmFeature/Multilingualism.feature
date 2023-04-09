Feature: Support for spanish language on the website

    Scenario Outline:
        Given I am on StateFarm homepage
        When I click on the epsanol button
        Then I should see the website language changed to spanish by checking the "<expected Heading>"

        Examples:
        |expected Heading|
        |Crea un precio económico, solo para ti.|
