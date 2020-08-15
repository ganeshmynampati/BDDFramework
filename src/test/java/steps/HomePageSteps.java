package steps;

import static org.hamcrest.MatcherAssert.assertThat;
import org.openqa.selenium.WebDriver;
import pageobjects.HomePage;

public class HomePageSteps extends HomePage {
	
	public HomePageSteps(WebDriver driver) {
		super(driver);
	}	
    
    public void navigate_dashboardscreen(){
      explicit_wait_title("Dashboard");
      assertThat("Dashboard page is displayed",(driver.getTitle()).equals("Dashboard"));
    }
  
    public void click_officemgmt() { 
      explicit_wait_elementvisibility(OfficeMgmt);
      OfficeMgmt.click();
      explicit_wait_title("Office Management Home");
      assertThat("Office Management tab is selected",(driver.getTitle()).equals("Office Management Home"));
    }
    
    
    public void click_commissionrate() throws Throwable {    
      CommissionRateLink.click();
      navigation_to_window();
      explicit_wait_title("Commission");
      assertThat("Commission Rate page is launched",(driver.getTitle()).equals("Commission"));
    }
    
}