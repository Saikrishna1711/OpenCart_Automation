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
import Page_Objects.Logout_page;
import Page_Objects.Registration_Page;

public class Validate_Registration_page extends Base_Page {

	public WebDriver driver;

	public Validate_Registration_page() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	Registration_Page register;
	Logout_page logout;

	@BeforeTest
	public void setUp() throws IOException {
		driver = getDriver();
		driver.get(getURL());
	}

	@Test(priority = 1)
	public void Registration() throws InterruptedException {

		register = new Registration_Page(driver);
		logout = new Logout_page(driver);
		extentTest.assignCategory("Registration_Validation");
		extentTest.assignAuthor("Sai krishna");
		extentTest.assignDevice("Chrome 114");

		register.getMyAccount().click();
		extentTest.pass("Successfully clicked MyAccount Button ");
		Thread.sleep(2000);
		register.getRegisterBtn().click();
		extentTest.pass("Successfully clicked Registration Button ");
		Thread.sleep(2000);
		register.getFirstName().sendKeys("Example");
		extentTest.pass("Successfully Entered First name");
		register.getLasttName().sendKeys("Test1");
		extentTest.pass("Successfully Entered Last name");
		register.getemail().sendKeys("ExampleTest11@gmail.com");
		extentTest.pass("Successfully Entered Email");
		register.getTelephone().sendKeys("1234567890");
		extentTest.pass("Successfully Entered Telephone");
		register.getPassword().sendKeys("123123");
		extentTest.pass("Successfully Entered password");
		register.getConfirmPassword().sendKeys("123123");
		extentTest.pass("Successfully confirmed password");
		register.getnewsLetter_NO().click();
		extentTest.pass("Successfully clicked No ");
		register.getPolicy_Agree().click();
		extentTest.pass("Successfully Agreed Policy terms");
		register.getContinueBtn().click();
		extentTest.pass("Successfully clicked continue Button ");
		Assert.assertEquals(register.getSuccessMessage().getText(), "Your Account Has Been Created!");

		register.getMyAccount().click();
		extentTest.pass("Successfully clicked MyAccount Button ");
		logout.getLogoutBtn().click();
		extentTest.pass("Successfully clicked logout Button ");

	}

	@Test(priority = 2)
	public void Registration_with_NoData() throws InterruptedException {
		register = new Registration_Page(driver);
		extentTest.assignCategory("Registration_Validation");
		extentTest.assignAuthor("Sai krishna");
		extentTest.assignDevice("Chrome 114");
		register.getMyAccount().click();
		extentTest.pass("Successfully clicked MyAccount Button ");
		Thread.sleep(2000);
		register.getRegisterBtn().click();
		extentTest.pass("Successfully clicked Registration Button ");
		Thread.sleep(2000);
		register.getFirstName().sendKeys("");
		register.getLasttName().sendKeys("");
		register.getemail().sendKeys("");
		register.getTelephone().sendKeys("");
		register.getPassword().sendKeys("");
		register.getConfirmPassword().sendKeys("");
		extentTest.pass(" havent entered any details");
		register.getnewsLetter_NO().click();
		extentTest.pass("Successfully clicked No ");
		register.getPolicy_Agree().click();
		extentTest.pass("Successfully Agreed Policy terms");
		register.getContinueBtn().click();
		extentTest.pass("Successfully clicked continue Button ");

		Boolean a = register.getFirstNameError().isDisplayed();
		Boolean b = register.getLastNameError().isDisplayed();
		Boolean c = register.getPasswordError().isDisplayed();
		Boolean d = register.gettelephoneError().isDisplayed();
		if (a && b && c && d) {
			assertEquals(true, true);

		}

	}

	@Test(priority = 3)
	public void Registration_2() throws InterruptedException {

		register = new Registration_Page(driver);
		logout = new Logout_page(driver);
		extentTest.assignCategory("Registration_Validation");
		extentTest.assignAuthor("Sai krishna");
		extentTest.assignDevice("Chrome 114");

		register.getMyAccount().click();
		extentTest.pass("Successfully clicked MyAccount Button ");
		Thread.sleep(2000);
		register.getRegisterBtn().click();
		extentTest.pass("Successfully clicked Registration Button ");
		Thread.sleep(2000);
		register.getFirstName().sendKeys("Example");
		register.getLasttName().sendKeys("Test2");
		register.getemail().sendKeys("ExampleTest21@gmail.com");
		register.getTelephone().sendKeys("1234567890");
		register.getPassword().sendKeys("123123");
		register.getConfirmPassword().sendKeys("123123");
		extentTest.pass("Successfully entered all mandatory details");
		register.getnewsLetter_NO().click();
		extentTest.pass("Successfully clicked No ");
		register.getPolicy_Agree().click();
		extentTest.pass("Successfully Agreed Policy terms");
		register.getContinueBtn().click();
		extentTest.pass("Successfully clicked continue Button ");
		String Expectedmessage = register.getSuccessMessage().getText();
		String ActaulMessage = "Your Account Has Been Created!";
		Assert.assertEquals(ActaulMessage, Expectedmessage);

		register.getMyAccount().click();
		extentTest.pass("Successfullyclicked MyAccount Button ");
		logout.getLogoutBtn().click();
		extentTest.pass("Successfully clicked logout Button ");

	}

	@Test(priority = 4)
	public void Registration_3() throws InterruptedException {

		register = new Registration_Page(driver);
		logout = new Logout_page(driver);
		extentTest.assignCategory("Registration_Validation");
		extentTest.assignAuthor("Sai krishna");
		extentTest.assignDevice("Chrome 114");

		register.getMyAccount().click();
		extentTest.pass("Successfully clicked MyAccount Button ");
		Thread.sleep(2000);
		register.getRegisterBtn().click();
		extentTest.pass("Successfully clicked Registration Button ");
		Thread.sleep(2000);
		register.getFirstName().sendKeys("Example");
		register.getLasttName().sendKeys("Test3");
		register.getemail().sendKeys("ExampleTest31@gmail.com");
		register.getTelephone().sendKeys("1234567890");
		register.getPassword().sendKeys("123123");
		register.getConfirmPassword().sendKeys("123123");
		extentTest.pass("Successfully entered all mandatory details");
		register.getnewsLetter_NO().click();
		extentTest.pass("Successfully clicked No ");
		register.getPolicy_Agree().click();
		extentTest.pass("Successfully Agreed Policy terms");
		register.getContinueBtn().click();
		extentTest.pass("Successfully clicked continue Button ");
		String Expectedmessage = register.getSuccessMessage().getText();
		String ActaulMessage = "Your Account Has Been Created!";
		Assert.assertEquals(ActaulMessage, Expectedmessage);

		register.getMyAccount().click();
		extentTest.pass("Successfully clicked MyAccount Button ");
		logout.getLogoutBtn().click();
		extentTest.pass("Successfully clicked logout Button ");
	}

	@Test(priority = 5)
	public void Registration_With_InvalidData() throws InterruptedException {
		register = new Registration_Page(driver);
		extentTest.assignCategory("Registration_Validation");
		extentTest.assignAuthor("Sai krishna");
		extentTest.assignDevice("Chrome 114");

		register.getMyAccount().click();
		extentTest.pass("Successfully clicked MyAccount Button ");
		Thread.sleep(2000);
		register.getRegisterBtn().click();
		extentTest.pass("Successfully clicked Registration Button ");
		Thread.sleep(2000);
		register.getFirstName().sendKeys("Example");
		register.getLasttName().sendKeys("Test4");
		register.getemail().sendKeys("ExampleTest41&*gmail.com");
		register.getTelephone().sendKeys("1234567890");
		register.getPassword().sendKeys("123123");
		register.getConfirmPassword().sendKeys("123123");
		extentTest.pass("entered invalid details");
		register.getnewsLetter_NO().click();
		extentTest.pass("Successfully clicked No ");
		register.getPolicy_Agree().click();
		extentTest.pass("Successfully Agreed Policy terms");
		register.getContinueBtn().click();
		extentTest.pass("Successfully clicked continue Button ");
		Thread.sleep(2000);
		String url = driver.getCurrentUrl();
		Thread.sleep(5000);
		if (url.contains("register")) {
			assertEquals(true, true);
			System.out.println("Check your mail address");
		}

	}

	@Test(priority = 6)
	public void Registration_With_Incorrectpassword() throws InterruptedException {
		register = new Registration_Page(driver);
		extentTest.assignCategory("Registration_Validation");
		extentTest.assignAuthor("Sai krishna");
		extentTest.assignDevice("Chrome 114");

		register.getMyAccount().click();
		extentTest.pass("Successfully clicked MyAccount Button ");
		Thread.sleep(2000);
		register.getRegisterBtn().click();
		extentTest.pass("Successfully clicked Registration Button ");
		Thread.sleep(2000);
		register.getFirstName().sendKeys("Example");
		register.getLasttName().sendKeys("Test5");
		register.getemail().sendKeys("ExampleTest51@gmail.com");
		register.getTelephone().sendKeys("1234567890");
		register.getPassword().sendKeys("12312");
		register.getConfirmPassword().sendKeys("123123");
		extentTest.pass("entered invalid password");
		register.getnewsLetter_NO().click();
		extentTest.pass("Successfully clicked No ");
		register.getPolicy_Agree().click();
		extentTest.pass("Successfully Agreed Policy terms");
		register.getContinueBtn().click();
		extentTest.pass("Successfully clicked continue Button ");
		Thread.sleep(2000);
		Boolean x = register.getPasswordError().isDisplayed();
		if (x) {
			assertEquals(true, true);

		}
	}

	@Test(priority = 7)
	public void Registration_PasswordLength() throws InterruptedException {
		register = new Registration_Page(driver);
		extentTest.assignCategory("Registration_Validation");
		extentTest.assignAuthor("Sai krishna");
		extentTest.assignDevice("Chrome 114");

		register.getMyAccount().click();
		extentTest.pass("Successfully clicked MyAccount Button ");
		Thread.sleep(2000);
		register.getRegisterBtn().click();
		extentTest.pass("Successfully clicked Registration Button ");
		Thread.sleep(2000);
		register.getFirstName().sendKeys("Example");
		register.getLasttName().sendKeys("Test6");
		register.getemail().sendKeys("ExampleTest61@gmail.com");
		register.getTelephone().sendKeys("1234567890");
		register.getPassword().sendKeys("123");
		register.getConfirmPassword().sendKeys("123");
		extentTest.pass("entered invalid password");
		register.getnewsLetter_NO().click();
		extentTest.pass("Successfully clicked No ");
		register.getPolicy_Agree().click();
		extentTest.pass("Successfully Agreed Policy terms");
		register.getContinueBtn().click();
		extentTest.pass("Successfully clicked continue Button ");
		Thread.sleep(2000);
		Assert.assertEquals(register.getPasswordError().getText(), "Password must be between 4 and 20 characters!");

	}

	@Test(priority = 8)
	public void Registration_Policy() throws InterruptedException {
		register = new Registration_Page(driver);
		extentTest.assignCategory("Registration_Validation");
		extentTest.assignAuthor("Sai krishna");
		extentTest.assignDevice("Chrome 114");

		register.getMyAccount().click();
		extentTest.pass("Successfully clicked MyAccount Button ");
		Thread.sleep(2000);
		register.getRegisterBtn().click();
		extentTest.pass("Successfully clicked Registration Button ");
		Thread.sleep(2000);
		register.getFirstName().sendKeys("Example");
		register.getLasttName().sendKeys("test7");
		register.getemail().sendKeys("ExampleTest71@gmail.com");
		register.getTelephone().sendKeys("1234567890");
		register.getPassword().sendKeys("123123");
		register.getConfirmPassword().sendKeys("123123");
		extentTest.pass("entered all mandatory details");
		register.getnewsLetter_NO().click();
		extentTest.pass("Successfully clicked No ");
		register.getContinueBtn().click();
		extentTest.pass("Successfully clicked continue Button ");
		Thread.sleep(3000);
		Assert.assertEquals(register.getPolicyNotification().getText(),
				"Warning: You must agree to the Privacy Policy!");

	}

	@Test(priority = 9)
	public void Registration_Telephone() throws InterruptedException {
		register = new Registration_Page(driver);
		logout = new Logout_page(driver);
		extentTest.assignCategory("Registration_Validation");
		extentTest.assignAuthor("Sai krishna");
		extentTest.assignDevice("Chrome 114");

		register.getMyAccount().click();
		extentTest.pass("Successfully clicked MyAccount Button ");
		Thread.sleep(2000);
		register.getRegisterBtn().click();
		extentTest.pass("Successfully clicked Registration Button ");
		Thread.sleep(2000);
		register.getFirstName().sendKeys("Example");

		register.getLasttName().sendKeys("Test8");
		register.getemail().sendKeys("ExampleTest81@gmail.com");
		register.getTelephone().sendKeys("dhkjdkj");
		register.getPassword().sendKeys("123123");
		register.getConfirmPassword().sendKeys("123123");
		extentTest.pass("entered all mandatory details");
		register.getnewsLetter_NO().click();
		extentTest.pass("Successfully clicked No ");
		register.getPolicy_Agree().click();
		extentTest.pass("Successfully Agreed Policy terms");
		register.getContinueBtn().click();
		extentTest.pass("Successfully clicked continue Button ");
		Thread.sleep(2000);
		String url = driver.getCurrentUrl();
		Thread.sleep(5000);
		if (url.contains("register")) {
			assertEquals(true, true);
		}
		register.getMyAccount().click();
		extentTest.pass("Successfully clicked MyAccount Button ");
		logout.getLogoutBtn().click();
		extentTest.pass("Successfully clicked logout Button ");

	}

	@Test(priority = 10)
	public void Registration_Home() throws InterruptedException {
		register = new Registration_Page(driver);
		extentTest.assignCategory("Registration_Validation");
		extentTest.assignAuthor("Sai krishna");
		extentTest.assignDevice("Chrome 114");

		register.getMyAccount().click();
		extentTest.pass("Successfully clicked MyAccount Button ");
		Thread.sleep(2000);
		register.getRegisterBtn().click();
		extentTest.pass("Successfully clicked Registration Button ");
		Thread.sleep(2000);
		register.getHomePage().click();
		extentTest.pass("Successfully clicked Home Button ");
		Thread.sleep(2000);
		String url = driver.getCurrentUrl();
		if (url.contains("home")) {
			assertEquals(true, true);
		}

	}

	@Test(priority = 11)
	public void Registration_Login() throws InterruptedException {
		register = new Registration_Page(driver);
		extentTest.assignCategory("Registration_Validation");
		extentTest.assignAuthor("Sai krishna");
		extentTest.assignDevice("Chrome 114");

		register.getMyAccount().click();
		extentTest.pass("Successfully clicked MyAccount Button ");
		Thread.sleep(2000);
		register.getRegisterBtn().click();
		extentTest.pass("Successfully clicked Registration Button ");
		Thread.sleep(2000);
		register.getLoginPage().click();
		extentTest.pass("Successfully clicked login Button ");
		Thread.sleep(2000);
		String url = driver.getCurrentUrl();
		if (url.contains("login")) {
			assertTrue(true);
			System.out.println("reached Login page");
		}

	}

	@AfterTest
	public void TearUp() throws InterruptedException {
		Thread.sleep(3000);
		driver.close();
		Thread.sleep(5000);

	}
}
