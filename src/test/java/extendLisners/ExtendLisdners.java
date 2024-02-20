package extendLisners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;

public class ExtendLisdners implements ITestListener{
	ExtentReports extend =  ExtendreportGen.extendreportGenerator();

	@Override
	public void onTestStart(ITestResult result) {
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
		
	}

	@Override
	public void onFinish(ITestContext context) {
		
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		return false;
		
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return extend;
		
	}

	@Override
	public String toString() {
		
		return super.toString();
	}

	@Override
	protected void finalize() throws Throwable {
				super.finalize();
	}
	
	

}
