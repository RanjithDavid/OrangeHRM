package orangeHRMPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import driverAPI.ChromeDriverstart;

public class LoginPageClass extends ChromeDriverstart{

	@FindBy(name="txtUsername")
	public static WebElement username;
	@FindBy(name="txtPassword")
	public static WebElement password;
	@FindBy(id="btnLogin")
	public static WebElement loginbtn;
	
	public String LoginTitle() {
		return driver.getTitle();
		
	}
}
