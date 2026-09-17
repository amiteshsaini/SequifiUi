Feature: Feature to Test Management Organization functionality

  @Regression @002_Management_Organization
  Scenario Outline: Management: <TestCase>: Test Employment Package - Organization functionality for <Position>
    When Login: browser is open
    Then Login: Validate user is on login page
    Then Login: user enters valid username and password
    Then Login: Click Submit Button
    Then Login: Validate user is navigated to homepage
    Then Login: Subscription popup - Click on Later button
    Then Dashboard: Switch to Standard
    When Management: Management Menu: Click
    Then Management: Management Menu: Search "<Position>" Position and Click to open details
    Then Management: Employment Package Tab: Click
    Then Management: Employment Package Tab: Organization SubSection - Click on Edit button
    Then Management: Employment Package Tab: Organization SubSection - Click on Add Location button
    Then Management: Employment Package Tab: Enter "<EffectiveDate>" in Effective Date TextBox
    Then Management: Employment Package Tab: Organization SubSection - Additional Office Location - Select "<AdditionalOfficeLocation_State>" from Select State Dropdown
    Then Management: Employment Package Tab: Organization SubSection - Additional Office Location - Select "<AdditionalOfficeLocation_Office>" from Select Office Dropdown
    Then Management: Employment Package Tab: Organization SubSection - Click on Save button
    Examples:
      | TestCase | Position | EffectiveDate | AdditionalOfficeLocation_State | AdditionalOfficeLocation_Office |
      | TC1      | CSO Test | 06/10/2023    | Kentucky                       | Kentucky Blitz Test             |
