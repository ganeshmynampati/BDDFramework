package pageobjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.TestBase;
import utils.TestUtils;

 public class FOLoginPage extends TestUtils{
	 
//	 private WebDriver driver;
	 
	 public FOLoginPage(WebDriver driver) {
	    	TestBase.driver=driver;
			PageFactory.initElements(driver, this);
	    }
	
    @FindBy(xpath="//*[@id='userid']")
    public WebElement UserId;
    
    @FindBy(xpath = "//*[@alt='Submit']")
    public WebElement SubmitButton; 
    
    @FindBy(id="rsapwd")
    public WebElement Password;
    
    @FindBy(id="ext-gen162")
    public WebElement Session;
    
    @FindBy(xpath = "//*[@value='QUESTION' and @type='radio']")
    public WebElement AuthenticateSelection;
    
    @FindBy(xpath = "//button[@text='Continue']")
    public WebElement ContinueButton;
    
    @FindBy(xpath = "//span[@id='lblQuestion']")
    public WebElement AuthenticateQuestion;
     
    @FindBy(xpath = "//input[@id='questionsList1_answer']")
    public WebElement AuthenticateAnswer;
    
   
}