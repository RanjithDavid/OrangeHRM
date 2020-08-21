package driverAPI;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxDriverstart {
	
private WebDriver driver;
	
	public void driverstart() {
		
		driver=new FirefoxDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials");
	}
	public void drivermanage() {
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000,TimeUnit.SECONDS);
	}
	public void drivernavigate() {
		
		driver.navigate().refresh();
	}
	public void driverstop() {
		
		driver.quit();
	}
}
