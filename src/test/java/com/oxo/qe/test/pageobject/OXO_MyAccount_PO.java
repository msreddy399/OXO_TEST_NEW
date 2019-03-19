package com.oxo.qe.test.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OXO_MyAccount_PO {
	
	@FindBy(xpath="//*[@id='email']") public WebElement signIn_Txt;
	@FindBy(xpath="//*[@id='pass1']") public WebElement Password_Txt;
	@FindBy(xpath="//*[@id='bnt-social-login-authentication']") public WebElement login_Btn;
	@FindBy(xpath="//*[@id='pass1']") public WebElement forgotPassword_Lnk;
	@FindBy(xpath="//*[@id='pass1']") public WebElement createAccount_Btn;
	@FindBy(xpath="//*[@class='mfp-close']") public WebElement signClose_Btn;
	
	@FindBy(xpath="(//*[@class='hero__info hero__info--'])[1]") public WebElement AccountBanner_Img1;
	@FindBy(xpath="(//*[@class='hero__media hero__media--'])[1]") public WebElement AccountBanner_Img2;
	@FindBy(xpath="//*[@class='hero__title hero__title--']") public WebElement AccountBannerTittle_Txt;
	@FindBy(xpath="//*[@class='hero__copy hero__copy--']") public WebElement AccountBannerSubTittle_Txt;
		
	@FindBy(xpath="(//*[@class='customer-name'])[1]") public WebElement sign_drpdwn;
	@FindBy(xpath="(//*[@class='authorization-link'])[1]/a") public WebElement signOut_Lnk;
	@FindBy(xpath="(//*[@class='header links'])[2]/li[1]") public WebElement myAccount_Lnk;
	
	@FindBy(xpath="(//*[text()='My Account'])[5]") public WebElement myAccountDash_Lnk;
	@FindBy(xpath="(//*[text()='My Orders'])[1]") public WebElement myOrdrDash_Lnk;
	@FindBy(xpath="(//*[text()='My Wish List'])[1]") public WebElement myWishListDash_Lnk;
	@FindBy(xpath="(//*[text()='Address Book'])[2]") public WebElement myAddrBookDash_Lnk;
	@FindBy(xpath="(//*[text()='My Information'])[1]") public WebElement myInfoDash_Lnk;

}
