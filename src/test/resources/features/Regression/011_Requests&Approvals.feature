Feature: Feature to Test Requests & Approvals - Requests functionality

  @Regression @011_RequestsAndApprovals
  Scenario Outline: Requests&Approvals: <TestCase>: Requests functionality for Requester <RequesterUserName> and Approver <ApproverUserName>
    When Login: browser is open
    Then Login: Validate user is on login page
    Then Login: user enters username "<RequesterUserName>" and password "<RequesterPassword>"
    Then Login: Click Submit Button
    Then Login: Validate user is navigated to homepage
    Then Login: Subscription popup - Click on Later button
    When Requests&Approvals: Requests & Approvals Menu: Click
    Then Requests&Approvals: Requests & Approvals: Request Tab: Click on Request Button for "<Type1>"
    Then Requests&Approvals: Requests & Approvals: Request Tab: Type - "<Type1>" - Select Type of Request Dropdown
    Then Requests&Approvals: Requests & Approvals: Request Tab: Type - "<Type1>" - Select "<Date1>" for Date
#    Then Requests&Approvals: Requests & Approvals: Request Tab: Type - "<Type1>" - Select "<Pid1>" for PID
#    Then Requests&Approvals: Requests & Approvals: Request Tab: Type - "<Type1>" - Select "<PayPeriod1>" for PayPeriod
    Then Requests&Approvals: Requests & Approvals: Request Tab: Type - "<Type1>" - Enter "<Amount1>" for Amount text box
#    Then Requests&Approvals: Requests & Approvals: Request Tab: Type - "<Type1>" - Select "<DisputeType1>" for Dispute Type
    Then Requests&Approvals: Requests & Approvals: Request Tab: Type - "<Type1>" - Select "<CostHead1>" from Cost Head Dropdown
    Then Requests&Approvals: Requests & Approvals: Request Tab: Type - "<Type1>" - Enter "<Description1>" in Description text box
    Then Requests&Approvals: Requests & Approvals: Request Tab: Type - "<Type1>" - Click Submit Button
    Then Requests&Approvals: Requests & Approvals: Click Request Id link for "<Type1>" to enter "<Reply1>"
    Then Requests&Approvals: Requests & Approvals: Request: Click Add Reply button for "<Type1>" to enter "<Reply1>"
    Then Requests&Approvals: Requests & Approvals: Request: Enter "<Reply1>" in Reply textbox for "<Type1>"
    Then Requests&Approvals: Requests & Approvals: Request: Click Post Reply button for "<Type1>" to enter "<Reply1>"
    Then Requests&Approvals: Requests & Approvals: Request: Validate "<Reply1>" is displayed in comments section for "<Type1>"
    When Requests&Approvals: Requests & Approvals Menu: Click
    Then Requests&Approvals: Requests & Approvals: Request Tab: Click on Request Button for "<Type2>"
    Then Requests&Approvals: Requests & Approvals: Request Tab: Type - "<Type2>" - Select Type of Request Dropdown
    Then Requests&Approvals: Requests & Approvals: Request Tab: Type - "<Type2>" - Select "<Date2>" for Date
    Then Requests&Approvals: Requests & Approvals: Request Tab: Type - "<Type2>" - Enter "<Amount2>" for Amount text box
    Then Requests&Approvals: Requests & Approvals: Request Tab: Type - "<Type2>" - Enter "<Description2>" in Description text box
    Then Requests&Approvals: Requests & Approvals: Request Tab: Type - "<Type2>" - Click Submit Button
    When Requests&Approvals: Requests & Approvals Menu: Click
    Then Requests&Approvals: Requests & Approvals: Request Tab: Click on Request Button for "<Type3>"
    Then Requests&Approvals: Requests & Approvals: Request Tab: Type - "<Type3>" - Select Type of Request Dropdown
    Then Requests&Approvals: Requests & Approvals: Request Tab: Type - "<Type3>" - Select "<Date3>" for Date
    Then Requests&Approvals: Requests & Approvals: Request Tab: Type - "<Type3>" - Enter "<Amount3>" for Amount text box
    Then Requests&Approvals: Requests & Approvals: Request Tab: Type - "<Type3>" - Enter "<Description3>" in Description text box
    Then Requests&Approvals: Requests & Approvals: Request Tab: Type - "<Type3>" - Click Submit Button
    When Requests&Approvals: Requests & Approvals Menu: Click
    Then Requests&Approvals: Requests & Approvals: Request Tab: Click on Request Button for "<Type4>"
    Then Requests&Approvals: Requests & Approvals: Request Tab: Type - "<Type4>" - Select Type of Request Dropdown
    Then Requests&Approvals: Requests & Approvals: Request Tab: Type - "<Type4>" - Select "<Date4>" for Date
    Then Requests&Approvals: Requests & Approvals: Request Tab: Type - "<Type4>" - Enter "<Amount4>" for Amount text box
    Then Requests&Approvals: Requests & Approvals: Request Tab: Type - "<Type4>" - Enter "<Description4>" in Description text box
    Then Requests&Approvals: Requests & Approvals: Request Tab: Type - "<Type4>" - Click Submit Button
    Then Requests&Approvals: Requests & Approvals: Request: Validate "<Type1>" Request is displayed in My Requests section with Status as "<InitialStatus1>" and "<Amount1>"
    Then Requests&Approvals: Requests & Approvals: Request: Validate "<Type2>" Request is displayed in My Requests section with Status as "<InitialStatus2>" and "<Amount2>"
    Then Requests&Approvals: Requests & Approvals: Request: Validate "<Type3>" Request is displayed in My Requests section with Status as "<InitialStatus3>" and "<Amount3>"
    Then Requests&Approvals: Requests & Approvals: Request: Validate "<Type4>" Request is displayed in My Requests section with Status as "<InitialStatus4>" and "<Amount4>"
    Then Login: logout from App
    Then Login: user enters username "<ApproverUserName>" and password "<ApproverPassword>"
    Then Login: Click Submit Button
    Then Login: Validate user is navigated to homepage
    Then Login: Subscription popup - Click on Later button
    Then Login: Subscription popup - Click on Later button
    Then Dashboard: Switch to Standard
    When Requests&Approvals: Requests & Approvals Menu: Click
    Then Requests&Approvals: Requests & Approvals: Approvals Tab: Click on Approvals Tab for "<Type1>" Request
    Then Requests&Approvals: Requests & Approvals: Approvals Tab: Click Request id for "<Type1>" and "<Amount1>" Request
    Then Requests&Approvals: Requests & Approvals: Approvals Tab: Click "<FinalStatus1>" for "<Type1>" Request
    Then Requests&Approvals: Requests & Approvals: Approvals Tab: Click Back Link for "<Type1>" Request
    Then Requests&Approvals: Requests & Approvals: Approvals Tab: Click on Approvals Tab for "<Type2>" Request
    Then Requests&Approvals: Requests & Approvals: Approvals Tab: Click Request id for "<Type2>" and "<Amount2>" Request
    Then Requests&Approvals: Requests & Approvals: Approvals Tab: Click "<FinalStatus2>" for "<Type2>" Request
    Then Requests&Approvals: Requests & Approvals: Approvals Tab: Click Back Link for "<Type2>" Request
    Then Requests&Approvals: Requests & Approvals: Approvals Tab: Click on Approvals Tab for "<Type3>" Request
    Then Requests&Approvals: Requests & Approvals: Approvals Tab: Click Request id for "<Type3>" and "<Amount3>" Request
    Then Requests&Approvals: Requests & Approvals: Approvals Tab: Click "<FinalStatus3>" for "<Type3>" Request
    Then Requests&Approvals: Requests & Approvals: Approvals Tab: Click Back Link for "<Type3>" Request
    Then Requests&Approvals: Requests & Approvals: Approvals Tab: Click on Approvals Tab for "<Type4>" Request
    Then Requests&Approvals: Requests & Approvals: Approvals Tab: Click Request id for "<Type4>" and "<Amount4>" Request
    Then Requests&Approvals: Requests & Approvals: Approvals Tab: Click "<FinalStatus4>" for "<Type4>" Request
    Then Requests&Approvals: Requests & Approvals: Approvals Tab: Click Back Link for "<Type4>" Request
    Then Requests&Approvals: Requests & Approvals: Approvals Tab: Click History Button
    Then Requests&Approvals: Requests & Approvals: Approvals History: Validate "<Type1>" Request is displayed in My Requests section with Status as "<FinalStatus1>" and "<Amount1>"
    Then Requests&Approvals: Requests & Approvals: Approvals History: Validate "<Type2>" Request is displayed in My Requests section with Status as "<FinalStatus2>" and "<Amount2>"
    Then Requests&Approvals: Requests & Approvals: Approvals History: Validate "<Type3>" Request is displayed in My Requests section with Status as "<FinalStatus3>" and "<Amount3>"
    Then Requests&Approvals: Requests & Approvals: Approvals History: Validate "<Type4>" Request is displayed in My Requests section with Status as "<FinalStatus4>" and "<Amount4>"
    Then Login: logout from App
    Then Login: user enters username "<RequesterUserName>" and password "<RequesterPassword>"
    Then Login: Click Submit Button
    Then Login: Validate user is navigated to homepage
    Then Login: Subscription popup - Click on Later button
    When Requests&Approvals: Requests & Approvals Menu: Click
    Then Requests&Approvals: Requests & Approvals: Request: Validate "<Type1>" Request is displayed in My Requests section with Status as "<FinalStatus1>" and "<Amount1>"
    Then Requests&Approvals: Requests & Approvals: Request: Validate "<Type2>" Request is displayed in My Requests section with Status as "<FinalStatus2>" and "<Amount2>"
    Then Requests&Approvals: Requests & Approvals: Request: Validate "<Type3>" Request is displayed in My Requests section with Status as "<FinalStatus3>" and "<Amount3>"
    Then Requests&Approvals: Requests & Approvals: Request: Validate "<Type4>" Request is displayed in My Requests section with Status as "<FinalStatus4>" and "<Amount4>"
    Examples:
      | TestCase | RequesterUserName                   | RequesterPassword | ApproverUserName                    | ApproverPassword | Type1           | Amount1 | Date1      | CostHead1 | Description1                                                              | PayPeriod          | DisputeType | PID   | InitialStatus1 | FinalStatus1 | Reply1                      | Type2    | Amount2 | Date2      | Description2                                          | InitialStatus2 | FinalStatus2 | Type3   | Amount3 | Date3      | Description3                                     | InitialStatus3 | FinalStatus3 | Type4     | Amount4 | Date4      | Description4             | InitialStatus4 | FinalStatus4 |
      | TC1      | testing+4@sequifi.com               | Flexpwr!          | testing+georgiamanager1@sequifi.com | Flexpwr!         | Reimbursement   | 101     | 01/25/2023 | - Trains  | Train ticket Cost                                                         |                    |             |       | Pending        | Approved     | I lost train ticket receipt | Bonus    | 201     | 01/01/2024 | I was promised a hiring bonus but did not receive one | Pending        | Approved     | Advance | 126     | 01/01/2024 | Need gas money to get to the office to start job | Pending        | Approved     | Incentive | 151     | 11/01/2023 | Need My hiring incentive | Pending        | Approved     |
      | TC2      | testing+georgiamanager1@sequifi.com | Flexpwr!          | superadmin@sequifi.com              | Flexpwr!         | Fine/fee        | 71      | 01/25/2024 |           | Fine for damaging apartment furniture                                     |                    |             |       | Pending        | Approved     |                             | Fine/fee | 121     | 01/25/2024 |                                                       | Pending        | Declined     |         |         |            |                                                  |                |              |           |         |            |                          |                |              |
      | TC3      | testing+8@sequifi.com               | Flexpwr!          | testing+manager2@sequifi.com        | Flexpwr!         | Reimbursement   | 151     | 12/28/2023 | Rent      | House Rent                                                                |                    |             |       | Pending        | Approved     |                             | Bonus    | 251     | 07/01/2024 | hiring bonus                                          | Pending        | Approved     | Advance | 301     | 01/01/2024 | Need advance                                     | Pending        | Approved     | Incentive | 181     | 11/26/2023 | Need My hiring incentive | Pending        | Approved     |
#      | TC4      | testing+manager2@sequifi.com        | Flexpwr!          | superadmin@sequifi.com              | Flexpwr!         | Payroll Dispute | 65      |            |           | During pre-season i was underpaid for sale with customer Georgia Closer 2 | 1/6/2023-1/12/2023 | Upfront     | TST59 | Pending        | Approved     |                             | Fine/fee | 121     | 01/25/2024 | Fine for damaging                                     | Pending        | Approved     |         | Bonus   | 301        | 01/10/2024                                       | Pending        | Approved     |           |         |            |                          |                |              |
      | TC5      | cso@gfrt.com                        | Flexpwr!          | superadmin@sequifi.com              | Flexpwr!         | Bonus           | 131     | 01/01/2024 |           | hiring bonus                                                              |                    |             |       | Pending        | Approved     |                             | Advance  | 401     | 01/01/2024 | Need advance                                          | Pending        | Approved     |         |         |            |                                                  |                |              |           |         |            |                          |                |              |

