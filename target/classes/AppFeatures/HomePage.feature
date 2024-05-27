Feature: Home page feature


Background: 
Given user has already Logged in to the application
|Username|Password|
|sudarshankillekar1998@gmail.com|98@Sudarshan98|

 
Scenario: Verify Category section
Given user is on account page
Then User gets category section
|WOMEN|
|MEN|
|KIDS|
And Category section count should be = 8
