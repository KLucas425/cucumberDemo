package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import junit.framework.Assert;

public class newAcctPage extends basePage{

	public newAcctPage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath="//h1[normalize-space()='Your Account Has Been Created!']")
	WebElement success;
	
	public void isWordingDisplayed() {
		boolean status = success.isDisplayed();
		
		Assert.assertTrue(true);
	}
}
