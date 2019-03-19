package com.oxo.qe.test.stepdefinition.web;

import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.oxo.qe.test.pageobject.OXO_MyAccount_PO;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class OXO_MyAccount_SD extends CommonActionHelper {

	OXO_MyAccount_PO oxoMyAccountPO = PageFactory.initElements(driver, OXO_MyAccount_PO.class);

	@When("^user navigates to my account from dropdown$")
	public void user_navigates_to_my_account_from_dropdown() throws Throwable {

		Thread.sleep(9000);
		oxoMyAccountPO.sign_drpdwn.click();
		oxoMyAccountPO.myAccount_Lnk.click();
	}

	@Given("^verify user logged in sucessfully$")
	public void verify_user_logged_in_sucessfully() throws Throwable {

		Thread.sleep(9000);
		oxoMyAccountPO.sign_drpdwn.click();
		//assertTrue(isDisplayed(oxoMyAccountPO.signOut_Lnk));
	}

	@When("^User click on sign out$")
	public void user_click_on_sign_out() throws Throwable {

		oxoMyAccountPO.signOut_Lnk.click();
	}

}
