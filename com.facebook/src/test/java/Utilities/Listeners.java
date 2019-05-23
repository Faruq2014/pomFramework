package Utilities;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.relevantcodes.extentreports.LogStatus;

public class Listeners implements ITestListener {
	BaseTest b = new BaseTest();
	
	public void onFinish(ITestContext context) {
		b.quit();
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailure(ITestResult result) {
		b.takeScreenShot();
		b.test.log(LogStatus.FAIL,  result.getMethod().getMethodName() + " test is failed", result.getThrowable().getMessage());
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSuccess(ITestResult result) {
		b.test.log(LogStatus.PASS,  result.getMethod().getMethodName() + " test is Pass");
		
	}

}
