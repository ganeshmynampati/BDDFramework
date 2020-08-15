package stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import steps.CommissionRatePageSteps;
import steps.FOLoginPageSteps;
import steps.HomePageSteps;
import utils.TestBase;
public class LoginStepDefinitions extends TestBase {

  FOLoginPageSteps fologinpage = new FOLoginPageSteps(driver);
  HomePageSteps homepage = new HomePageSteps(driver);
  CommissionRatePageSteps commissioratepage= new CommissionRatePageSteps(driver);
	
	
	@Given("^User is on the FO Advisorportal Login Page$")
	public void user_is_on_the_FO_Advisorportal_Login_Page() throws Throwable {	
		 driver.get("https://agqa.v2020.com/login.aspx");
		 driver.manage().window().maximize();
		 }

	@When("^User enter the username and password and click submit$")
	public void user_enter_the_username_password_and_click_submit() throws Throwable {	
	//	fologinpage.login(prop.getProperty("Username"),prop.getProperty("Password"));
		fologinpage.login(excelRead("Testdata",Testcaseid,"Username"),excelRead("Testdata",Testcaseid,"Password"));
		fologinpage.handle_session();
		fologinpage.set_authenticate_anwsers();
		homepage.navigate_dashboardscreen();
		homepage.click_officemgmt();
		homepage.click_commissionrate();
		commissioratepage.click_createcompensation();
		commissioratepage.select_writingrep();
	}	
	


	
	
	
}
