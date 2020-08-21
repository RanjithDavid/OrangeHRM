package orangeHRMTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import driverAPI.ChromeDriverstart;
import orangeHRMPage.LoginPageClass;

public class LoginTestClass extends ChromeDriverstart{

	LoginPageClass loginverify=new LoginPageClass();

	@BeforeTest
	public void setup() {

		driverstart() ; drivermanage();
	}

	@Test(priority=1)
	public void VerifyLoginPage() {

		String Logintitle=loginverify.LoginTitle();
		Assert.assertEquals(Logintitle, "OrangeHRM");
	}

	@Test(priority=2)
	public void LoginTest() {

		System.out.println("Loading Site......");

		PageFactory.initElements(driver, LoginPageClass.class);
		LoginPageClass.username.sendKeys("Admin");
		LoginPageClass.password.sendKeys("admin123");
		LoginPageClass.loginbtn.click();

		System.out.println("Site verified");
	}

	@AfterTest
	public void teardown() {
		driverstop();
	}
}
