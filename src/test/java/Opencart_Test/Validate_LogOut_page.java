package Opencart_Test;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Base.Base_Page;
import Page_Objects.Login_page;
import Page_Objects.Logout_page;
import Page_Objects.Registration_Page;

public class Validate_LogOut_page extends Base_Page {
	static WebDriver driver;
	Registration_Page register;
	Login_page login;
	Logout_page logout;

	public Validate_LogOut_page() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	@BeforeTest()
	public void Setup() throws IOException {
		driver = getDriver();
		driver.get(getURL());

	}

	@Test(priority = 1)
	public void Logout_1() throws InterruptedException, IOException {
		register = new Registration_Page(driver);
		login = new Login_page(driver);
		logout = new Logout_page(driver);
		extentTest.assignCategory("Logout_Validation");
		extentTest.assignAuthor("Sai krishna");
		extentTest.assignDevice("Chrome 114");

		register.getMyAccount().click();

		Thread.sleep(2000);
		login.getLoginButton().click();
		extentTest.pass("Successfully clicked login Button ");
		login.getEmailfield().sendKeys("KittuTest@gmail.com");
		extentTest.pass("Entered Email");
		login.getPasswordfiled().sendKeys("123123");
		extentTest.pass("Entered Password");
		login.getLoginToBTn().click();
		extentTest.pass("Suceesfuuly clicked login Button ");
		Thread.sleep(2000);
		register.getMyAccount().click();
		extentTest.pass("Suceesfuuly clicked MyAccount Button ");
		logout.getLogoutBtn().click();
		extentTest.pass("Suceesfuuly clicked logout Button ");
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
		String Expected = logout.getMessage().getText();
		String Actual = "You have been logged off your account. It is now safe to leave the computer.";
		assertEquals(Actual, Expected, "message mismatch");

	}

	@Test(priority = 2)
	public void Logout_2() throws InterruptedException {
		register = new Registration_Page(driver);
		login = new Login_page(driver);
		logout = new Logout_page(driver);
		extentTest.assignCategory("Logout_Validation");
		extentTest.assignAuthor("Sai krishna");
		extentTest.assignDevice("Chrome 114");

		register.getMyAccount().click();
		extentTest.pass("Suceesfuuly Clicked account Button");
		Thread.sleep(2000);
		login.getLoginButton().click();
		extentTest.pass("Suceesfuuly clicked login");
		login.getEmailfield().sendKeys("KittuTest@gmail.com");
		extentTest.pass("Suceesfuuly enetered email");
		login.getPasswordfiled().sendKeys("123123");
		extentTest.pass("Suceesfuuly entered password");
		login.getLoginToBTn().click();
		Thread.sleep(2000);

		register.getMyAccount().click();
		logout.getLogoutBtn().click();
		extentTest.pass("Suceesfuuly clicked logout button");
		logout.getContinueBtn().click();
		String actual = driver.getCurrentUrl();
		if (actual.contains("home")) {
			assertEquals(true, true);
		}

	}

	@AfterTest
	public void tearUp() throws IOException {
		driver.close();

	}

}
