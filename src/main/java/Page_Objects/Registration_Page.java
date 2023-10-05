package Page_Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Registration_Page {
	public WebDriver driver;
	
	By MyAccountBtn= By.cssSelector("a[title='My Account'] > .hidden-md.hidden-sm.hidden-xs");
	By RegisterBtn= By.cssSelector(".list-inline  ul > li:nth-of-type(1) > a");
	By firstName= By.cssSelector("input#input-firstname");
	By LastName= By.cssSelector("#input-lastname");
	By email= By.cssSelector("input#input-email");
	By telephone= By.cssSelector("input#input-telephone");
	By password= By.cssSelector("input#input-password");
	By confirmPassword= By.cssSelector("input#input-confirm");
	By newsletterSub_No= By.cssSelector("label:nth-of-type(2) > input[name='newsletter']");
	By newsletterSub_Yes=By.cssSelector("label:nth-of-type(1) > input[name='newsletter']");
	By PolicyCheckBox= By.cssSelector("input[name='agree']");
	By policyerror= By.cssSelector("div#account-register > .alert.alert-danger.alert-dismissible");
	By ContinueBtn= By.cssSelector("input[value='Continue']");
	By successMessage = By.cssSelector("div#content > h1");
	By ContinueBtn2= By.cssSelector(".btn.btn-primary");
	By HomePage = By.cssSelector("div#account-register > ul > li:nth-of-type(1)");
	By LoginPage = By.cssSelector(".breadcrumb [href='http\\:\\/\\/localhost\\/opencart\\/upload\\/index\\.php\\?route\\=account\\/account']");
	By FirstnameError=By.cssSelector("#account .has-error:nth-child(3) .text-danger");
	By lastnameError=By.cssSelector("#account .has-error:nth-child(4) .text-danger");
	By EmailError=By.cssSelector("#account .has-error:nth-child(5) .text-danger");
	By TelephoneError=By.cssSelector("#account .has-error:nth-child(6) .text-danger");
	By PasswordError=By.cssSelector(".form-horizontal fieldset:nth-of-type(2) .text-danger");
	
	
	
	
	
	public Registration_Page(WebDriver driver) {
		this.driver=driver;
	}
	public WebElement getMyAccount() {
		return driver.findElement(MyAccountBtn);
	}
	public WebElement getRegisterBtn() {
		return driver.findElement(RegisterBtn);
	}
	
	public WebElement getFirstName() {
		return driver.findElement(firstName);
	}
	public WebElement getLasttName() {
		return driver.findElement(LastName);
	}
	public WebElement getemail() {
		return driver.findElement(email);
	}
	public WebElement getTelephone() {
		return driver.findElement(telephone);
	}
	public WebElement getPassword() {
		return driver.findElement(password);
	}
	public WebElement getConfirmPassword() {
		return driver.findElement(confirmPassword);
	}
	public WebElement getnewsLetter_NO() {
		return driver.findElement(newsletterSub_No);
	}
	public WebElement getnewLetter_YES() {
		return driver.findElement(newsletterSub_Yes);
	}
	public WebElement getPolicy_Agree() {
		return driver.findElement(PolicyCheckBox);
	}
	public WebElement getContinueBtn() {
		return driver.findElement(ContinueBtn);
	}
	public WebElement getSuccessMessage() {
		return driver.findElement(successMessage);
	}
	public WebElement getContinueBtn2() {
		return driver.findElement(ContinueBtn2);
	}
	public WebElement getHomePage() {
		return driver.findElement(HomePage);
	}
	
	public WebElement getFirstNameError() {
		return driver.findElement(FirstnameError);
	}
	public WebElement getLastNameError() {
		return driver.findElement(lastnameError);
	}
	public WebElement getEmailError() {
		return driver.findElement(EmailError);
	}
	public WebElement gettelephoneError() {
		return driver.findElement(TelephoneError);
	}
	public WebElement getPasswordError() {
		return driver.findElement(PasswordError);
	}
	public WebElement getPolicyNotification() {
		return driver.findElement(policyerror);
	}
	public WebElement getLoginPage() {
		return driver.findElement(LoginPage);
	}
	
	
}
