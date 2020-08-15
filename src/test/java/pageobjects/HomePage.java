package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.TestBase;
import utils.TestUtils;

public class HomePage extends TestUtils {
	
	 public HomePage(WebDriver driver) {
	    	TestBase.driver=driver;
			PageFactory.initElements(driver, this);
	    }

    @FindBy(xpath="//*[contains(text(),'Client Management')]")
    public WebElement ClientMgmt;
     
    @FindBy(xpath="//*[contains(text(),'Office Management')]")
    public WebElement OfficeMgmt;
    
    @FindBy(xpath="//div[contains(text(),'LAUNCH APPS')]/following::li/a[text()='Commission Rate Automation']")
    public WebElement CommissionRateLink;
     
   
}
