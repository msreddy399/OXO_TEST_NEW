package com.oxo.qe.test.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OXO_PLP_PO {
	
	@FindBy(xpath="(//*[@class='hero__info hero__info--'])[1]") public WebElement PlpBanner_Img1;
	@FindBy(xpath="(//*[@class='hero__media hero__media--'])[1]") public WebElement PlpBanner_Img2;
	@FindBy(xpath="//*[@class='hero__title hero__title--']") public WebElement plpBannerTittle_Txt;
	@FindBy(xpath="//*[@class='hero__copy hero__copy--']") public WebElement plpBannerSubTittle_Txt;
	@FindBy(xpath="(//*[@class='breadcrumbs'])[1]") public WebElement plpBreadcrumb_Lnk;
	
	@FindBy(xpath="(//*[@class='product-image-photo'])[1]") public WebElement PlpProduct_Img;
	@FindBy(xpath="(//*[@class='action towishlist'])[2]") public WebElement plpWishlist_Btn;
	@FindBy(xpath="(//*[text() = 'Add to Cart'])[1]") public WebElement plpAddToCart_Btn;
	@FindBy(xpath="(//*[text() = 'Add to Cart'])[1]") public WebElement plpProductName_Txt;
	@FindBy(xpath="(//*[@id='product-price-1736'])[1]/span") public WebElement plpProductPrice_Txt;
	@FindBy(xpath="(//*[text()='Load More Products'])[2]") public WebElement loadMoreProdts_Btn;

}
