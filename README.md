						BUDGET UI AUTOMATED SUITE

OVERVIEW

This repository consists of automated smoke scenario to hire a vehicle from Budget travels UI

SCENARIO DESCRIPTION

User browses through Budget GUI to hire a SUV for a week trip at lowest price

SALIENT FEATURES OF AUTOMATION FRAMEWORK

1.	Created the framework using SELENIUM WEBDRIVER API with JAVA as programming language.
2.	Implemented BEHAVIOUR DRIVEN DEVELOPMENT (BDD) for easy understanding of requirements from client perspective.
3.	Implemented the automated suite using CUCUMBER and TestNG which brings more robustness in terms of reporting, efficient execution by running scenarios in parallel 
	if required.
4.	Browser actions and test scripting is implemented based on OOP concept. 
5.	Inheritance concept is applied between page classes and step definition classes.
6.	Constructors are used in every page to initialize the driver variable and other variables as required.
7.	Access Modifiers such as Private, Public and Protected are used to wrap the data from other packages and classes for effective utilization.
8.	Ease of reusability is achieved in this framework by Reusable methods, they are created and maintained in a separate source folder and hence they can be called as 
	many times as needed without the need to create a method which is used frequently.
9.	Method Overriding principle is applied in accessing the methods from different package.
10.	Parameters such as Browser name, Environment, URL and Wait time are declared in config.properties file such that when a test case has to be accessed with 
	different configuration, just by changing the parameter is enough and there is no need to deep dive into the code to change any parameters.
11.	The browser initialization takes places using WEBDRIVER MANAGER API rather than using conventional driver.exe file. This removes the conflicts created due to 
	mismatch between BROWSER and DRIVER file configurations.
12.	Provision is made to execute the suite for CROSS BROWSER TESTING, CROSS PLATFORM TESTING using SAUCE LABS if need arise.
13.	This framework makes use of LOG4J to track the test execution events at each step.
14.	Web application under test is split in forms of pages and PAGE OBJECT MODEL (POM) approach is applied to represent the test components in a modular approach.
15.	PAGE CHAINING CONCEPT is implemented to establish the concurrency between each page during page navigation.
16.	DATA DRIVEN APPROACH - is achieved with the help of Scenario Outline concept of Cucumber. This feature would facilitate testing the scenario with multiple types of 
	test data in parallel.
17.	Supports PARALLEL EXECUTION of SCENARIOS using Cucumber TestNG inbuilt class
18.	ON FAILURE SCREENSHOT for analysis in case of test failures.
19.	SCREENSHOT STORAGE is embedded in report itself rather than having it in local directory. This enables memory saving.	
20. 	Supports CROSS BROWSER TESTING on CHROME, FIREFOX and IE browsers.

