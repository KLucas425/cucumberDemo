package StepDefinitions;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import factory.baseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.homePage;
import pageObjects.loginPage;
import pageObjects.myAcctPage;
import utilities.DataReader;

public class Steps {
	WebDriver driver;
	homePage hp;
	loginPage lp;
	myAcctPage macct;
	
	@Given("the user is on the nopCommerce login page")
	public void the_user_is_on_the_nop_commerce_login_page() {
	    
		
		
		hp = new homePage(baseClass.getDriver());
	    
	    hp.clickMyAcct();
	    hp.clickLogin();
	    
	}
	@When("the user enters email as {string} and password as {string}")
	public void the_user_enters_email_as_and_password_as(String string, String string2) {
		lp= new loginPage(baseClass.getDriver());
		lp.inputEmail(string);
		lp.inputPassword(string2);
	}

	@When("the user enters the valid login credentials \\(username: {string}, password: {string})")
	public void the_user_enters_the_valid_login_credentials_username_password(String user, String pwd) {
	  
		lp = new loginPage(baseClass.getDriver());
		
		lp.inputEmail(user);
		lp.inputPassword(pwd);
	    
	}

	@When("the user clicks on the Login button")
	public void the_user_clicks_on_the_login_button() {
	  
	    lp.pressLogin();
	}
	@Then("the user should be directed to the My Account Page")
	public void the_user_should_be_directed_to_the_my_account_page() {
		
		macct = new myAcctPage(baseClass.getDriver());
		
		boolean status = macct.isMyAcctDisplayed();
	
		Assert.assertEquals(status, true);
	}

}
