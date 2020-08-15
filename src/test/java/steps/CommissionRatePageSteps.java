package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageobjects.CommissionRatePage;

public class CommissionRatePageSteps extends CommissionRatePage {

	public CommissionRatePageSteps(WebDriver driver) {
		super(driver);
	}

	public void click_createcompensation() {
		CreateCompensationSchedule.click();
	}
	
	public void select_writingrep() throws Throwable {
		SelectWritingRep.click();
		SearchRep.sendKeys("D59");
		SelectRep.click();
		Thread.sleep(50);
	
	}
	
}
