Feature: Login functionality

Scenario Outline: Login with valid credentials
Given User navigates to login page
When User enters valid email address "<username>" into email field
And User enters valid password "<password>" into password field
And User clicks on Login button
Then User should get successfully logged in
Examples:
|username								|password	|
|dipaksahane87@gmail.com	|  Mahatma9881     	|
|dipaks9911@gmail.com	| Mahatma309		|


Scenario: Login with invalid credentials
Given User navigates to login page
When User enters invalid email address into email field
And User enters invalid password "1234567890" into password field
And User clicks on Login button
Then User should get a proper warning message about credentials mismatch

Scenario: Login with valid email and invalid password
Given User navigates to login page
When User enters valid email address "dipaks9911@gmail.com" into email field
And User enters invalid password "12345678956" into password field
And User clicks on Login button
Then User should get a proper warning message about credentials mismatch

Scenario: Login with invalid email and valid password
Given User navigates to login page
When User enters invalid email address into email field
And User enters valid password "Gandhi1445" into password field
And User clicks on Login button
Then User should get a proper warning message about credentials mismatch

Scenario: Login without providing any credentails
Given User navigates to login page
When User dont enter email address into email field
And User dont enter password into password field
And User clicks on Login button
Then User should get a proper warning message about credentials mismatch 