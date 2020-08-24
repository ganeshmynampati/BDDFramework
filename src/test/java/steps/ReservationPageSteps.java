package steps;

import java.io.IOException;
import java.text.DecimalFormat;
import java.text.ParseException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import pageobjects.ReservationsPage;
import utils.DateUtil;

public class ReservationPageSteps extends ReservationsPage {

	public ReservationPageSteps(WebDriver driver) {
		super(driver);
	}

	private String groupName;
	private String vehicleName;
	private String transmode;
	private String baseprice;
	private static DecimalFormat df = new DecimalFormat("0.00");

	public void validateReservationsPageHeaders() throws NumberFormatException, IOException {
		waitForElementToBeVisible(travelTimeLabel);
		assertPageTitle("Reservations | Budget Car Rental");
		assertTrueCheck(isElementDisplayed(pickUpLabel));
		assertTrueCheck(isElementDisplayed(returnLabel));
	}

	public void validatePickUpReturnDetails() throws ParseException, NumberFormatException, IOException {
		waitForElementToBeVisible(pickUpLocLabel);
		assertPageText(pickUpLocLabel, "Austin Bergstrom Intl Airport");

		waitForElementToBeVisible(pickUpTimeLabel);
		String reformattedDt = DateUtil.reformatDate(DateUtil.getFutureDateByWeek("MM/dd/YYYY", 1));
		assertTrueCheck(pickUpTimeLabel.getText().contains(reformattedDt));
		assertPageText(returnLocLabel, "Austin Bergstrom Intl Airport");

		waitForElementToBeVisible(returnTimeLabel);
		String reformattedDt2 = DateUtil.reformatDate(DateUtil.getFutureDateByWeek("MM/dd/YYYY", 2));
		assertTrueCheck(returnTimeLabel.getText().contains(reformattedDt2));
	}

	public void selectSUVType() throws ParseException {
		jseClick(allVehiclesDropDown);
		jseClick(suvGroupOption);
	}

	public void sortSUVPrice() throws ParseException {
		jseClick(sortByDropDown);
		jseClick(lowToHighPriceOption);
	}

	public void validateAndSelectSUV(String door, String seat) throws ParseException, InterruptedException, NumberFormatException, IOException {
		for (int i = 0; i < viewVehicleInformation.size(); i++) {
			
			
			jseClick(driver.findElements(By.xpath("//div[contains(@ng-click,'vm.vehicleInfo')]/img[@class='img-responsive']")).get(i));
			if (fourDoorVehicle.get(i).getText().contains(door) && fiveSeatsVehicle.get(i).getText().contains(seat)) {
				groupName = suvGroup.get(i).getText();
				vehicleName = suvName.get(i).getText();
				transmode = transMode.get(i).getText();
				baseprice = basePrice.get(i).getText();
				jseClick(driver.findElements(By.xpath("//div[contains(@ng-click,'vm.vehicleInfo')]/img[@class='img-responsive']")).get(i));
				jseClick(payNowOption.get(i));
				break;
			}
			break;
		}
	}

	public void confirmHireDuration() throws ParseException, NumberFormatException, IOException {
		waitForElementToBeVisible(rentalSummary);
		assertPageText(confirmPickupLoc, "Austin Bergstrom Intl Airport");
		waitForElementToBeVisible(confirmPickupTime);
		String finalPickUpDt = DateUtil.reformatDate(DateUtil.getFutureDateByWeek("MM/dd/YYYY", 1));
		assertTrueCheck(confirmPickupTime.getText().contains(finalPickUpDt));
		assertPageText(confirmReturnLoc, "Austin Bergstrom Intl Airport");
		waitForElementToBeVisible(confirmReturnTime);
		String finalReturnDt = DateUtil.reformatDate(DateUtil.getFutureDateByWeek("MM/dd/YYYY", 2));
		assertTrueCheck(confirmReturnTime.getText().contains(finalReturnDt));
	}

	public void confirmSUVDetails() throws ParseException, NumberFormatException, IOException {
		waitForElementToBeVisible(finalVehicleInfo);
		assertPageText(confirmSUVGroup, groupName);
		assertPageText(confirmSUVName, vehicleName);
		assertPageText(confirmTransMode, transmode);
		waitForElementToBeVisible(finalBaseRate);
		jseClick(confirmSUVGroup);
		waitForElementToBeVisible(finalBaseRate);
		assertPageText(finalBaseRate, baseprice);
	}

	public void calculatePrepaidEstimates() {
		float basePrice = Float.parseFloat(finalBaseRate.getText());
		float feesTaxes = Float.parseFloat(confirmFeeTaxes.getText());
		String ExpectedEstimates = df.format(basePrice + feesTaxes);
		String actualEstimates = EstimatedTotal.getText();
		Assert.assertEquals(actualEstimates, ExpectedEstimates, "Actual and Expected Estimates are not matching");
	}
}