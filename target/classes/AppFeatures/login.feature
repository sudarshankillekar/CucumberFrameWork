

 
Feature: Login page feature

Scenario: Login Page title
    Given user is on Login Page
    When user gets the title of the page
    Then page title should be "Automation Exercise - Signup / Login"

Scenario: Verify Login to your account
    Given user is on Login Page
    Then Login to your account should be displayed

Scenario: Login with correct credentials
    Given user is on Login Page
    When user enters Username "sudarshankillekar1998@gmail.com"
    And user enters Password "98@Sudarshan98"
    And user clicks on login button
    When  user gets the title of the page
    Then page title should be "Automation Exercise"
