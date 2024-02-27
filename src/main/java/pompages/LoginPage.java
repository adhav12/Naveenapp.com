package pompages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass{
WebDriver driver;
	
	@FindBy(xpath ="//input[@name='username']")
	private WebElement username;
	
	@FindBy(xpath ="//input[@name='password']")
	private WebElement password;
	
	@FindBy(xpath ="//button[@type='submit']")
	private WebElement loginbutton;
	
	public LoginPage(WebDriver driver) throws IOException{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public void loginToApp() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		username.sendKeys("Admin");
		password.sendKeys("admin123");
		loginbutton.click();

	
		
		
		
		
		
		
	}
	

}
