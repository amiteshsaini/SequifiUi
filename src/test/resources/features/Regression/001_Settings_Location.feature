Feature: Feature to Test Settings Locations functionality

  @Regression @001_Settings_Locations
  Scenario Outline: Settings: <TestCase>: Locations - Add location with <RedLineStandard> Standard Redline for State <State> and State Code <StateCode>
    When Login: browser is open
    Then Login: Validate user is on login page
    Then Login: user enters valid username and password
    Then Login: Click Submit Button
    Then Login: Validate user is navigated to homepage
    Then Login: Subscription popup - Click on Later button
    Then Settings: Settings Menu: Click
    Then Settings: Locations Tab: Click
    Then Settings: Locations Tab: Click on Add New button
    Then Settings: Locations Tab: Add Location SubSection - Enter Effective Date to "<EffectiveFromDate>"
    Then Settings: Locations Tab: Add Location SubSection - Select "<State>" from State Dropdown
    Then Settings: Locations Tab: Add Location SubSection - Enter State General Code to "<StateCode>"
    Then Settings: Locations Tab: Add Location SubSection - Select "<Office>" from Office Checkbox
    Then Settings: Locations Tab: Add Location SubSection - Enter "<OfficeName>" in Office Name Textbox
    Then Settings: Locations Tab: Add Location SubSection - Enter "<OfficeAddress>" in Office Address Textbox
    Then Settings: Locations Tab: Add Location SubSection - Enter "<InstallationPartner>" in Installation Partner Textbox
    Then Settings: Locations Tab: Add Location SubSection - Update RedLine Standard to "<RedLineStandard>"
    Then Settings: Locations Tab: Click on Add Location button to Save

    Examples:
      | TestCase | State      | StateCode | EffectiveFromDate | RedLineStandard | Office  | OfficeName | OfficeAddress                             | InstallationPartner |
      | TC1      | California | CA        | 05/01/2023        | 2.0             | Checked | Cal Office | 123 Main St, San Diego, California, 92111 | LGCY                |

  @Regression @001_Settings_Locations
  Scenario Outline: Settings: <TestCase>: Locations - Edit location Redline of State <State> and State Code <StateCode> to <RedLineStandard>
    When Login: browser is open
    Then Login: Validate user is on login page
    Then Login: user enters valid username and password
    Then Login: Click Submit Button
    Then Login: Validate user is navigated to homepage
    Then Login: Subscription popup - Click on Later button
    Then Settings: Settings Menu: Click
    Then Settings: Locations Tab: Click
    Then Settings: Locations Tab: Click on Edit button for state code "<StateCode>"
    Then Settings: Locations Tab: Edit Location Redline - Click on Edit button
    Then Settings: Locations Tab: Edit Location Redline - Click on Add Redline Link
    Then Settings: Locations Tab: Edit Location Redline - Update Effective Date to "<RedLineEffectiveDate>"
    Then Settings: Locations Tab: Edit Location Redline - Update RedLine Standard to "<RedLineStandard>"
    Then Settings: Locations Tab: Edit Location Redline - Click on Tick Button
    Then Settings: Locations Tab: Edit Location Redline - Click on Save Button
    Examples:
      | TestCase | State     | StateCode | RedLineEffectiveDate | RedLineStandard |
      | TC1      | Tennessee | TN        | 05/01/2023           | 2.40            |
      | TC2      | Georgia   | GA-2      | 05/01/2023           | 2.35            |
      | TC3      | Kentucky  | KY-3      | 05/01/2023           | 2.25            |
