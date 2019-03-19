package com.oxo.qe.test.stepdefinition.web;

import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.oxo.qe.test.pageobject.OXO_Cart_PO;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.apache.log4j.Logger;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import freemarker.template.utility.NullArgumentException;

public class OXO_Cart_Verification_SD extends CommonActionHelper {
	
	OXO_Cart_PO oxoCartPO = PageFactory.initElements(driver, OXO_Cart_PO.class);
	private static final Logger logger = Logger.getLogger(OXO_Cart_Verification_SD.class);
	
	
	@Then("^Verify below Sub/Main Module of CartPage$")
	public void verify_below_Sub_Main_Module_of_CartPage(DataTable arg1) throws Throwable {
		
		try {
		List<List<String>> elements = arg1.raw();
		for(int i=1; i<elements.size(); i++) {
			
			String currentElement = elements.get(i).get(0);
			// ===============================================================================
			//// HomePage
			// ===============================================================================
			if (currentElement.equalsIgnoreCase("checkout_Btn"))
				assertTrue(isDisplayed(oxoCartPO.checkout_Btn));
			else if(currentElement.equalsIgnoreCase("pdpAddToCart_Btn"))
				assertTrue(isDisplayed(oxoCartPO.pdpAddToCart_Btn));
			else {
				logger.error("Element <" + currentElement + "> is not found in the SD list.");
				throw new NullArgumentException("Element <" + currentElement + "> is not found in the SD list.");
			}
			
		}		
	  
	}catch (NullPointerException e) {
		logger.error("This test-step has been failed");
	}
	}

}
