Feature: Credit Card Inquiries US Bank Phone Numbers

 Scenario Outline: user can see the consumer and business tel number
    Given I am on StateFarm homepage
      When I scroll to the bottom of the page
      And clicks the contact us link
      Then I should be taken to the contact us page
     Then In the Credit card inquiries - U.S. Bank section I should see the consumer tel as "<consumer_tel>"
     And The business tel number as "<business_tel>"


     Examples:
     | consumer_tel | business_tel |
     | 833-728-0344 | 833-728-0345 |
