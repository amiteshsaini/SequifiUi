package PageObjects;

import org.openqa.selenium.By;

public class DashboardElements {
    public static By PayrollReport = By.xpath("//span[text()=' Payroll Report']");
    public static By SendAlerts = By.xpath("//span[text()='Send Alerts']");
    public static By FinalizePayroll = By.xpath("//span[text()='Finalize Payroll']");
    public static By Reconciliations = By.xpath("//span[text()='Reconciliations']");
    public static By Manage = By.xpath("//span[text()='Manage']");
    public static By AddNew = By.xpath("//span[text()='Add New']");
    public static By SwitchToStandard = By.xpath("//*[text()='Switch to Standard']");
    public static By CloseModal = By.xpath("//*[@id='Close_Modal']");
    public static By DashboardLabel = By.xpath("//*[text()='Dashboard']");
    public static By Dashboard_ResetAppButton = By.xpath("//span[text()='Reset App']");
    public static By Dashboard_ResetAppConfirmationYesButton = By.xpath("//span[text()='Yes']");
    public static By Dashboard_ResetAppSuccessfulText = By.xpath("//*[contains(text(),'App Reset Successfully')]");


}
