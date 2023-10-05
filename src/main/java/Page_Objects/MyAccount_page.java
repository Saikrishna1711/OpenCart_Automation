package Page_Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyAccount_page {
	public WebDriver driver;
	
	By MyAccountBTn= By.cssSelector(".list-inline  ul > li:nth-of-type(1) > a");
	By AeditInformation=By.cssSelector("div#content > ul:nth-of-type(1) > li:nth-of-type(1) > a");
	By PChangePassword = By.cssSelector("div#content > ul:nth-of-type(1) > li:nth-of-type(2) > a");
	By BAddressBook = By.cssSelector("div#content > ul:nth-of-type(1) > li:nth-of-type(3) > a");
	By AFirstName = By.cssSelector("input#input-firstname");
	By ALastName = By.cssSelector("#input-lastname");
	By AEmail= By.cssSelector("#input-email");
	By ATelephone = By.cssSelector("input#input-telephone");
	By AMessage = By.cssSelector("div#account-account > .alert.alert-dismissible.alert-success");
	By AContinueBtn= By.cssSelector(".btn-primary");
	By AbackBtn=By.cssSelector(".form-horizontal .btn-default");
	By PPassword=By.cssSelector("input#input-password");
	By PConfirmpassword=By.cssSelector("#input-confirm");
	By PContinueBtn= By.cssSelector(".btn-primary");
	By PMessage= By.cssSelector("div#account-account > .alert.alert-dismissible.alert-success");
	By PconfirmError= By.cssSelector(".text-danger");
	By PlengthError = By.cssSelector(".text-danger");
	By PbackBtn=By.cssSelector(".form-horizontal .btn-default");
	By BNewAAddressBtn = By.cssSelector(".btn.btn-primary");
	By BFirstName = By.cssSelector("input#input-firstname");
	By BLastName = By.cssSelector("input#input-lastname");
	By BAddress1 = By.cssSelector("input[name='address_1']");
	By BCity = By.cssSelector("input#input-city");
	By BPostCode = By.cssSelector("input#input-postcode");
	By BCountry = By.cssSelector("#input-country");
	By BRegion = By.cssSelector("#input-zone");
	By BDefaultAddress_Yes = By.cssSelector("label:nth-of-type(1) > input[name='default']");
	By BDefaultAddress_No = By.cssSelector("label:nth-of-type(2) > input[name='default']");
	By BContinueBtn= By.cssSelector(".btn-primary");
	By newAddedAddress = By.cssSelector("tr:nth-of-type(1) > .text-left");
	By BeditBtn= By.cssSelector("tr:nth-of-type(1) > .text-right > .btn.btn-info");
	By BDeleteBtn=By.cssSelector("tr:nth-of-type(1) > .text-right > a:nth-of-type(2)");
	By BSuccessMessage= By.cssSelector("div#account-address > .alert.alert-dismissible.alert-success");
	By BSuccessDelete= By.cssSelector("div#account-address > .alert.alert-dismissible.alert-success");
	By BbackBtn=By.cssSelector(".form-horizontal .btn-default");
	

	 
	public MyAccount_page(WebDriver driver) {
		this.driver=driver;
		
	}
	public WebElement getMyAccountBTn() {
		return driver.findElement(MyAccountBTn);
	}
	public WebElement getEditInformationBtn() {
		return driver.findElement(AeditInformation);
	}
	public WebElement getchangepasswordBtn() {
		return driver.findElement(PChangePassword);
	}
	public WebElement getAddressBook() {
		return driver.findElement(BAddressBook);
	}
	public WebElement getAFirstName() {
		return driver.findElement(AFirstName);
	}
	public WebElement getALastName() {
		return driver.findElement(ALastName);
	}
	public WebElement getAemail() {
		return driver.findElement(AEmail);
	}
	public WebElement getAtelephone() {
		return driver.findElement(ATelephone);
	}
	public WebElement getABackBtn() {
		return driver.findElement(AbackBtn);
	}
	public WebElement getAmessage() {
		return driver.findElement(AMessage);
	}
	public WebElement getAContinueBtn() {
		return driver.findElement(AContinueBtn);
	}
	public WebElement getPPassword() {
		return driver.findElement(PPassword);
	}
	public WebElement getPConfirmPassword() {
		return driver.findElement(PConfirmpassword);
	}
	public WebElement getPContinueBtn() {
		return driver.findElement(PContinueBtn);
	}
	public WebElement getPmessage() {
		return driver.findElement(PMessage);
	}
	public WebElement getPlengthError() {
		return driver.findElement(PlengthError);
	}
	public WebElement getPcofirmError() {
		return driver.findElement(PconfirmError);
	}
	public WebElement getPBackBtn() {
		return driver.findElement(PbackBtn);
	}
	public WebElement getBNewAddressBtn() {
		return driver.findElement(BNewAAddressBtn);
	}
	public WebElement getBFirstName() {
		return driver.findElement(BFirstName);
	}
	public WebElement getBLastName() {
		return driver.findElement(BLastName);
	}
	public WebElement getBAddress1() {
		return driver.findElement(BAddress1);
	}
	public WebElement getBCity() {
		return driver.findElement(BCity);
	}
	public WebElement getBPostCode() {
		return driver.findElement(BPostCode);
	}
	public WebElement getBCountry() {
		return driver.findElement(BCountry);
	}
	public WebElement getBRegion() {
		return driver.findElement(BRegion);
	}
	public WebElement getBDefaultAddress_Yes() {
		return driver.findElement(BDefaultAddress_Yes);
		
	}
	public WebElement getBDefaultAddress_No() {
		return driver.findElement(BDefaultAddress_No);
	}
	public WebElement getBContinueBtn() {
		return driver.findElement(BContinueBtn);
	}
	public WebElement getBnewaddress() {
		return driver.findElement(newAddedAddress);
	}
	public WebElement getBEditBtn() {
		return driver.findElement(BeditBtn);
	}
	public WebElement getBDeleteBtn() {
		return driver.findElement(BDeleteBtn);
	}
	public WebElement getBsucessmessage() {
		return driver.findElement(BSuccessMessage);
	}
	public WebElement getBsucessDelete() {
		return driver.findElement(BSuccessDelete);
	}
	
	public WebElement getBbackBtn() {
		return driver.findElement(BbackBtn);
	}
}
