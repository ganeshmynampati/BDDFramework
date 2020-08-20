package pageobjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import utils.TestUtils;

public class HomePage extends TestUtils{

	public HomePage(WebDriver driver) {
		TestUtils.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH, using = "//*[@class='navbar-brand']")
	public WebElement budgetHeader;

	@FindBy(how = How.XPATH, using = "//*[@id='from']/preceding::input[@id='PicLoc_value']")
	public WebElement pickupLocation;
	
	@FindBy(how = How.XPATH, using = "//*[@id='from']/preceding::input[@id='PicLoc_value']/following::div[@class='angucomplete-results'][1]/div[1]")
	public WebElement pickupDropDownOptions;
		
	@FindBy(how = How.XPATH, using = "//*[contains(@ng-repeat,'suggestions')]/descendant::span[contains(@class,'result-name')]")
	public List<WebElement> pickupDropDownValues;
	
	@FindBy(how = How.XPATH, using = "//*[contains(@ng-repeat,'suggestions')]/descendant::div[contains(@ng-click,'selectResult(')]")
	public List<WebElement> optionToSelect;
	
	@FindBy(how = How.XPATH, using = "//*[@id='from']")
	public WebElement pickupDate;

	@FindBy(how = How.XPATH, using = "//*[@id='from']/following::select[1]")
	public WebElement pickupTime;

	@FindBy(how = How.XPATH, using = "//*[@id='to']/preceding::input[@id='DropLoc_value']")
	public WebElement dropLocation;

	@FindBy(how = How.XPATH, using = "//*[@id='to']")
	public WebElement dropDate;

	@FindBy(how = How.XPATH, using = "//*[@id='from']/following::select[2]")
	public WebElement dropTime;

	@FindBy(how = How.XPATH, using = "//button[@id='res-home-select-car']")
	public WebElement selectCar;

}
