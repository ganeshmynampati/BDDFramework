package utils;

import java.net.MalformedURLException;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends TestBase {

	TestBase testBase;
	public Scenario scenario;

	@Before
	public void initializeTest(Scenario scenario) throws MalformedURLException {
		testBase = new TestBase();
		String env = ReadProperty.getProp("environment");
		String browser = ReadProperty.getProp("browser");
		testBase.selectBrowser(env, browser);
		this.scenario = scenario;
		String scenarioname = scenario.getName();
		String[] arrayScenarioName = scenarioname.split("-");
		Testcaseid = arrayScenarioName[0];
//		// System.out.println("testcaseid" + Testcaseid);
		//Testcasedescription = arrayScenarioName[1];
	}

	@After
	public void endTest(Scenario scenario) {
		TestBase.driver.quit();
	}
}
