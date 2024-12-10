package pageObjects;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class basePage {
	WebDriver driver;
	
	
	public basePage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	

}
