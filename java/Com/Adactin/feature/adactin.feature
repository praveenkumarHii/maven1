@Smoketest 
Feature: Hotel Booking In Adactin Application 
Scenario: User Login In The Web Appliction 
	Given User Lunch The Adaction Application 
	When User Enter The User Name In User Name Field 
	And User Enter The Password In Password Field 
	Then User Click The login Button And Navigate Next Page 
	
@Sanitytest 
Scenario: User Searching In The Search Hotel Page 
	When User Select The Location Used In Drop Down 
	And User Select The Hotel In Search Hotel Page In Used In DropDown 
	And User Select The Room Type Used In DropDown 
	And User Select The Number Of Room Types Used In DropDown 
	And User Enter The Checkin Date Used In Sendkey 
	And User Enter The Checkout Date Used In Sendey 
	And User Select the Adults Per Used In DropDown 
	And User Select The Cheldrens Per Room Used In DropDown 
	Then User Click The Search Hotel Page And Navigate To Select Hotel Page 
	
@Sanitytest 
Scenario: User Select The Hotel In Select Hotel Page 
	And User Click The Select Button 
	Then User Click The Continue Button And Navigate To Payement Page 
@Sanitytest 
Scenario: User Booking The Room And Payement In Search Hotel Page 
	And User Enter The Name Used In Send Key 
	And User Enter The Billing Address Used In SendKey 
	And User Enter The Credit CardNumber Used In Sendkey 
	And User Select The Credit CardType Used In DropDown 
	And User Select Expiry Date And Month Used In DropDrown 
	And User Enter The Cvv Number Used In SendKey 
	Then User Click The BookNow And Navigte To Booking Confirmation 
	
@regressiontest 
Scenario: User Logout In Itinery Page
     And User Booking Confirmation In My Itinery Button Click 
	Then User Booked In Itinery In Click The LogOut Button
 