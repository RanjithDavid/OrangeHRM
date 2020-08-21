package driverAPI;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxDriverstart {
	
private WebDriver driver;
	
	public void driverstart() {
		
		driver=new FirefoxDriver();
		driver.get("https://phptravels.net/login");
		driver.manage().timeouts().implicitlyWait(3000,TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	public void driverstop() {
		
		driver.quit();
	}
}
