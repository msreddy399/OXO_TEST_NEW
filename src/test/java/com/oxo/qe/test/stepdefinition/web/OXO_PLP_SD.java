package com.oxo.qe.test.stepdefinition.web;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.oxo.qe.test.pageobject.OXO_HomePage_PO;
import com.oxo.qe.test.pageobject.OXO_MyAccount_PO;
import com.oxo.qe.test.pageobject.OXO_PLP_PO;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OXO_PLP_SD extends CommonActionHelper {
	
	OXO_HomePage_PO oxoHomePagePO = PageFactory.initElements(driver, OXO_HomePage_PO.class);
	OXO_PLP_PO oxoPLPPO = PageFactory.initElements(driver, OXO_PLP_PO.class);
	OXO_MyAccount_PO oxoMyAccountPO = PageFactory.initElements(driver, OXO_MyAccount_PO.class);
	
	@Given("^user selects a sub category$")
	public void user_selects_a_sub_category() throws Throwable {
		Thread.sleep(5000);
		oxoHomePagePO.L2_Cat.click();
	}
	
	@When("^user selects a product and clicks on add to cart$")
	public void user_selects_a_product_and_clicks_on_add_to_cart() throws Throwable {
		
		scrollPageToWebElement(oxoPLPPO.PlpProduct_Img);
		
		Actions action = new Actions(driver);
		action.moveToElement(oxoPLPPO.plpAddToCart_Btn).build().perform();
		oxoPLPPO.plpAddToCart_Btn.click();
		
	}

	@Then("^verify the item is add to cart$")
	public void verify_the_item_is_add_to_cart() throws Throwable {
		
	}
	
	@Given("^user enters email \"(.*?)\"$")
	public void user_enters_email(String arg1) throws Throwable {
		setInputText(oxoMyAccountPO.signIn_Txt, webPropHelper.getTestDataProperty(arg1));
	}

	@Given("^user enters password \"(.*?)\"$")
	public void user_enters_password(String arg1) throws Throwable {
		setInputText(oxoMyAccountPO.Password_Txt, webPropHelper.getTestDataProperty(arg1));
		
	}
	
	
	@Given("^Clicks on login button$")
	public void clicks_on_login_button() throws Throwable {
		assertTrue(clickOnButton(oxoMyAccountPO.login_Btn));
		
	}


}
