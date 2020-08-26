$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/features/app.feature");
formatter.feature({
  "line": 1,
  "name": "Sample Mobile app automation",
  "description": "",
  "id": "sample-mobile-app-automation",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Sample Mobile app automation",
  "description": "",
  "id": "sample-mobile-app-automation;sample-mobile-app-automation",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "Enter username as \u003cUser Name\u003e and password as \u003cPassword\u003e",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Click on Login Button",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "Verify if house image is available",
  "keyword": "Then "
});
formatter.examples({
  "line": 8,
  "name": "",
  "description": "",
  "id": "sample-mobile-app-automation;sample-mobile-app-automation;",
  "rows": [
    {
      "cells": [
        "User Name",
        "Password"
      ],
      "line": 9,
      "id": "sample-mobile-app-automation;sample-mobile-app-automation;;1"
    },
    {
      "cells": [
        "percival@gmail.com",
        "123456"
      ],
      "line": 10,
      "id": "sample-mobile-app-automation;sample-mobile-app-automation;;2"
    },
    {
      "cells": [
        "arthur@gmail.com",
        "98765"
      ],
      "line": 11,
      "id": "sample-mobile-app-automation;sample-mobile-app-automation;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 14885064064,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "Sample Mobile app automation",
  "description": "",
  "id": "sample-mobile-app-automation;sample-mobile-app-automation;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "Enter username as percival@gmail.com and password as 123456",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Click on Login Button",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "Verify if house image is available",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "percival@gmail.com",
      "offset": 18
    },
    {
      "val": "123456",
      "offset": 53
    }
  ],
  "location": "AppStepDefinition.enter_username_and_password(String,String)"
});
formatter.result({
  "duration": 2735566685,
  "status": "passed"
});
formatter.match({
  "location": "AppStepDefinition.click_on_Login_Button()"
});
formatter.result({
  "duration": 1256589205,
  "status": "passed"
});
formatter.match({
  "location": "AppStepDefinition.verify_if_house_image_is_available()"
});
formatter.result({
  "duration": 5019896557,
  "status": "passed"
});
formatter.after({
  "duration": 1545144618,
  "status": "passed"
});
formatter.before({
  "duration": 11258801047,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "Sample Mobile app automation",
  "description": "",
  "id": "sample-mobile-app-automation;sample-mobile-app-automation;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "Enter username as arthur@gmail.com and password as 98765",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Click on Login Button",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "Verify if house image is available",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "arthur@gmail.com",
      "offset": 18
    },
    {
      "val": "98765",
      "offset": 51
    }
  ],
  "location": "AppStepDefinition.enter_username_and_password(String,String)"
});
formatter.result({
  "duration": 2496486159,
  "status": "passed"
});
formatter.match({
  "location": "AppStepDefinition.click_on_Login_Button()"
});
formatter.result({
  "duration": 1152306272,
  "status": "passed"
});
formatter.match({
  "location": "AppStepDefinition.verify_if_house_image_is_available()"
});
formatter.result({
  "duration": 5010285616,
  "status": "passed"
});
formatter.after({
  "duration": 1350005724,
  "status": "passed"
});
});