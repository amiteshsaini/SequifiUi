Feature: Feature to ResetApp

  @ResetApp
  Scenario: ResetApp
    When Login: browser is open
    Then Login: Validate user is on login page
    Then Login: user enters valid username and password
    Then Login: Click Submit Button
    Then Login: Validate user is navigated to homepage
    Then Login: Subscription popup - Click on Later button
    Then Dashboard: Click Reset App Button
