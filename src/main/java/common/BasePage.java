package common;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;


public abstract class BasePage {

    public static WebDriver driver;
    static WebDriverWait wait;
    public static ExtentTest test;
	public static ExtentHtmlReporter htmlReporter;
	public static ExtentReports extent;
    
    static {
		org.apache.log4j.Logger.getRootLogger().setLevel(org.apache.log4j.Level.OFF);
		htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir")+"/test-output/extent-report.html");
		extent = new ExtentReports();
	    extent.attachReporter(htmlReporter);
	    htmlReporter.config().setDocumentTitle("Feature Report");
	    htmlReporter.config().setReportName("Test Report");
	    
	    htmlReporter.config().setTheme(Theme.STANDARD);
	    htmlReporter.config().setTimeStampFormat("EEEE, MMMM dd, yyyy, hh:mm a '('zzz')'");
	}
    
    public static ExtentTest getTest() {
		return test;
	}

    /**
     * Wait until element is displayed
     * @param driver
     * @param seconds
     * @param element
     */
    public static void waitForWebElementPresent(WebDriver driver, int seconds, WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver,seconds);
        wait.until( ExpectedConditions.visibilityOf(element));
    }


    public static void scrollIntoViewElement(WebDriver driver , WebElement element) {

        ((JavascriptExecutor) driver).executeScript(
                "arguments[0].scrollIntoView();", element);
    }

    /**
     * Is element present
     * @param locator
     * @param timeoutInSeconds
     * @return
     */
    public boolean isElementPresent(By locator, int timeoutInSeconds) {
        try {
            wait = new WebDriverWait(driver, timeoutInSeconds);
            WebElement elem = wait.until(ExpectedConditions.presenceOfElementLocated(locator));
            if (elem != null) {
                return true;
            } else {
                return false;
            }

        } catch (Exception e) {
            return false;
        }
    }



    /**
     * find webelement
     * @param locator
     * @param timeoutSeconds
     * @return
     */
    public WebElement findElement(By locator, int timeoutSeconds) {
        wait = new WebDriverWait(driver, timeoutSeconds);
        WebElement elem = wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        if (elem != null) {
            return elem;
        } else {
            return null;
        }
    }

    public boolean WaitTime(long time) {
        long startTime = System.currentTimeMillis();;
        long waitTime = Long.parseLong(ConfigManager.getProperty("WaitTime")) * 60000;
        long endTime = time + waitTime;
        if (startTime < endTime) {
            return true;
        } else {
            return false;
        }
    }
}