$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/main/java/StateFarmFeature/ContactUs.feature");
formatter.feature({
  "name": "Credit Card Inquiries US Bank Phone Numbers",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "user can see the consumer and business tel number",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I am on StateFarm homepage",
  "keyword": "Given "
});
formatter.step({
  "name": "I scroll to the bottom of the page",
  "keyword": "When "
});
formatter.step({
  "name": "clicks the contact us link",
  "keyword": "And "
});
formatter.step({
  "name": "I should be taken to the contact us page",
  "keyword": "Then "
});
formatter.step({
  "name": "In the Credit card inquiries - U.S. Bank section I should see the consumer tel as \"\u003cconsumer_tel\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "The business tel number as \"\u003cbusiness_tel\u003e\"",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "consumer_tel",
        "business_tel"
      ]
    },
    {
      "cells": [
        "833-728-0344",
        "833-728-0345"
      ]
    }
  ]
});
formatter.scenario({
  "name": "user can see the consumer and business tel number",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I am on StateFarm homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "StateFarmStepDefinition.StepDefinitions.iAmOnStateFarmHomepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I scroll to the bottom of the page",
  "keyword": "When "
});
formatter.match({
  "location": "StateFarmStepDefinition.StepDefinitions.iScrollToTheBottomOfThePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicks the contact us link",
  "keyword": "And "
});
formatter.match({
  "location": "StateFarmStepDefinition.StepDefinitions.clicksTheContactUpLink()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should be taken to the contact us page",
  "keyword": "Then "
});
formatter.match({
  "location": "StateFarmStepDefinition.StepDefinitions.iShouldBeTakenToTheContactUsPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "In the Credit card inquiries - U.S. Bank section I should see the consumer tel as \"833-728-0344\"",
  "keyword": "Then "
});
formatter.match({
  "location": "StateFarmStepDefinition.StepDefinitions.inTheCreditCardInquiriesUSBankSectionIShouldSeeTheConsumerTelAs(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The business tel number as \"833-728-0345\"",
  "keyword": "And "
});
formatter.match({
  "location": "StateFarmStepDefinition.StepDefinitions.theBusinessTelNumberAs(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/main/java/StateFarmFeature/Help.feature");
formatter.feature({
  "name": "Help button redirects to Customer Care Page",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Clicking help button would take to the customer care page",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I am on StateFarm homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "StateFarmStepDefinition.StepDefinitions.iAmOnStateFarmHomepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on the help button",
  "keyword": "When "
});
formatter.match({
  "location": "StateFarmStepDefinition.StepDefinitions.iClickOnTheHelpButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should be taken to the customer care page",
  "keyword": "Then "
});
formatter.match({
  "location": "StateFarmStepDefinition.StepDefinitions.iShouldBeTakenToTheCustomerCarePage()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/main/java/StateFarmFeature/Multilingualism.feature");
formatter.feature({
  "name": "Support for spanish language on the website",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I am on StateFarm homepage",
  "keyword": "Given "
});
formatter.step({
  "name": "I click on the epsanol button",
  "keyword": "When "
});
formatter.step({
  "name": "I should see the website language changed to spanish by checking the \"\u003cexpected Heading\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "expected Heading"
      ]
    },
    {
      "cells": [
        "Crea un precio económico, solo para ti."
      ]
    }
  ]
});
formatter.scenario({
  "name": "",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I am on StateFarm homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "StateFarmStepDefinition.StepDefinitions.iAmOnStateFarmHomepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on the epsanol button",
  "keyword": "When "
});
formatter.match({
  "location": "StateFarmStepDefinition.StepDefinitions.iClickOnTheEpsanolButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should see the website language changed to spanish by checking the \"Crea un precio económico, solo para ti.\"",
  "keyword": "Then "
});
formatter.match({
  "location": "StateFarmStepDefinition.StepDefinitions.iShouldSeeTheWebsiteLanguageChangedToSpanishByCheckingThe(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/main/java/StateFarmFeature/Searching.feature");
formatter.feature({
  "name": "User can search anything on the site",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "When user searches \"Auto insurance\" keyword, they should see more than one search result",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I am on StateFarm homepage",
  "keyword": "Given "
});
formatter.step({
  "name": "I click on the search link",
  "keyword": "When "
});
formatter.step({
  "name": "I enter \"\u003csearch keyword\u003e\" to search and click the search button",
  "keyword": "And "
});
formatter.step({
  "name": "I should be taken to the search result page",
  "keyword": "Then "
});
formatter.step({
  "name": "There I can verify that more than one search result for the keyword is shown",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "search keyword"
      ]
    },
    {
      "cells": [
        "Auto insurance"
      ]
    }
  ]
});
formatter.scenario({
  "name": "When user searches \"Auto insurance\" keyword, they should see more than one search result",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I am on StateFarm homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "StateFarmStepDefinition.StepDefinitions.iAmOnStateFarmHomepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on the search link",
  "keyword": "When "
});
formatter.match({
  "location": "StateFarmStepDefinition.StepDefinitions.iClickOnTheSearchLink()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter \"Auto insurance\" to search and click the search button",
  "keyword": "And "
});
formatter.match({
  "location": "StateFarmStepDefinition.StepDefinitions.iEnterToSearchAndClickTheSearchButton(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should be taken to the search result page",
  "keyword": "Then "
});
formatter.match({
  "location": "StateFarmStepDefinition.StepDefinitions.iShouldBeTakenToTheSearchResultPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "There I can verify that more than one search result for the keyword is shown",
  "keyword": "And "
});
formatter.match({
  "location": "StateFarmStepDefinition.StepDefinitions.thereICanVerifyThatMoreThanOneSearchResultForTheKeywordIsShown()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});