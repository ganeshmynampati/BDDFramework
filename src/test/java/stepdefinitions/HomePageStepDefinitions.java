package stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import steps.HomePageSteps;
import utils.TestBase;

public class HomePageStepDefinitions extends TestBase {

//  FOLoginPageSteps fologinpage = new FOLoginPageSteps(driver);
//  HomePageSteps homepage = new HomePageSteps(driver);
//  CommissionRatePageSteps commissioratepage= new CommissionRatePageSteps(driver);
//	
//	
//	@Given("^User is on the FO Advisorportal Login Page$")
//	public void user_is_on_the_FO_Advisorportal_Login_Page() throws Throwable {	
//		 driver.get("https://agqa.v2020.com/login.aspx");
//		 driver.manage().window().maximize();
//		 }
//
//	@When("^User enter the username and password and click submit$")
//	public void user_enter_the_username_password_and_click_submit() throws Throwable {	
//	//	fologinpage.login(prop.getProperty("Username"),prop.getProperty("Password"));
//		fologinpage.login(excelRead("Testdata",Testcaseid,"Username"),excelRead("Testdata",Testcaseid,"Password"));
//		fologinpage.handle_session();
//		fologinpage.set_authenticate_anwsers();
//		homepage.navigate_dashboardscreen();
//		homepage.click_officemgmt();
//		homepage.click_commissionrate();
//		commissioratepage.click_createcompensation();
//		commissioratepage.select_writingrep();
//	}	

	HomePageSteps homepage = new HomePageSteps(driver);

	@Given("user is on budget application home page")
	public void user_is_on_budget_application_home_page() {
		homepage.launchApplication();
		homepage.validateHomePageHeader();

	}

	@When("^user types \"([^\"]*)\" and selects pickup and return location as \"([^\"]*)\"$")
	public void user_types_and_selects_pickup_location_as(String pickkey, String pikcuploc) throws Throwable {
		homepage.enterPickUpLocation(pickkey,pikcuploc);
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
