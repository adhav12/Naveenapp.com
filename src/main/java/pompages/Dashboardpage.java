package pompages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dashboardpage {
	WebDriver driver;
	WebElement MyTimesheet= driver.findElement(By.xpath("//*[text()='My Timesheet']"));
	private WebElement Mytimesheet;
	
		public Dashboardpage(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver, this);
			
			}
		public boolean navToDashboard() {
			String dashboardurl = driver.getCurrentUrl();
			System.out.println("Dashboard page URL:"+dashboardurl);
		     boolean ispresent = dashboardurl.contains("dashboard")	;
		     return ispresent;
			
			
		}
		public void clickonMytimesheets() {
			Mytimesheet.click();
			// TODO Auto-generated method stub
			
		}
		
		
			
		
		
}