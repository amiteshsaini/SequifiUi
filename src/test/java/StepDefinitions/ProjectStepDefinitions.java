package StepDefinitions;

import Sequifi.qa.configuration.ConfigurationException;
import Sequifi.qa.cucumber.state.TestState;
import Sequifi.qa.cucumber.stepdefinitions.AbstractStepDefinitions;
import Sequifi.qa.framework.CommonElementMethods;
import Sequifi.qa.frameworktests.LogResult;
import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.IOException;

public class ProjectStepDefinitions extends AbstractStepDefinitions {

    CommonElementMethods commonElementMethods;
    long scriptStartTime, scriptEndTime;
    public static Scenario scenario;

    public ProjectStepDefinitions(TestState state) {
        super(state);
    }

    @Before(order = 1)
    public void setup(Scenario scenario) throws IOException, ConfigurationException {
        ProjectStepDefinitions.scenario = scenario;
        scriptStartTime = System.currentTimeMillis();
        super.setUpBeforScenario(scenario);
        this.state.setDriver(super.getDriver());
        this.commonElementMethods = new CommonElementMethods(this.state.getDriver());
        (state).setContext("messageLog", "");
    }


    @AfterStep
    public void afterStep(Scenario scenario) throws Exception {
        if (!state.getContext("messageLog").equals("")) {
//            ProjectStepDefinitions.scenario.log(Thread.currentThread().getName() + "\n" + "AfterStep: " + state.getContext("messageLog"));
            state.setContext("messageLog", "");
        }
    }

    private String setMessage() {
        return (String) state.getContext("messageLog");
    }

    private void getScreenshot(Scenario scenario) {
        final byte[] screenshot = ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.BYTES);
        scenario.attach(screenshot, "image"+System.currentTimeMillis()+".png", scenario.getName());
    }

    @After
    public void teardown(Scenario scenario) throws Exception {
        scriptEndTime = System.currentTimeMillis();
//        ProjectStepDefinitions.scenario.log("Execution Time Taken: " + CommonMethods.getTimeElapsed(scriptEndTime - scriptStartTime));
//        ProjectStepDefinitions.scenario.log("Execution Date: " + CommonMethods.todayDateTime("MM-dd-yyyy"));
        super.tearDownAfterScenario(scenario);
    }


}
