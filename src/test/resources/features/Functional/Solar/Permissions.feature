Feature: Feature to Test Permissions Add Group functionality

  @Solar @Solar_Permissions_AddGroup
  Scenario Outline: Permissions: <TestCase> Add Group Name <GroupName>
    When Login: browser is open
    Then Login: Validate user is on login page
    Then Login: user enters valid username and password
    Then Login: Click Submit Button
    Then Login: Validate user is navigated to homepage
    Then Login: Subscription popup - Click on Later button
    Then Permissions: Permissions Menu: Click
    Then Permissions: Click New Group Button
    Then Permissions: Add Group: Enter "<GroupName>" in Group Name Textbox
    Then Permissions: Add Group: Expand "<HeadOption1>" - Expand "<ParentOption1>": "<ChildOption1>" - Check "<Check1>" Options
    Then Permissions: Add Group: Expand "<HeadOption1>" - Expand "<ParentOption2>": "<ChildOption2>" - Check "<Check2>" Options
    Then Permissions: Add Group: Expand "<HeadOption1>" - Expand "<ParentOption3>": "<ChildOption3>" - Check "<Check3>" Options
    Then Permissions: Add Group: Expand "<HeadOption1>" - Expand "<ParentOption4>": "<ChildOption4>" - Check "<Check4>" Options
    Then Permissions: Add Group: Expand "<HeadOption1>" - Expand "<ParentOption5>": "<ChildOption5>" - Check "<Check5>" Options
#    Then Permissions: Add Group: Expand "<HeadOption1>" - Expand "<ParentOption6>": "<ChildOption6>" - Check "<Check6>" Options
#    Then Permissions: Add Group: Expand "<HeadOption1>" - Expand "<ParentOption7>": "<ChildOption7>" - Check "<Check7>" Options
#    Then Permissions: Add Group: Expand "<HeadOption1>" - Expand "<ParentOption8>": "<ChildOption8>" - Check "<Check8>" Options
#    Then Permissions: Add Group: Expand "<HeadOption1>" - Expand "<ParentOption9>": "<ChildOption9>" - Check "<Check9>" Options
#    Then Permissions: Add Group: Expand "<HeadOption1>" - Expand "<ParentOption10>": "<ChildOption10>" - Check "<Check10>" Options
#    Then Permissions: Add Group: Expand "<HeadOption1>" - Expand "<ParentOption11>": "<ChildOption11>" - Check "<Check11>" Options
#    Then Permissions: Add Group: Expand "<HeadOption1>" - Expand "<ParentOption12>": "<ChildOption12>" - Check "<Check12>" Options
#    Then Permissions: Add Group: Expand "<HeadOption1>" - Expand "<ParentOption13>": "<ChildOption13>" - Check "<Check13>" Options
#    Then Permissions: Add Group: Expand "<HeadOption1>" - Expand "<ParentOption14>": "<ChildOption14>" - Check "<Check14>" Options
#    Then Permissions: Add Group: Expand "<HeadOption1>" - Expand "<ParentOption15>": "<ChildOption15>" - Check "<Check15>" Options
#    Then Permissions: Add Group: Expand "<HeadOption1>" - Expand "<ParentOption16>": "<ChildOption16>" - Check "<Check16>" Options
#    Then Permissions: Add Group: Expand "<HeadOption1>" - Expand "<ParentOption17>": "<ChildOption17>" - Check "<Check17>" Options
#    Then Permissions: Add Group: Expand "<HeadOption1>" - Expand "<ParentOption18>": "<ChildOption18>" - Check "<Check18>" Options
#    Then Permissions: Add Group: Expand "<HeadOption1>" - Expand "<ParentOption19>": "<ChildOption19>" - Check "<Check19>" Options
#    Then Permissions: Add Group: Expand "<HeadOption1>" - Expand "<ParentOption20>": "<ChildOption20>" - Check "<Check20>" Options
#    Then Permissions: Add Group: Expand "<HeadOption1>" - Expand "<ParentOption21>": "<ChildOption21>" - Check "<Check21>" Options
#    Then Permissions: Add Group: Expand "<HeadOption1>" - Expand "<ParentOption22>": "<ChildOption22>" - Check "<Check22>" Options
#    Then Permissions: Add Group: Expand "<HeadOption1>" - Expand "<ParentOption23>": "<ChildOption23>" - Check "<Check23>" Options
#    Then Permissions: Add Group: Expand "<HeadOption1>" - Expand "<ParentOption24>": "<ChildOption24>" - Check "<Check24>" Options
#    Then Permissions: Add Group: Expand "<HeadOption1>" - Expand "<ParentOption25>": "<ChildOption25>" - Check "<Check25>" Options
#    Then Permissions: Add Group: Expand "<HeadOption1>" - Expand "<ParentOption26>": "<ChildOption26>" - Check "<Check26>" Options
#    Then Permissions: Add Group: Expand "<HeadOption1>" - Expand "<ParentOption27>": "<ChildOption27>" - Check "<Check27>" Options
#    Then Permissions: Add Group: Expand "<HeadOption1>" - Expand "<ParentOption28>": "<ChildOption28>" - Check "<Check28>" Options
#    Then Permissions: Add Group: Expand "<HeadOption1>" - Expand "<ParentOption29>": "<ChildOption29>" - Check "<Check29>" Options
#    Then Permissions: Add Group: Expand "<HeadOption2>" - Expand "<ParentOption30>": "<ChildOption30>" - Check "<Check30>" Options
#    Then Permissions: Add Group: Expand "<HeadOption2>" - Expand "<ParentOption31>": "<ChildOption31>" - Check "<Check31>" Options
#    Then Permissions: Add Group: Expand "<HeadOption2>" - Expand "<ParentOption32>": "<ChildOption32>" - Check "<Check32>" Options
#    Then Permissions: Add Group: Expand "<HeadOption2>" - Expand "<ParentOption33>": "<ChildOption33>" - Check "<Check33>" Options
#    Then Permissions: Add Group: Expand "<HeadOption2>" - Expand "<ParentOption34>": "<ChildOption34>" - Check "<Check34>" Options
#    Then Permissions: Add Group: Expand "<HeadOption2>" - Expand "<ParentOption35>": "<ChildOption35>" - Check "<Check35>" Options
#    Then Permissions: Add Group: Expand "<HeadOption2>" - Expand "<ParentOption36>": "<ChildOption36>" - Check "<Check36>" Options
#    Then Permissions: Add Group: Expand "<HeadOption2>" - Expand "<ParentOption37>": "<ChildOption37>" - Check "<Check37>" Options
#    Then Permissions: Add Group: Expand "<HeadOption2>" - Expand "<ParentOption38>": "<ChildOption38>" - Check "<Check38>" Options
#    Then Permissions: Add Group: Expand "<HeadOption2>" - Expand "<ParentOption39>": "<ChildOption39>" - Check "<Check39>" Options
#    Then Permissions: Add Group: Expand "<HeadOption2>" - Expand "<ParentOption40>": "<ChildOption40>" - Check "<Check40>" Options
#    Then Permissions: Add Group: Expand "<HeadOption2>" - Expand "<ParentOption41>": "<ChildOption41>" - Check "<Check41>" Options
#    Then Permissions: Add Group: Expand "<HeadOption2>" - Expand "<ParentOption42>": "<ChildOption42>" - Check "<Check42>" Options
#    Then Permissions: Add Group: Expand "<HeadOption2>" - Expand "<ParentOption43>": "<ChildOption43>" - Check "<Check43>" Options
#    Then Permissions: Add Group: Expand "<HeadOption2>" - Expand "<ParentOption44>": "<ChildOption44>" - Check "<Check44>" Options
#    Then Permissions: Add Group: Expand "<HeadOption2>" - Expand "<ParentOption45>": "<ChildOption45>" - Check "<Check45>" Options
#    Then Permissions: Add Group: Expand "<HeadOption2>" - Expand "<ParentOption46>": "<ChildOption46>" - Check "<Check46>" Options
#    Then Permissions: Add Group: Expand "<HeadOption2>" - Expand "<ParentOption47>": "<ChildOption47>" - Check "<Check47>" Options
#    Then Permissions: Add Group: Expand "<HeadOption2>" - Expand "<ParentOption48>": "<ChildOption48>" - Check "<Check48>" Options
#    Then Permissions: Add Group: Expand "<HeadOption2>" - Expand "<ParentOption49>": "<ChildOption49>" - Check "<Check49>" Options
#    Then Permissions: Add Group: Expand "<HeadOption2>" - Expand "<ParentOption50>": "<ChildOption50>" - Check "<Check50>" Options
#    Then Permissions: Add Group: Expand "<HeadOption2>" - Expand "<ParentOption51>": "<ChildOption51>" - Check "<Check51>" Options
#    Then Permissions: Add Group: Expand "<HeadOption2>" - Expand "<ParentOption52>": "<ChildOption52>" - Check "<Check52>" Options
#    Then Permissions: Add Group: Expand "<HeadOption2>" - Expand "<ParentOption53>": "<ChildOption53>" - Check "<Check53>" Options
#    Then Permissions: Add Group: Expand "<HeadOption3>" - Expand "<ParentOption54>": "<ChildOption54>" - Check "<Check54>" Options
#    Then Permissions: Add Group: Expand "<HeadOption3>" - Expand "<ParentOption55>": "<ChildOption55>" - Check "<Check55>" Options
#    Then Permissions: Add Group: Expand "<HeadOption3>" - Expand "<ParentOption56>": "<ChildOption56>" - Check "<Check56>" Options
#    Then Permissions: Add Group: Expand "<HeadOption3>" - Expand "<ParentOption57>": "<ChildOption57>" - Check "<Check57>" Options
#    Then Permissions: Add Group: Expand "<HeadOption3>" - Expand "<ParentOption58>": "<ChildOption58>" - Check "<Check58>" Options
#    Then Permissions: Add Group: Expand "<HeadOption3>" - Expand "<ParentOption59>": "<ChildOption59>" - Check "<Check59>" Options
    Then Permissions: Add Group: Click Save Button
    Examples:
      | TestCase | HeadOption1            | HeadOption2       | HeadOption3      | GroupName             | ParentOption1 | ChildOption1 | Check1               | ParentOption2 | ChildOption2 | Check2 | ParentOption3 | ChildOption3 | Check3 | ParentOption4 | ChildOption4 | Check4 | ParentOption5 | ChildOption5 | Check5 | ParentOption6 | ChildOption6 | Check6 | ParentOption7 | ChildOption7 | Check7 | ParentOption8 | ChildOption8 | Check8 | ParentOption9 | ChildOption9 | Check9 | ParentOption10 | ChildOption10 | Check10 | ParentOption11 | ChildOption11 | Check11 | ParentOption12 | ChildOption12 | Check12 | ParentOption13 | ChildOption13 | Check13 | ParentOption14 | ChildOption14 | Check14 | ParentOption15 | ChildOption15 | Check15 | ParentOption16 | ChildOption16 | Check16 | ParentOption17 | ChildOption17 | Check17              | ParentOption18 | ChildOption18 | Check18 | ParentOption19 | ChildOption19 | Check19              | ParentOption20 | ChildOption20 | Check20              | ParentOption21 | ChildOption21  | Check21              | ParentOption22 | ChildOption22 | Check22              | ParentOption23 | ChildOption23   | Check23              | ParentOption24 | ChildOption24 | Check24 | ParentOption25 | ChildOption25 | Check25 | ParentOption26 | ChildOption26 | Check26 | ParentOption27 | ChildOption27 | Check27 | ParentOption28 | ChildOption28 | Check28              | ParentOption29 | ChildOption29 | Check29 | ParentOption30 | ChildOption30 | Check30              | ParentOption31 | ChildOption31 | Check31              | ParentOption32 | ChildOption32 | Check32              | ParentOption33 | ChildOption33 | Check33              | ParentOption34 | ChildOption34   | Check34              | ParentOption35 | ChildOption35 | Check35              | ParentOption36 | ChildOption36 | Check36 | ParentOption37 | ChildOption37        | Check37                                     | ParentOption38 | ChildOption38 | Check38              | ParentOption39 | ChildOption39 | Check39              | ParentOption40 | ChildOption40 | Check40              | ParentOption41 | ChildOption41 | Check41 | ParentOption42 | ChildOption42 | Check42 | ParentOption43 | ChildOption43 | Check43 | ParentOption44 | ChildOption44 | Check44 | ParentOption45 | ChildOption45  | Check45 | ParentOption46 | ChildOption46 | Check46 | ParentOption47 | ChildOption47 | Check47 | ParentOption48       | ChildOption48 | Check48              | ParentOption49       | ChildOption49 | Check49              | ParentOption50 | ChildOption50 | Check50              | ParentOption51 | ChildOption51 | Check51              | ParentOption52 | ChildOption52 | Check52              | ParentOption53 | ChildOption53 | Check53 | ParentOption54 | ChildOption54 | Check54              | ParentOption55 | ChildOption55      | Check55 | ParentOption56 | ChildOption56 | Check56              | ParentOption57 | ChildOption57 | Check57              | ParentOption58 | ChildOption58 | Check58              | ParentOption59 | ChildOption59 | Check59 |
      | TC1      | Administrator Policies | Standard Policies | Profile Policies | Test Regional Manager | Dashboard     | Dashboard    | View,Add,Edit,Delete |               |              |        |               |              |        |               |              |        |               |              |        |               |              |        |               |              |        |               |              |        |               |              |        |                |               |         |                |               |         |                |               |         |                |               |         |                |               |         |                |               |         |                |               |         | Reports        | Company       | View,Add,Edit,Delete | Reports        | Sales         | View    | Reports        | Cost          | View,Add,Edit,Delete | Reports        | Payroll       | View,Add,Edit,Delete | Reports        | Reconciliation | View,Add,Edit,Delete | Reports        | Clawback      | View,Add,Edit,Delete | Reports        | Pending Install | View,Add,Edit,Delete |                |               |         |                |               |         |                |               |         |                |               |         | Alerts Center  | Alerts        | View,Add,Edit,Delete |                |               |         | Dashboard      | Dashboard     | View,Add,Edit,Delete | My Sales       | My Sales      | View,Add,Edit,Delete | My Sales       | My Overrides  | View,Add,Edit,Delete | My Sales       | Pay Stubs     | View,Add,Edit,Delete | Hiring         | Hiring Progress | View,Add,Edit,Delete | Hiring         | Leads         | View,Add,Edit,Delete |                |               |         | Hiring         | Onboarding Employees | View,Add,Edit,Delete,Hire Now,Hire Directly | Calendar       | Calendar      | View,Add,Edit,Delete | Management     | Employee      | View,Add,Edit,Delete | Management     | Team          | View,Add,Edit,Delete |                |               |         |                |               |         | Reports        | Office        | View    | Reports        | Sales         | View    | Reports        | Past Pay Stubs | View    |                |               |         |                |               |         | Requests & Approvals | Request       | View,Add,Edit,Delete | Requests & Approvals | Approvals     | View,Add,Edit,Delete | Support        | Support       | View,Add,Edit,Delete | SequiDocs      | Templates     | View,Add,Edit,Delete | SequiDocs      | Documents     | View,Add,Edit,Delete |                |               |         | Profile        | Personal Info | View,Add,Edit,Delete | Profile        | Employment Package | View    | Profile        | Tax Info      | View,Add,Edit,Delete | Profile        | Banking       | View,Add,Edit,Delete | Profile        | Documents     | View,Add,Edit,Delete | Profile        | Network       | View    |
