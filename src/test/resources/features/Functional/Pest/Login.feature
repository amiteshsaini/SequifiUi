Feature: Test Login functionality

 @Pest @Pest_Login
  Scenario: Login
    When Login: browser is open
    Then Login: Validate user is on login page
    Then Login: user enters valid username and password
    Then Login: Click Submit Button
    Then Login: Validate user is navigated to homepage
