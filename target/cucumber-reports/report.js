$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/google.feature");
formatter.feature({
  "name": "Google home page",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "I am testing Google search box",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I am on  Google home page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.GoogleStepDefinitaions.i_am_on_Google_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "i click the search box i should  see the cursor",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitions.GoogleStepDefinitaions.i_click_the_search_box_i_should_see_the_cursor()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "i will enter the Laptop",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.GoogleStepDefinitaions.i_will_enter_the_Laptop()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I will click the search button",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.GoogleStepDefinitaions.i_will_click_the_search_button()"
});
formatter.result({
  "status": "passed"
});
});