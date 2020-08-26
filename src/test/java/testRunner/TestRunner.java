package testRunner;

import org.junit.runner.RunWith;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import common.BasePage;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


	@RunWith(Cucumber.class)

	@CucumberOptions(
			features = "src/test/java/features/app.feature",
			glue = "stepDefinition",
			plugin = { "pretty", "html:test-output/cucumber-html-report", "json:test-output/cucumber.json",
					"junit:test-output/cucumber.xml"}, 

			monochrome = true,
			strict = true, 
			dryRun = false)


	public class TestRunner extends BasePage{

		public static ExtentHtmlReporter getHtmlReporter() {
			return htmlReporter;
		}

		public static ExtentReports getExtent() {
			return extent;
		}
		
	}

