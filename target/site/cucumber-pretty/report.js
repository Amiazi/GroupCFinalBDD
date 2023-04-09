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
});