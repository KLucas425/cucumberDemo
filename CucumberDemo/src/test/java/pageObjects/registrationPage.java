package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class registrationPage extends basePage {

	public registrationPage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath="//input[@id='input-firstname']")
	WebElement firstName;
	
	@FindBy(xpath="//input[@id='input-lastname']")
	WebElement lastName;
	
	@FindBy(id="input-email")
	WebElement emailAddress;
	
	@FindBy(xpath="//input[@id='input-telephone']")
	WebElement phone;
	
	@FindBy(xpath= "//input[@id='input-password']")
	WebElement pwd;
	
	@FindBy(xpath="//input[@id='input-confirm']")
	WebElement confirmPwd;
	
	@FindBy(xpath="//input[@name='agree']")
	WebElement termsBtn;
	
	@FindBy(xpath="//input[@value='Continue']")
	WebElement continueBtn;
	
	public void inputFirst(String fName) {
		firstName.sendKeys(fName);
	}
	
	public void inputLast(String lName) {
		lastName.sendKeys(lName);
	}
	
	public void inputEmail(String email) {
		emailAddress.sendKeys(email);
	}
	
	public void inputPhone(String phoneNum) {
		phone.sendKeys(phoneNum);
	}
	
	public void inputPassword(String passwd) {
		pwd.sendKeys(passwd);
	}
	
	public void confirmPassword(String confirmPasswd) {
		confirmPwd.sendKeys(confirmPasswd);
	}
	
	public void terms() {
		termsBtn.click();
	}
	
	public void pressContinue() {
		continueBtn.click();
	}

}
