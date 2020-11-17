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
  "error_message": "org.openqa.selenium.WebDriverException: chrome not reachable\n  (Session info: chrome\u003d86.0.4240.198)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027MYNAMPATI\u0027, ip: \u0027192.168.0.110\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_144\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 86.0.4240.198, chrome: {chromedriverVersion: 86.0.4240.22 (398b0743353ff..., userDataDir: C:\\Users\\MYNAMP~1\\AppData\\L...}, goog:chromeOptions: {debuggerAddress: localhost:59070}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: b50d999c400b0fd5e79d671d66104d55\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.executeScript(RemoteWebDriver.java:489)\r\n\tat utils.TestUtils.pageScrollUp(TestUtils.java:252)\r\n\tat steps.HomePageSteps.enterPickUpLocation(HomePageSteps.java:34)\r\n\tat stepdefinitions.HomePageStepDefinitions.user_types_and_selects_pickup_location_as(HomePageStepDefinitions.java:23)\r\n\tat ✽.user types \"aus\" and selects pickup and return location as \"Austin Bergstrom Intl Airport\"(file:///C:/Users/Mynampati/Downloads/BDDFramework/BDDFramework/src/test/resources/features/hireSUV.feature:6)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "pickup date as week ahead of current date",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.HomePageStepDefinitions.pickup_date_as_week_ahead_of_current_date()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "return date as week ahead of pickup date",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.HomePageStepDefinitions.return_date_as_week_ahead_of_pickup_date()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "clicks Select My car option to navigate to reservations page",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.HomePageStepDefinitions.clicks_select_my_car_option_to_navigate_to_reservations_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "chooses lowest price SUV with \"4\" doors and \"5\" seats and click pay now option",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.ReservationsPageStepDefinitions.chooses_lowest_price_SUV_with_doors_and_seats_and_click_pay_now_option(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user validates base rate, fees and taxes and estimated prepaid total succesfully",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.ReservationsPageStepDefinitions.user_validates_base_rate_fees_and_taxes_and_estimated_prepaid_total_succesfully()"
});
formatter.result({
  "status": "skipped"
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
  "error_message": "org.openqa.selenium.WebDriverException: chrome not reachable\n  (Session info: chrome\u003d86.0.4240.198)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027MYNAMPATI\u0027, ip: \u0027192.168.0.110\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_144\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 86.0.4240.198, chrome: {chromedriverVersion: 86.0.4240.22 (398b0743353ff..., userDataDir: C:\\Users\\MYNAMP~1\\AppData\\L...}, goog:chromeOptions: {debuggerAddress: localhost:59071}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: 0c5c658fa6038670edd15aea5b6d1853\n*** Element info: {Using\u003dxpath, value\u003d//*[contains(@ng-repeat,\u0027suggestions\u0027)]/descendant::span[contains(@class,\u0027result-name\u0027)]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElements(RemoteWebDriver.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementsByXPath(RemoteWebDriver.java:432)\r\n\tat org.openqa.selenium.By$ByXPath.findElements(By.java:348)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElements(RemoteWebDriver.java:311)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElements(DefaultElementLocator.java:85)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementListHandler.invoke(LocatingElementListHandler.java:36)\r\n\tat com.sun.proxy.$Proxy19.get(Unknown Source)\r\n\tat utils.TestUtils.selectFromList(TestUtils.java:230)\r\n\tat steps.HomePageSteps.enterPickUpLocation(HomePageSteps.java:33)\r\n\tat stepdefinitions.HomePageStepDefinitions.user_types_and_selects_pickup_location_as(HomePageStepDefinitions.java:23)\r\n\tat ✽.user types \"aus\" and selects pickup and return location as \"Austin Bergstrom Intl Airport\"(file:///C:/Users/Mynampati/Downloads/BDDFramework/BDDFramework/src/test/resources/features/hireSUV.feature:20)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "pickup date as week ahead of current date",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.HomePageStepDefinitions.pickup_date_as_week_ahead_of_current_date()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "return date as week ahead of pickup date",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.HomePageStepDefinitions.return_date_as_week_ahead_of_pickup_date()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "clicks Select My car option to navigate to reservations page",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.HomePageStepDefinitions.clicks_select_my_car_option_to_navigate_to_reservations_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "chooses lowest price SUV with \"4\" doors and \"6\" seats and click pay now option",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.ReservationsPageStepDefinitions.chooses_lowest_price_SUV_with_doors_and_seats_and_click_pay_now_option(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user validates base rate, fees and taxes and estimated prepaid total succesfully",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.ReservationsPageStepDefinitions.user_validates_base_rate_fees_and_taxes_and_estimated_prepaid_total_succesfully()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
});