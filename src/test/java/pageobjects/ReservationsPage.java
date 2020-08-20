package pageobjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import utils.TestUtils;

public class ReservationsPage extends TestUtils{

	public ReservationsPage(WebDriver driver) {
		TestUtils.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH, using = "//*[@class='location step2']")
	public WebElement travelTimeLabel;

	@FindBy(how = How.XPATH, using = "//a[text()[contains(.,'Pick-Up')]]")
	public WebElement pickUpLabel;

	@FindBy(how = How.XPATH, using = "//a[text()[contains(.,'Pick-Up')]]/following::div[1]")
	public WebElement pickUpLocLabel;

	@FindBy(how = How.XPATH, using = "//a[text()[contains(.,'Pick-Up')]]/following::div[@class='day-time-info'][1]")
	public WebElement pickUpTimeLabel;

	@FindBy(how = How.XPATH, using = "//a[text()[contains(.,'Return')]]")
	public WebElement returnLabel;

	@FindBy(how = How.XPATH, using = "//a[text()[contains(.,'Return')]]/following::div[1]")
	public WebElement returnLocLabel;

	@FindBy(how = How.XPATH, using = "//a[text()[contains(.,'Return')]]/following::div[@class='day-time-info'][1]")
	public WebElement returnTimeLabel;

	 @FindBy(how = How.XPATH, using ="//a[@id='res-vehicles-filter-by-vehicle-type']")
	public WebElement allVehiclesDropDown;

	@FindBy(how = How.XPATH, using = "//div[contains(@class,'vehListRule')]/span[contains(text(),'SUVs')]/parent::div")
	public WebElement suvGroupOption;

	@FindBy(how = How.XPATH, using = "//a[@id='res-vehicles-sort']")
	public WebElement sortByDropDown;

	@FindBy(how = How.XPATH, using = "//ul[@class='dropdown-menu']/descendant::a[text()[contains(.,'Low to High')]]")
	public WebElement lowToHighPriceOption;

	@FindBy(how = How.XPATH, using = "//*[@class='step2dtl']/descendant::a[text()='View Vehicle Information']")
	public List<WebElement> viewVehicleInformation;

	@FindBy(how = How.XPATH, using = "//span[text()[contains(.,'4 Doors')]]")
	public List<WebElement> fourDoorVehicle;

	@FindBy(how = How.XPATH, using = "//span[@class='four-seats-feat' and text()[contains(.,'5 seats')]]")
	public List<WebElement> fiveSeatsVehicle;

	@FindBy(how = How.XPATH, using = "//*[@class='step2dtl']/descendant::h3[@ng-bind='car.carGroup']")
	public List<WebElement> suvGroup;

	@FindBy(how = How.XPATH, using = "//*[@class='step2dtl']/descendant::p[contains(@class,'similar-car')]")
	public List<WebElement> suvName;

	@FindBy(how = How.XPATH, using = "//*[@class='step2dtl']/descendant::p[@ng-bind='car.automaticCaption']")
	public List<WebElement> transMode;

	@FindBy(how = How.XPATH, using = "//*[@class='step2dtl']/descendant::price/span")
	public List<WebElement> basePrice;

	@FindBy(how = How.XPATH, using = "//*[@class='step2dtl']/descendant::a[@id='res-vehicles-pay-now']")
	public List<WebElement> payNowOption;

	@FindBy(how = How.XPATH, using = "//section[contains(@class,'rental-summary')]")
	public WebElement rentalSummary;

	@FindBy(how = How.XPATH, using = "//*[contains(@class,'source')]/descendant::div[@class='location-info']")
	public WebElement confirmPickupLoc;

	@FindBy(how = How.XPATH, using = "//*[contains(@class,'source')]/descendant::div[@class='day-time-info']")
	public WebElement confirmPickupTime;

	@FindBy(how = How.XPATH, using = "//*[contains(@class,'destination')]/descendant::div[@class='location-info']")
	public WebElement confirmReturnLoc;

	@FindBy(how = How.XPATH, using = "//*[contains(@class,'destination')]/descendant::div[@class='day-time-info']")
	public WebElement confirmReturnTime;
	
	@FindBy(how = How.XPATH, using = "//div[@ng-show='mode']/descendant::div[@class='vehicle-name']/parent::div")
	public WebElement finalVehicleInfo;

	@FindBy(how = How.XPATH, using = "//div[@ng-show='mode']/descendant::div[@class='vehicle-name']")
	public WebElement confirmSUVGroup;

	@FindBy(how = How.XPATH, using = "//*[@ng-show='mode']/descendant::div[@class='vehicle-info']/span")
	public WebElement confirmSUVName;

	@FindBy(how = How.XPATH, using = "//*[@ng-show='mode']/descendant::div[contains(@ng-bind,'Transmission')]")
	public WebElement confirmTransMode;

	@FindBy(how = How.XPATH, using = "//div[@class='optBaseRateRow']/span/span[2]")
	public WebElement finalBaseRate;

	@FindBy(how = How.XPATH, using = "//div[@class='optTaxesRow']/span/span[2]")
	public WebElement confirmFeeTaxes;

	@FindBy(how = How.XPATH, using = "//div[contains(@class,'optEstimatedTotalRow')]/span/span[2]")
	public WebElement EstimatedTotal;

}