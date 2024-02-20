package alerthandling;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertpopuphandaling {
	 public static void main(String[]args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Shree\\OneDrive\\Desktop\\Selenium Download\\Updated Chromedriver\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
			ChromeDriver driver =new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
			
			driver.findElement(By.xpath("//*[@name='alert']")).click();
			
			//Alert pop up with ok button
			String textOnAlert = driver.switchTo().alert().getText();
			System.out.println("String on Alert is:" + textOnAlert);
			Thread.sleep(3000);
			driver.switchTo().alert().accept();
			
			//Alert pop up with Cancel bUtton
			driver.findElement(By.xpath("//*[@name='confirmation']")).click();
			String textonconfirmation = driver.switchTo().alert().getText();
			System.out.println("Text On Confirmation: "+textonconfirmation);
			Thread.sleep(3000);
			driver.switchTo().alert().dismiss();
			
			//File uploading
			
			driver.findElement(By.xpath("//*[@name='upload']")).sendKeys("C:\\Users\\Shree\\OneDrive\\Desktop\\Screenshot\\loginscreenshot.png");
			
			
			

	 }
}
