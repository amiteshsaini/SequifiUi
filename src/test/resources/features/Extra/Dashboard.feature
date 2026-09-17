Feature: Feature to Test Dashboard functionality

  Background:
    When Login: browser is open
    Then Login: Validate user is on login page
    Then Login: user enters valid username and password
    Then Login: Click Submit Button
    Then Login: Validate user is navigated to homepage

  @C_186
  Scenario: C_186 Validate Admin Dashboards is working as Expected
    When Dashboard: user click on Payroll Reports
    Then Dashboard: Validate user is navigated to payroll under reports
    Then Dashboard: Click back button
    When Dashboard: User click on Send Alerts
    Then Dashboard: Validate user is navigated to Alert Center
    Then Dashboard: Click back button
    When Dashboard: User click on Finalize Payroll
    Then Dashboard: Validate user is navigated to Run Payroll under Payroll
    Then Dashboard: Click back button
    When Dashboard: User click on Reconciliations
    Then Dashboard: Validate user is navigated to Reconciliation under Payroll

  @C_187
  Scenario: C_187 Validate Admin Dashboards- Announcements is working as Expected
    When Dashboard: User click on Manage
    And  Dashboard: Click on Add New Button
    And Dashboard: Fill the required data
    And Dashboard: Click on Save Button
    Then Dashboard: Validate Announcements should be created

  @C_188
  Scenario: C_188 Validate Admin Dashboards- Edit Announcements is working as Expected
    When Dashboard: User click on edit button
    And Dashboard: Change the Announcement Title and Duration
    And Dashboard: Update the Announcement
    Then Dashboard: Validate Announcements should be updated
    When Dashboard: User click on Manage button
    Then Dashboard: Validate Location DropDown
    Then Dashboard: Validate Position DropDown
    Then Dashboard: Validate Status DropDown

  @C_189
  Scenario: C_189 Validate Admin Dashboards- Payroll Summary card is displayed as Expected
    When Dashboard: User is on payroll summary card
    Then Dashboard: Validate TimeLine DropDown of PS

  @C_190
  Scenario: C_190 Validate Admin Dashboards- Office Sales performance card is displayed as Expected
    When Dashboard: User is on office sales performance card
    Then Dashboard: Validate TimeLine DropDown of OSP
    And  Dashboard: Validate Office DropDown

  @C_191
  Scenario: C_191 Validate Admin Dashboards- Change Office Sales performance card DropDown is working as Expected
    When Dashboard: User is on office sales performance card
#   And User Change the Office location to California Office
#   And User Change the Timeline to This Month
