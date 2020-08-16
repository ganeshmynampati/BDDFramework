package utils;

import java.io.FileInputStream;
import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {

	public static WebDriver driver = null;
	public static FileInputStream fis = null;
	public static String Testcaseid = null;
	public static String Testcasedescription = null;

	public WebDriver selectBrowser(String env, String browser) throws MalformedURLException {

		if (env.equalsIgnoreCase("local")) {

			if (browser.equalsIgnoreCase("chrome")) {
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				driver.manage().window().maximize();
			} else if (browser.equalsIgnoreCase("firefox")) {
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
			}
		} else if (env.equalsIgnoreCase("sauce")) {
			// Saucelabs configuration
		}
		return driver;
	}
}
