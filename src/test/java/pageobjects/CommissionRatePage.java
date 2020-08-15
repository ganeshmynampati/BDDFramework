package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.TestBase;
import utils.TestUtils;

public class CommissionRatePage extends TestUtils {
	
	public CommissionRatePage(WebDriver driver) {
    	TestBase.driver=driver;
		PageFactory.initElements(driver, this);
    }
	
	@FindBy(xpath="//button//*[contains(text(),'Create Compensation Schedule')]")
    public WebElement CreateCompensationSchedule;
	
	@FindBy(xpath="//span[contains(@class,'dropdown-trigger')]")
    public WebElement SelectWritingRep;
	
	@FindBy(xpath="//div[contains(@class,'dropdown')]/following::input")
    public WebElement SearchRep;
		
	@FindBy(xpath="//li[contains(@class,'dropdown')]")
    public WebElement SelectRep;
	////div[contains(@class,'dropdown')]/following::li/span
	
	
	

}
