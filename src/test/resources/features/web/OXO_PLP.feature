Feature: Verify sample Page 

Background: 
	Given user launches the browser and navigates to "OXO_HOME" page 
	
@OXO_PLP 
Scenario: Verify the PLP banner image and title 
	And user clicks on cooking & baking category 
    And user selects a sub category
    Then Verify below Sub/Main Module of PLP Page 
		|# Verify following elements in Header |
		|PlpBanner_Img1|
		|PlpBanner_Img2|
		|plpBannerTittle_Txt|
		|plpBannerSubTittle_Txt|

@OXO_PLP 
Scenario: Verify the presence of breadcrumb in PLP 
	And user clicks on cooking & baking category 
	And user selects a sub category 
	Then Verify below Sub/Main Module of PLP Page 
		|# Verify following elements in PLP Page |
		|plpBreadcrumb_Lnk|

@OXO_PLP 
Scenario: Verify the product attributes 
	And user clicks on cooking & baking category 
	And user selects a sub category 
	Then Verify below Sub/Main Module of PLP Page 
		|# Verify following elements in PLP Page |
		|PlpProduct_Img|
#		|plpWishlist_Btn|
#		|plpAddToCart_Btn|
		|plpProductName_Txt|
		|plpProductPrice_Txt|

@OXO_PLP 
Scenario: Verify the add to cart functionality as a guest user from PLP
	And user clicks on cooking & baking category 
	And user selects a sub category 
	When user selects a product and clicks on add to cart 
	Then verify the item is add to cart
	
@OXO_PLP 
Scenario: Verify the add to cart functionality as a Logged In user from PLP
	And user clicks on Sign In link in the header 
	And user enters email "email" 
	And user enters password "Password"
	And Clicks on login button
	And user clicks on cooking & baking category 
	And user selects a sub category 
	When user selects a product and clicks on add to cart 
	Then verify the item is add to cart	

@OXO_PLP 
Scenario: Verify the wish list functionality as a guest user from PLP
	And user clicks on cooking & baking category 
	And user selects a sub category 
	When user selects a product and clicks on wishlist icon 
    Then verify the item is add to Wish list
	
@OXO_PLP 
Scenario: Verify the wish list functionality as a Logged In user from PLP 
	And user clicks on Sign In link in the header 
	And user enters email "email" 
	And user enters password "Password"
	And Clicks on login button
	And user clicks on cooking & baking category 
	And user selects a sub category 
	When user selects a product and clicks on wishlist icon 
    Then verify the item is add to Wish list	
    
@OXO_PLP 
Scenario: Verify the sort by functionality 
    

@OXO_PLP 
Scenario: Verify the Load more products functionality

@OXO_PLP 
Scenario: Verify the plp sorting

@OXO_PLP 
Scenario: Verify the bottom search functionality 

