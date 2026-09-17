Feature: Test Reports - Sales functionality

  @Solar @Solar_Reports_Sales
  Scenario Outline: Reports: <TestCase> - Test Sales functionality for <PID> PID
    When Login: browser is open
    Then Login: Validate user is on login page
    Then Login: user enters valid username and password
    Then Login: Click Submit Button
    Then Login: Validate user is navigated to homepage
    Then Login: Subscription popup - Click on Later button
    When Reports: Reports Menu: Click
    Then Reports: Sales Tab: Click
    Then Reports: Sales Tab: Click on Add Sale button
    Then Reports: Sales Tab: Add Sale - Enter "<PID>" in PID Textbox
    Then Reports: Sales Tab: Add Sale - Enter "<ProspectId>" in Prospect Id Textbox
    Then Reports: Sales Tab: Add Sale - Enter "<HomeownerId>" in Homeowner Id Textbox
    Then Reports: Sales Tab: Add Sale - Enter "<ProposalId>" in Proposal Id Textbox
    Then Reports: Sales Tab: Add Sale - Enter "<Product>" in Product Textbox
    Then Reports: Sales Tab: Add Sale - Enter "<GrossValue>" in Gross Value Textbox
    Then Reports: Sales Tab: Add Sale - Enter "<Installer>" in Installer TextBox
    Then Reports: Sales Tab: Add Sale - Enter "<KW>" in KW TextBox
    Then Reports: Sales Tab: Add Sale - Enter "<EPC>" in EPC TextBox
    Then Reports: Sales Tab: Add Sale - Enter "<NetEPC>" in Net EPC TextBox
    Then Reports: Sales Tab: Add Sale - Enter "<DealerFeePercentage>" in Dealer Fee% TextBox
    Then Reports: Sales Tab: Add Sale - Enter "<DealerFeeAmount>" in Dealer Fee$ TextBox
    Then Reports: Sales Tab: Add Sale - Enter "<SOWAmount>" in SOW $ TextBox
    Then Reports: Sales Tab: Add Sale - Enter "<CustomerName>" in Customer Name Textbox
    Then Reports: Sales Tab: Add Sale - Enter "<CustomerAddress>" in Customer Address Textbox
    Then Reports: Sales Tab: Add Sale - Enter "<CustomerAddress2>" in Customer Address2 Textbox
    Then Reports: Sales Tab: Add Sale - Enter "<CustomerCity>" in Customer City Textbox
    Then Reports: Sales Tab: Add Sale - Select State and General Code
    Then Reports: Sales Tab: Add Sale - Enter "<CustomerZip>" in Customer Zip Textbox
    Then Reports: Sales Tab: Add Sale - Enter "<CustomerEmail>" in Customer Email Textbox
    Then Reports: Sales Tab: Add Sale - Enter "<CustomerPhone>" in Customer Phone Textbox
    Then Reports: Sales Tab: Add Sale - Enter "<ApprovalDate>" in Approval Date TextBox
    Then Reports: Sales Tab: Add Sale - Enter "<M1Date>" in M1 Date TextBox
    Then Reports: Sales Tab: Add Sale - Enter "<M2Date>" in M2 Date TextBox
    Then Reports: Sales Tab: Add Sale - Enter "<CancelDate>" in Cancel Date TextBox
    Then Reports: Sales Tab: Add Sale - Enter "<Adders>" in Adders TextBox
    Then Reports: Sales Tab: Add Sale - Select Closer1 Name
    Then Reports: Sales Tab: Add Sale - Select Setter1 Name
    Then Reports: Sales Tab: Add Sale - Click on Save Sale button
    Then Reports: Sales Tab: Sale - Select Custom from Select range Dropdown and enter "<RangeStartDate>" as FromDate and today as ToDate
    Then Reports: Sales Tab: Sale - Enter PID in Customer Info Search TextBox
    Then Reports: Sales Tab: Sale - Sale Summary Click Pid Link
    Then Reports: Sales Tab: Sale Summary - Validate PID text field

    Examples:
      | TestCase | PID   | RangeStartDate | ProspectId | HomeownerId | ProposalId | Product | GrossValue | Installer | KW    | EPC | NetEPC | DealerFeePercentage | DealerFeeAmount | SOWAmount | CustomerName | CustomerAddress | CustomerAddress2 | CustomerCity | CustomerZip | CustomerEmail | CustomerPhone | ApprovalDate | M1Date     | M2Date     | CancelDate | Adders |
      | Test1    | TST01 | 10/10/2024     |            |             |            |         | 50,000     | TST       | 10.00 | 5   | 4      | 35.20               |                 |           | Customer 1   |                 |                  |              |             |               |               | 10/10/2024   | 10/10/2024 | 10/10/2024 |            |        |
