package listeners;

import org.slf4j.LoggerFactory;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;

public class TestListener extends ExtentReportListener implements ITestListener {
	private static ExtentReports extent;
	private static org.slf4j.Logger log = LoggerFactory.getLogger(TestListener.class);

	public void onTestStart(ITestResult result) {
		log.info("Test Case Started");
	}

	public void onTestSuccess(ITestResult result) {
		log.info("Test Case Passed Succesfully");
	}

	public void onTestFailure(ITestResult result) {
		log.info("Test Case Passed Failed");
	}

	public void onTestSkipped(ITestResult result) {
		log.info("Test Case Skipped");
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	}

	public void onStart(ITestContext context) {
		log.info("Extent Report Setup");
		extent = setUp();
	}

	public void onFinish(ITestContext context) {
		log.info("Extent Report Flush");
		extent.flush();
	}
}
