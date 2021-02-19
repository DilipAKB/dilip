$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/features/duckssearch.feature");
formatter.feature({
  "name": "Search for ducks on google",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Verifying searching ducks",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "Open chrome and launch google",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdef.Enter_ducks_in_search_bar_and_hit_search()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "search ducks and open wikipage",
  "keyword": "When "
});
formatter.match({
  "location": "stepdef.search_ducks_and_open_wikipage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "ducks wiki should open",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdef.ducks_wiki_should_open()"
});
formatter.result({
  "status": "passed"
});
});