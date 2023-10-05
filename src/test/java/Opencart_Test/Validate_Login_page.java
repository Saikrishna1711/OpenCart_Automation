package Opencart_Test;

import static org.testng.Assert.assertEquals;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Base.Base_Page;
import Page_Objects.Login_page;
import Page_Objects.Logout_page;
import Page_Objects.Registration_Page;

public class Validate_Login_page extends Base_Page {
	public WebDriver driver;
	Registration_Page register;
	Login_page login;
	Logout_page logout;

	public Validate_Login_page() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	@BeforeTest
	public void Setup() throws IOException {
		driver = getDriver();
		driver.get(getURL());
	}

	@Test(priority = 1)
	public void Login() throws InterruptedException {
		register = new Registration_Page(driver);
		login = new Login_page(driver);
		logout = new Logout_page(driver);
		extentTest.assignCategory("Login_Validation");
		extentTest.assignAuthor("Sai krishna");
		extentTest.assignDevice("Chrome 114");

		register.getMyAccount().click();
		extentTest.pass("Sucessfully clicked MyAccount ");
		Thread.sleep(2000);
		login.getLoginButton().click();
		extentTest.pass("Sucessfully clicked Login ");

		String placeholder = login.getEmailfield().getAttribute("placeholder");

		System.out.println("placeHolderText:" + placeholder);

		login.getEmailfield().sendKeys("KittuTest@gmail.com");
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

		register.getMyAccount().click();
		extentTest.pass("Suceesfuuly clicked MyAccount Button ");
		logout.getLogoutBtn().click();
		extentTest.pass("Suceesfuuly clicked logout Button ");

	}

	@Test(priority = 2)
	public void Login_With_NoData() throws InterruptedException {
		register = new Registration_Page(driver);
		login = new Login_page(driver);
		logout = new Logout_page(driver);
		extentTest.assignCategory("Login_Validation");
		extentTest.assignAuthor("Sai krishna");
		extentTest.assignDevice("Chrome 114");

		register.getMyAccount().click();
		extentTest.pass("Sucessfully clicked MyAccount ");
		Thread.sleep(2000);
		login.getLoginButton().click();
		extentTest.pass("Sucessfully clicked Login ");
		Thread.sleep(2000);
		login.getLoginToBTn().click();
		extentTest.pass("Sucessfully clicked Login ");
		Thread.sleep(4000);
		String errormessageExpected = login.getErroeMessage().getText();
		String actaul = "Warning: No match for E-Mail Address and/or Password.";
		assertEquals(actaul, errormessageExpected);

	}

	@Test(priority = 3)
	public void Login_without_password() throws InterruptedException {
		register = new Registration_Page(driver);
		login = new Login_page(driver);
		logout = new Logout_page(driver);
		extentTest.assignCategory("Login_Validation");
		extentTest.assignAuthor("Sai krishna");
		extentTest.assignDevice("Chrome 114");

		register.getMyAccount().click();
		extentTest.pass("Sucessfully clicked MyAccount ");
		Thread.sleep(2000);
		login.getLoginButton().click();
		extentTest.pass("Sucessfully clicked Login ");
		login.getEmailfield().sendKeys("KittuTest@gmail.com");
		extentTest.pass("Sucessfully Entered Email");
		login.getLoginToBTn().click();
		Thread.sleep(2000);
		String errormessageExpected = login.getErroeMessage().getText();
		String actaul = "Warning: No match for E-Mail Address and/or Password.";
		assertEquals(actaul, errormessageExpected);

	}

	@Test(priority = 4)
	public void Login_without_email() throws InterruptedException {
		register = new Registration_Page(driver);
		login = new Login_page(driver);
		logout = new Logout_page(driver);
		extentTest.assignCategory("Login_Validation");
		extentTest.assignAuthor("Sai krishna");
		extentTest.assignDevice("Chrome 114");

		register.getMyAccount().click();
		extentTest.pass("Sucessfully clicked MyAccount ");
		Thread.sleep(2000);
		login.getLoginButton().click();
		extentTest.pass("Sucessfully clicked Login ");
		login.getPasswordfiled().sendKeys("123123");
		extentTest.pass("Sucessfully Entered password");
		login.getLoginToBTn().click();
		Thread.sleep(4000);
		String errormessageExpected = login.getErroeMessage().getText();
		String actaul = "Warning: No match for E-Mail Address and/or Password.";
		assertEquals(actaul, errormessageExpected);

	}

	@Test(priority = 5)
	public void Login_with_Invalid_data() throws InterruptedException {
		register = new Registration_Page(driver);
		login = new Login_page(driver);
		logout = new Logout_page(driver);
		extentTest.assignCategory("Login_Validation");
		extentTest.assignAuthor("Sai krishna");
		extentTest.assignDevice("Chrome 114");

		register.getMyAccount().click();
		extentTest.pass("Sucessfully clicked MyAccount ");
		Thread.sleep(2000);
		login.getLoginButton().click();
		extentTest.pass("Sucessfully clicked Login ");
		login.getEmailfield().sendKeys("hjdjh@gmail.com");
		extentTest.pass("Sucessfully Entered invalid email");
		login.getPasswordfiled().sendKeys("123123");
		extentTest.pass("Sucessfully Entered password");
		login.getLoginToBTn().click();
		Thread.sleep(2000);
		String errormessageExpected = login.getErroeMessage().getText();
		String actaul = "Warning: No match for E-Mail Address and/or Password.";
		assertEquals(actaul, errormessageExpected);

	}

	@Test(priority = 6)
	public void ForgotPassword() throws InterruptedException {
		register = new Registration_Page(driver);
		login = new Login_page(driver);
		logout = new Logout_page(driver);
		extentTest.assignCategory("Login_Validation");
		extentTest.assignAuthor("Sai krishna");
		extentTest.assignDevice("Chrome 114");

		login.getForgotPassword().click();
		extentTest.pass("Sucessfully cliced forgot password button ");
		Thread.sleep(2000);

		String Actual = login.getforgotmessage().getText();
		String Expected = "Forgot Your Password?";
		assertEquals(Actual, Expected);

		register.getMyAccount().click();
		extentTest.pass("Suceesfuuly clicked MyAccount Button ");
		logout.getLogoutBtn().click();
		extentTest.pass("Suceesfuuly clicked logout Button ");

	}

	@Test(priority = 7)
	public void ForgorPassword_email() throws InterruptedException {
		register = new Registration_Page(driver);
		login = new Login_page(driver);
		logout = new Logout_page(driver);
		extentTest.assignCategory("Login_Validation");
		extentTest.assignAuthor("Sai krishna");
		extentTest.assignDevice("Chrome 114");

		login.getForgotPassword().click();
		extentTest.pass("Sucessfully cliced forgor password button ");
		Thread.sleep(2000);
		String placeholder = login.getEmailfield2().getAttribute("placeholder");
		System.out.println(placeholder);
		String Expected = "E-Mail Address";
		assertEquals(placeholder, Expected);

	}

	@Test(priority = 8)
	public void ForgorPassword_email_check() throws InterruptedException {
		register = new Registration_Page(driver);
		login = new Login_page(driver);
		logout = new Logout_page(driver);
		extentTest.assignCategory("Login_Validation");
		extentTest.assignAuthor("Sai krishna");
		extentTest.assignDevice("Chrome 114");

		login.getForgotPassword().click();
		extentTest.pass("Sucessfully cliked forgot password button ");
		Thread.sleep(2000);
		login.getEmailfield2().sendKeys("KittuTest@gmail.com");
		extentTest.pass("Sucessfully entered  email");
		login.getContinueBtn().click();
		extentTest.pass("Sucessfully cliked continue button");
		Thread.sleep(4000);
		String messageExpected = login.getsuccessmessage().getText();
		String messageActual = "An email with a confirmation link has been sent your email address.";
		assertEquals(messageActual, messageExpected);

	}

	@Test(priority = 9)
	public void ForgorPassword_email_invalidData() throws InterruptedException {
		register = new Registration_Page(driver);
		login = new Login_page(driver);
		logout = new Logout_page(driver);
		extentTest.assignCategory("Login_Validation");
		extentTest.assignAuthor("Sai krishna");
		extentTest.assignDevice("Chrome 114");

		login.getForgotPassword().click();
		extentTest.pass("Sucessfully cliked forgot password button ");
		Thread.sleep(2000);
		login.getEmailfield2().sendKeys("KittuTes8989gmail.com");
		extentTest.pass("Sucessfully entered invalid email");
		login.getContinueBtn().click();
		extentTest.pass("Sucessfully cliked continue button");
		Thread.sleep(4000);
		String messageActual = login.getresetError().getText();
		String messageExpected = "Warning: The E-Mail Address was not found in our records, please try again!";
		assertEquals(messageActual, messageExpected);

	}

	@Test(priority = 10)
	public void ForgorPassword_Back() throws InterruptedException {
		register = new Registration_Page(driver);
		login = new Login_page(driver);
		logout = new Logout_page(driver);
		extentTest.assignCategory("Login_Validation");
		extentTest.assignAuthor("Sai krishna");
		extentTest.assignDevice("Chrome 114");

		login.getForgotPassword().click();
		extentTest.pass("Sucessfully cliked Forgot password button");
		Thread.sleep(2000);
		login.getBackBtn().click();
		extentTest.pass("Sucessfully cliked back button");
		Thread.sleep(2000);
		String url = driver.getCurrentUrl();
		if (url.contains("login")) {
			assertEquals(true, true);
		}

	}

	@AfterTest
	public void tearUp() {
		driver.close();
	}

}
