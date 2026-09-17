Feature: Feature to Test Management Overrides functionality

  @Regression @003_Management_Overrides
  Scenario Outline: <TestCase> Management: MODIFY REPS EMPLOYMENT PACKAGE TO TEST EFFECTIVE DATES AND VALUES FOR <Position>
    When Login: browser is open
    Then Login: Validate user is on login page
    Then Login: user enters valid username and password
    Then Login: Click Submit Button
    Then Login: Validate user is navigated to homepage
    Then Login: Subscription popup - Click on Later button
    Then Settings: Settings Menu: Click
    Then Settings: Package Tab: Click
    Then Settings: Package Tab: Search "<Position>" Position
    Then Settings: Package Tab: Click on Commission Structure Edit
    Then Settings: Package Tab: Overrides Sub Tab - Click
    Then Settings: Package Tab: Overrides Sub Tab - Enable Direct Overrides
    Then Settings: Package Tab: Overrides Sub Tab - Select "<SettingsCalculatedDropdownValue1>" from Calculated Dropdown
    Then Settings: Package Tab: Overrides Sub Tab - Enter Amount "<SettingsAmount1>" on Upfront Sub Tab
    Then Settings: Package Tab: Overrides Sub Tab - Click Submit
    Then Dashboard: Switch to Standard
    When Management: Management Menu: Click
    Then Management: Management Menu: Search "<Position>" Position and Click to open details
    Then Management: Employment Package Tab: Click
    Then Management: Employment Package Tab: Overrides SubSection - Click on Edit button
    Then Management: Employment Package Tab: Overrides SubSection - Update Override Effective Date to "<OverrideEffectiveDate1>"
    Then Management: Employment Package Tab: Overrides SubSection - Direct Override - Select "<CalculatedDropdownValue1>" from Calculated Dropdown
    Then Management: Employment Package Tab: Overrides SubSection - Direct Override - Update Amount from "<SettingsAmount1>" to "<Amount_Updated1>"
    Then Management: Employment Package Tab: Overrides SubSection - Validate "Indirect Overrides" is hidden
    Then Management: Employment Package Tab: Overrides SubSection - Validate "Office Overrides" is hidden
    Then Management: Employment Package Tab: Overrides SubSection - Update Stack Split from "<StackSplit1>" to "<StackSplit_Updated1>"
    Then Management: Employment Package Tab: Overrides SubSection - Click on Save button
    Then Management: Employment Package Tab: Overrides SubSection - Click on View Manual Overrides
    Then Management: Employment Package Tab: Overrides SubSection - Manual Override - Click on Add New Button
    Then Management: Employment Package Tab: Overrides SubSection - Manual Override - Update Effective Date to "<ManualOverridesEffectiveDate1>"
    Then Management: Employment Package Tab: Overrides SubSection - Manual Override - Update Override from to "<OverrideFrom1>"
    Then Management: Employment Package Tab: Overrides SubSection - Manual Override - Select "<ManualOverrideCalculatedDropdown1>" from Calculated Dropdown
    Then Management: Employment Package Tab: Overrides SubSection - Manual Override - Update Amount to "<ManualOverrideAmount1>"
    Then Management: Employment Package Tab: Overrides SubSection - Manual Override - Click on Add Override button
    Then Management: Employment Package Tab: Click
    Then Management: Employment Package Tab: Overrides SubSection - Click on Edit button
    Then Management: Employment Package Tab: Overrides SubSection - Update Override Effective Date to "<OverrideEffectiveDate2>"
    Then Management: Employment Package Tab: Overrides SubSection - Direct Override - Select "<CalculatedDropdownValue2>" from Calculated Dropdown
    Then Management: Employment Package Tab: Overrides SubSection - Direct Override - Update Amount from "<Amount2>" to "<Amount_Updated2>"
    Then Management: Employment Package Tab: Overrides SubSection - Validate "Indirect Overrides" is hidden
    Then Management: Employment Package Tab: Overrides SubSection - Validate "Office Overrides" is hidden
    Then Management: Employment Package Tab: Overrides SubSection - Update Stack Split from "<StackSplit2>" to "<StackSplit_Updated2>"
    Then Management: Employment Package Tab: Overrides SubSection - Click on Save button
    Then Management: Employment Package Tab: Overrides SubSection - Click on View Manual Overrides
    Then Management: Employment Package Tab: Overrides SubSection - Manual Override - Click on Add New Button
    Then Management: Employment Package Tab: Overrides SubSection - Manual Override - Update Effective Date to "<ManualOverridesEffectiveDate2>"
    Then Management: Employment Package Tab: Overrides SubSection - Manual Override - Update Override from to "<OverrideFrom2>"
    Then Management: Employment Package Tab: Overrides SubSection - Manual Override - Select "<ManualOverrideCalculatedDropdown2>" from Calculated Dropdown
    Then Management: Employment Package Tab: Overrides SubSection - Manual Override - Update Amount to "<ManualOverrideAmount2>"
    Then Management: Employment Package Tab: Overrides SubSection - Manual Override - Click on Add Override button

    Examples:
      | TestCase | Position    | OverrideEffectiveDate1 | OverrideEffectiveDate2 | SettingsAmount1 | SettingsCalculatedDropdownValue1 | Amount_Updated1 | CalculatedDropdownValue1 | StackSplit1 | StackSplit_Updated1 | ManualOverridesEffectiveDate1 | OverrideFrom1 | ManualOverrideCalculatedDropdown1 | ManualOverrideAmount1 | Amount2 | Amount_Updated2 | CalculatedDropdownValue2 | StackSplit2 | StackSplit_Updated2 | ManualOverridesEffectiveDate2 | OverrideFrom2 | ManualOverrideCalculatedDropdown2 | ManualOverrideAmount2 |
      | TC1      | VP of Sales | 03/01/2023             | 07/01/2024             | 0               | Per KW                           | 50              | Per Sale                 | 100         | 90                  | 03/01/2023                    | Regional 1    | Per Sale                          | 100                   | 50      | 30              | Per KW                   | 90          | 70                  | 05/01/2024                    | Regional 2    | Per Sale                          | 200                   |

  @Regression @003_Management_Overrides
  Scenario Outline: <TestCase> Management: MODIFY REPS EMPLOYMENT PACKAGE TO TEST EFFECTIVE DATES AND VALUES FOR <Position>
    When Login: browser is open
    Then Login: Validate user is on login page
    Then Login: user enters valid username and password
    Then Login: Click Submit Button
    Then Login: Validate user is navigated to homepage
    Then Login: Subscription popup - Click on Later button
    Then Dashboard: Switch to Standard
    Then Management: Management Menu: Click
    Then Management: Management Menu: Search "<Position>" Position and Click to open details
    Then Management: Employment Package Tab: Click
    Then Management: Employment Package Tab: Overrides SubSection - Click on Edit button
    Then Management: Employment Package Tab: Overrides SubSection - Update Override Effective Date to "<OverrideEffectiveDate1>"
    Then Management: Employment Package Tab: Overrides SubSection - Direct Override - Select "<CalculatedDropdownValue1>" from Calculated Dropdown
    Then Management: Employment Package Tab: Overrides SubSection - Direct Override - Update Amount from "<SettingsAmount1>" to "<Amount_Updated1>"
    Then Management: Employment Package Tab: Overrides SubSection - Validate "Indirect Overrides" is hidden
    Then Management: Employment Package Tab: Overrides SubSection - Validate "Office Overrides" is hidden
    Then Management: Employment Package Tab: Overrides SubSection - Update Stack Split from "<StackSplit1>" to "<StackSplit_Updated1>"
    Then Management: Employment Package Tab: Overrides SubSection - Click on Save button
    Then Management: Employment Package Tab: Overrides SubSection - Click on View Manual Overrides
    Then Management: Employment Package Tab: Overrides SubSection - Manual Override - Click on Add New Button
    Then Management: Employment Package Tab: Overrides SubSection - Manual Override - Update Effective Date to "<ManualOverridesEffectiveDate1>"
    Then Management: Employment Package Tab: Overrides SubSection - Manual Override - Update Override from to "<OverrideFrom1>"
    Then Management: Employment Package Tab: Overrides SubSection - Manual Override - Select "<ManualOverrideCalculatedDropdown1>" from Calculated Dropdown
    Then Management: Employment Package Tab: Overrides SubSection - Manual Override - Update Amount to "<ManualOverrideAmount1>"
    Then Management: Employment Package Tab: Overrides SubSection - Manual Override - Click on Add Override button
    Then Management: Employment Package Tab: Click
    Then Management: Employment Package Tab: Overrides SubSection - Click on Edit button
    Then Management: Employment Package Tab: Overrides SubSection - Update Override Effective Date to "<OverrideEffectiveDate2>"
    Then Management: Employment Package Tab: Overrides SubSection - Direct Override - Select "<CalculatedDropdownValue2>" from Calculated Dropdown
    Then Management: Employment Package Tab: Overrides SubSection - Direct Override - Update Amount from "<Amount2>" to "<Amount_Updated2>"
    Then Management: Employment Package Tab: Overrides SubSection - Validate "Indirect Overrides" is hidden
    Then Management: Employment Package Tab: Overrides SubSection - Validate "Office Overrides" is hidden
    Then Management: Employment Package Tab: Overrides SubSection - Update Stack Split from "<StackSplit2>" to "<StackSplit_Updated2>"
    Then Management: Employment Package Tab: Overrides SubSection - Click on Save button
    Then Management: Employment Package Tab: Overrides SubSection - Click on View Manual Overrides
    Then Management: Employment Package Tab: Overrides SubSection - Manual Override - Click on Add New Button
    Then Management: Employment Package Tab: Overrides SubSection - Manual Override - Update Effective Date to "<ManualOverridesEffectiveDate2>"
    Then Management: Employment Package Tab: Overrides SubSection - Manual Override - Update Override from to "<OverrideFrom2>"
    Then Management: Employment Package Tab: Overrides SubSection - Manual Override - Select "<ManualOverrideCalculatedDropdown2>" from Calculated Dropdown
    Then Management: Employment Package Tab: Overrides SubSection - Manual Override - Update Amount to "<ManualOverrideAmount2>"
    Then Management: Employment Package Tab: Overrides SubSection - Manual Override - Click on Add Override button

    Examples:
      | TestCase | Position   | OverrideEffectiveDate1 | OverrideEffectiveDate2 | Amount1 | Amount_Updated1 | CalculatedDropdownValue1 | StackSplit1 | StackSplit_Updated1 | ManualOverridesEffectiveDate1 | OverrideFrom1      | ManualOverrideCalculatedDropdown1 | ManualOverrideAmount1 | Amount2 | Amount_Updated2 | CalculatedDropdownValue2 | StackSplit2 | StackSplit_Updated2 | ManualOverridesEffectiveDate2 | OverrideFrom2      | ManualOverrideCalculatedDropdown2 | ManualOverrideAmount2 |
      | TC2      | Regional 2 | 03/01/2023             | 07/01/2024             | 50      | 25              | Per KW                   | 60          | 50                  | 03/01/2023                    | Georgia Closer 1   | Per KW                            | 20                    | 25      | 100             | Per Sale                 | 50          | 70                  | 05/01/2024                    | Georgia Closer 2   | Per Sale                          | 200                   |
      | TC3      | Regional 3 | 03/01/2023             | 07/01/2024             | 50      | 0               | Per Sale                 | 40          | 50                  | 03/01/2023                    | Tennessee Closer 1 | %                                 | 10                    | 0       | 30              | Per KW                   | 50          | 70                  | 05/01/2024                    | Tennessee Closer 2 | Per KW                            | 20                    |
