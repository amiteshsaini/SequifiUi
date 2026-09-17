package Sequifi.qa.cucumber.stepdefinitions;

import Sequifi.qa.cucumber.state.TestState;
import Sequifi.qa.frameworktests.BaseCucumberTest;

public abstract class AbstractStepDefinitions extends BaseCucumberTest {
    protected TestState state;

    public AbstractStepDefinitions(TestState state) {
        this.state = state;
    }
}
