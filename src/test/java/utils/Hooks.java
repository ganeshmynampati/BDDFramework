package utils;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks {

	public Scenario scenario;
	private WebDriver driver;

	@Before
	public void initializeTest(Scenario scenario) throws IOException {

		this.scenario = scenario;
		String env = PropertyUtil.readprop("environment");
		String browser = PropertyUtil.readprop("browser");
		if (env.equalsIgnoreCase("local")) {
			if (browser.equalsIgnoreCase("chrome")) {
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				driver.manage().window().maximize();
			} else if (browser.equalsIgnoreCase("firefox")) {
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
				driver.manage().window().maximize();
			}
		} else if (browser.equalsIgnoreCase("ie")) {
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
			driver.manage().window().maximize();

		} else if (env.equalsIgnoreCase("sauce")) {
			// Saucelabs configuration
		}
		DriverContext.addDriver(driver);
		DriverContext.getDriver().manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		DriverContext.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@After
	public void endTest(Scenario scenario) throws IOException {
		if (scenario.isFailed()) {
			try {
				final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
				scenario.embed(screenshot, "image/png", scenario.getName());
			} catch (WebDriverException e) {
				e.printStackTrace();
			}
			DriverContext.getDriver().quit();
		}
	}

}