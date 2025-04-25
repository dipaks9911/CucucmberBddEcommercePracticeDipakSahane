Feature: Registration functionality

Scenario: User creates an account only with mandatory fields
Given User navigates to Register Account page
When User enters the details into below fields
|firstName	|dipak												|
|lastName		|sahane										|
|telephone	|8767085923									|
|password		|Mahatma309											|
And User selects Privacy Policy
And User clicks on Continue button
Then User account should get created successfully

Scenario: User creates an account with all fields
Given User navigates to Register Account page
When User enters the details into below fields
|firstName	|avish												|
|lastName		|sah										|
|telephone	|8554892272									|
|password		|Gandhi1445											|
And User selects Yes for Newsletter
And User selects Privacy Policy
And User clicks on Continue button
Then User account should get created successfully

Scenario: User creates a duplicate account
Given User navigates to Register Account page
When User enters the details into below fields with duplicate email
|firstName	|dipak											|
|lastName		|sahane									|
|email			|dipaks9911@gmail.com			|
|telephone	|8767085923								|
|password		|Mahatma309											|
And User selects Yes for Newsletter
And User selects Privacy Policy
And User clicks on Continue button
Then User should get a proper warning about duplicate email

Scenario: User creates an account without filling any details
Given User navigates to Register Account page
When User dont enter any details into fields
And User clicks on Continue button
Then User should get proper warning messages for every mandatory field