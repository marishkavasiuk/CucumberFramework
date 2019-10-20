$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "Login into account",
  "description": "Existing stackoverflow user should be able to login into account using correct credentials",
  "id": "login-into-account",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Login into account with correct details",
  "description": "",
  "id": "login-into-account;login-into-account-with-correct-details",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User opens home page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User clicks on the login button on homepage",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User enters a valid username",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User enters a valid password",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User clicks on the login button",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "User should be taken to the successful login page",
  "keyword": "Then "
});
formatter.match({
  "location": "HomeStep.user_opens_home_page()"
});
formatter.result({
  "duration": 6204640800,
  "status": "passed"
});
formatter.match({
  "location": "HomeStep.user_clicks_on_the_login_button_on_homepage()"
});
formatter.result({
  "duration": 459405600,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.user_enters_a_valid_username()"
});
formatter.result({
  "duration": 166426400,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.user_enters_a_valid_password()"
});
formatter.result({
  "duration": 95098900,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.user_clicks_on_the_login_button()"
});
formatter.result({
  "duration": 72646700,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.user_should_be_taken_to_the_successful_login_page()"
});
formatter.result({
  "duration": 3101866800,
  "status": "passed"
});
formatter.after({
  "duration": 777757600,
  "status": "passed"
});
formatter.uri("Search.feature");
formatter.feature({
  "line": 1,
  "name": "Search answers",
  "description": "Existing stackoverflow user should be able to find answer for his question",
  "id": "search-answers",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Search answers",
  "description": "",
  "id": "search-answers;search-answers",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User opens home page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User enters a valid request",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User clicks search",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User should get correct response",
  "keyword": "Then "
});
formatter.match({
  "location": "HomeStep.user_opens_home_page()"
});
formatter.result({
  "duration": 5134433200,
  "status": "passed"
});
formatter.match({
  "location": "SearchStep.user_enters_request_to_search_field()"
});
formatter.result({
  "duration": 281915600,
  "status": "passed"
});
formatter.match({
  "location": "SearchStep.user_clicks_enter()"
});
formatter.result({
  "duration": 1415061800,
  "status": "passed"
});
formatter.match({
  "location": "SearchStep.user_should_get_correct_response()"
});
formatter.result({
  "duration": 88655400,
  "status": "passed"
});
formatter.after({
  "duration": 759051500,
  "status": "passed"
});
});