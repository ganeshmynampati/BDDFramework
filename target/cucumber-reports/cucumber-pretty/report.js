$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/hireSUV.feature");
formatter.feature({
  "name": "Hire SUV",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Hire budget SUV with five seats for one week trip",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user is on budget application home page",
  "keyword": "Given "
});
formatter.step({
  "name": "user types \"\u003clocation search keyword\u003e\" and selects pickup and return location as \"\u003clocation\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "pickup date as week ahead of current date",
  "keyword": "And "
});
formatter.step({
  "name": "return date as week ahead of pickup date",
  "keyword": "And "
});
formatter.step({
  "name": "clicks Select My car option to navigate to reservations page",
  "keyword": "And "
});
formatter.step({
  "name": "chooses lowest price SUV with \"\u003cX\u003e\" doors and \"\u003cY\u003e\" seats and click pay now option",
  "keyword": "And "
});
formatter.step({
  "name": "user validates base rate, fees and taxes and estimated prepaid total succesfully",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "location search keyword",
        "location",
        "X",
        "Y"
      ]
    },
    {
      "cells": [
        "aus",
        "Austin Bergstrom Intl Airport",
        "4",
        "5"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Hire budget SUV with five seats for one week trip",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on budget application home page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.HomePageStepDefinitions.user_is_on_budget_application_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user types \"aus\" and selects pickup and return location as \"Austin Bergstrom Intl Airport\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitions.HomePageStepDefinitions.user_types_and_selects_pickup_location_as(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "pickup date as week ahead of current date",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.HomePageStepDefinitions.pickup_date_as_week_ahead_of_current_date()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "return date as week ahead of pickup date",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.HomePageStepDefinitions.return_date_as_week_ahead_of_pickup_date()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicks Select My car option to navigate to reservations page",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.HomePageStepDefinitions.clicks_select_my_car_option_to_navigate_to_reservations_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "chooses lowest price SUV with \"4\" doors and \"5\" seats and click pay now option",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.ReservationsPageStepDefinitions.chooses_lowest_price_SUV_with_doors_and_seats_and_click_pay_now_option(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user validates base rate, fees and taxes and estimated prepaid total succesfully",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.ReservationsPageStepDefinitions.user_validates_base_rate_fees_and_taxes_and_estimated_prepaid_total_succesfully()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Hire budget SUV with six seats for one week trip",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user is on budget application home page",
  "keyword": "Given "
});
formatter.step({
  "name": "user types \"\u003clocation search keyword\u003e\" and selects pickup and return location as \"\u003clocation\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "pickup date as week ahead of current date",
  "keyword": "And "
});
formatter.step({
  "name": "return date as week ahead of pickup date",
  "keyword": "And "
});
formatter.step({
  "name": "clicks Select My car option to navigate to reservations page",
  "keyword": "And "
});
formatter.step({
  "name": "chooses lowest price SUV with \"\u003cX\u003e\" doors and \"\u003cY\u003e\" seats and click pay now option",
  "keyword": "And "
});
formatter.step({
  "name": "user validates base rate, fees and taxes and estimated prepaid total succesfully",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "location search keyword",
        "location",
        "X",
        "Y"
      ]
    },
    {
      "cells": [
        "aus",
        "Austin Bergstrom Intl Airport",
        "4",
        "6"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Hire budget SUV with six seats for one week trip",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on budget application home page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.HomePageStepDefinitions.user_is_on_budget_application_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user types \"aus\" and selects pickup and return location as \"Austin Bergstrom Intl Airport\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitions.HomePageStepDefinitions.user_types_and_selects_pickup_location_as(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "pickup date as week ahead of current date",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.HomePageStepDefinitions.pickup_date_as_week_ahead_of_current_date()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "return date as week ahead of pickup date",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.HomePageStepDefinitions.return_date_as_week_ahead_of_pickup_date()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicks Select My car option to navigate to reservations page",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.HomePageStepDefinitions.clicks_select_my_car_option_to_navigate_to_reservations_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "chooses lowest price SUV with \"4\" doors and \"6\" seats and click pay now option",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.ReservationsPageStepDefinitions.chooses_lowest_price_SUV_with_doors_and_seats_and_click_pay_now_option(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user validates base rate, fees and taxes and estimated prepaid total succesfully",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.ReservationsPageStepDefinitions.user_validates_base_rate_fees_and_taxes_and_estimated_prepaid_total_succesfully()"
});
formatter.result({
  "error_message": "org.openqa.selenium.TimeoutException: Expected condition failed: waiting for visibility of Proxy element for: DefaultElementLocator \u0027By.xpath: //div[@ng-show\u003d\u0027mode\u0027]/descendant::div[@class\u003d\u0027vehicle-name\u0027]/parent::div\u0027 (tried for 60 second(s) with 500 milliseconds interval)\r\n\tat org.openqa.selenium.support.ui.WebDriverWait.timeoutException(WebDriverWait.java:95)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:272)\r\n\tat utils.TestUtils.waitForElementToBeVisible(TestUtils.java:152)\r\n\tat steps.ReservationPageSteps.confirmSUVDetails(ReservationPageSteps.java:94)\r\n\tat stepdefinitions.ReservationsPageStepDefinitions.user_validates_base_rate_fees_and_taxes_and_estimated_prepaid_total_succesfully(ReservationsPageStepDefinitions.java:30)\r\n\tat ✽.user validates base rate, fees and taxes and estimated prepaid total succesfully(file:///C:/Users/Mynampati/Downloads/BDDFramework/BDDFramework/src/test/resources/features/hireSUV.feature:25)\r\nCaused by: org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//div[@ng-show\u003d\u0027mode\u0027]/descendant::div[@class\u003d\u0027vehicle-name\u0027]/parent::div\"}\n  (Session info: chrome\u003d84.0.4147.135)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027MYNAMPATI\u0027, ip: \u0027192.168.0.109\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_144\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 84.0.4147.135, chrome: {chromedriverVersion: 84.0.4147.30 (48b3e868b4cc0..., userDataDir: C:\\Users\\MYNAMP~1\\AppData\\L...}, goog:chromeOptions: {debuggerAddress: localhost:50758}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: 87f6c636b2e16c5015c5a04d6fe2bde9\n*** Element info: {Using\u003dxpath, value\u003d//div[@ng-show\u003d\u0027mode\u0027]/descendant::div[@class\u003d\u0027vehicle-name\u0027]/parent::div}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy18.isDisplayed(Unknown Source)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions.elementIfVisible(ExpectedConditions.java:314)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions.access$000(ExpectedConditions.java:43)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions$10.apply(ExpectedConditions.java:300)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions$10.apply(ExpectedConditions.java:297)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:249)\r\n\tat utils.TestUtils.waitForElementToBeVisible(TestUtils.java:152)\r\n\tat steps.ReservationPageSteps.confirmSUVDetails(ReservationPageSteps.java:94)\r\n\tat stepdefinitions.ReservationsPageStepDefinitions.user_validates_base_rate_fees_and_taxes_and_estimated_prepaid_total_succesfully(ReservationsPageStepDefinitions.java:30)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat io.cucumber.java.Invoker.invoke(Invoker.java:27)\r\n\tat io.cucumber.java.JavaStepDefinition.execute(JavaStepDefinition.java:27)\r\n\tat io.cucumber.core.runner.PickleStepDefinitionMatch.runStep(PickleStepDefinitionMatch.java:63)\r\n\tat io.cucumber.core.runner.TestStep.executeStep(TestStep.java:64)\r\n\tat io.cucumber.core.runner.TestStep.run(TestStep.java:49)\r\n\tat io.cucumber.core.runner.PickleStepTestStep.run(PickleStepTestStep.java:46)\r\n\tat io.cucumber.core.runner.TestCase.run(TestCase.java:51)\r\n\tat io.cucumber.core.runner.Runner.runPickle(Runner.java:66)\r\n\tat io.cucumber.testng.TestNGCucumberRunner.runScenario(TestNGCucumberRunner.java:120)\r\n\tat io.cucumber.testng.AbstractTestNGCucumberTests.runScenario(AbstractTestNGCucumberTests.java:29)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat org.testng.internal.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:124)\r\n\tat org.testng.internal.Invoker.invokeMethod(Invoker.java:583)\r\n\tat org.testng.internal.Invoker.invokeTestMethod(Invoker.java:719)\r\n\tat org.testng.internal.TestMethodWithDataProviderMethodWorker.call(TestMethodWithDataProviderMethodWorker.java:71)\r\n\tat org.testng.internal.TestMethodWithDataProviderMethodWorker.call(TestMethodWithDataProviderMethodWorker.java:14)\r\n\tat java.util.concurrent.FutureTask.run(FutureTask.java:266)\r\n\tat java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:511)\r\n\tat java.util.concurrent.FutureTask.run(FutureTask.java:266)\r\n\tat java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)\r\n\tat java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)\r\n\tat java.lang.Thread.run(Thread.java:748)\r\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded0.png", "Hire budget SUV with six seats for one week trip");
formatter.after({
  "status": "passed"
});
});