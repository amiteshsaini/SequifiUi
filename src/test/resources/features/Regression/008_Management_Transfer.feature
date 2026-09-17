Feature: Feature to Test Management Transfer functionality

#  @Regression @008_Management_Transfer
  Scenario Outline: Management: <TestCase>: Test Transfer functionality for <Position>
    When Login: browser is open
    Then Login: Validate user is on login page
    Then Login: user enters valid username and password
    Then Login: Click Submit Button
    Then Login: Validate user is navigated to homepage
    Then Login: Subscription popup - Click on Later button
    Then Dashboard: Switch to Standard
    When Management: Management Menu: Click
    Then Management: Management Menu: Search "<Position>" Position and Click to open details
    Then Management: Transfer: Click on Transfer Button
    Then Management: Transfer: Click Yes on Transfer Confirmation Popup
    Then Management: Transfer: Update Transfer Effective Date to "<TransferEffectiveDate>"
    Then Management: Transfer: Select "<OfficeState>" from Office State Dropdown
    Then Management: Transfer: Select "<OfficeName>" from Office Name Dropdown
#    Then Management: Transfer: IsManager checkbox is "<IsManagerCheckbox>"
#    Then Management: Transfer: MayActAsBothSetterAndCloser checkbox is "<MayActAsBothSetterAndCloserCheckbox>"
    Then Management: Transfer: Select "<SelectNewManager>" from SelectNewManager Dropdown
    Then Management: Transfer: Select "<CloserRedlineChange>" from CloserRedlineChange Dropdown
    Then Management: Transfer: Enter "<CloserRedlineChangeValue>" in CloserRedlineChangeValue TextBox
    Then Management: Transfer: Select "<CloserRedlineChangeType>" from CloserRedlineChangeType Dropdown
    Then Management: Transfer: Select "<SetterRedlineChange>" from SetterRedlineChange Dropdown
    Then Management: Transfer: Enter "<SetterRedlineChangeValue>" in SetterRedlineChangeValue TextBox
    Then Management: Transfer: Select "<SetterRedlineChangeType>" from SetterRedlineChangeType Dropdown
#    Then Management: Transfer: Select "<MapToManager>" from MapToManager Dropdown
    Then Management: Transfer: Click on Transfer Button to Save
    Examples:
      | TestCase | Position           | TransferEffectiveDate | OfficeState | OfficeName          | IsManagerCheckbox | MayActAsBothSetterAndCloserCheckbox | SelectNewManager   | CloserRedlineChange     | CloserRedlineChangeValue | CloserRedlineChangeType | SetterRedlineChange     | SetterRedlineChangeValue | SetterRedlineChangeType | MapToManager          |
      | TC1      | Regional 1         | 06/01/2024            | Georgia     | Georgia Test        | Checked           | Unchecked                           | CSO Test           |                         |                          |                         |                         |                          |                         | Regional  3           |
      | TC2      | Georgia Manager 2  | 06/01/2024            | Tennessee   | Tennessee Test      | Checked           | Checked                             | Regional  3        | Shift based on Location | 2.7                      | Per Watt                | Shift based on Location | 3.15                     | Per Watt                | Georgia  Manager 1    |
      | TC3      | Georgia Closer 2   | 06/01/2024            | Tennessee   | Tennessee Test      | Unchecked         | Unchecked                           | Tennessee  Manager | Shift based on Location | 2.92                     | Per Watt                |                         |                          |                         | Should not be visible |
      | TC4      | Georgia Setter 2   | 06/01/2024            | Tennessee   | Tennessee Test      | Unchecked         | Unchecked                           | Tennessee  Manager | Should not be visible   | Should not be visible    | Should not be visible   | Fixed                   | 3.05                     | Per Watt                | Should not be visible |
      | TC5      | Tennessee Manager  | 06/01/2024            | Kentucky    | Kentucky Blitz Test | Checked           | Checked                             | CSO  Test          | Shift based on Location | 2.90                     | Per Watt                | Fixed                   | 3.10                     | Per Watt                | Regional  3           |
      | TC6      | Tennessee Closer 2 | 06/01/2024            | Kentucky    | Kentucky Blitz Test | Unchecked         | Unchecked                           | CSO  Test          | Shift based on Location | 2.75                     | Per Watt                | Should not be visible   | Should not be visible    | Should not be visible   | Should not be visible |
      | TC7      | Tennessee Setter 2 | 06/01/2024            | Kentucky    | Kentucky Blitz Test | Unchecked         | Unchecked                           | CSO  Test          | Should not be visible   | Should not be visible    | Should not be visible   | Shift based on Location | 3.15                     | Per Watt                | Should not be visible |
