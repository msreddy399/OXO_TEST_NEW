Feature: Verify sample Page 

Background: 
	Given user launches the browser and navigates to "OXO_HOME" page 
	
@OXO_PDP 
Scenario: Verify the breadcrumb in PDP
	And user clicks on search icon 
	And Search box will be shown to enter the text 
	And User enters the product name "productName" 
	When selects an item from search result
	Then Verify below Sub/Main Module of PDP Page 
		|# Verify following elements in PLP Page |
		|pdpBreadcrumb_Lnk|
	
@OXO_PDP 
Scenario: Verify the product image slider in PDP 
	And user clicks on search icon 
	And Search box will be shown to enter the text 
	And User enters the product name "productName" 
	When selects an item from search result 
	Then Verify below Sub/Main Module of PDP Page 
		|# Verify following elements in PLP Page |
		|pdpImgSlider_Img|



@OXO_PLP 
Scenario: Verify the add to cart functionality 

@OXO_PLP 
Scenario: Verify the wishlist functionality 

@OXO_PLP 
Scenario: Verify the product share 

@OXO_PLP 
Scenario: Verify the product details 


