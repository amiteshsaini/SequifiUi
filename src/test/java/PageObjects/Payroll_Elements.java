package PageObjects;

import org.openqa.selenium.By;

public class Payroll_Elements {

    public static By Payroll_Menu = By.xpath("//*[text()='Payroll        ']");
    public static By PayrollFrequencyDropdown = By.xpath("//*[@id='Run_Payroll_Global_Week_Select_Input']/div[3]");

    public static By PayrollFrequency(String PayrollFrequency) {
        return By.xpath("//div[text()='" + PayrollFrequency + "']");
    }

    public static By PayrollPeriodDropdown = By.xpath("//*[@id='Run_Payroll_Pay_Period_Select_Input']/div[3]");

    public static By getPayrollPeriodXpath(String PayrollPeriod) {
        return By.xpath("//div[text()='" + PayrollPeriod + "']");
    }

    public static By getCommissionAmountXpath(String EmployeeFirstName, String EmployeeLastName) {
        return By.xpath("(((//*[text()='" + EmployeeFirstName + "'])[text()='" + EmployeeLastName + "'])/../../../..)/td[4]/span");
    }

    public static By PayrollCommissionPopupCloseButton = By.xpath("//*[@id='Close_Modal']");

    public static By getXpathForEntryWithPIDAmountAndDate(String PID, String Amount, String Date) {
        return By.xpath("((//td/a)[text()='" + PID + "'])/../../td/div/div/span[text()='$ " + Amount + "']");
    }
}
