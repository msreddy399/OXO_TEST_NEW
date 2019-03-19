package com.oxo.qe.test.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OXO_Cart_PO {
	
	@FindBy(id="removeItem") public WebElement pdpAddToCart_Btn;
	@FindBy(xpath="(//*[@class='action primary checkout'])[2]") public WebElement checkout_Btn;

}
