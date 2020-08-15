package utils;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Set;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestUtils extends TestBase {
	
	public void navigation_to_window() throws Throwable{
	   Set <String> st= driver.getWindowHandles();
       for(String windowhandle:st)
       driver.switchTo().window(windowhandle);	 
	}
	public void explicit_wait_elementvisibility(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOf(element));

	}
	public void explicit_wait_title(String title) {
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.titleContains(title));
    }
	
	public void clickandhold(WebElement element){
	    Actions action = new Actions(driver);
	    action.clickAndHold(element).build().perform();	   
	}
	public String integertostring(String value) {
		int values= new BigDecimal(value).setScale(0,RoundingMode.HALF_UP).intValue();
		String svalue= Integer.toString(values);
		return svalue;
	}
	
}
