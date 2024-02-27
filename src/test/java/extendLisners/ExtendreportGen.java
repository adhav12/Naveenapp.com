package extendLisners;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtendreportGen {
	static ExtentReports extend;
	public static  ExtentReports extendreportGenerator () {
		 String path = System.getProperty("uesr.dir")+"//Report//test-outputReport.html";
		 ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		 reporter.config().setReportName("Naveenapp test");
		 reporter.config().setTheme(Theme.DARK);
		 
		 ExtentReports extend = new ExtentReports();
		 extend.attachReporter(reporter);
		 extend.setSystemInfo("Environment", "Test");
		 extend.setSystemInfo("OS", "Windows");
		 extend.setSystemInfo("Run By", "Atomation Tester");
		 
		 return null;		
	}
	

}
