package com.oxo.qe.test.stepdefinition.web;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.oxo.qe.test.pageobject.OXO_Shipping_PO;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;

public class OXO_Shipping_Verification_SD extends CommonActionHelper{
	
	OXO_Shipping_PO oxoPLPPo = PageFactory.initElements(driver, OXO_Shipping_PO.class);
	private static final Logger logger = Logger.getLogger(OXO_Shipping_Verification_SD.class);
	
	@Then("^Verify below Sub/Main Module of Shipping Page$")
	public void verify_below_Sub_Main_Module_of_Shipping_Page(DataTable arg1) throws Throwable {
	   
		try {
			List<List<String>> elements = arg1.raw();
			for(int i=1; i<elements.size(); i++) {
				
			//	String currentElement = elements.get(i).get(0);
				// ===============================================================================
				//// HomePage
				// ===============================================================================
					/*
					 * if (currentElement.equalsIgnoreCase("checkout_Btn"))
					 * assertTrue(isDisplayed("oxoMyAccountPO")); else
					 * if(currentElement.equalsIgnoreCase("pdpAddToCart_Btn"))
					 * assertTrue(isDisplayed(oxoMyAccountPO.pdpAddToCart_Btn)); else {
					 * logger.error("Element <" + currentElement +
					 * "> is not found in the SD list."); throw new
					 * NullArgumentException("Element <" + currentElement +
					 * "> is not found in the SD list."); }
					 */
				
			}		
		  
		}catch (NullPointerException e) {
			logger.error("This test-step has been failed");
		}
		    
		}

	}