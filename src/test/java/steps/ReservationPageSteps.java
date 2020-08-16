package steps;

import java.text.ParseException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import pageobjects.ReservationsPage;

public class ReservationPageSteps extends ReservationsPage {

	public ReservationPageSteps(WebDriver driver) {
		super(driver);
	}

	private String groupName;
	private String vehicleName;
	private String transmode;
	private String baseprice;

	public void validateReservationsPageHeaders() {
		waitForElementToBeVisible(travelTimeLabel);
		assertPageTitle("Reservations | Budget Car Rental");
		assertTrueCheck(isElementDisplayed(pickUpLabel));
		assertTrueCheck(isElementDisplayed(returnLabel));
	}

	public void validatePickUpReturnDetails() throws ParseException {
		assertPageText(pickUpLocLabel, "Austin Bergstrom Intl Airport");
		waitForElementToBeVisible(pickUpTimeLabel);
		String reformattedDt = reformatDate(getFutureDateByWeek("MM/dd/YYYY", 1));
		assertTrueCheck(pickUpTimeLabel.getText().contains(reformattedDt));
		assertPageText(returnLocLabel, "Austin Bergstrom Intl Airport");
		waitForElementToBeVisible(returnTimeLabel);
		String reformattedDt2 = reformatDate(getFutureDateByWeek("MM/dd/YYYY", 2));
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

	public void validateAndSelectSUV(String door, String seat) throws ParseException, InterruptedException {
		for (int i = 0; i < viewVehicleInformation.size(); i++) {
			jseClick(viewVehicleInformation.get(i));
			if (fourDoorVehicle.get(i).getText().contains(door) && fiveSeatsVehicle.get(i).getText().contains(seat)) {
				groupName = suvGroup.get(i).getText();
				System.out.println("Selected SUV Group Name is" + " " + groupName);
				vehicleName = suvName.get(i).getText();
				System.out.println("Selected SUV is" + " " + vehicleName);
				transmode = transMode.get(i).getText();
				System.out.println("Trans Mode is" + " " + transmode);
				baseprice = basePrice.get(i).getText();
				System.out.println("Base Price is" + " " + baseprice);
				jseClick(payNowOption.get(i));
				break;
			}
			break;
		}
	}

	public void confirmHireDuration() throws ParseException {
		waitForElementToBeVisible(rentalSummary);
		assertPageText(confirmPickupLoc, "Austin Bergstrom Intl Airport");
		waitForElementToBeVisible(confirmPickupTime);
		String finalPickUpDt = reformatDate(getFutureDateByWeek("MM/dd/YYYY", 1));
		assertTrueCheck(confirmPickupTime.getText().contains(finalPickUpDt));
		assertPageText(confirmReturnLoc, "Austin Bergstrom Intl Airport");
		waitForElementToBeVisible(confirmReturnTime);
		String finalReturnDt = reformatDate(getFutureDateByWeek("MM/dd/YYYY", 2));
		assertTrueCheck(confirmReturnTime.getText().contains(finalReturnDt));	
	}

	public void confirmSUVDetails() throws ParseException {
		assertPageText(confirmSUVGroup, groupName);
		assertPageText(confirmSUVName, vehicleName);
		assertPageText(confirmTransMode, transmode);
		assertPageText(finalBaseRate, baseprice);
	}

	public void calculatePrepaidEstimates() {
		float basePrice=Float.parseFloat(finalBaseRate.getText());
		float feesTaxes=Float.parseFloat(confirmFeeTaxes.getText());
		float prepaidEstimates=Float.parseFloat(EstimatedTotal.getText());	
		Assert.assertEquals(basePrice+feesTaxes, prepaidEstimates);
	}
}