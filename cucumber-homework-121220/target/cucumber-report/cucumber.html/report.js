$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/resources/featurefile/browsing.feature");
formatter.feature({
  "line": 1,
  "name": "amazon.co.uk Christmas Deals",
  "description": "As a user I want to visit amazon.co.uk for christmas offers",
  "id": "amazon.co.uk-christmas-deals",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 27,
  "name": "New customer wants to create account in amazon.co.uk",
  "description": "",
  "id": "amazon.co.uk-christmas-deals;new-customer-wants-to-create-account-in-amazon.co.uk",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 26,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 28,
  "name": "I am on home page",
  "keyword": "Given "
});
formatter.step({
  "line": 29,
  "name": "I mouse hover on Hello, Sign in",
  "keyword": "When "
});
formatter.step({
  "line": 30,
  "name": "I click on New customer? Start here.",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "I should be on Create account page with expectedText \"Create account\"",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "I enter name \"\u003cname\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "I enter email \"\u003crandomEmailAddress\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "I enter password \"\u003crandomPassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "I click on Create your Amazon account",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "Verify that you are a real person text \"\u003crealPersonText\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "line": 37,
  "name": "",
  "description": "",
  "id": "amazon.co.uk-christmas-deals;new-customer-wants-to-create-account-in-amazon.co.uk;",
  "rows": [
    {
      "cells": [
        "name",
        "randomEmailAddress",
        "randomPassword",
        "realPersonText"
      ],
      "line": 38,
      "id": "amazon.co.uk-christmas-deals;new-customer-wants-to-create-account-in-amazon.co.uk;;1"
    },
    {
      "cells": [
        "Jagira",
        "randomEmailAddress",
        "randomPassword",
        "solve this puzzle so we know that you\u0027re a real person"
      ],
      "line": 39,
      "id": "amazon.co.uk-christmas-deals;new-customer-wants-to-create-account-in-amazon.co.uk;;2"
    },
    {
      "cells": [
        "Mowgali",
        "randomEmailAddress",
        "randomPassword",
        "Please solve this puzzle so we know that you\u0027re a real person"
      ],
      "line": 40,
      "id": "amazon.co.uk-christmas-deals;new-customer-wants-to-create-account-in-amazon.co.uk;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 8174285499,
  "status": "passed"
});
formatter.scenario({
  "line": 39,
  "name": "New customer wants to create account in amazon.co.uk",
  "description": "",
  "id": "amazon.co.uk-christmas-deals;new-customer-wants-to-create-account-in-amazon.co.uk;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 26,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 28,
  "name": "I am on home page",
  "keyword": "Given "
});
formatter.step({
  "line": 29,
  "name": "I mouse hover on Hello, Sign in",
  "keyword": "When "
});
formatter.step({
  "line": 30,
  "name": "I click on New customer? Start here.",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "I should be on Create account page with expectedText \"Create account\"",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "I enter name \"Jagira\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "I enter email \"randomEmailAddress\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "I enter password \"randomPassword\"",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "I click on Create your Amazon account",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "Verify that you are a real person text \"solve this puzzle so we know that you\u0027re a real person\"",
  "matchedColumns": [
    3
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "BrowsingStepdefs.iAmOnHomePage()"
});
formatter.result({
  "duration": 142454900,
  "status": "passed"
});
formatter.match({
  "location": "BrowsingStepdefs.iMouseHoverOnHelloSignIn()"
});
formatter.result({
  "duration": 376602701,
  "status": "passed"
});
formatter.match({
  "location": "BrowsingStepdefs.iClickOnNewCustomerStartHere()"
});
formatter.result({
  "duration": 660243300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Create account",
      "offset": 54
    }
  ],
  "location": "BrowsingStepdefs.iShouldBeOnCreateAccountPageWithExpectedText(String)"
});
formatter.result({
  "duration": 74673200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Jagira",
      "offset": 14
    }
  ],
  "location": "BrowsingStepdefs.iEnterName(String)"
});
formatter.result({
  "duration": 117281500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "randomEmailAddress",
      "offset": 15
    }
  ],
  "location": "BrowsingStepdefs.iEnterEmail(String)"
});
formatter.result({
  "duration": 154331801,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "randomPassword",
      "offset": 18
    }
  ],
  "location": "BrowsingStepdefs.iEnterPassword(String)"
});
formatter.result({
  "duration": 454388199,
  "status": "passed"
});
formatter.match({
  "location": "BrowsingStepdefs.iClickOnCreateYourAmazonAccount()"
});
formatter.result({
  "duration": 1347649900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "solve this puzzle so we know that you\u0027re a real person",
      "offset": 40
    }
  ],
  "location": "BrowsingStepdefs.verifyThatYouAreARealPersonText(String)"
});
formatter.result({
  "duration": 77460701,
  "error_message": "org.junit.ComparisonFailure: expected:\u003c[]solve this puzzle so...\u003e but was:\u003c[Please ]solve this puzzle so...\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:115)\r\n\tat org.junit.Assert.assertEquals(Assert.java:144)\r\n\tat uk.co.amazon.cucumber.stepdefs.BrowsingStepdefs.verifyThatYouAreARealPersonText(BrowsingStepdefs.java:121)\r\n\tat ✽.Then Verify that you are a real person text \"solve this puzzle so we know that you\u0027re a real person\"(src/test/java/resources/featurefile/browsing.feature:36)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 1173432599,
  "status": "passed"
});
formatter.before({
  "duration": 6614975600,
  "status": "passed"
});
formatter.scenario({
  "line": 40,
  "name": "New customer wants to create account in amazon.co.uk",
  "description": "",
  "id": "amazon.co.uk-christmas-deals;new-customer-wants-to-create-account-in-amazon.co.uk;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 26,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 28,
  "name": "I am on home page",
  "keyword": "Given "
});
formatter.step({
  "line": 29,
  "name": "I mouse hover on Hello, Sign in",
  "keyword": "When "
});
formatter.step({
  "line": 30,
  "name": "I click on New customer? Start here.",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "I should be on Create account page with expectedText \"Create account\"",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "I enter name \"Mowgali\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "I enter email \"randomEmailAddress\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "I enter password \"randomPassword\"",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "I click on Create your Amazon account",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "Verify that you are a real person text \"Please solve this puzzle so we know that you\u0027re a real person\"",
  "matchedColumns": [
    3
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "BrowsingStepdefs.iAmOnHomePage()"
});
formatter.result({
  "duration": 36001,
  "status": "passed"
});
formatter.match({
  "location": "BrowsingStepdefs.iMouseHoverOnHelloSignIn()"
});
formatter.result({
  "duration": 789948500,
  "status": "passed"
});
formatter.match({
  "location": "BrowsingStepdefs.iClickOnNewCustomerStartHere()"
});
formatter.result({
  "duration": 495562299,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Create account",
      "offset": 54
    }
  ],
  "location": "BrowsingStepdefs.iShouldBeOnCreateAccountPageWithExpectedText(String)"
});
formatter.result({
  "duration": 59206601,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Mowgali",
      "offset": 14
    }
  ],
  "location": "BrowsingStepdefs.iEnterName(String)"
});
formatter.result({
  "duration": 148305999,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "randomEmailAddress",
      "offset": 15
    }
  ],
  "location": "BrowsingStepdefs.iEnterEmail(String)"
});
formatter.result({
  "duration": 177882300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "randomPassword",
      "offset": 18
    }
  ],
  "location": "BrowsingStepdefs.iEnterPassword(String)"
});
formatter.result({
  "duration": 493300800,
  "status": "passed"
});
formatter.match({
  "location": "BrowsingStepdefs.iClickOnCreateYourAmazonAccount()"
});
formatter.result({
  "duration": 1353513900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Please solve this puzzle so we know that you\u0027re a real person",
      "offset": 40
    }
  ],
  "location": "BrowsingStepdefs.verifyThatYouAreARealPersonText(String)"
});
formatter.result({
  "duration": 72032500,
  "status": "passed"
});
formatter.after({
  "duration": 786618500,
  "status": "passed"
});
});