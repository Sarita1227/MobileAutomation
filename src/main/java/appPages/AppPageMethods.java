package appPages;

import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.Status;

import common.BasePage;

public class AppPageMethods extends BasePage implements IAppLocator {


	boolean returnValue = false;

	/**
	 * Enter login credentials
	 * 
	 * @param user
	 * @return
	 */
	public boolean enterLoginCredentials(String username, String passwd) {
		WebElement emailEle = findElement(emailID, 10);
		WebElement psswdEle = findElement(password, 10);
		test.log(Status.INFO, "Enter email id and password");
		emailEle.sendKeys(username);
		psswdEle.sendKeys(passwd);
		test.log(Status.INFO, "Verify username is properly set");
		returnValue = emailEle.getText().equals(username);
		if (returnValue) {
			test.log(Status.PASS, "The method <b>enterLoginCredentials passed");
		} else {
			test.log(Status.FAIL, "The method <b>enterLoginCredentials failed");
		}

		return returnValue;
	}

	/**
	 * Click on login button
	 * 
	 * @return
	 * @throws InterruptedException
	 */
	public boolean clickLoginBtn() throws InterruptedException {
		WebElement signONBtnEle = findElement(signONBtn, 10);
		test.log(Status.INFO, "Verify the signon button is enabled");
		returnValue = isElementPresent(signONBtn, 10);
		test.log(Status.INFO, "Click on signon button");
		signONBtnEle.click();
		Thread.sleep(1000);

		if (returnValue) {
			test.log(Status.PASS, "The method <b>clickLoginBtn passed");
		} else {
			test.log(Status.FAIL, "The method <b>clickLoginBtn failed");
		}

		return returnValue;
	}

	/**
	 * Verify image
	 * 
	 * @return
	 */
	public boolean verifyImageOnLogin() {
		test.log(Status.INFO, "Verify house image is displayed");
		WebElement image = findElement(houseImage, 10);
		returnValue = image.isDisplayed();
		returnValue &= isElementPresent(houseImage, 10);
		if (returnValue) {
			test.log(Status.PASS, "The method <b>clickLoginBtn passed");
		} else {
			test.log(Status.FAIL, "The method <b>clickLoginBtn failed");
		}

		return returnValue;
	}
}
