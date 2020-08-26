package stepDefinition;

import org.junit.Assert;


import com.aventstack.extentreports.Status;

import appPages.AppPageMethods;
import common.BasePage;
import common.ConfigurationSettings;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import testRunner.TestRunner;

public class AppStepDefinition extends BasePage{


	boolean testResult = false;
	AppPageMethods pageMethods = new AppPageMethods();
	static ConfigurationSettings configSettings = new ConfigurationSettings();
	
	
	@Before
	public static void beforeclass() throws Exception{
		test = extent.createTest("Before Class");
	  try {
		  configSettings.setUp();
	  } catch (Exception e) {
			test.log(Status.WARNING, "Error occured !!!" + e);
			
		}	
	}

	@After
	public static void afterClass(){
		extent.flush();
		driver.quit();
	}

	@Given("^Enter username as (.*) and password as (.*)$")
	public void enter_username_and_password(String user, String passwd) {
		test = TestRunner.getExtent().createTest("Test Step : enter_username_and_password");
		try {
			testResult = pageMethods.enterLoginCredentials(user, passwd);
		} catch (Exception e) {
			test.log(Status.WARNING, "Error occured !!!" + e);
			testResult &= false;
		}
		Assert.assertEquals(true, testResult);
	}

	@Then("^Click on Login Button$")
	public void click_on_Login_Button() {
		test = TestRunner.getExtent().createTest("Test Step : click_on_Login_Button");
		try {
			testResult = pageMethods.clickLoginBtn();
		} catch (Exception e) {
			test.log(Status.WARNING, "Error occured !!!" + e);
			testResult &= false;
		}
		Assert.assertEquals(true, testResult);
	}

	@Then("^Verify if house image is available$")
	public void verify_if_house_image_is_available() {
		test = TestRunner.getExtent().createTest("Test Step : verify_if_house_image_is_available");
		try {
			testResult = pageMethods.verifyImageOnLogin();
		} catch (Exception e) {
			test.log(Status.WARNING, "Error occured !!!" + e);
			testResult &= false;
		}
		Assert.assertEquals(true, testResult);
	}

}
