package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginPage extends basePage {

	public loginPage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath="//input[@id='input-email']")
	WebElement emailAddy;
	
	@FindBy(xpath="//input[@id='input-password']")
	WebElement password;
	
	@FindBy(xpath="//input[@value='Login']")
	WebElement loginButton;
	
	
	public void inputEmail(String email) {
		emailAddy.sendKeys(email);
	}
	
	public void inputPassword(String pwd) {
		password.sendKeys(pwd);
	}
	
	public void pressLogin() {
		loginButton.click();
	}
	
	
}
