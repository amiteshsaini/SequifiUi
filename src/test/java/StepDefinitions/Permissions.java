package StepDefinitions;

import PageObjects.Permissions_Elements;
import Sequifi.qa.cucumber.state.TestState;
import Sequifi.qa.cucumber.stepdefinitions.AbstractStepDefinitions;
import Sequifi.qa.reporting.logging.CustomLogging;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.UUID;

public class Permissions extends AbstractStepDefinitions {
    CommonMethods commonMethods = new CommonMethods(state);
    CustomLogging customLogging = new CustomLogging(state);

    Duration timeoutInSeconds = Duration.ofSeconds(15);
    WebDriverWait wait = new WebDriverWait(this.state.getDriver(), timeoutInSeconds);

    public Permissions(TestState state) {
        super(state);
    }

    @Then("Permissions: Permissions Menu: Click")
    public void permissionsPermissionsMenuClick() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(Permissions_Elements.Permissions_Menu));
        customLogging.customAssertTrue(commonMethods.absoluteClick(Permissions_Elements.Permissions_Menu), "Permissions: Permissions Menu: Click");
    }

    @Then("Permissions: Click New Group Button")
    public void permissionsClickNewGroupButton() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(Permissions_Elements.Permissions_NewGroup_Button));
        customLogging.customAssertTrue(commonMethods.absoluteClick(Permissions_Elements.Permissions_NewGroup_Button), "Permissions: Click New Group Button");
    }

    @Then("Permissions: Add Group: Enter {string} in Group Name Textbox")
    public void permissionsAddGroupEnterInGroupNameTextbox(String GroupName) throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(Permissions_Elements.Permissions_GroupName_TextBox));
        String UniqueGroupName = GroupName + UUID.randomUUID().toString().replace("-", "").substring(0, 5);
        customLogging.customAssertTrue(commonMethods.absoluteSendKeys(Permissions_Elements.Permissions_GroupName_TextBox, UniqueGroupName), "Permissions: Add Group: Enter " + UniqueGroupName + " in Group Name Textbox");
    }

    @Then("Permissions: Add Group: Expand {string} - Expand {string}: {string} - Check {string} Options")
    public void permissionsAddGroupAdministratorPoliciesExpandCheckOptions(String Policies, String ParentOption, String ChildOption, String Check) throws InterruptedException {
        if (!ParentOption.equalsIgnoreCase("")) {
            Actions action = new Actions(this.state.getDriver());
            WebElement element = this.state.getDriver().findElement(Permissions_Elements.Permissions_GroupName_TextBox);
            action.moveToElement(this.state.getDriver().findElement(Permissions_Elements.Permissions_GroupName_TextBox)).moveToElement(element).perform();
            if (Policies.equalsIgnoreCase("Administrator Policies")) {
                try {
                    wait.until(ExpectedConditions.visibilityOfElementLocated(Permissions_Elements.Permissions_AdministratorPoliciesExpandCollapse));
                } catch (Exception ignore) {
                }
                if (this.state.getDriver().findElement(Permissions_Elements.Permissions_AdministratorPoliciesExpandCollapse).getAttribute("class").equalsIgnoreCase("pi pi-angle-down fs-2 text-cmGrey700 cursor-pointer")) {
                    customLogging.customAssertTrue(commonMethods.absoluteClick(Permissions_Elements.Permissions_AdministratorPoliciesExpandCollapse), "Permissions: Add Group: Expand Administrator Policies");
                }
            } else if (Policies.equalsIgnoreCase("Standard Policies")) {
                try {
                    wait.until(ExpectedConditions.visibilityOfElementLocated(Permissions_Elements.Permissions_StandardPoliciesExpandCollapse));
                } catch (Exception ignore) {
                }
                if (this.state.getDriver().findElement(Permissions_Elements.Permissions_StandardPoliciesExpandCollapse).getAttribute("class").equalsIgnoreCase("pi pi-angle-down fs-2 text-cmGrey700 cursor-pointer")) {
                    customLogging.customAssertTrue(commonMethods.absoluteClick(Permissions_Elements.Permissions_StandardPoliciesExpandCollapse), "Permissions: Add Group: Expand Standard Policies");
                }
            } else if (Policies.equalsIgnoreCase("Profile Policies")) {
                try {
                    wait.until(ExpectedConditions.visibilityOfElementLocated(Permissions_Elements.Permissions_ProfilePoliciesExpandCollapse));
                } catch (Exception ignore) {
                }
                if (this.state.getDriver().findElement(Permissions_Elements.Permissions_ProfilePoliciesExpandCollapse).getAttribute("class").equalsIgnoreCase("pi pi-angle-down fs-2 text-cmGrey700 cursor-pointer")) {
                    customLogging.customAssertTrue(commonMethods.absoluteClick(Permissions_Elements.Permissions_ProfilePoliciesExpandCollapse), "Permissions: Add Group: Expand Profile Policies");
                }
            }
            try {
                wait.until(ExpectedConditions.visibilityOfElementLocated(Permissions_Elements.getParentOption(Policies, ParentOption)));
            } catch (Exception ignore) {
            }
            if (ParentOption.equalsIgnoreCase("Profile")) {
                if (this.state.getDriver().findElement(Permissions_Elements.getParentProfileOption(ParentOption)).getAttribute("class").equalsIgnoreCase("pi pi-angle-down fs-2 text-cmGrey700 cursor-pointer")) {
                    customLogging.customAssertTrue(commonMethods.absoluteClick(Permissions_Elements.getParentProfileOption(ParentOption)), "Permissions: Add Group: Expand " + ParentOption);
                }
            } else {
                if (this.state.getDriver().findElement(Permissions_Elements.getParentOption(Policies, ParentOption)).getAttribute("class").equalsIgnoreCase("pi pi-angle-down fs-2 text-cmGrey700 cursor-pointer")) {
                    customLogging.customAssertTrue(commonMethods.absoluteClick(Permissions_Elements.getParentOption(Policies, ParentOption)), "Permissions: Add Group: Expand " + ParentOption);
                }
            }
            if (Check.contains("View")) {
                try {
                    wait.until(ExpectedConditions.visibilityOfElementLocated(Permissions_Elements.getChildOptionCheckBox(Policies, ParentOption, ChildOption, "View")));
                } catch (Exception ignore) {
                }
                customLogging.customAssertTrue(commonMethods.absoluteClick(Permissions_Elements.getChildOptionCheckBox(Policies, ParentOption, ChildOption, "View")), "Permissions: Add Group: Administrator Policies - Check View for " + ChildOption);
            }
            if (Check.contains("Add")) {
                try {
                    wait.until(ExpectedConditions.visibilityOfElementLocated(Permissions_Elements.getChildOptionCheckBox(Policies, ParentOption, ChildOption, "Add")));
                } catch (Exception ignore) {
                }
                customLogging.customAssertTrue(commonMethods.absoluteClick(Permissions_Elements.getChildOptionCheckBox(Policies, ParentOption, ChildOption, "Add")), "Permissions: Add Group: Administrator Policies - Check Add for " + ChildOption);
            }
            if (Check.contains("Edit")) {
                try {
                    wait.until(ExpectedConditions.visibilityOfElementLocated(Permissions_Elements.getChildOptionCheckBox(Policies, ParentOption, ChildOption, "Edit")));
                } catch (Exception ignore) {
                }
                customLogging.customAssertTrue(commonMethods.absoluteClick(Permissions_Elements.getChildOptionCheckBox(Policies, ParentOption, ChildOption, "Edit")), "Permissions: Add Group: Administrator Policies - Check Edit for " + ChildOption);
            }
            if (Check.contains("Delete")) {
                try {
                    wait.until(ExpectedConditions.visibilityOfElementLocated(Permissions_Elements.getChildOptionCheckBox(Policies, ParentOption, ChildOption, "Delete")));
                } catch (Exception ignore) {
                }
                customLogging.customAssertTrue(commonMethods.absoluteClick(Permissions_Elements.getChildOptionCheckBox(Policies, ParentOption, ChildOption, "Delete")), "Permissions: Add Group: Administrator Policies - Check Delete for " + ChildOption);
            }
            if (Check.contains("Hire Now")) {
                try {
                    wait.until(ExpectedConditions.visibilityOfElementLocated(Permissions_Elements.getChildOptionCheckBox(Policies, ParentOption, ChildOption, "Hire Now")));
                } catch (Exception ignore) {
                }
                customLogging.customAssertTrue(commonMethods.absoluteClick(Permissions_Elements.getChildOptionCheckBox(Policies, ParentOption, ChildOption, "Hire Now")), "Permissions: Add Group: Administrator Policies - Check Hire Now for " + ChildOption);
            }
            if (Check.contains("Hire Directly")) {
                try {
                    wait.until(ExpectedConditions.visibilityOfElementLocated(Permissions_Elements.getChildOptionCheckBox(Policies, ParentOption, ChildOption, "Hire Directly")));
                } catch (Exception ignore) {
                }
                customLogging.customAssertTrue(commonMethods.absoluteClick(Permissions_Elements.getChildOptionCheckBox(Policies, ParentOption, ChildOption, "Hire Directly")), "Permissions: Add Group: Administrator Policies - Check Hire Directly for " + ChildOption);
            }
        }
    }

    @Then("Permissions: Add Group: Click Save Button")
    public void permissionsAddGroupClickSaveButton() throws InterruptedException {
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(Permissions_Elements.Permissions_AddGroup_SaveButton));
        } catch (Exception ignore) {
        }
        customLogging.customAssertTrue(commonMethods.absoluteClick(Permissions_Elements.Permissions_AddGroup_SaveButton), "Permissions: Add Group: Click Save Button");
    }
}
