Feature: Feature to Test Settings Hiring functionality

  @Regression @009_Hiring
  Scenario Outline: Hiring
    When Login: Wait
    When Login: browser is open
    Then Login: Validate user is on login page
    Then Login: user enters valid username and password
    Then Login: Click Submit Button
    Then Login: Validate user is navigated to homepage
    Then Login: Subscription popup - Click on Later button
    Then Dashboard: Switch to Standard
    Then Hiring: Hiring Menu: Click
    Then Hiring: Onboarding: Click on Onboarding Employees Tab
    Then Hiring: Onboarding: Click on Hire New Button
    Then Hiring: Onboarding: Hire New: Details: Enter "<FirstName>" as First Name
    Then Hiring: Onboarding: Hire New: Details: Enter "<LastName>" as Last Name
    Then Hiring: Onboarding: Hire New: Details: Enter "<Email>" as Email
    Then Hiring: Onboarding: Hire New: Details: Enter "<Phone>" as Phone
    Then Hiring: Onboarding: Hire New: Details: Select "<OfficeState>" from Office Location State dropdown
    Then Hiring: Onboarding: Hire New: Details: Select "<Office>" from Office Location Office dropdown
    Then Hiring: Onboarding: Hire New: Details: Click on Save and Continue Button
    Then Hiring: Onboarding: Hire New: Organization: Select "<Department>" from Department Dropdown
    Then Hiring: Onboarding: Hire New: Organization: Select "<Position>" from Position Dropdown
    Then Hiring: Onboarding: Hire New: Organization: Select "<IsManager>" from IsManager Checkbox
    Then Hiring: Onboarding: Hire New: Organization: Select "<MayActAsBothSetterAndCloser>" from May act as both setter and closer Checkbox
    Then Hiring: Onboarding: Hire New: Organization: Select "<Manager>" from Manager Dropdown
    Then Hiring: Onboarding: Hire New: Organization: Select "<Team>" from Team Dropdown
    Then Hiring: Onboarding: Hire New: Organization: Enter "<Recruiter>" in Recruiter Textbox
    Then Hiring: Onboarding: Hire New: Organization: Click on Save and Continue Button
    Then Hiring: Onboarding: Hire New: Compensation: Enter "<CloserCommission>" in Closer Commission Textbox
    Then Hiring: Onboarding: Hire New: Compensation: Select "<CloserRedlineType>" from Closer Redline Type Dropdown
    Then Hiring: Onboarding: Hire New: Compensation: Enter "<CloserRedline>" in Closer Redline Amount Textbox
    Then Hiring: Onboarding: Hire New: Compensation: Select "<CloserRedlinePerType>" from Closer Redline Per Type Dropdown
    Then Hiring: Onboarding: Hire New: Compensation: Enter "<CloserUpfrontPay>" in Closer Upfront Pay Textbox
    Then Hiring: Onboarding: Hire New: Compensation: Select "<CloserUpfrontPayPerType>" from Closer Upfront Pay Type Dropdown
    Then Hiring: Onboarding: Hire New: Compensation: Enter "<CloserWithheldAmount>" in Closer Withheld Amount Textbox
    Then Hiring: Onboarding: Hire New: Compensation: Select "<CloserWithheldAmountPerType>" from Closer Withheld Amount Type Dropdown
    Then Hiring: Onboarding: Hire New: Compensation: Enter "<SetterCommission>" in Setter Commission Textbox
    Then Hiring: Onboarding: Hire New: Compensation: Select "<SetterRedlineType>" from Setter Redline Type Dropdown
    Then Hiring: Onboarding: Hire New: Compensation: Enter "<SetterRedline>" in Setter Redline Textbox
    Then Hiring: Onboarding: Hire New: Compensation: Select "<SetterRedlinePerType>" from Setter Redline Per Type Dropdown
    Then Hiring: Onboarding: Hire New: Compensation: Enter "<SetterUpfrontPay>" in Setter Upfront Pay Textbox
    Then Hiring: Onboarding: Hire New: Compensation: Select "<SetterUpfrontPayPerType>" from Setter Upfront Pay Type Dropdown
    Then Hiring: Onboarding: Hire New: Compensation: Select "<SetterWithheldType>" from Setter Withheld Type Dropdown
    Then Hiring: Onboarding: Hire New: Compensation: Enter "<SetterWithheldAmount>" in Setter Withheld Amount Textbox
    Then Hiring: Onboarding: Hire New: Compensation: Enter "<SelfGenCommissionType>" in Self Gen Commission Type Dropdown
    Then Hiring: Onboarding: Hire New: Compensation: Enter "<SelfGenCommission>" in Self Gen Commission Textbox
    Then Hiring: Onboarding: Hire New: Compensation: Click on Save and Continue Button
    Then Hiring: Onboarding: Hire New: Overrides: Select "<DirectOverridesType>" from Direct Overrides Type Dropdown
    Then Hiring: Onboarding: Hire New: Overrides: Enter "<DirectOverrides>" in Direct Overrides Textbox
    Then Hiring: Onboarding: Hire New: Overrides: Select "<IndirectOverridesType>" from Indirect Overrides Type Dropdown
    Then Hiring: Onboarding: Hire New: Overrides: Enter "<IndirectOverrides>" in Indirect Overrides Textbox
    Then Hiring: Onboarding: Hire New: Overrides: Select "<OfficeOverridesType>" from Office Overrides Type Dropdown
    Then Hiring: Onboarding: Hire New: Overrides: Enter "<OfficeOverrides>" in Office Overrides Textbox
    Then Hiring: Onboarding: Hire New: Overrides: Click on Save and Continue Button
    Then Hiring: Onboarding: Hire New: Agreement: Select "<ProbationPeriod>" from Probation Period Dropdown
    Then Hiring: Onboarding: Hire New: Agreement: Select "<OfferIncludesBonus>" from Offer includes bonus Checkbox
    Then Hiring: Onboarding: Hire New: Agreement: Enter "<DateToBePaid>" in Date To Be Paid Textbox
    Then Hiring: Onboarding: Hire New: Agreement: Enter "<ResignBonus>" in Resign Bonus Textbox
    Then Hiring: Onboarding: Hire New: Agreement: Enter "<PeriodOfAgreementStartDate>" in Period of Agreement Start Date Textbox
    Then Hiring: Onboarding: Hire New: Agreement: Enter "<PeriodOfAgreementEndDate>" in Period of Agreement End Date Textbox
    Then Hiring: Onboarding: Hire New: Agreement: Enter "<OfferExpiryDate>" in Offer Expiry Date Textbox
    Then Hiring: Onboarding: Hire New: Agreement: Click on Save and Continue Button
    Then Hiring: Onboarding: Hire New: Finish: Select "<Acknowledge>" from Acknowledge Checkbox
    Then Hiring: Onboarding: Hire New: Agreement: Enter "<Name>" in Name Textbox
    Then Hiring: Onboarding: Hire New: Agreement: Click on Hire Directly

    Examples:
      | FirstName  | LastName | Email               | Phone          | OfficeState | Office     | Department   | Position       | IsManager | MayActAsBothSetterAndCloser | Manager               | Team | Recruiter           | CloserCommission | CloserRedlineType | CloserRedline | CloserRedlinePerType | CloserUpfrontPay | CloserUpfrontPayPerType | CloserWithheldAmount | CloserWithheldAmountPerType | SetterCommission | SetterRedlineType       | SetterRedline | SetterRedlinePerType | SetterUpfrontPay | SetterUpfrontPayPerType | SetterWithheldType | SetterWithheldAmount | SelfGenCommission | SelfGenCommissionType | DirectOverrides | DirectOverridesType | IndirectOverrides | IndirectOverridesType | OfficeOverrides | OfficeOverridesType | ProbationPeriod | OfferIncludesBonus | DateToBePaid | ResignBonus | PeriodOfAgreementStartDate | PeriodOfAgreementEndDate | OfferExpiryDate | Acknowledge | Name     |
      | California | Setter 1 | ca.setter@gmail.com | (999) 123-4569 | California  | Cal Office | Testing Team | Testing Setter |           |                             | California  Manager 1 |      | California Closer 1 |                  |                   |               |                      |                  |                         |                      |                             | 60               | Shift based on Location | 2.75          |                      | 300              | Per Sale                |                    |                      |                   |                       | 20              | Per KW              | 0                 | Per KW                |                 |                     | None            |                    |              |             | 01/01/2024                 |                          | 12/31/2025      | Checked     | Test Sig |
