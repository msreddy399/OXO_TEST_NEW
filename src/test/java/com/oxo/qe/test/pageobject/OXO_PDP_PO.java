package com.oxo.qe.test.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OXO_PDP_PO {
	
	@FindBy(xpath="(//*[@ class='action primary tocart'])[1]") public WebElement PdpAddToCart_Btn;
	@FindBy(xpath="//*[@class='action showcart']") public WebElement miniCart_Icon;
	@FindBy(xpath="//*[@class='action viewcart']") public WebElement miniCartViewCart_Btn;
	@FindBy(xpath="(//*[@class='product-image-photo'])[1]") public WebElement minicart_Img;
	@FindBy(xpath="//*[@class='action delete']/span") public WebElement minicartRemove_Btn;
	@FindBy(id="top-cart-btn-checkout") public WebElement minicartCheckout_Btn;
	@FindBy(xpath="//*[@class='action-primary action-accept']/span") public WebElement minicartModalRemove_Btn;
	@FindBy(xpath="//*[@class='action-secondary action-dismiss']/span") public WebElement minicartModalCancel_Btn;
	@FindBy(xpath="//*[@class='item Back to cart']") public WebElement checkoutBackCart_Lnk;	
	@FindBy(xpath="//*[@class='cart-empty']/p[1]") public WebElement cartEmpty_msg;
	
	@FindBy(xpath="(//*[@class='breadcrumbs'])[1]") public WebElement pdpBreadcrumb_Lnk;
	@FindBy(xpath="(//*[@class='product-hero-thumb__item product-hero-thumb__item--image '])[1]") public WebElement pdpImgSlider_Img;

}
