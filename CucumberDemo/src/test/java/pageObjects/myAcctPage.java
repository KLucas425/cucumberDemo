package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class myAcctPage extends basePage {

	public myAcctPage(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(xpath="//h2[normalize-space()='My Account']")
	WebElement myAccountWords;
	
	
	public boolean isMyAcctDisplayed() {
		boolean Myacct = myAccountWords.isDisplayed();
	    Assert.assertEquals(Myacct, true);
	    return Myacct;	
	}


	

}
