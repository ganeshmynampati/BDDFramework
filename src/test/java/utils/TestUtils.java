package utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class TestUtils extends TestBase {

	public long webelementWaitTime;

	public synchronized void launchURL() {
		try {
			driver.get(ReadProperty.getProp("url"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public synchronized void clear(WebElement element) {
		try {
			waitForElementToBeClickable(element);
			scrollIntoView(element);
			element.clear();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public synchronized void sendKeys(WebElement element, String value) {
		try {
			waitForElementToBeClickable(element);
			// scrollIntoView(element);
			element.sendKeys(value);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public synchronized void jseSendKeys(String attribute, String value) {
		try {
			((JavascriptExecutor) driver)
					.executeScript("document.getElementById('" + attribute + "').value='" + value + "'");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public synchronized void click(WebElement element) {
		try {
			waitForElementToBeClickable(element);
			scrollIntoView(element);
			element.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void jseClick(WebElement element) {
		try {
			waitForElementToBeClickable(element);
			scrollIntoView(element);
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public synchronized String getText(WebElement element) {
		String value = null;
		waitForElementToBeVisible(element);
		scrollIntoView(element);
		value = element.getText();
		return value;
	}

	public synchronized void moveToElement(WebElement element) {
		try {
			waitForElementToBeVisible(element);
			scrollIntoView(element);
			Actions action = new Actions(driver);
			action.moveToElement(element).build().perform();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public synchronized void moveAndClick(WebElement element) {
		try {
			waitForElementToBeVisible(element);
			scrollIntoView(element);
			Actions action = new Actions(driver);
			action.moveToElement(element).click().build().perform();
		} catch (Exception e) {
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
		WebDriverWait wait = new WebDriverWait(driver, webelementWaitTime);
		wait.until(ExpectedConditions.visibilityOf(element));

	}

	public synchronized void waitForElementToBeClickable(WebElement element) {
		webelementWaitTime = Long.parseLong(ReadProperty.getProp("webelementwait"));
		WebDriverWait wait = new WebDriverWait(driver, webelementWaitTime);
		wait.until(ExpectedConditions.elementToBeClickable(element));

	}

	public synchronized void scrollIntoView(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", element);
	}

	public synchronized void clickDropDown(WebElement element) {
		try {
			moveToElement(element);
			click(element);
		} catch (Exception e) {
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
		} catch (WebDriverException exp) {
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
		} catch (WebDriverException exp) {
		}
	}

	public void selectByIndex(WebElement element, int index) {
		try {
			waitForElementToBeVisible(element);
			scrollIntoView(element);
			Select select = new Select(element);
			select.selectByIndex(index);
		} catch (WebDriverException exp) {
		}

	}

	public static void selectFromList(List<WebElement> element, String value, List<WebElement> optionToClick) {
		for (int i = 0; i < element.size(); i++) {
			if (element.get(i).getText().contains(value)) {
				Actions actions = new Actions(driver);
				actions.moveToElement(optionToClick.get(i)).click().build().perform();
				break;
			}
		}
	}

	public void assertPageTitle(String expected) {
		Assert.assertEquals(driver.getTitle(), expected);
	}

	public void assertPageText(WebElement element, String actualtext) {
		Assert.assertTrue(element.getText().contains(actualtext), "Actual and Expected text does not match");
	}

	public void assertTrueCheck(boolean testcondition) {
		Assert.assertTrue(testcondition);
	}

	public static String getCurrentTimestamp(String format) {
		SimpleDateFormat formatter = new SimpleDateFormat(format);
		Date date = new Date();
		return formatter.format(date);
	}

	public static String getFutureDateByWeek(String dateFormat, int weekno) {
		String futureDate = "";
		LocalDate result = LocalDate.now().plus(weekno, ChronoUnit.WEEKS);
		futureDate = DateTimeFormatter.ofPattern(dateFormat, Locale.ENGLISH).format(result);
		return futureDate;
	}

	public static String reformatDate(String inputdate) throws ParseException {
		DateFormat format = new SimpleDateFormat("MM/dd/yyyy");
		Date d = format.parse(inputdate);
		DateFormat format1 = new SimpleDateFormat("EEE, MMM dd");
		String newDate = format1.format(d);
		return newDate;
	}

	public static String get(String dateFormat, int weekno) {
		String futureDate = "";
		LocalDate result = LocalDate.now().plus(weekno, ChronoUnit.WEEKS);
		futureDate = DateTimeFormatter.ofPattern(dateFormat, Locale.ENGLISH).format(result);
		return futureDate;
	}

}
