package Page_Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Logout_page {
	public WebDriver driver;
	
	By LogoutBtn= By.cssSelector(".list-inline  ul > li:nth-of-type(5) > a");
	By ContinueBtn=By.cssSelector(".btn.btn-primary");
	By Logout_message=By.cssSelector("div#content > p:nth-of-type(1)");
	

	
	public Logout_page(WebDriver driver) {
		this.driver=driver;
		
	}
	
	public WebElement getLogoutBtn() {
		return driver.findElement(LogoutBtn);
	}
	public WebElement getContinueBtn() {
		return driver.findElement(ContinueBtn);
	}
	public WebElement getMessage() {
		return driver.findElement(Logout_message);
	}
}

