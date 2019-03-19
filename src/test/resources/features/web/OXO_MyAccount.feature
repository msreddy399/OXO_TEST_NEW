Feature: Verify sample Page 

Background: 
	Given user launches the browser and navigates to "OXO_HOME" page 
	
@OXO_MyAccount 
Scenario: Verify the sign In 
	And user clicks on Sign In link in the header 
	And user enters email "email" 
	And user enters password "Password" 
	And Clicks on login button 
	When user navigates to my account from dropdown 
	Then Verify below Sub/Main Module of MyAccount Page 
		|# Verify following elements in MyAccount |
		|AccountBanner_Img1|
		|AccountBanner_Img2|
		|AccountBannerTittle_Txt|
		|AccountBannerSubTittle_Txt|
		
@OXO_MyAccount 
Scenario: Verify the my account dashboard links 
	And user clicks on Sign In link in the header 
	And user enters email "email" 
	And user enters password "Password" 
	And Clicks on login button 
	When user navigates to my account from dropdown 
	Then Verify below Sub/Main Module of MyAccount Page 
		|# Verify following elements in MyAccount |
		|myAccountDash_Lnk|
		|myOrdrDash_Lnk|
		|myWishListDash_Lnk|
		|myAddrBookDash_Lnk|
		|myInfoDash_Lnk|
		
@OXO_MyAccount 
Scenario: Verify the my account dashboard links 
	And user clicks on Sign In link in the header 
	And clicks on Sign In in the home page header 
	And Clicks on create account 
	And user enters firstname "firstname" 
	And user enters lastname "lastname" 
	And user enters password "password" 
	And user enters random email 
	And user enters confirm password "repassword" 
	When user clicks on create account button 
	Then verify the user is registred successfully
	
	
	