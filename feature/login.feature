Feature: Login feature file


 Scenario: User should be able to login to the application
 
 Given User is in login page
 When User enters email id "seller.ncrypted@gmail.com"
 And User enters password  "123456"
 And User clicks the remember me
 And User clicks the signin button
 Then User should be logged in successfully
 
 Scenario: User should be able to logout from the application

When User clicks the profile button
And User clicks the logout button
Then User should be logged out successfully