package steps;

import org.openqa.selenium.WebDriver;
import pageobjects.FOLoginPage;
import static org.hamcrest.MatcherAssert.assertThat;
public class FOLoginPageSteps extends FOLoginPage {
	
//	private WebDriver driver;

	public FOLoginPageSteps(WebDriver driver) {
		super(driver);
	}
	
	public void is_the_home_page() {
		assertThat("Login page is displayed", (driver.getTitle()).equals("Login Page"));
	}
    
	public void login(String username,String password) throws Throwable
	{
     	UserId.clear();
		UserId.sendKeys(integertostring(username));
		SubmitButton.click();
		Thread.sleep(3000);
		Password.clear();
		Password.sendKeys(password);
		SubmitButton.click();
		}
	
	public void handle_session() throws Throwable {
		
		Thread.sleep(3000);
		try {
			if (Session!=null) {
				Session.click();
				Thread.sleep(2000);
			}
		} catch (Exception e) {
		}
	}

	public void set_authenticate_anwsers() throws Throwable {
		
		Thread.sleep(3000);
		if ((driver.getTitle()).equals("RSA_V3_Authentication")) {
			AuthenticateSelection.click();
			ContinueButton.click();
			AuthenticateAnswer.sendKeys(get_Authenticate_Answers());
			ContinueButton.click();
		}
		

	}

	public String get_Authenticate_Answers() {

		String question = AuthenticateQuestion.getText();
		String lastWord = question.substring(question.lastIndexOf(" ") + 1);
		String answer = lastWord.substring(0, lastWord.length() - 1);
		return answer;

	}  
}
