package com.oxo.qe.test.stepdefinition.web;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.oxo.qe.test.pageobject.OXO_PDP_PO;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import freemarker.template.utility.NullArgumentException;

public class OXO_PDP_Verification_SD extends CommonActionHelper {

	OXO_PDP_PO oxoPDPPo = PageFactory.initElements(driver, OXO_PDP_PO.class);
	private static final Logger logger = Logger.getLogger(OXO_Payment_Verification_SD.class);

	@Then("^Verify below Sub/Main Module of PDP Page$")
	public void verify_below_Sub_Main_Module_of_PDP_Page(DataTable arg1) throws Throwable {

		try {
			List<List<String>> elements = arg1.raw();
			for (int i = 1; i < elements.size(); i++) {

				String currentElement = elements.get(i).get(0);
				// ===============================================================================
				//// HomePage
				// ===============================================================================

				if (currentElement.equalsIgnoreCase("pdpBreadcrumb_Lnk"))
					assertTrue(isDisplayed(oxoPDPPo.pdpBreadcrumb_Lnk));				
				
				  else if (currentElement.equalsIgnoreCase("pdpImgSlider_Img"))
				  assertTrue(isDisplayed(oxoPDPPo.pdpImgSlider_Img));
				 
				else {
					logger.error("Element <" + currentElement + "> is not found in the SD list.");
					throw new NullArgumentException("Element <" + currentElement + "> is not found in the SD list.");
				}

			}

		} catch (NullPointerException e) {
			logger.error("This test-step has been failed");
		}

	}

}
