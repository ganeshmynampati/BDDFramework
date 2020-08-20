package utils;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.LoggerFactory;
import org.testng.Assert;

public class TestUtils {

	public static WebDriver driver;

	public long webelementWaitTime;

	private static org.slf4j.Logger log = LoggerFactory.getLogger(TestUtils.class);

	public synchronized void launchURL() {
		try {
			DriverContext.getDriver().get(ReadProperty.getProp("url"));
			log.info("Launched Browser Succesfully");
		} catch (Exception e) {
			log.error("Browser launch is unsuccesful");
			e.printStackTrace();
		}
	}

	public synchronized void clear(WebElement element) {
		try {
			waitForElementToBeClickable(element);
			scrollIntoView(element);
			element.clear();
			log.info("Element content is cleared");
		} catch (Exception e) {
			log.error("Error in clearing element content");
			e.printStackTrace();
		}
	}

	public synchronized void sendKeys(WebElement element, String value) {
		try {
			waitForElementToBeClickable(element);
			element.sendKeys(value);
			log.info("Entered text");
		} catch (Exception e) {
			log.error("Error in entering the text");
			e.printStackTrace();
		}
	}

	public synchronized void jseSendKeys(String attribute, String value) {
		try {
			((JavascriptExecutor) DriverContext.getDriver())
					.executeScript("document.getElementById('" + attribute + "').value='" + value + "'");
			log.info("Entered text using javascript");
		} catch (Exception e) {
			log.error("Error in entering the text using javascript");
			e.printStackTrace();
		}
	}

	public synchronized void click(WebElement element) {
		try {
			waitForElementToBeClickable(element);
			scrollIntoView(element);
			element.click();
			log.info("Clicked element");
		} catch (Exception e) {
			log.error("Error in clicking the element");
			e.printStackTrace();
		}
	}

	public void jseClick(WebElement element) {
		try {
			waitForElementToBeClickable(element);
			scrollIntoView(element);
			((JavascriptExecutor) DriverContext.getDriver()).executeScript("arguments[0].click();", element);
			log.info("JS click succesful for the element");
		} catch (Exception e) {
			log.error("Unsuccesful JS Click");
			e.printStackTrace();
		}
	}

	public synchronized String getText(WebElement element) {
		String value = null;
		waitForElementToBeVisible(element);
		scrollIntoView(element);
		value = element.getText();
		log.info("Text fetched from from the element");
		return value;
	}

	public synchronized void moveToElement(WebElement element) {
		try {
			waitForElementToBeVisible(element);
			scrollIntoView(element);
			Actions action = new Actions(DriverContext.getDriver());
			action.moveToElement(element).build().perform();
			log.info("Moved to element");
		} catch (Exception e) {
			log.error("Error in moving to element");
			e.printStackTrace();
		}
	}

	public synchronized void moveAndClick(WebElement element) {
		try {
			waitForElementToBeVisible(element);
			scrollIntoView(element);
			Actions action = new Actions(DriverContext.getDriver());
			action.moveToElement(element).click().build().perform();
			log.info("Moved and clicked element");
		} catch (Exception e) {
			log.error("Error in moving and clicking the element");
			e.printStackTrace();
		}
	}

	public synchronized boolean isElementEnabled(WebElement element) {
		boolean isEnabled = false;
		waitForElementToBeVisible(element);
		scrollIntoView(element);
		isEnabled = element.isEnabled();
		return isEnabled;
	}

	public synchronized boolean isElementDisplayed(WebElement element) {
		boolean isDisplayed = false;
		waitForElementToBeVisible(element);
		scrollIntoView(element);
		isDisplayed = element.isDisplayed();
		return isDisplayed;
	}

	public synchronized void waitForElementToBeVisible(WebElement element) {
		webelementWaitTime = Long.parseLong(ReadProperty.getProp("webelementwait"));
		WebDriverWait wait = new WebDriverWait(DriverContext.getDriver(), webelementWaitTime);
		wait.until(ExpectedConditions.visibilityOf(element));

	}

	public synchronized void waitForElementToBeClickable(WebElement element) {
		webelementWaitTime = Long.parseLong(ReadProperty.getProp("webelementwait"));
		WebDriverWait wait = new WebDriverWait(DriverContext.getDriver(), webelementWaitTime);
		wait.until(ExpectedConditions.elementToBeClickable(element));

	}

	public synchronized void scrollIntoView(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) DriverContext.getDriver();
		js.executeScript("arguments[0].scrollIntoView();", element);
		log.info("Scrolled into element");
	}

	public synchronized void clickDropDown(WebElement element) {
		try {
			moveToElement(element);
			click(element);
			log.info("Clicked dropdown element" + " " + element + " " + "succesfully");
		} catch (Exception e) {
			log.error("Error in clicking dropdown element");
			e.printStackTrace();
		}
	}

	public void selectByValue(WebElement element, String value) {
		try {
			waitForElementToBeVisible(element);
			scrollIntoView(element);
			Select select = new Select(element);
			select.selectByValue(value);
			String text = select.getFirstSelectedOption().getAttribute("value");
			Assert.assertEquals(value, text, "Expected value is: " + value + " and an actual value is: " + text);
			log.info("Selected value from dropdown");
		} catch (WebDriverException exp) {
			log.error("Error in selecting dropdown value");
		}
	}

	public void selectByVisibleText(WebElement element, String value) {
		try {
			waitForElementToBeVisible(element);
			scrollIntoView(element);
			Select select = new Select(element);
			select.selectByVisibleText(value);
			String text = select.getFirstSelectedOption().getText();
			Assert.assertEquals(value, text, "Expected value is: " + value + " and an actual value is: " + text);
			log.info("Selected text from dropdown");
		} catch (WebDriverException exp) {
			log.error("Error in selecting dropdown text");
		}
	}

	public void selectByIndex(WebElement element, int index) {
		try {
			waitForElementToBeVisible(element);
			scrollIntoView(element);
			Select select = new Select(element);
			select.selectByIndex(index);
			log.info("Selected index from dropdown");
		} catch (WebDriverException exp) {
			log.error("Error in selecting dropdown index");
		}

	}

	public static void selectFromList(List<WebElement> element, String value, List<WebElement> optionToClick) {
		for (int i = 0; i < element.size(); i++) {
			if (element.get(i).getText().contains(value)) {
				Actions actions = new Actions(DriverContext.getDriver());
				actions.moveToElement(optionToClick.get(i)).click().build().perform();
				break;
			}
		}
	}

	public void assertPageTitle(String expected) {
		Assert.assertEquals(DriverContext.getDriver().getTitle(), expected);
	}

	public void assertPageText(WebElement element, String actualtext) {
		Assert.assertTrue(element.getText().contains(actualtext), "Actual and Expected text does not match");
	}

	public void assertTrueCheck(boolean testcondition) {
		Assert.assertTrue(testcondition);
	}

	public void pageScrollUp() {
		JavascriptExecutor js = (JavascriptExecutor) DriverContext.getDriver();
		js.executeScript("window.scrollBy(0,-250)", "");
	}

	public static void takeScreenshot(String scenarioName, String status) throws IOException {
		File scrFile = ((TakesScreenshot) DriverContext.getDriver()).getScreenshotAs(OutputType.FILE);
		String currentDir = System.getProperty("user.dir");
		FileUtils.copyFile(scrFile, new File(currentDir + "/screenshots/" + scenarioName + "_" + status + "_"
				+ System.currentTimeMillis() + ".png"));
	}

}
