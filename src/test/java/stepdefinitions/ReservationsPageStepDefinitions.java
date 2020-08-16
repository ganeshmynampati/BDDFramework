package stepdefinitions;

import java.text.ParseException;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import steps.ReservationPageSteps;
import utils.TestBase;

public class ReservationsPageStepDefinitions extends TestBase {

	ReservationPageSteps reservepage = new ReservationPageSteps(driver);

	@When("^chooses lowest price SUV with \"([^\"]*)\" doors and \"([^\"]*)\" seats and click pay now option$")
	public void chooses_lowest_price_SUV_with_doors_and_seats_and_click_pay_now_option(String doors, String seats)
			throws Throwable {
		reservepage.validateReservationsPageHeaders();
		reservepage.validatePickUpReturnDetails();
		reservepage.selectSUVType();
		reservepage.sortSUVPrice();
		reservepage.validateAndSelectSUV(doors, seats);
	}

	@Then("user validates base rate, fees and taxes and estimated prepaid total succesfully")
	public void user_validates_base_rate_fees_and_taxes_and_estimated_prepaid_total_succesfully()
			throws ParseException {
		reservepage.confirmHireDuration();
		reservepage.confirmSUVDetails();
		reservepage.calculatePrepaidEstimates();
	}
}
