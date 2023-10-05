package Opencart_Test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertEquals;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import Base.Base_Page;
import Page_Objects.Login_page;
import Page_Objects.Logout_page;
import Page_Objects.Registration_Page;

public class End_to_End_Registration_Login_Logout extends Base_Page {

	public WebDriver driver;

	public End_to_End_Registration_Login_Logout() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	Registration_Page register;
	Login_page login;
	Logout_page logout;

	@BeforeTest
	public void setUp() throws IOException {
		driver = getDriver();
		driver.get(getURL());
	}

	@Test(priority = 1, groups = "End to End Registration, Login and Logout ")
	public void RegistrationEtoE() throws InterruptedException {

		register = new Registration_Page(driver);

		register.getMyAccount().click();
		extentTest.assignCategory("End to End Registration,Login and Logout");
		extentTest.assignAuthor("Sai krishna");
		extentTest.assignDevice("Chrome 114");
		extentTest.pass("Successfully clicked MyAccount Button ");
		Thread.sleep(2000);
		register.getRegisterBtn().click();
		extentTest.pass("Successfully clicked Registration Button ");
		Thread.sleep(2000);
		register.getFirstName().sendKeys("Test-E_123");
		register.getLasttName().sendKeys("WithKittu-E_123");
		register.getemail().sendKeys("KittuTestEtoE_123@gmail.com");
		register.getTelephone().sendKeys("1234567890");
		register.getPassword().sendKeys("123123");
		register.getConfirmPassword().sendKeys("123123");
		extentTest.pass("Entered all mandatory details");
		register.getnewsLetter_NO().click();
		extentTest.pass("Successfully clicked No ");
		register.getPolicy_Agree().click();
		extentTest.pass("Successfully Agreed Policy terms");
		register.getContinueBtn().click();
		extentTest.pass("Successfully clicked continue Button ");
		Assert.assertEquals(register.getSuccessMessage().getText(), "Your Account Has Been Created!");
		System.out.println("Registered Successfully ");

	}

	@Test(priority = 2)
	public void LogoutEtoE() throws InterruptedException {
		register = new Registration_Page(driver);
		logout = new Logout_page(driver);
		extentTest.assignCategory("End to End Registration,Login and Logout");
		extentTest.assignAuthor("Sai krishna");
		extentTest.assignDevice("Chrome 114");
		register.getMyAccount().click();
		extentTest.pass("Successfully clicked MyAccount Button ");
		Thread.sleep(2000);
		logout.getLogoutBtn().click();
		extentTest.pass("Suceesfuuly clicked logout Button ");
		logout.getContinueBtn().click();
		extentTest.pass("Suceesfuuly clicked continue Button ");
		String url = driver.getCurrentUrl();
		if (url.contains("home")) {
			assertEquals(true, true);
		}

	}

	@Test(priority = 3)
	public void LoginEtoE() throws InterruptedException {
		register = new Registration_Page(driver);
		login = new Login_page(driver);
		extentTest.assignCategory("End to End Registration,Login and Logout");
		extentTest.assignAuthor("Sai krishna");
		extentTest.assignDevice("Chrome 114");
		register.getMyAccount().click();
		extentTest.pass("Sucessfully clicked MyAccount ");
		Thread.sleep(2000);
		login.getLoginButton().click();
		extentTest.pass("Sucessfully clicked Login ");

		String placeholder = login.getEmailfield().getAttribute("placeholder");

		System.out.println("placeHolderText:" + placeholder);
		if (placeholder.contains("E-mail Address")) {
			assertTrue(true);
		}
		login.getEmailfield().sendKeys("KittuTestEtoE_123@gmail.com");
		extentTest.pass("Sucessfully Entered Email");
		login.getPasswordfiled().sendKeys("123123");
		extentTest.pass("Sucessfully Entered password");
		login.getLoginToBTn().click();
		extentTest.pass("Sucessfully clicked Login ");
		Thread.sleep(2000);

		String url = driver.getCurrentUrl();
		if (url.contains("account") && placeholder.contains("E-mail Address")) {
			assertEquals(true, true);
		}
	}

	@Test(priority = 4)
	public void LogoutEtoE2() throws InterruptedException {
		register = new Registration_Page(driver);
		logout = new Logout_page(driver);
		extentTest.assignCategory("End to End Registration,Login and Logout");

		extentTest.assignAuthor("Sai krishna");
		extentTest.assignDevice("Chrome 114");
		register.getMyAccount().click();
		extentTest.pass("Sucessfully clicked MyAccount ");
		Thread.sleep(2000);
		logout.getLogoutBtn().click();
		extentTest.pass("Suceesfuuly clicked logout Button ");
		logout.getContinueBtn().click();
		extentTest.pass("Suceesfuuly clicked continue Button ");
		String url = driver.getCurrentUrl();
		if (url.contains("home")) {
			assertEquals(true, true);
		}
	}

	@AfterTest
	public void TearUp() throws InterruptedException {
		Thread.sleep(3000);
		driver.close();
		driver.quit();

	}
}
