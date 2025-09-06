package StepDefinitions;

import java.util.Map;

import org.openqa.selenium.WebDriver;

import factory.baseClass;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.homePage;
import pageObjects.newAcctPage;
import pageObjects.registrationPage;
	
public class registrationSteps {
	
	WebDriver driver;
	homePage hp;
	registrationPage rp;
	newAcctPage newAcct;
	
	
	
	
	@Given("user navigates to registration page")
	public void user_navigates_to_registration_page() {

		//Just testing to see if I can edit files in my repo.
		hp = new homePage(baseClass.getDriver());
		hp.clickMyAcct();
		hp.clickRegBtn();
	}	
		
	@When("user enters the details")
	public void user_enters_the_details(DataTable datatable) {
		
		Map<String,String> datamap = datatable.asMap(String.class,String.class);
		
		rp = new registrationPage(baseClass.getDriver());
		
		rp.inputFirst(datamap.get("firstname"));
		rp.inputLast(datamap.get("lastname"));
		rp.inputEmail(baseClass.randomString()+"@gmail.com");
		rp.inputPhone(datamap.get("telephone"));
		rp.inputPassword(datamap.get("password"));
		rp.confirmPassword(datamap.get("password"));
		
	}

	@And("user checks on the terms checkbox")
	public void user_checks_on_the_terms_checkbox() {
		rp.terms();
	}

	@And("the userclicks continue")
	public void the_userclicks_continue() {
		rp.pressContinue();
	}

	@Then("Account should be on My Account page")
	public void account_should_be_on_my_account_page() {
		newAcct = new newAcctPage(baseClass.getDriver());
		newAcct.isWordingDisplayed();
	}
}
