$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/main/java/HomeDepotFeature/HomeDepot.feature");
formatter.feature({
  "name": "This is a script for Home Depot automated test cases.",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Searching a product in the search bar.",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am on Home Depot homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "HomeDepotStepDefinition.HomeDepotStepDefinition.i_am_on_Home_Depot_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I type a product in the search bar",
  "keyword": "When "
});
formatter.match({
  "location": "HomeDepotStepDefinition.HomeDepotStepDefinition.i_type_a_product_in_the_search_bar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on the search icon",
  "keyword": "And "
});
formatter.match({
  "location": "HomeDepotStepDefinition.HomeDepotStepDefinition.i_click_on_the_search_icon()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I get the search results",
  "keyword": "Then "
});
formatter.match({
  "location": "HomeDepotStepDefinition.HomeDepotStepDefinition.i_get_the_search_results()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});