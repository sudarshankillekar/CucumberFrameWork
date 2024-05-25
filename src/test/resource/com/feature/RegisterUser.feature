Feature: User Registration

  Scenario: Register a new user account
    Given the browser is launched
    And the website "http://automationexercise.com" is navigated
    Then the home page should be visible successfully
    When the "Signup / Login" button is clicked
    Then the "New User Signup!" should be visible
    When the name and email address are entered
    And the "Signup" button is clicked
    Then the "ENTER ACCOUNT INFORMATION" should be visible
    When the following details are filled:
      | Title    | Ms.   |
      | Name     | Jane  |
      | Email    | jane@example.com |
      | Password | Password123 |
      | Date of Birth | 01/01/1990 |
    And the "Sign up for our newsletter!" checkbox is selected
    And the "Receive special offers from our partners!" checkbox is selected
    And the following information is filled:
      | First Name | Jane |
      | Last Name  | Doe  |
      | Company    | ABC Company |
      | Address1   | 123 Main St |
      | Address2   | Apt 456 |
      | Country    | United States |
      | State      | California |
      | City       | Los Angeles |
      | Zipcode    | 90001 |
      | Mobile Number | 1234567890 |
    And the "Create Account" button is clicked
    Then the "ACCOUNT CREATED!" should be visible
    When the "Continue" button is clicked
    Then the "Logged in as username" should be visible
    When the "Delete Account" button is clicked
    Then the "ACCOUNT DELETED!" should be visible
    And the "Continue" button is clicked      