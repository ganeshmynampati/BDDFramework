package steps;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageobjects.HomePage;
import utils.ReadProperty;

public class HomePageSteps extends HomePage {

	public HomePageSteps(WebDriver driver) {
		super(driver);
	}

	public void launchApplication() {
		launchURL();
		waitForElementToBeVisible(budgetHeader);
		assertPageTitle("Discount car rental rates and rental car deals | Budget Car Rental");
	}

	public void validateHomePageHeader() {
		Assert.assertTrue(isElementDisplayed(budgetHeader));
	}

	public void enterPickUpLocation(String keyword, String location) throws InterruptedException {
		sendKeys(pickupLocation, keyword);
		waitForElementToBeClickable(pickupDropDownOptions);
		selectFromList(pickupDropDownValues, location, optionToSelect);
	}

	public void enterPickUpDate() {
		clear(pickupDate);
		sendKeys(pickupDate, getFutureDateByWeek("MM/dd/YYYY", 1));
	}

	public void selectPickUpTime() {
		selectByVisibleText(pickupTime, ReadProperty.getProp("pickuptime"));
	}

	public void enterDropDate() {
		clear(dropDate);
		sendKeys(dropDate, getFutureDateByWeek("MM/dd/YYYY", 2));
	}

	public void selectDropTime() {
		selectByVisibleText(dropTime, ReadProperty.getProp("droptime"));
	}

	public ReservationPageSteps clickSelectMyCar() {
		jseClick(selectCar);
		return new ReservationPageSteps(driver);

	}

}