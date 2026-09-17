package PageObjects;

import org.openqa.selenium.By;

public class Permissions_Elements {

    public static By Permissions_Menu = By.xpath("//*[text()='Permissions']");
    public static By Permissions_NewGroup_Button = By.xpath("//*[text()='New Group']");
    public static By Permissions_GroupName_TextBox = By.xpath("//*[@id='Manage_Group_Group_Name_Input']");
    public static By Permissions_AdministratorPoliciesExpandCollapse = By.xpath("//*[@id='manage_Group_Particular_Policy_DropIcon_0']");
    public static By Permissions_StandardPoliciesExpandCollapse = By.xpath("//*[@id='manage_Group_Particular_Policy_DropIcon_1']");
    public static By Permissions_ProfilePoliciesExpandCollapse = By.xpath("//*[@id='manage_Group_Particular_Policy_DropIcon_2']");

    public static By getParentOption(String Policies, String ParentOption) {
        if (Policies.equalsIgnoreCase("Administrator Policies")) {
            switch (ParentOption) {
                case "Dashboard":
                    return By.xpath("//*[@id='manage_Group_Particular_Child_Policy_DropIcon_0']");
                case "Setting":
                    return By.xpath("//*[@id='manage_Group_Particular_Child_Policy_DropIcon_1']");
                case "Integrations":
                    return By.xpath("//*[@id='manage_Group_Particular_Child_Policy_DropIcon_2']");
                case "SequiDocs":
                    return By.xpath("//*[@id='manage_Group_Particular_Child_Policy_DropIcon_3']");
                case "PayRoll":
                    return By.xpath("//*[@id='manage_Group_Particular_Child_Policy_DropIcon_4']");
                case "Reports":
                    return By.xpath("//*[@id='manage_Group_Particular_Child_Policy_DropIcon_5']");
                case "Permissions":
                    return By.xpath("//*[@id='manage_Group_Particular_Child_Policy_DropIcon_6']");
                case "Alerts Center":
                    return By.xpath("//*[@id='manage_Group_Particular_Child_Policy_DropIcon_7']");
                case "Support":
                    return By.xpath("//*[@id='manage_Group_Particular_Child_Policy_DropIcon_8']");
                case "Sequi-CRM":
                    return By.xpath("//*[@id='manage_Group_Particular_Child_Policy_DropIcon_9']");
                case "Automation":
                    return By.xpath("//*[@id='manage_Group_Particular_Child_Policy_DropIcon_10']");
            }
        } else if (Policies.equalsIgnoreCase("Standard Policies")) {
            switch (ParentOption) {
                case "Dashboard":
                    return By.xpath("//*[@id='manage_Group_Particular_Child_Policy_DropIcon_0']");
                case "My Sales":
                    return By.xpath("//*[@id='manage_Group_Particular_Child_Policy_DropIcon_1']");
                case "Hiring":
                    return By.xpath("//*[@id='manage_Group_Particular_Child_Policy_DropIcon_2']");
                case "Calendar":
                    return By.xpath("//*[@id='manage_Group_Particular_Child_Policy_DropIcon_3']");
                case "Management":
                    return By.xpath("//*[@id='manage_Group_Particular_Child_Policy_DropIcon_4']");
                case "Community":
                    return By.xpath("//*[@id='manage_Group_Particular_Child_Policy_DropIcon_5']");
                case "Projections":
                    return By.xpath("//*[@id='manage_Group_Particular_Child_Policy_DropIcon_6']");
                case "Reports":
                    return By.xpath("//*[@id='manage_Group_Particular_Child_Policy_DropIcon_7']");
                case "Training":
                    return By.xpath("//*[@id='manage_Group_Particular_Child_Policy_DropIcon_8']");
                case "Requests & Approvals":
                    return By.xpath("//*[@id='manage_Group_Particular_Child_Policy_DropIcon_9']");
                case "Support":
                    return By.xpath("//*[@id='manage_Group_Particular_Child_Policy_DropIcon_10']");
                case "SequiDocs":
                    return By.xpath("//*[@id='manage_Group_Particular_Child_Policy_DropIcon_11']");
                case "Referrals":
                    return By.xpath("//*[@id='manage_Group_Particular_Child_Policy_DropIcon_12']");
            }
        } else if (Policies.equalsIgnoreCase("Profile Policies")) {
            switch (ParentOption) {
                case "Profile":
                    return By.xpath("//*[@id='manage_Group_Particular_Child_Policy_DropIcon_0']");
            }
        }
        return null;
    }

    public static By getParentProfileOption(String ParentOption) {
        return By.xpath("(((//div[text()='" + ParentOption + "'])[2])/..)/div[2]");
    }

    public static By getChildOptionCheckBox(String Policies, String ParentOption, String ChildOption, String Check) {
        if (Policies.equalsIgnoreCase("Administrator Policies")) {
            if (ParentOption.equalsIgnoreCase("Dashboard") && ChildOption.equalsIgnoreCase("Dashboard")) {
                switch (ChildOption) {
                    case "Add":
                        return By.xpath("//*[@id='Manage_Group_Guard_name_Permission_CheckBox_0']");
                    case "Edit":
                        return By.xpath("//*[@id='Manage_Group_Guard_name_Permission_CheckBox_1']");
                    case "Delete":
                        return By.xpath("//*[@id='Manage_Group_Guard_name_Permission_CheckBox_2']");
                    case "View":
                        return By.xpath("//*[@id='Manage_Group_Guard_name_Permission_CheckBox_3']");
                }
            }
        } else if (Policies.equalsIgnoreCase("Standard Policies")) {
            switch (ParentOption) {
                case "Dashboard":
                    return By.xpath("//*[@id='manage_Group_Particular_Child_Policy_DropIcon_0']");
                case "My Sales":
                    return By.xpath("//*[@id='manage_Group_Particular_Child_Policy_DropIcon_1']");
                case "Hiring":
                    return By.xpath("//*[@id='manage_Group_Particular_Child_Policy_DropIcon_2']");
                case "Calendar":
                    return By.xpath("//*[@id='manage_Group_Particular_Child_Policy_DropIcon_3']");
                case "Management":
                    return By.xpath("//*[@id='manage_Group_Particular_Child_Policy_DropIcon_4']");
                case "Community":
                    return By.xpath("//*[@id='manage_Group_Particular_Child_Policy_DropIcon_5']");
                case "Projections":
                    return By.xpath("//*[@id='manage_Group_Particular_Child_Policy_DropIcon_6']");
                case "Reports":
                    return By.xpath("//*[@id='manage_Group_Particular_Child_Policy_DropIcon_7']");
                case "Training":
                    return By.xpath("//*[@id='manage_Group_Particular_Child_Policy_DropIcon_8']");
                case "Requests & Approvals":
                    return By.xpath("//*[@id='manage_Group_Particular_Child_Policy_DropIcon_9']");
                case "Support":
                    return By.xpath("//*[@id='manage_Group_Particular_Child_Policy_DropIcon_10']");
                case "SequiDocs":
                    return By.xpath("//*[@id='manage_Group_Particular_Child_Policy_DropIcon_11']");
                case "Referrals":
                    return By.xpath("//*[@id='manage_Group_Particular_Child_Policy_DropIcon_12']");
            }
        } else if (Policies.equalsIgnoreCase("Profile Policies")) {
            switch (ParentOption) {
                case "Profile":
                    return By.xpath("//*[@id='manage_Group_Particular_Child_Policy_DropIcon_0']");
            }
        }
        return null;
    }

    public static By Permissions_AddGroup_SaveButton = By.xpath("//*[text()='Save']");


}
