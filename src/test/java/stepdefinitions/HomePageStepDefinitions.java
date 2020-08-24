package stepdefinitions;

import java.io.IOException;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import steps.HomePageSteps;
import utils.DriverContext;


public class HomePageStepDefinitions{

	HomePageSteps homepage = new HomePageSteps(DriverContext.getDriver());

	@Given("user is on budget application home page")
	public void user_is_on_budget_application_home_page() throws NumberFormatException, IOException {
		homepage.launchApplication();
		homepage.validateHomePageHeader();
	}

	@When("^user types \"([^\"]*)\" and selects pickup and return location as \"([^\"]*)\"$")
	public void user_types_and_selects_pickup_location_as(String pickkey, String pikcuploc) throws Throwable {
		homepage.enterPickUpLocation(pickkey, pikcuploc);
	}

	@When("pickup date as week ahead of current date")
	public void pickup_date_as_week_ahead_of_current_date() throws InterruptedException {
		homepage.enterPickUpDate();
	}

	@When("return date as week ahead of pickup date")
	public void return_date_as_week_ahead_of_pickup_date() throws InterruptedException {
		homepage.enterDropDate();
	}

	@When("clicks Select My car option to navigate to reservations page")
	public void clicks_select_my_car_option_to_navigate_to_reservations_page() throws InterruptedException {
		homepage.clickSelectMyCar();

	}
}
