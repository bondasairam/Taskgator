Feature: Login Data Driven

Scenario Outline: Login Data Driven

	 Given User is in login page
	 When User enters email id "<email>"
	 And User enters password  "<password>"
	 And User clicks the remember me
	 And User clicks the signin button
	 Then User should be logged in successfully
	 
	 Examples:
	 | email                      |password      |
	 | seller.ncrypted@gmail.com  |123456789     |
	 | seller.ncrypted@gmail.com  |123456        |