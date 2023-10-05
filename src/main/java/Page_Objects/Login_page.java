package Page_Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login_page {
	public WebDriver driver;
	
	By LoginBtn= By.cssSelector(".list-inline  ul > li:nth-of-type(2) > a");
	By Emailfield= By.cssSelector("input#input-email");
	By Passwordfield= By.cssSelector("input#input-password");
	By Forgotpassword = By.cssSelector("form[method='post']  a");
	By LoginToBtn = By.cssSelector("form[method='post'] > input[value='Login']");
	By Emailfield2 = By.cssSelector("input#input-email");
	By continueBtn = By.cssSelector("input[value='Continue']");
	By BackBtn= By.linkText("Back");
	By ErrorMessage= By.cssSelector("div#account-login > .alert.alert-danger.alert-dismissible");
	By forgotmessage= By.cssSelector("div#content > h1");
	By successmessage= By.cssSelector("div#account-login > .alert.alert-dismissible.alert-success");
	By resetError=By.cssSelector("div#account-forgotten > .alert.alert-danger.alert-dismissible");

	
	public Login_page(WebDriver driver) {
		this.driver=driver;
		
	}
	public WebElement getLoginButton() {
		return driver.findElement(LoginBtn);
	}
	public WebElement getEmailfield() {
		return driver.findElement(Emailfield);
	}
	public WebElement getPasswordfiled() {
		return driver.findElement(Passwordfield);
	}
	public WebElement getForgotPassword() {
		return driver.findElement(Forgotpassword);
	}
	public WebElement getLoginToBTn() {
		return driver.findElement(LoginToBtn);
	}
	public WebElement getEmailfield2() {
		return driver.findElement(Emailfield2);
	}
	public WebElement getContinueBtn() {
		return driver.findElement(continueBtn);
	}
	public WebElement getBackBtn() {
		return driver.findElement(BackBtn);
	}
	public WebElement getErroeMessage() {
		return driver.findElement(ErrorMessage);
	}
	public WebElement getforgotmessage() {
		return driver.findElement(forgotmessage);
	}
	public WebElement getsuccessmessage() {
		return driver.findElement(successmessage);
	}
	public WebElement getresetError() {
		return driver.findElement(resetError);
	}
}
