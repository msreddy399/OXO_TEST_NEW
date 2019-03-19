package com.oxo.qe.test.stepdefinition.web;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;

import com.aso.qe.framework.common.CommonActionHelper;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Common_Web_SD extends CommonActionHelper {
	private static final Logger logger = Logger.getLogger(Common_Web_SD.class);

	@Given("^user launches the browser and navigates to \"(.*?)\" page$")
	public void user_launches_the_browser_and_navigates_to_page(String url) throws Throwable {
		initializeDriver();
		openBaseURL(url);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		waitForPageLoad(driver);
	}

	@Then("^User closes the web application$")
	public void user_closes_the_web_application() throws Throwable {
		logger.debug("User closes the application & Browser.............");
		close();
	}
}
