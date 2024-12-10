package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class homePage extends basePage {

	public homePage(WebDriver driver) {
		super(driver);

	}
	
	@FindBy(xpath= "//span[normalize-space()='My Account']")
	WebElement myAcct;
	
	@FindBy(xpath="//a[normalize-space()='Register']")
	WebElement regBtn;
	
	@FindBy(xpath="//a[normalize-space()='Login']")
	WebElement loginBtn;
	
	@FindBy(xpath="//input[@placeholder='Search']")
	WebElement searchBar;
	
	public void clickMyAcct() {
		myAcct.click();
	}
	
	public void clickRegBtn() {
		regBtn.click();
	}
	
	public void clickLogin() {
		loginBtn.click();
	}
	
	public void search(String result) {
		searchBar.sendKeys(result);
	}

}
