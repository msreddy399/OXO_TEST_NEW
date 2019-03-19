package com.oxo.qe.test.stepdefinition.web;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.oxo.qe.test.pageobject.OXO_HomePage_PO;
import com.oxo.qe.test.pageobject.OXO_PDP_PO;

import cucumber.api.java.en.When;

public class OXO_PDP_SD extends CommonActionHelper {
	
	OXO_HomePage_PO oxoHomePagePO = PageFactory.initElements(driver, OXO_HomePage_PO.class);
	OXO_PDP_PO oxoPDPPo = PageFactory.initElements(driver, OXO_PDP_PO.class);
	
	@When("^User enters the product name \"(.*?)\"$")
	public void user_enters_the_product_name(String arg1) throws Throwable {
		setInputText(oxoHomePagePO.Search_Placeholder_Txt, webPropHelper.getTestDataProperty(arg1));
		
	}

	@When("^selects an item from search result$")
	public void selects_an_item_from_search_result() throws Throwable {
		assertTrue(clickOnButton(oxoHomePagePO.searchprd_Img)); 
		
	}
	
	@When("^clicks on add to cart button$")
	public void clicks_on_add_to_cart_button() throws Throwable {
		assertTrue(clickOnButton(oxoPDPPo.PdpAddToCart_Btn));
		
	}

	
	
	


}
