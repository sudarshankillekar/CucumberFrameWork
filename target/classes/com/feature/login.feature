Feature: Login Page feature

 
Scenario: Login with correct credentials
Given user is on login page
Then user enters username "sudarshankillekar1998@gmail.com"
And user enters password "98@Sudarshan98"
And user clicks on login button
#Then user gets the title of the Home page 
#And page title should be "Automation Exercise"