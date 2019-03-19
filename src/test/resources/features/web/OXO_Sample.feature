Feature: Verify sample Page 

Background: 
	Given user launches the browser and navigates to "OXO_HOME" page 
	
@OXO_PDP 
Scenario: Verify the add to cart functionality in PDP as guest user 
	And user clicks on search icon 
	And Search box will be shown to enter the text 
	And User enters the product name "productName" 
	And selects an item from search result 
	When clicks on add to cart button
	Then verify the item is add to cart 
	
