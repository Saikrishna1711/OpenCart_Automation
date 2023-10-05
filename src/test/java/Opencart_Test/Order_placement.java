package Opencart_Test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertEquals;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import Base.Base_Page;
import Page_Objects.Login_page;
import Page_Objects.Logout_page;
import Page_Objects.Order_placement_page;
import Page_Objects.Registration_Page;

public class Order_placement extends Base_Page {

	public WebDriver driver;
	Registration_Page register;
	Login_page login;
	Logout_page logout;
	Order_placement_page order;
	WebDriverWait wait;

	public Order_placement() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	@BeforeTest
	public void setUp() throws IOException, InterruptedException {
		driver = getDriver();
		driver.get(getURL());
		register = new Registration_Page(driver);
		login = new Login_page(driver);

		register.getMyAccount().click();

		Thread.sleep(2000);
		login.getLoginButton().click();

		String placeholder = login.getEmailfield().getAttribute("placeholder");

		System.out.println("placeHolderText:" + placeholder);
		if (placeholder.contains("E-mail Address")) {
			assertTrue(true);
		}
		login.getEmailfield().sendKeys("KittuTest@gmail.com");
		login.getPasswordfiled().sendKeys("123123");
		login.getLoginToBTn().click();
		Thread.sleep(2000);

		String url = driver.getCurrentUrl();
		if (url.contains("account")) {
			assertTrue(true);
			System.out.println("Successfully logged in");
		} else {
			assertTrue(false);
		}

	}

	@Test(priority = 1)
	public void AddToCart() throws InterruptedException {
		extentTest.assignCategory("Order placement");
		extentTest.assignAuthor("Sai krishna");
		extentTest.assignDevice("Chrome 114");
		order = new Order_placement_page(driver);
		order.getSearchBtn().sendKeys("MacBook Air");
		extentTest.pass("Sucessfully searched product");
		order.getSearchBtn2().click();
		order.getAddtoCartBtn().click();
		extentTest.pass("Sucessfully added product to cart");
		Thread.sleep(2000);
		if (order.getCartMessage().isDisplayed()) {
			assertEquals(true, true);
		}

	}

	@Test(priority = 2)
	public void CheckingOutProduct() throws InterruptedException {
		order = new Order_placement_page(driver);
		order.getshoppingcartBtn().click();
		extentTest.pass("Sucessfully opened shopping cart");
		extentTest.assignCategory("Order placement");
		extentTest.assignAuthor("Sai krishna");
		extentTest.assignDevice("Chrome 114");

		Thread.sleep(2000);
		// order.getQuantity().clear();
		// order.getQuantity().sendKeys("2");
		// System.out.println("product name:"+ order.getproductName().getText()+"
		// price:"+price);

		order.getCheckoutBtn().click();
		extentTest.pass("Sucessfully checked out");
		Thread.sleep(1000);
		order.getuseExistingAddressOption().click();
		extentTest.pass("Sucessfully clicked use existing address");
		Thread.sleep(2000);
		order.getAddressContinueBtn().click();
		extentTest.pass("Sucessfully clicked continue");
		Thread.sleep(1000);
		// order.getuseExistingAddressOption().click();
		Thread.sleep(1000);
		order.getDeliveryContinueBtn().click();
		extentTest.pass("Sucessfully clicked continue");
		Thread.sleep(1000);
		order.getDeliveryContinueBtn2().click();
		extentTest.pass("Sucessfully clicked continue");
		Thread.sleep(1000);
		order.getAgreementCheckBox2().click();
		extentTest.pass("Sucessfully clicked checkbox");
		Thread.sleep(1000);
		order.getPaymentContinueBtn().click();
		extentTest.pass("Sucessfully clicked continue");
		Thread.sleep(1000);
		order.getConfirmBtn().click();
		Thread.sleep(5000);

		extentTest.pass("Sucessfully confirmed order");

		order.getConfirmBtn().click();
		wait.until(ExpectedConditions.visibilityOf(order.getordermessage()));
		if (order.getordermessage().isDisplayed()) {
			assertEquals(false, true);
		}

	}

	@AfterTest
	public void TearUp() throws InterruptedException {
		Thread.sleep(3000);
		driver.close();
		driver.quit();

	}
}
