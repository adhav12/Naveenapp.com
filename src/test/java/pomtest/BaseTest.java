package pomtest;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;
import pompages.Dashboardpage;
import pompages.LoginPage;

public class BaseTest {
	public static WebDriver driver;
	 public SoftAssert softAssert;
	 public LoginPage login;
	 public Dashboardpage dashboard;
	@BeforeSuite
	public void initBrowser() throws IOException {
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\Shree\\OneDrive\\Desktop\\Selenium Download\\Updated Chromedriver\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		
         WebDriverManager.chromedriver().setup();
 		
 		ChromeOptions options = new ChromeOptions();
 		options.addArguments("--disable-notifications");
 		options.addArguments("--start-maximized");
 		options.addArguments("--incognito");
 		
 		driver = new ChromeDriver(options);
 				
 		//Access config.properties file
 		String path = System.getProperty("user.dir")+"//config.properties";
 		FileInputStream fis = new FileInputStream(path);
 		Properties prop = new Properties();
 		prop.load(fis);
 		driver.get(prop.getProperty("testsiteurl"));
 	}
 	
 	@BeforeClass
 	public void createObject() throws IOException {
 		softAssert = new SoftAssert();
 		  login = new LoginPage(driver);
 		  dashboard = new Dashboardpage(driver);
	
	
}
}