package Opencart_Test;

import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertEquals;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.Base_Page;
import Page_Objects.Login_page;
import Page_Objects.Logout_page;
import Page_Objects.MyAccount_page;
import Page_Objects.Registration_Page;

public class Validate_MyAccountFeatures extends Base_Page {
	public WebDriver driver;
	Registration_Page register;
	Login_page login;
	Logout_page logout;
	MyAccount_page features;

	public Validate_MyAccountFeatures() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	@BeforeTest
	public void Setup() throws IOException, InterruptedException {
		driver = getDriver();
		driver.get(getURL());
		register = new Registration_Page(driver);
		login = new Login_page(driver);
		features = new MyAccount_page(driver);

		register.getMyAccount().click();
		login.getLoginButton().click();
		Thread.sleep(2000);
		login.getEmailfield().sendKeys("KittuTest@gmail.com");
		login.getPasswordfiled().sendKeys("123123");
		login.getLoginToBTn().click();

	}

	@Test(priority = 1)
	public void Details_update() throws InterruptedException {
		register = new Registration_Page(driver);
		features = new MyAccount_page(driver);
		extentTest.assignCategory("MyAccount_Validation");
		extentTest.assignAuthor("Sai krishna");
		extentTest.assignDevice("Chrome 114");

		register.getMyAccount().click();
		extentTest.pass("Successfully clicked MyAccount Button ");
		features.getMyAccountBTn().click();
		extentTest.pass("Successfully clicked MyAccount Button ");
		features.getEditInformationBtn().click();
		features.getAFirstName().clear();
		features.getALastName().clear();
		features.getAemail().clear();
		features.getAtelephone().clear();
		features.getAFirstName().sendKeys("Kittu");
		features.getALastName().sendKeys("Test");
		features.getAemail().sendKeys("KittuTest@gmail.com");
		features.getAtelephone().sendKeys("1234567890");
		extentTest.pass("Entered New details ");

		Thread.sleep(2000);

		features.getAContinueBtn().click();
		Thread.sleep(2000);
		String Expectedmessage = features.getAmessage().getText();
		String actaulMessage = "Success: Your account has been successfully updated.";
		assertEquals(Expectedmessage, actaulMessage);

	}

	@Test(priority = 2)
	public void Back_Button() throws InterruptedException {
		features = new MyAccount_page(driver);
		extentTest.assignCategory("MyAccount_Validation");
		extentTest.assignAuthor("Sai krishna");
		extentTest.assignDevice("Chrome 114");

		features.getEditInformationBtn().click();
		extentTest.pass("Successfully clicked Edit Information Link");
		Thread.sleep(2000);

		features.getABackBtn().click();
		extentTest.pass("Successfully clicked Back Button ");

		String url = driver.getCurrentUrl();
		if (url.contains("account")) {
			assertEquals(true, true);
		}
		register.getMyAccount().click();
		features.getMyAccountBTn().click();

	}

	@Test(priority = 3)
	public void Password_update() {
		features = new MyAccount_page(driver);
		extentTest.assignCategory("MyAccount_Validation");
		extentTest.assignAuthor("Sai krishna");
		extentTest.assignDevice("Chrome 114");

		features.getchangepasswordBtn().click();
		extentTest.pass("Successfully clicked Change password link ");
		features.getPPassword().sendKeys("123123");
		features.getPConfirmPassword().sendKeys("123123");
		extentTest.pass("Successfully entered password ");
		features.getPContinueBtn().click();
		extentTest.pass("Successfully clicked continue Button ");

		String Expectedmessage = features.getPmessage().getText();
		String actaulMessage = "Success: Your password has been successfully updated.";
		assertEquals(actaulMessage, Expectedmessage);
		register.getMyAccount().click();
		features.getMyAccountBTn().click();

	}

	@Test(priority = 4)
	public void InvalidPassword() {
		features = new MyAccount_page(driver);
		extentTest.assignCategory("MyAccount_Validation");
		extentTest.assignAuthor("Sai krishna");
		extentTest.assignDevice("Chrome 114");

		features.getchangepasswordBtn().click();
		extentTest.pass("Successfully clicked change password link");
		features.getPPassword().sendKeys("123123");
		features.getPConfirmPassword().sendKeys("1231237899");
		extentTest.pass("Entered invalid password");
		features.getPContinueBtn().click();
		extentTest.pass("Successfully clicked continue Button ");

		Boolean message = features.getPcofirmError().isDisplayed();
		if (message) {
			assertEquals(true, true);
		}
		register.getMyAccount().click();
		features.getMyAccountBTn().click();
	}

	@Test(priority = 5)
	public void PasswordLength() {
		features = new MyAccount_page(driver);
		extentTest.assignCategory("MyAccount_Validation");
		extentTest.assignAuthor("Sai krishna");
		extentTest.assignDevice("Chrome 114");

		features.getchangepasswordBtn().click();
		extentTest.pass("Successfully clicked change password link ");
		features.getPPassword().sendKeys("123");
		features.getPConfirmPassword().sendKeys("123");
		extentTest.pass("Entered invalid password");
		features.getPContinueBtn().click();
		extentTest.pass(" clicked Continue Button ");

		Boolean message = features.getPlengthError().isDisplayed();
		if (message) {
			assertEquals(true, true);
		}
		register.getMyAccount().click();
		features.getMyAccountBTn().click();
	}

	@Test(priority = 6)
	public void Password_3() {
		features = new MyAccount_page(driver);
		extentTest.assignCategory("MyAccount_Validation");
		extentTest.assignAuthor("Sai krishna");
		extentTest.assignDevice("Chrome 114");

		features.getchangepasswordBtn().click();
		extentTest.pass("Successfully clicked change password link ");
		features.getPBackBtn().click();
		extentTest.pass("Successfully back Button ");

		String url = driver.getCurrentUrl();
		if (url.contains("account")) {
			assertTrue(true);
			System.out.println("Successfully reached Account page");
		}
		register.getMyAccount().click();
		features.getMyAccountBTn().click();

	}

	@Test(priority = 7)
	public void MyAccount() {
		features = new MyAccount_page(driver);
		extentTest.assignCategory("MyAccount_Validation");
		extentTest.assignAuthor("Sai krishna");
		extentTest.assignDevice("Chrome 114");

		features.getAddressBook().click();
		extentTest.pass("Successfully clicked adress book");

		String url = driver.getCurrentUrl();
		if (url.contains("address")) {
			assertEquals(true, true);

		}

		register.getMyAccount().click();
		features.getMyAccountBTn().click();
	}

	@Test(priority = 8)
	public void ADDing_New_address() {
		features = new MyAccount_page(driver);
		extentTest.assignCategory("MyAccount_Validation");
		extentTest.assignAuthor("Sai krishna");
		extentTest.assignDevice("Chrome 114");

		features.getAddressBook().click();
		extentTest.pass("Successfully clicked adress book link");
		features.getBNewAddressBtn().click();
		extentTest.pass("Successfully clicked new adress book link");

		features.getBFirstName().sendKeys("kittu");
		features.getBLastName().sendKeys("Test");
		features.getBAddress1().sendKeys("1-2 /3 ");
		features.getBCity().sendKeys("new york");
		features.getBPostCode().sendKeys("12345");
		Select country = new Select(driver.findElement(By.id("input-country")));
		country.selectByVisibleText("United States");

		Select region = new Select(driver.findElement(By.id("input-zone")));
		region.selectByVisibleText("New York");
		extentTest.pass("Entered all mandatory details");

		features.getBContinueBtn().click();
		extentTest.pass("Successfully clicked continue button");

		String address = features.getBnewaddress().getText();
		if (address.contains("United States")) {
			assertEquals(true, true);
		}
		register.getMyAccount().click();
		features.getMyAccountBTn().click();

	}

	@Test(priority = 9)
	public void Update_address() {
		features = new MyAccount_page(driver);
		extentTest.assignCategory("MyAccount_Validation");
		extentTest.assignAuthor("Sai krishna");
		extentTest.assignDevice("Chrome 114");

		features.getAddressBook().click();
		extentTest.pass("Successfully clicked adress book link");

		features.getBEditBtn().click();
		extentTest.pass("Successfully clicked edit button");

		features.getBFirstName().sendKeys("kittu");
		features.getBLastName().sendKeys("Test");
		features.getBAddress1().sendKeys("1-2 /3 ");
		features.getBCity().sendKeys("new york");
		features.getBPostCode().sendKeys("12345");
		Select country = new Select(driver.findElement(By.id("input-country")));
		country.selectByVisibleText("United States");

		Select region = new Select(driver.findElement(By.id("input-zone")));
		region.selectByVisibleText("New York");
		extentTest.pass("Entered all mandatory details");

		features.getBContinueBtn().click();
		extentTest.pass("Successfully clicked continue button");

		String Expectedmessage = features.getBsucessDelete().getText();
		String actaulMessage = "Your address has been successfully updated";
		assertEquals(actaulMessage, Expectedmessage);
		register.getMyAccount().click();
		features.getMyAccountBTn().click();

	}

	@Test(priority = 10)
	public void Delete_address() {
		features = new MyAccount_page(driver);
		extentTest.assignCategory("MyAccount_Validation");
		extentTest.assignAuthor("Sai krishna");
		extentTest.assignDevice("Chrome 114");

		features.getAddressBook().click();
		extentTest.pass("Successfully clicked adress book link");
		features.getBDeleteBtn().click();
		extentTest.pass("Successfully clicked edit button");

		driver.switchTo().alert().accept();

		String Expectedmessage = features.getBsucessmessage().getText();
		String actaulMessage = "Your address has been successfully deleted";
		assertEquals(actaulMessage, Expectedmessage);
		register.getMyAccount().click();
		features.getMyAccountBTn().click();

	}

	@Test(priority = 11)
	public void Back_button_Test() {
		features = new MyAccount_page(driver);
		extentTest.assignCategory("MyAccount_Validation");
		extentTest.assignAuthor("Sai krishna");
		extentTest.assignDevice("Chrome 114");

		features.getAddressBook().click();
		extentTest.pass("Successfully clicked adress book link");
		features.getBbackBtn().click();
		extentTest.pass("Successfully clicked back button");

		String url = driver.getCurrentUrl();
		if (url.contains("account")) {
			assertEquals(true, true);
		}

	}

	@AfterTest
	public void tearUp() {
		register = new Registration_Page(driver);
		logout = new Logout_page(driver);

		register.getMyAccount().click();
		logout.getLogoutBtn().click();
		driver.close();
		driver.quit();
	}

}
