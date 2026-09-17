Feature: Feature to Test Settings functionality

  Background:
    When Login: browser is open
    Then Login: Validate user is on login page
    Then Login: user enters valid username and password
    Then Login: Click Submit Button
    Then Login: Validate user is navigated to homepage

  @Settings
  Scenario: C_21 Validate NewCompanySetup is working as Expected
    When Settings: Settings Menu: Click
    And Settings: click on Edit Profile
    Then Settings: fill the required company data
    And Settings: click on save button
    Then Settings: Validate user is navigated back to settings page
