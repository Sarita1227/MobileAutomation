package common;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import com.aventstack.extentreports.Status;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class ConfigurationSettings extends BasePage {


	
	DesiredCapabilities capabilities;
	

	public void setUp() throws IOException {
		test.log(Status.INFO, "Inside set up method of before hook");
		ConfigManager.loadConfig();
		/**
		 * This method Is responsible for executing test cases on Native Mobile apps.
		 */
		if (ConfigManager.getProperty("ExecutionPlatform").equalsIgnoreCase("Mobile")) {
			if (ConfigManager.getProperty("MachineName").equalsIgnoreCase("Windows")) {
				DriverFactory.appiumStartWindows();
			} else if (ConfigManager.getProperty("MachineName").equalsIgnoreCase("Mac")) {
				DriverFactory.appiumStartMac();
			}
			if (ConfigManager.getProperty("PlatformName").equalsIgnoreCase("Android")) {

				capabilities = new DesiredCapabilities();
				capabilities.setCapability("emulator", true);
				capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, ConfigManager.getProperty("DeviceName"));
				capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,
						ConfigManager.getProperty("PlatformName"));
				capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,
						ConfigManager.getProperty("PlatformVersion"));
				capabilities.setCapability(MobileCapabilityType.APP, System.getProperty("user.dir") + ConfigManager.getProperty("ApkPath"));
				capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "60000");

				try {
					driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
				} catch (MalformedURLException e) {
					e.printStackTrace();
				}
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

			} else if (ConfigManager.getProperty("PlatformName").equalsIgnoreCase("iOS")) {
				boolean DriverNoResetFlag = true;
				boolean locationServiceEnabled = true;
				capabilities = new DesiredCapabilities();
				capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "");
				capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,
						ConfigManager.getProperty("PlatformVersion"));
				capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,
						ConfigManager.getProperty("PlatformName"));
				capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, ConfigManager.getProperty("DeviceName"));
				capabilities.setCapability(MobileCapabilityType.APP, ConfigManager.getProperty("ApkPath"));
				capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "60000");
				if (DriverNoResetFlag) {
					capabilities.setCapability(MobileCapabilityType.FULL_RESET, false);
					capabilities.setCapability(MobileCapabilityType.NO_RESET, false);

				}
				if (locationServiceEnabled = true) {
					capabilities.setCapability("autoAcceptAlerts", true);
				}
				try {
					driver = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

					driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				} catch (MalformedURLException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
}
