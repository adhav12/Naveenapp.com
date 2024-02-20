package pomtest;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.bouncycastle.pkix.SubjectPublicKeyInfoChecker;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.idealized.Network.UserAgent;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;
import pompages.Dashboardpage;
import pompages.LoginPage;
import pompages.PimPage;

public class BaseTest {
	//Declaring variable as global
	 public static  WebDriver driver;
	 public SoftAssert softAssert;
	  LoginPage login;
	 PimPage pim;
	 Dashboardpage dashboard;
	
	
	
    //Initialize Browser Method
	@BeforeSuite
	public void initBrowser() throws IOException {
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\Shree\\OneDrive\\Desktop\\Selenium Download\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		options.addArguments("--start-maximized");
		options.addArguments("--incognito");
		
		driver = new ChromeDriver(options);
		
		String path = System.getProperty("user.dir")+"//Config.properties";
		FileInputStream fis= new FileInputStream(path);
		Properties prop= new Properties();
		prop.load(fis);
		driver.get(prop.getProperty("testsiteurl"));
		
	}
	@BeforeClass
	public void createobject() throws IOException   {
		 softAssert=new SoftAssert();
		 login = new LoginPage(driver);
		 pim = new PimPage(driver);
		 dashboard= new Dashboardpage(driver);
		 
		 
		
		 
	
	
}
}