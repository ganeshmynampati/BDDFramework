package utils;
import java.net.MalformedURLException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import utils.TestBase;

public class ServiceHooks extends TestBase {

	TestBase testBase;
	public Scenario scenario;
	@Before
	public void initializeTest(Scenario scenario) throws MalformedURLException {
		testBase = new TestBase();
		testBase.selectBrowser("LOCAL","CHROME");
		this.scenario = scenario;
		String scenarioname = scenario.getName();
		String[] arrayScenarioName = scenarioname.split("-");
		Testcaseid = arrayScenarioName[0];
		System.out.println("testcaseid" + Testcaseid);
		Testcasedescription = arrayScenarioName[1];
	}

	@After
	public void endTest(Scenario scenario) {
		/*if (scenario.isFailed()) {

			try {
				//log.info(scenario.getName() + " is Failed");
				final byte[] screenshot = ((TakesScreenshot) TestBase.driver).getScreenshotAs(OutputType.BYTES);
				scenario.embed(screenshot, "image/png"); // ... and embed it in
			} catch (WebDriverException e) {
				e.printStackTrace();
			}

		} else {
			try {
			//	log.info(scenario.getName() + " is pass");
				scenario.embed(((TakesScreenshot) TestBase.driver).getScreenshotAs(OutputType.BYTES), "image/png");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}*/

		TestBase.driver.quit();
	}
}
