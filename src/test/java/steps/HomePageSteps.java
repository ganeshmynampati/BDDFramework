package steps;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import pageobjects.HomePage;
import utils.DateUtil;
import utils.DriverContext;
import utils.PropertyUtil;

public class HomePageSteps extends HomePage {

	public HomePageSteps(WebDriver driver) {
		super(driver);
	}

	public void launchApplication() throws NumberFormatException, IOException {
		launchURL();
		waitForElementToBeVisible(budgetHeader);
		assertPageTitle("Discount car rental rates and rental car deals | Budget Car Rental");
	}

	public void validateHomePageHeader() throws NumberFormatException, IOException {
		Assert.assertTrue(isElementDisplayed(budgetHeader));
	}

	public void enterPickUpLocation(String keyword, String location)
			throws InterruptedException, NumberFormatException, IOException {
		sendKeys(pickupLocation, keyword);
		waitForElementToBeClickable(pickupDropDownOptions);
		selectFromList(pickupDropDownValues, location, optionToSelect);
		pageScrollUp();
	}

	public void enterPickUpDate() {
		clear(pickupDate);
		pageScrollUp();
		sendKeys(pickupDate, DateUtil.getFutureDateByWeek("MM/dd/YYYY", 1));
	}

	public void selectPickUpTime() throws IOException {
		selectByVisibleText(pickupTime, PropertyUtil.readprop("pickuptime"));
	}

	public void enterDropDate() {
		clear(dropDate);
		sendKeys(dropDate, DateUtil.getFutureDateByWeek("MM/dd/YYYY", 2));
	}

	public void selectDropTime() throws IOException {
		selectByVisibleText(dropTime, PropertyUtil.readprop("droptime"));
	}

	public ReservationPageSteps clickSelectMyCar() {
		jseClick(selectCar);
		return new ReservationPageSteps(DriverContext.getDriver());

	}

}