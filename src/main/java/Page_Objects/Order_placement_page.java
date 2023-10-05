package Page_Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Order_placement_page {
	public WebDriver driver;
	
	By SearchBtn= By.cssSelector("div#search > input[name='search']");
	By searchBtn2=By.cssSelector(".btn-default");
	By AddtoCartBtn= By.cssSelector("div:nth-of-type(1) > .product-thumb > div:nth-of-type(2) > .button-group > button:nth-of-type(1) > .hidden-md.hidden-sm.hidden-xs");
	By CartMessage= By.cssSelector(".alert-dismissible");
	By shoppingcartBtn=By.cssSelector("a[title='Shopping Cart'] > .hidden-md.hidden-sm.hidden-xs");
	By productName= By.cssSelector("a[title='Shopping Cart'] > .hidden-md.hidden-sm.hidden-xs");
	By Quantity= By.cssSelector(".btn-block.input-group > input[name='quantity[3]']");
	By price=By.cssSelector(".btn-block.input-group > input[name='quantity[3]']");
	By CheckoutBtn= By.cssSelector("#content div:nth-child(8) .btn-primary");
	By useExistingAddressOption = By.cssSelector("div:nth-of-type(1) > label > input[name='payment_address']");
	By newAddressOption= By.cssSelector("div:nth-of-type(3) > label > input[name='payment_address']");
	By AddressContinueBtn= By.cssSelector("input#button-payment-address");
	By AgreementCheckBox1= By.cssSelector("input[name='agree']");
	By paymentContinueBtn = By.cssSelector("#button-payment-method");
	By deliveryAddress= By.cssSelector("div:nth-of-type(1) > label > input[name='payment_address']");
	By DeliveryContinueBtn= By.cssSelector("#button-shipping-address");
	By DeliveryContinueBtn2= By.cssSelector("#button-shipping-method");
	By AgreementCheckBox2= By.cssSelector("input[name='agree']");
	By PaymentContinueBtn= By.cssSelector("#button-payment-method");
	By ConfirmBtn= By.cssSelector("input#button-confirm");
	By ordermessage= By.className("alert alert-success alert-dismissible");
	
	
	
	
	public Order_placement_page(WebDriver driver) {
		this.driver=driver;
	}
	public WebElement getSearchBtn() {
		return driver.findElement(SearchBtn);
	}
	public WebElement getSearchBtn2() {
		return driver.findElement(searchBtn2);
	}
	public WebElement getAddtoCartBtn() {
		return driver.findElement(AddtoCartBtn);
	}
	public WebElement getCartMessage() {
		return driver.findElement(CartMessage);
	}
	public WebElement getshoppingcartBtn() {
		return driver.findElement(shoppingcartBtn);
	}
	public WebElement getproductName() {
		return driver.findElement(productName);
	}
	public WebElement getQuantity() {
		return driver.findElement(Quantity);
	}
	public WebElement getprice() {
		return driver.findElement(price);
	}
	public WebElement getCheckoutBtn() {
		return driver.findElement(CheckoutBtn);
	}
	public WebElement getuseExistingAddressOption() {
		return driver.findElement(useExistingAddressOption);
	}
	public WebElement getnewAddressOption() {
		return driver.findElement(newAddressOption);
	}
	public WebElement getAddressContinueBtn() {
		return driver.findElement(AddressContinueBtn);
	}
	public WebElement geAgreementCheckBox1() {
		return driver.findElement(AgreementCheckBox1);
	}
	public WebElement getpaymentContinueBtn() {
		return driver.findElement(paymentContinueBtn);
	}
	public WebElement getdeliveryAddress() {
		return driver.findElement(deliveryAddress);
	}
	public WebElement getDeliveryContinueBtn() {
		return driver.findElement(DeliveryContinueBtn);
	}
	public WebElement getDeliveryContinueBtn2() {
		return driver.findElement(DeliveryContinueBtn2);
	}
	public WebElement getAgreementCheckBox2() {
		return driver.findElement(AgreementCheckBox2);
	}
	public WebElement getPaymentContinueBtn() {
		return driver.findElement(PaymentContinueBtn);
	}
	public WebElement getConfirmBtn() {
		return driver.findElement(ConfirmBtn);
	}
	public WebElement getordermessage() {
		return driver.findElement(ordermessage);
	}
}

