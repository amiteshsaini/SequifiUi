package StepDefinitions;

import PageObjects.DashboardElements;
import PageObjects.Management_Elements;
import PageObjects.Management_Transfer_Elements;
import Sequifi.qa.cucumber.state.TestState;
import Sequifi.qa.cucumber.stepdefinitions.AbstractStepDefinitions;
import Sequifi.qa.reporting.logging.CustomLogging;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Dashboard extends AbstractStepDefinitions {

    CommonMethods commonMethods = new CommonMethods(state);
    CustomLogging customLogging = new CustomLogging(state);
    Duration timeoutInSeconds = Duration.ofSeconds(15);
    WebDriverWait wait = new WebDriverWait(this.state.getDriver(), timeoutInSeconds);

    public Dashboard(TestState state) {
        super(state);
    }


    @When("Dashboard: user click on Payroll Reports")
    public void user_click_on_Payroll_Reports() {
        if (commonMethods.waitUntilElementIsVisible(DashboardElements.PayrollReport)) {
            this.state.getDriver().findElement(DashboardElements.PayrollReport).click();
        } else {
            org.testng.Assert.fail(DashboardElements.PayrollReport + " element not displayed!");
        }
    }

    @Then("Dashboard: Validate user is navigated to payroll under reports")
    public void Validate_user_is_navigated_to_payroll_under_reports() {
        commonMethods.implicitlyWait();
        this.state.getDriver().getPageSource().contains("Payroll");
    }

    @Then("Dashboard: Click back button")
    public void click_back_button() {
        commonMethods.implicitlyWait();
        this.state.getDriver().navigate().back();
    }

    @When("Dashboard: User click on Send Alerts")
    public void user_click_on_send_alerts() {
        if (commonMethods.waitUntilElementIsVisible(DashboardElements.SendAlerts)) {
            this.state.getDriver().findElement(DashboardElements.SendAlerts).click();
        } else {
            org.testng.Assert.fail(DashboardElements.SendAlerts + " element not displayed!");
        }
        ;
    }

    @Then("Dashboard: Validate user is navigated to Alert Center")
    public void validate_user_is_navigated_to_alert_center() {
        commonMethods.implicitlyWait();
        this.state.getDriver().getPageSource().contains("Alert Summary");
    }

    @When("Dashboard: User click on Finalize Payroll")
    public void user_click_on_finalize_payroll() {
        if (commonMethods.waitUntilElementIsVisible(DashboardElements.FinalizePayroll)) {
            this.state.getDriver().findElement(DashboardElements.FinalizePayroll).click();
        } else {
            org.testng.Assert.fail(DashboardElements.FinalizePayroll + " element not displayed!");
        }
        ;
    }

    @Then("Dashboard: Validate user is navigated to Run Payroll under Payroll")
    public void validate_user_is_navigated_to_run_payroll_under_payroll() {
        commonMethods.implicitlyWait();
        this.state.getDriver().getPageSource().contains("Run Payroll");
    }

    @When("Dashboard: User click on Reconciliations")
    public void user_click_on_reconciliations() {
        if (commonMethods.waitUntilElementIsVisible(DashboardElements.Reconciliations)) {
            this.state.getDriver().findElement(DashboardElements.Reconciliations).click();
        } else {
            org.testng.Assert.fail(DashboardElements.Reconciliations + " element not displayed!");
        }
        ;
    }

    @Then("Dashboard: Validate user is navigated to Reconciliation under Payroll")
    public void validate_user_is_navigated_to_reconciliation_under_payroll() {
        commonMethods.implicitlyWait();
        this.state.getDriver().getPageSource().contains("Reconciliation");
    }

    //C_187
    @When("Dashboard: User click on Manage")
    public void user_click_on_manage() {
        if (commonMethods.waitUntilElementIsVisible(DashboardElements.Manage)) {
            this.state.getDriver().findElement(DashboardElements.Manage).click();
        } else {
            org.testng.Assert.fail(DashboardElements.Manage + " element not displayed!");
        }
        ;
    }

    @And("Dashboard: Click on Add New Button")
    public void click_on_add_new_button() {
        if (commonMethods.waitUntilElementIsVisible(DashboardElements.AddNew)) {
            this.state.getDriver().findElement(DashboardElements.AddNew).click();
        } else {
            org.testng.Assert.fail(DashboardElements.AddNew + " element not displayed!");
        }
        ;
    }

    @And("Dashboard: Fill the required data")
    public void fill_the_required_data() {
        this.state.getDriver().findElement(By.xpath("//input[@placeholder='Enter Title']")).sendKeys("Company Safety Announcement");
        this.state.getDriver().findElement(By.xpath("//textarea[@placeholder='Enter Content']")).sendKeys("All employees will be required to undergo safety training during the month of August.  Contact your supervisor for your training schedule.");
        this.state.getDriver().findElement(By.xpath("//span[@class='p-checkbox-box']")).click();

        WebElement positions = this.state.getDriver().findElement(By.xpath("//div[@id='kt_modal_create_app_content']//div[4]/div[1]/div/div[2]/div/div[2]/div"));
        Select select = new Select(positions);
        java.util.List<WebElement> options = select.getOptions();
        for (WebElement option : options) {
            select.selectByVisibleText(option.getText());
        }
        // this.state.getDriver().findElement(By.xpath("//button[@aria-label='Close']")).click();

        WebElement office = this.state.getDriver().findElement(By.xpath("//div[@id='kt_modal_create_app_content']//div[4]/div[2]/div/div[2]/div/div[2]/div"));
        Select select1 = new Select(office);
        java.util.List<WebElement> options1 = select.getOptions();
        for (WebElement option : options1) {
            select1.selectByVisibleText(option.getText());
        }
        // this.state.getDriver().findElement(By.xpath("//button[@aria-label='Close']")).click();

        this.state.getDriver().findElement(By.xpath("//input[@placeholder='Enter Link']")).sendKeys("www.google.com");
        this.state.getDriver().findElement(By.xpath("//input[@placeholder='Start Date']")).sendKeys("09/20/2023");
        this.state.getDriver().getPageSource().contains("09/20/2023");
        Select dd = new Select(this.state.getDriver().findElement(By.xpath("//span[text()='Select']")));
        dd.selectByVisibleText("1 month");
        WebElement fileupload = this.state.getDriver().findElement(By.xpath("//input[@placeholder='Select file']"));
        fileupload.sendKeys("C:\\Users\\S.K\\Downloads\\Dummy.pdf");
    }

    @And("Dashboard: Click on Save Button")
    public void click_on_save_button() {
        this.state.getDriver().findElement(By.xpath("//span[text()='Save']")).click();
    }

    @Then("Dashboard: Validate Announcements should be created")
    public void validate_announcements_should_be_created() {
        this.state.getDriver().getPageSource().contains("Company Safety Announcement");
        this.state.getDriver().findElement(By.xpath("//div[@id='pr_id_32_header']/div/div/div[3]")).click();
    }

    //C_188
    @When("Dashboard: User click on edit button")
    public void User_click_on_edit_button() {
        this.state.getDriver().findElement(By.xpath("//*[@id='kt_app_content_container']/div/div[2]/div[2]/div/div[2]/div/span/span")).click();
    }

    @And("Dashboard: Change the Announcement Title and Duration")
    public void Change_the_Announcement_Title_and_Duration() {
        this.state.getDriver().findElement(By.xpath("//input[@placeholder='Enter Title']")).clear();
        this.state.getDriver().findElement(By.xpath("//input[@placeholder='Enter Title']")).sendKeys("Florida Sales Plan");

        Select dd1 = new Select(this.state.getDriver().findElement(By.xpath("//select[@name='durations']")));
        dd1.selectByVisibleText("2 week");
    }

    @And("Dashboard: Update the Announcement")
    public void Update_the_Announcement() {
        WebElement element2 = this.state.getDriver().findElement(By.xpath("//span[text()='Update']"));
        JavascriptExecutor js2 = (JavascriptExecutor) this.state.getDriver();
        js2.executeScript("arguments[0].click();", element2);
    }

    @Then("Dashboard: Validate Announcements should be updated")
    public void Validate_Announcements_should_be_updated() {
        this.state.getDriver().getPageSource().contains("Florida Sales Plan"); // Can we use this directly
    }

    @When("Dashboard: User click on Manage button")
    public void User_click_on_Manage_button() {
        this.state.getDriver().findElement(By.xpath("//span[text()='Manage']")).click();
    }

    @Then("Dashboard: Validate Location DropDown")
    public void Validate_Location_DropDown() {

        String pageSource = this.state.getDriver().getPageSource();
        String expectedContent = "All Office";
        boolean isEqual = pageSource.contentEquals(expectedContent);
        if (isEqual) {
            System.out.println("Page source matches the expected content.");
        } else {
            System.out.println("Page source does not match the expected content.");
        }
    }

    @Then("Dashboard: Validate Position DropDown")
    public void Validate_Position_DropDown() {
        String pageSource = this.state.getDriver().getPageSource();
        String expectedContent = "All Positions";
        boolean isEqual = pageSource.contentEquals(expectedContent);
        if (isEqual) {
            System.out.println("Page source matches the expected content.");
        } else {
            System.out.println("Page source does not match the expected content.");
        }
    }

    @Then("Dashboard: Validate Status DropDown")
    public void Validate_Status_DropDown() {
        String pageSource = this.state.getDriver().getPageSource();
        String expectedContent = "All";
        boolean isEqual = pageSource.contentEquals(expectedContent);
        if (isEqual) {
            System.out.println("Page source matches the expected content.");
        } else {
            System.out.println("Page source does not match the expected content.");
        }
    }

    //C_189
    @When("Dashboard: User is on payroll summary card")
    public void User_is_on_payroll_summary_card() {
        this.state.getDriver().getPageSource().contains("Payroll Summary"); // Can we use this directly
    }

    @Then("Dashboard: Validate TimeLine DropDown of PS")
    public void Validate_TimeLine_DropDown_of_PS() {
        String expectedOptions[] = {"This Week", "This Year", "This Month", "This Quarter"};
        WebElement dropdown = this.state.getDriver().findElement(By.xpath("//div[@id='kt_app_content_container']/div/div[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div/div/span"));
        Select sel = new Select(dropdown);
        List<WebElement> options = sel.getOptions();
        for (int i = 0; i < options.size(); i++) {
            Assert.assertEquals(options.get(i).getText(), expectedOptions[i]);
        }

        String pageSource = this.state.getDriver().getPageSource();
        String expectedContent = "This Week";
        boolean isEqual = pageSource.contentEquals(expectedContent);
        if (isEqual) {
            System.out.println("Page source matches the expected content.");
        } else {
            System.out.println("Page source does not match the expected content.");
        }

    }

    //C_190
    @When("Dashboard: User is on office sales performance card")
    public void User_is_on_office_sales_performance_card() {
        String pageSource = this.state.getDriver().getPageSource();
        String expectedContent = "Office Sales Performance";
        boolean isEqual = pageSource.contentEquals(expectedContent);
        if (isEqual) {
            System.out.println("Page source matches the expected content.");
        } else {
            System.out.println("Page source does not match the expected content.");
        }
    }

    @Then("Dashboard: Validate TimeLine DropDown of OSP")
    public void Validate_TimeLine_DropDown_of_OSP() {
        String pageSource = this.state.getDriver().getPageSource();
        String expectedContent = "This Week";
        boolean isEqual = pageSource.contentEquals(expectedContent);
        if (isEqual) {
            System.out.println("Page source matches the expected content.");
        } else {
            System.out.println("Page source does not match the expected content.");
        }

        String expectedOptions[] = {"This Week", "This Year", "This Month", "This Quarter"};
        WebElement dropdown = this.state.getDriver().findElement(By.xpath("//div[@id='kt_app_content_container']/div/div[1]/div[5]/div[1]/div[2]/div[1]/div/div/span"));
        Select sel = new Select(dropdown);
        List<WebElement> options = sel.getOptions();
        for (int i = 0; i < options.size(); i++) {
            Assert.assertEquals(options.get(i).getText(), expectedOptions[i]);
        }
    }

    @And("Dashboard: Validate Office DropDown")
    public void Validate_Office_DropDown() {
        String pageSource = this.state.getDriver().getPageSource();
        String expectedContent = "All Office";
        boolean isEqual = pageSource.contentEquals(expectedContent);
        if (isEqual) {
            System.out.println("Page source matches the expected content.");
        } else {
            System.out.println("Page source does not match the expected content.");
        }

        String expectedOptions[] = {"All Office", "California Office", "Florida Office"};
        WebElement dropdown = this.state.getDriver().findElement(By.xpath("//div[@id='kt_app_content_container']/div/div[1]/div[5]/div[1]/div[2]/div[2]/div/div/span"));
        Select sel = new Select(dropdown);
        List<WebElement> options = sel.getOptions();
        for (int i = 0; i < options.size(); i++) {
            Assert.assertEquals(options.get(i).getText(), expectedOptions[i]);
        }
        this.state.getDriver().findElement(By.xpath("")).click();
    }


    @When("Dashboard: Switch to Standard")
    public void user_click_on_SwitchToStandard() {
        try {
            Thread.sleep(10000);
            wait.until(ExpectedConditions.elementToBeClickable(DashboardElements.SwitchToStandard));
            customLogging.customAssertTrue(commonMethods.absoluteClick(DashboardElements.SwitchToStandard), "Dashboard: Switch to Standard successful");
        } catch (Exception e) {
        }
    }


    @Then("Dashboard: Click Reset App Button")
    public void dashboardClickResetAppButton() {
        try {
            wait.until(ExpectedConditions.elementToBeClickable(DashboardElements.Dashboard_ResetAppButton));
            this.state.getDriver().findElement(DashboardElements.Dashboard_ResetAppButton).click();
            this.state.getDriver().findElement(DashboardElements.Dashboard_ResetAppConfirmationYesButton).click();
//            wait.until(ExpectedConditions.visibilityOfElementLocated(DashboardElements.Dashboard_ResetAppSuccessfulText));
//            WebElement element = this.state.getDriver().findElement(DashboardElements.Dashboard_ResetAppSuccessfulText);
//            ((JavascriptExecutor) this.state.getDriver()).executeScript("arguments[0].scrollIntoView({block: 'center'});", element);
//            customLogging.customAssertTrue(true, "Reset App successful");
            Thread.sleep(3000);
        } catch (Exception e) {
            customLogging.customAssertTrue(false, "Reset App NOT successful");
        }
    }
}
